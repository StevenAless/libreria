/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utp.interfaces;

import static conexion.ConexionBD.conectar;
import static edu.utp.interfaces.Listado.output;
import edu.utp.utils.FileUtil;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Efrain Figueroa
 */
public class ReporteDetallado extends javax.swing.JDialog {

    Connection cn;
    Statement st;

    public ReporteDetallado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/logo.png")));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblIngresar1 = new javax.swing.JLabel();
        lblIngresar2 = new javax.swing.JLabel();
        fechahasta = new com.toedter.calendar.JDateChooser();
        fechadesde = new com.toedter.calendar.JDateChooser();
        btn_generar = new javax.swing.JLabel();
        radioReporteDetallado = new javax.swing.JRadioButton();
        radioReporteProducto = new javax.swing.JRadioButton();
        radioReporteCliente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblIngresar1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblIngresar1.setText("Desde:");

        lblIngresar2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblIngresar2.setText("Hasta:");

        fechahasta.setDateFormatString("yyyy/MM/dd");

        fechadesde.setDateFormatString("yyyy/MM/dd");

        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/btn-generar.png"))); // NOI18N
        btn_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_generarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechadesde, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechahasta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_generar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIngresar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechahasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechadesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIngresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        radioReporteDetallado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioReporteDetallado.setSelected(true);
        radioReporteDetallado.setText("Reporte detallado de ventas");

        radioReporteProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioReporteProducto.setText("Reporte por Producto");
        radioReporteProducto.setEnabled(false);

        radioReporteCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioReporteCliente.setText("Reporte por cliente");
        radioReporteCliente.setEnabled(false);
        radioReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReporteClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioReporteDetallado)
                        .addGap(18, 18, 18)
                        .addComponent(radioReporteProducto)
                        .addGap(18, 18, 18)
                        .addComponent(radioReporteCliente)
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(radioReporteProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioReporteCliente))
                    .addComponent(radioReporteDetallado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReporteClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioReporteClienteActionPerformed

    private void btn_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generarMouseClicked
        String filtro = "";
        Locale loc = new Locale("es", "PE");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);

        String desde = "";
        String hasta = "";

        List<String> tiposReporte = Collections.singletonList("REPORTE_VENTAS");
        if (Objects.nonNull(fechadesde.getDate())) {
            desde = dateFormat.format(fechadesde.getDate());
            String[] date = desde.split("/");
            String dateinit = date[2] + "-" + date[1] + "-" + date[0];
            filtro += " AND co.fecha between '" + dateinit + " 00:00:00'";
            if (Objects.nonNull(fechahasta.getDate())) {
                hasta = dateFormat.format(fechahasta.getDate());
                String[] date2 = hasta.split("/");
                filtro += " AND '" + date2[2] + "-" + date2[1] + "-" + date2[0] + " 23:59:59'";
            } else {
                filtro += " AND '" + dateinit + " 23:59:59'";
            }

        }
        FileUtil.generarReporteVentas(get_items_reporte(filtro), tiposReporte, output, desde, hasta);
        fechadesde.setDate(null);
        fechahasta.setDate(null);
    }//GEN-LAST:event_btn_generarMouseClicked

    public List<Map<String, String>> get_items_reporte(String filtro) {
        String sql = "select c.*,co.*,p.codigo,DATE_FORMAT(co.fecha,'%d/%m/%Y') as format, p.descripcion, u.nombre as usuario, concat(cl.nombre, ' ', cl.apellidos) as nombres, "
                + "cl.numero_documento as documento from carrito c inner join productos p on p.id = c.id INNER JOIN comprobante co on co.id_comprobante = c.Identificador "
                + "left join usuarios u on u.id_usuario = co.id_usuario inner join clientes cl on cl.id_cliente = co.id_cliente where 1=1 " + filtro;
        List<Map<String, String>> lista = new ArrayList<>();
        cn = conectar();
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("fecha", rs.getString("format"));
                map.put("tipocomprobante", rs.getString("tipo_comprobante"));
                map.put("seriecomprobante", rs.getString("serie_comprobante") + "-" + rs.getString("numero_comprobante"));
                map.put("vendedor", rs.getString("usuario"));
                map.put("cliente", rs.getString("nombres"));
                map.put("documento", rs.getString("documento"));
                map.put("codigo", rs.getString("codigo"));
                map.put("descripcion", rs.getString("descripcion"));
                map.put("cantidad", rs.getString("cantidad"));
                map.put("preciounitario", rs.getString("precio"));
                map.put("impuesto", rs.getString("impuesto"));
                map.put("totalventa", rs.getString("total_venta"));
                map.put("preciototal", rs.getString("precioT"));
                lista.add(map);
            }
            cn.close();
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_generar;
    private com.toedter.calendar.JDateChooser fechadesde;
    private com.toedter.calendar.JDateChooser fechahasta;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIngresar1;
    private javax.swing.JLabel lblIngresar2;
    public javax.swing.JRadioButton radioReporteCliente;
    public javax.swing.JRadioButton radioReporteDetallado;
    public javax.swing.JRadioButton radioReporteProducto;
    // End of variables declaration//GEN-END:variables
}
