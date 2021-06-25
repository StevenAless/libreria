/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;
import conexion.ConexionBD;
import java.awt.Color;
//import conexion.Metodos_sql;
//import interfaz.Inicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Casa
 */
public class Clientes extends javax.swing.JFrame {
    
    ConexionBD conexion = new ConexionBD();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    static int id;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
        listar(txtbuscar.getText());
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        
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
        jLabel3 = new javax.swing.JLabel();
        btn_productos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_comprobantes = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_num = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JLabel();
        btn_edit = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, 60));

        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu-productos.png"))); // NOI18N
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 270, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu-Clientes.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 270, 60));

        btn_comprobantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu1.png"))); // NOI18N
        btn_comprobantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprobantesMouseClicked(evt);
            }
        });
        jPanel1.add(btn_comprobantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 60));

        lbl_id.setText("id");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        lbl_name.setText("Nombre y apellido");
        jPanel1.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        lbl_num.setText("Número");
        jPanel1.add(lbl_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        lbl_type.setText("Tipo de documento");
        jPanel1.add(lbl_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Boton-eliminar.png"))); // NOI18N
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, -1, -1));

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Boton-editar.png"))); // NOI18N
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, -1, -1));

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/NewEdit/Boton-agregar.png"))); // NOI18N
        btn_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevoMouseClicked(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, -1));

        txtbuscar.setBorder(null);
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 220, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/NewEdit/Boton-buscar.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, -1, -1));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DNI", "RUC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setResizable(false);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 680, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/panel-right.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 850, 680));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Panel-left.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        // TODO add your handling code here:
        int fila=TablaDatos.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(null,"Ingrese los campos obligatorios");
        }else{
        id=Integer.parseInt((String)TablaDatos.getValueAt(fila,0).toString());
        String nombre=(String)TablaDatos.getValueAt(fila,1);
        String tipo_docu=(String)TablaDatos.getValueAt(fila,2);
        String num_docu=(String)TablaDatos.getValueAt(fila,3);

        lbl_id.setText(""+id);
        lbl_name.setText(""+nombre);
        lbl_num.setText(""+num_docu);
        lbl_type.setText(""+tipo_docu);
        
        
        }
  
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:
        EditarCliente edit = new EditarCliente();
        //edit.lbl_id2.setText((String)lbl_id.getText().toString());
        edit.setVisible(true);

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMouseClicked
        // TODO add your handling code here:
        NuevoCliente nuevo = new NuevoCliente();
        nuevo.setVisible(true);
        
    }//GEN-LAST:event_btn_nuevoMouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        // TODO add your handling code here:
        listar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        // TODO add your handling code here:
        eliminar();
        listar(txtbuscar.getText());
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        listar(txtbuscar.getText());
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseClicked
        // TODO add your handling code here:
        Productos productos = new Productos();
        productos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_productosMouseClicked

    private void btn_comprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobantesMouseClicked
        // TODO add your handling code here:
         Comprobante comp = new Comprobante();
        comp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_comprobantesMouseClicked

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }
    void listar(String numero_documento)  { //buscar()
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("id_cliente");
    modelo.addColumn("nombre");
    modelo.addColumn("tipo_documento");
    modelo.addColumn("numero_documento");
    /*modelo.addColumn("direccion");
    modelo.addColumn("departamento");
    modelo.addColumn("provincia");
    modelo.addColumn("distrito");
    modelo.addColumn("telefono");
    modelo.addColumn("correo");*/
    TablaDatos.setModel(modelo);
    String sql="";
    if(numero_documento.equals("")){
        sql="Select id_cliente, nombre, tipo_documento, numero_documento from clientes ";
        }else{
        //esto es para que busque letra por letra
        sql="Select id_cliente, nombre, tipo_documento, numero_documento from clientes where numero_documento like'%"+numero_documento+"%'";
    }
  String Clientes[]=new String[4];
  cn=conexion.conectar();

    try {
        st=cn.createStatement();
        ResultSet resul=st.executeQuery(sql);
      //mandamos datos al jtable
      while(resul.next()){
          Clientes[0]=resul.getString(1);
          Clientes[1]=resul.getString(2);
          Clientes[2]=resul.getString(3);
          Clientes[3]=resul.getString(4);
          /*Clientes[4]=resul.getString(5);
          Clientes[5]=resul.getString(6);
          Clientes[6]=resul.getString(7);
          Clientes[7]=resul.getString(8);
          Clientes[8]=resul.getString(9);
          Clientes[9]=resul.getString(10);*/

          modelo.addRow(Clientes);

    } 
    TablaDatos.setModel(modelo); 

    }catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

    //esto es para que al listar no se dupliquen las entradas borra las anteriores :v
   void limpiartabla(){
        for(int i=0;i<=TablaDatos.getRowCount()-1;i++){
        modelo.removeRow(i);
       i=i-1;
        }
   }
    
   void eliminar(){
       int filaselccionado=TablaDatos.getSelectedRow();
       if(filaselccionado==-1){
        JOptionPane.showMessageDialog(null,"Seleccione una fila para eliminar");
        }else{
           String sql="delete from clientes where id_cliente="+id;
            try{
                cn=conexion.conectar();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"El cliente fue eliminado");
                limpiartabla();
                
                }catch(Exception e){
                   System.out.println("error: "+e.getMessage());
                }
       }
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel btn_comprobantes;
    public static javax.swing.JLabel btn_edit;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel btn_nuevo;
    private javax.swing.JLabel btn_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_num;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
