/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utp.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.swing.JTextField;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import static edu.utp.utils.Constantes.*;
import static edu.utp.utils.Util.*;

/**
 *
 * @author Efrain Figueroa <efrain.figue.95@gmail.com>
 */
public class Util {

    public static void generarMascaraExcel(String tipoMoneda, Sheet sheetDocumento, Row roww, Workbook workbook, String[] cabeceras, String finicio, String ffin, String txtRucEmpresa, String txtRazonSocial, String titulo) {

        /* titulo */
        CellStyle styletitulo = workbook.createCellStyle();
        Font fontitulo = workbook.createFont();
        fontitulo.setBold(true);
        fontitulo.setFontHeightInPoints((short) 36);
        fontitulo.setColor((short) 23);
        styletitulo.setFont(fontitulo);
        styletitulo.setAlignment(HorizontalAlignment.CENTER);
        Cell cellCabecera = roww.createCell(0);
        cellCabecera.setCellStyle(styletitulo);
        cellCabecera.setCellValue(titulo);
        /* cabeceras_ventas */
        Font fontcabecera = workbook.createFont();
        CellStyle stylecabecera = workbook.createCellStyle();
        fontcabecera.setBold(true);
        fontcabecera.setFontHeightInPoints((short) 13);

        roww = sheetDocumento.createRow(3);
        roww.createCell(0).setCellValue("RUC");
        roww.createCell(1).setCellValue(txtRucEmpresa);
        roww.createCell(3).setCellValue("Fecha inicial");
        roww.createCell(4).setCellValue(finicio);
        roww.createCell(6).setCellValue("MONEDA:");
        roww.createCell(7).setCellValue("SOLES");

        roww = sheetDocumento.createRow(4);
        roww.createCell(0).setCellValue("Razón Social");
        roww.createCell(1).setCellValue(txtRazonSocial);
        roww.createCell(3).setCellValue("Fecha final");
        roww.createCell(4).setCellValue(ffin);

        roww = sheetDocumento.createRow(7);
        stylecabecera.setFont(fontcabecera);
        stylecabecera.setBorderBottom(BorderStyle.THIN);
        stylecabecera.setBorderLeft(BorderStyle.THIN);
        stylecabecera.setBorderRight(BorderStyle.THIN);
        stylecabecera.setBorderTop(BorderStyle.THIN);

        for (int i = 0; i < cabeceras.length; i++) {
            Cell cell = roww.createCell(i);
            cell.setCellValue(cabeceras[i]);
            cell.setCellStyle(stylecabecera);
        }
        for (int i = 0; i < cabeceras.length; i++) {
            sheetDocumento.autoSizeColumn(i);
        }
    }

    public static void agregarTotalesExcel(Sheet sheetDocumento, Workbook workbook, String[] calculoTotales, int indextotal) throws IllegalStateException, FormulaParseException {
        Row roww;
        CellStyle styletotal = workbook.createCellStyle();
        Font fontotal = workbook.createFont();
        fontotal.setBold(true);
        fontotal.setFontHeightInPoints((short) 13);
        styletotal.setAlignment(HorizontalAlignment.RIGHT);
        styletotal.setFont(fontotal);
        roww = sheetDocumento.createRow(8);
        Cell celltot = roww.createCell(0);
        celltot.setCellValue("TOTALES");
        celltot.setCellStyle(styletotal);
        for (String montoTotale : calculoTotales) {
            Cell celltotal = roww.createCell(indextotal);
            celltotal.setCellFormula(montoTotale);
            celltotal.setCellStyle(styletotal);
            indextotal++;
        }
    }

    public static String notNullEmpty(Object text) {
        String texto = String.valueOf(text).trim();
        return texto.equals("") || texto.equals("null") ? "" : texto;
    }

    public static Double StringToDouble(Object text) {
        String texto = notNullEmpty(text);
        return Double.parseDouble("".equals(texto) ? "0.00" : texto);
    }


}
