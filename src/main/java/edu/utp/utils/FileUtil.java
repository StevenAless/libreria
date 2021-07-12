package edu.utp.utils;

import static edu.utp.utils.Constantes.*;
import static edu.utp.utils.Util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.utp.interfaces.Listado;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JsonDataSource;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Efrain Figueroa <efrain.figue.95@gmail.com>
 */
public class FileUtil {

    public static void generarReporte(String json, Map parameters, String output) {
        File theDir = new File(output);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        try (InputStream fileIn = Listado.class.getResourceAsStream("/reporte/factura_v_6.jasper")) {
            ByteArrayInputStream jsonDataStream = new ByteArrayInputStream(json.getBytes());
            JRDataSource jsonDataSource = new JsonDataSource(jsonDataStream);

            JasperPrint jasperPrint = JasperFillManager.fillReport(fileIn, parameters, jsonDataSource);
            JasperExportManager.exportReportToPdfFile(jasperPrint, output + parameters.get("serie") + ".pdf");
            Desktop desktop = Desktop.getDesktop();
            File file = new File(output);
            if (file.exists()) {
                desktop.open(file);
            }

        } catch (JRException | IOException e) {
            Logger.getLogger(Listado.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void generarReporteVentas(List<Map<String, String>> items, List<String> tiposReporte, String output, String desde, String hasta) {
        File theDir = new File(output);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy-HH.mm.ss");

        try (Workbook workbook = new XSSFWorkbook(); FileOutputStream fileOut = new FileOutputStream(output + "reporte-detallado-" + now.format(formatter) + ".xlsx")) {
            tiposReporte.forEach((tipo) -> {
                Sheet sheetDocumento = workbook.createSheet(tipo);
                sheetDocumento.addMergedRegion(new CellRangeAddress(0, 0, 0, 13));
                sheetDocumento.addMergedRegion(new CellRangeAddress(8, 8, 0, 8));
                Row roww = sheetDocumento.createRow(0);
                generarMascaraExcel(tipo, sheetDocumento, roww, workbook, cabeceras_ventas, desde, hasta, "", "Libreria Area51", "Reporte detallado de ventas");

                int rowindex = 9;
                for (int i = 0; i < items.size(); i++) {
                    Map<String, String> object = items.get(i);

                    Row row = sheetDocumento.createRow(rowindex);
                    row.createCell(0).setCellValue(object.get("fecha"));
                    row.createCell(1).setCellValue(object.get("tipocomprobante"));
                    row.createCell(2).setCellValue(object.get("seriecomprobante"));
                    row.createCell(3).setCellValue(object.get("vendedor"));
                    row.createCell(4).setCellValue(object.get("cliente"));
                    row.createCell(5).setCellValue(object.get("documento"));
                    row.createCell(6).setCellValue("SOLES");
                    row.createCell(7).setCellValue(object.get("codigo"));
                    row.createCell(8).setCellValue(object.get("descripcion"));
                    row.createCell(9).setCellValue(StringToDouble(object.get("cantidad")));
                    row.createCell(10).setCellValue(StringToDouble(object.get("preciounitario")));
                    row.createCell(11).setCellValue(StringToDouble(object.get("impuesto")));
                    row.createCell(12).setCellValue(StringToDouble(object.get("totalventa")));
                    row.createCell(13).setCellValue(StringToDouble(object.get("preciototal")));
                    rowindex++;
                }

                int indextotal = 9;
                String[] calculoTotales = {"SUM(J10:J10000)", "SUM(K10:K10000)", "SUM(L10:L10000)", "SUM(M10:M10000)", "SUM(N10:N10000)"};
                agregarTotalesExcel(sheetDocumento, workbook, calculoTotales, indextotal);
            });

            workbook.write(fileOut);
            Desktop desktop = Desktop.getDesktop();
            File file = new File(output);
            if (file.exists()) {
                desktop.open(file);
            }
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, ex.getLocalizedMessage(), "ERROR", JOptionPane.OK_CANCEL_OPTION);
            throw new RuntimeException(ex.getMessage(), ex.getCause());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getLocalizedMessage(), "ERROR", JOptionPane.OK_CANCEL_OPTION);
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }
}
