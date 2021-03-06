/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utp.interfaces;

import conexion.ConexionBD;
import static conexion.Metodos_sql.conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static edu.utp.interfaces.NuevoProducto.combo_categoria;
import static edu.utp.interfaces.Productos.idP;
import java.awt.Toolkit;

/**
 *
 * @author Casa
 */
public class EditarProducto extends javax.swing.JFrame {
    ConexionBD conexion = new ConexionBD();
    Connection cn;
    Statement st;
    ResultSet rs;
   
    /**
     * Creates new form EditarProducto
     */
    public EditarProducto() {
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        listar();
        mostrarcategoria();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_guardarP = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_pventa = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        txt_pcompra = new javax.swing.JTextField();
        combo_categoriaE = new javax.swing.JComboBox<>();
        btn_exitP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/NewEdit/Boton-editar.png"))); // NOI18N
        btn_guardarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarPMouseClicked(evt);
            }
        });
        jPanel1.add(btn_guardarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, -1));

        txt_codigo.setBorder(null);
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 30));

        txt_descripcion.setBorder(null);
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 590, 60));

        txt_nombre.setBorder(null);
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 370, 30));

        txt_pventa.setBorder(null);
        txt_pventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pventaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_pventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 30));

        txt_stock.setBorder(null);
        txt_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stockKeyTyped(evt);
            }
        });
        jPanel1.add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, 30));

        txt_pcompra.setBorder(null);
        txt_pcompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pcompraKeyTyped(evt);
            }
        });
        jPanel1.add(txt_pcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 150, 30));

        combo_categoriaE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una categoria" }));
        jPanel1.add(combo_categoriaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 280, 30));

        btn_exitP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/NewEdit/Boton-eliminar.png"))); // NOI18N
        btn_exitP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitPMouseEntered(evt);
            }
        });
        jPanel1.add(btn_exitP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/productos/EditarProducto.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void btn_guardarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarPMouseClicked
        // TODO add your handling code here:
        guardar();
        this.dispose();
    }//GEN-LAST:event_btn_guardarPMouseClicked

    private void btn_exitPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exitPMouseEntered

    private void btn_exitPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_exitPMouseClicked

    private void txt_pventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pventaKeyTyped
        // TODO add your handling code here:
          if(Character.isLetter(evt.getKeyChar()))
            evt.consume();
        else{
        try{
            Double.parseDouble(txt_pventa.getText()+evt.getKeyChar());
        }catch(NumberFormatException e){
            evt.consume();
        }}
    }//GEN-LAST:event_txt_pventaKeyTyped

    private void txt_pcompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pcompraKeyTyped
        // TODO add your handling code here:
        if(Character.isLetter(evt.getKeyChar()))
               evt.consume();
           else{
           try{
               Double.parseDouble(txt_pcompra.getText()+evt.getKeyChar());
           }catch(NumberFormatException e){
               evt.consume();
           }}
    }//GEN-LAST:event_txt_pcompraKeyTyped

    private void txt_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
                if(Character.isLetter(validar)){
                    getToolkit().beep();
                    evt.consume();
                }
    }//GEN-LAST:event_txt_stockKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProducto().setVisible(true);
            }
        });
    }

    void listar(){
        
        String sql="select * from productos where id="+idP;

        try{
            cn=conexion.conectar();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[]productos=new Object[6];
           
           
            while(rs.next()){
            productos[0]=rs.getString("codigo");    
            productos[1]=rs.getString("nombre");
            productos[2]=rs.getString("precio_venta");
            productos[3]=rs.getString("stock");
            productos[4]=rs.getString("descripcion");
            productos[5]=rs.getString("precio_compra");

            }
            
            txt_codigo.setText(""+productos[0]);
            txt_nombre.setText(""+productos[1]);
            txt_pventa.setText(""+productos[2]);
            txt_pcompra.setText(""+productos[5]);
            txt_stock.setText(""+productos[3]);
            txt_descripcion.setText(""+productos[4]);
            
            
            
        }catch (SQLException e){
             System.out.println("error");
            System.out.println("esto viene de editar error id:"+idP);
        }
    }
    void guardar(){

        String codigo_producto=txt_codigo.getText();
        String nombre=txt_nombre.getText();
        String precio_venta=txt_pventa.getText();
        String precio_compra=txt_pcompra.getText();
        String stock=txt_stock.getText();
        String descripcion=txt_descripcion.getText();
        Integer codigo_categoria=combo_categoriaE.getSelectedIndex();
        

        String sql="update productos set id_categoria='"+codigo_categoria+"',codigo='"+codigo_producto+"',nombre='"+nombre+"',precio_venta='"+precio_venta+
                "',stock='"+stock+"',descripcion='"+descripcion+"',precio_compra='"+precio_compra+"' where id="+idP;
        if(nombre.equals("")||codigo_producto.equals("")||precio_venta.equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese los campos obligatorios");
        }else{
            try{
                cn=conexion.conectar();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Producto Actualizado");
                }catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null,"error al modificar");
                }
        }
    }
    
    void mostrarcategoria(){
        String sql="Select * from categoria";
        cn=conexion.conectar();
    try {

        st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
        combo_categoriaE.addItem(rs.getString("nombre")); //nombre de la cabecera tabla pa mostrar
        }

    } catch (SQLException ex) {
        Logger.getLogger(EditarProducto.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel btn_exitP;
    public static javax.swing.JLabel btn_guardarP;
    public static javax.swing.JComboBox<String> combo_categoriaE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pcompra;
    private javax.swing.JTextField txt_pventa;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
