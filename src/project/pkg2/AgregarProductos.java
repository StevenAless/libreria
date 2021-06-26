/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import conexion.ConexionBD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static project.pkg2.Comprobante.idC;

/**
 *
 * @author Casa
 */
public class AgregarProductos extends javax.swing.JFrame {

    ConexionBD conexion = new ConexionBD();
    Connection cn;
    Statement st;
    ResultSet rs;

    int cantidad;
    float precio, precioT;
    int comboIndex;
    Comprobante parent;

    /**
     * Creates new form AgregrarProductos
     */
    public AgregarProductos(Comprobante comprobante) {
        initComponents();
        mostrarproductos();
        this.parent = comprobante;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    DecimalFormat df = new DecimalFormat("0.00");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregar = new javax.swing.JButton();
        combo_productos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_precioT = new javax.swing.JTextField();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        combo_productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su producto" }));
        combo_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_productosActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto");

        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyReleased(evt);
            }
        });

        lbl_cantidad.setText("Cantidad");

        jLabel3.setText("Precio");

        jLabel4.setText("Precio Total");

        btn_cerrar.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(combo_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cantidad)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_precioT, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_cantidad)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_precioT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        agregar();
        this.parent.listar();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void combo_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_productosActionPerformed
        // TODO add your handling code here:
        txt_cantidad.setText("" + 1);
        llenarprecio();
    }//GEN-LAST:event_combo_productosActionPerformed

    private void txt_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyReleased
        // TODO add your handling code here:
        float ptotal = Float.parseFloat((String) txt_cantidad.getText()) * Float.parseFloat((String) txt_precio.getText());
        txt_precioT.setText("" + df.format(ptotal));

    }//GEN-LAST:event_txt_cantidadKeyReleased

    void llenarprecio() {

        int combo = combo_productos.getSelectedIndex();
        String sql = "select stock, precio_venta from productos where id=" + combo;

        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] productos = new Object[2];

            while (rs.next()) {
                productos[0] = rs.getString("stock");
                productos[1] = rs.getString("precio_venta");
            }
            lbl_cantidad.setText("cantidad disponbible: " + productos[0]);
            txt_precio.setText("" + productos[1]);
            float ptotal = Float.parseFloat((String) txt_cantidad.getText()) * Float.parseFloat((String) productos[1]);
            txt_precioT.setText("" + df.format(ptotal));
            cn.close();

        } catch (SQLException e) {

            System.out.println("error: " + e.getMessage());
        }
        System.out.println("index " + combo);

    }

    void mostrarproductos() {
        String sql = "Select nombre from productos";
        cn = conexion.conectar();
        try {
            //combo_productos.addItem("Seleccionar producto");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo_productos.addItem(rs.getString("nombre")); //nombre de la cabecera tabla pa mostrar
            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void agregar() {

        comboIndex = combo_productos.getSelectedIndex();
        cantidad = Integer.parseInt(txt_cantidad.getText());
        precio = Float.parseFloat(txt_precio.getText());
        precioT = Float.parseFloat(txt_precioT.getText());
        int identificador = idC;

        if (txt_cantidad.getText().length() == 0 || txt_precio.getText().length() == 0 || txt_precioT.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos obligatorios");
            //limpiartabla();
        } else {
            try {
                Integer stock = Integer.valueOf(lbl_cantidad.getText().split(":")[1].trim());
                cn = conexion.conectar();
                st = cn.createStatement();
                System.err.println("comboIndex: " + comboIndex);
                
                System.err.println("stock: " + stock);
                System.err.println("cantidad: " + cantidad);

                if (stock > 0 && cantidad <= stock) {
                    String sql = "insert into carrito (id,identificador,cantidad,precio,precioT)"
                            + "values('" + comboIndex + "','" + identificador + "','" + cantidad + "','" + precio + "','" + precioT + "')";

                    st.executeUpdate(sql);

                    stock = stock - cantidad;
                    String sqlRestaStock = "UPDATE productos SET stock=" + stock + " WHERE id =" + comboIndex;
                    st.executeUpdate(sqlRestaStock);
                    
                    JOptionPane.showMessageDialog(null, "Producto Agregado");
                    llenarprecio();
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Stock no disponible");
                }
                cn.close();
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
                System.out.println("Error");
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JComboBox<String> combo_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_precioT;
    // End of variables declaration//GEN-END:variables
}
