/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import conexion.ConexionBD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class AdminUsuarios extends javax.swing.JFrame {

    ConexionBD conexion = new ConexionBD();
    Connection cn;
    Statement st;
    ResultSet rs;
    static int id;
    Integer idUsuario = null;
    Integer idPermisos = null;
    DefaultTableModel tablamodelo;

    /**
     * Creates new form AdminUsuarios
     */
    public AdminUsuarios(Integer id, Integer permisos) {
        this.idUsuario = id;
        this.idPermisos = permisos;
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        listar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_comprobante = new javax.swing.JLabel();
        btn_listado = new javax.swing.JLabel();
        btn_productos = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JLabel();
        btn_admUsuarios = new javax.swing.JLabel();
        btn_editar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_permiso = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu1.png"))); // NOI18N
        btn_comprobante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprobanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_comprobanteMouseEntered(evt);
            }
        });
        jPanel1.add(btn_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 70));

        btn_listado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu2.png"))); // NOI18N
        btn_listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listadoMouseClicked(evt);
            }
        });
        jPanel1.add(btn_listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 70));

        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu-productos.png"))); // NOI18N
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/productos/Menu-Clientes.png"))); // NOI18N
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });
        jPanel1.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btn_admUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Usuarios/Menu5.png"))); // NOI18N
        jPanel1.add(btn_admUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, 60));

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Boton-editar.png"))); // NOI18N
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 710, 410));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Boton-eliminar.png"))); // NOI18N
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, -1, -1));

        lbl_id.setText("Id");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 30, -1));

        lbl_permiso.setText("Permiso");
        jPanel1.add(lbl_permiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 90, -1));

        lbl_nombre.setText("Nombre");
        lbl_nombre.setToolTipText("");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 110, -1));

        lbl_apellido.setText("Apellido");
        jPanel1.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 110, -1));

        lbl_correo.setText("correo");
        jPanel1.add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 140, -1));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 610, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Usuarios/Panel-derecho.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -10, 850, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Panel-left.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        // TODO add your handling code here:
        int fila=tabla_usuarios.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(null,"Ingrese los campos obligatorios");
        }else{
        String rol;
        id=Integer.parseInt((String)tabla_usuarios.getValueAt(fila,0).toString());
        String nombre=(String)tabla_usuarios.getValueAt(fila,1);
        String apellido=(String)tabla_usuarios.getValueAt(fila,2);
        String correo=(String)tabla_usuarios.getValueAt(fila,3);
        String permisos=(String) tabla_usuarios.getValueAt(fila,4);
        
        if("1".equals(permisos)){
            rol = "Administrador";
        }else{
            rol = "Empleado";
        }
        
        lbl_id.setText(""+id);
        lbl_nombre.setText(""+nombre);
        lbl_apellido.setText(""+apellido);
        lbl_correo.setText(""+correo);
        lbl_permiso.setText(""+rol);
        
        
        }
        
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        // TODO add your handling code here:
        EditarUsuario edit = new EditarUsuario();
        edit.setVisible(true);
        
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        listar("");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_comprobanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobanteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobanteMouseEntered

    private void btn_comprobanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobanteMouseClicked
        // TODO add your handling code here:
        Comprobante comp = new Comprobante(this.idUsuario,this.idPermisos);
        comp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_comprobanteMouseClicked

    private void btn_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listadoMouseClicked
        // TODO add your handling code here:
        Listado pro = new Listado(this.idUsuario,this.idPermisos);
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_listadoMouseClicked

    private void btn_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseClicked
        // TODO add your handling code here:
        Productos products = new Productos(this.idUsuario,this.idPermisos);
        products.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_productosMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        // TODO add your handling code here:
        Clientes clientes = new Clientes(this.idUsuario,this.idPermisos);
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_clientesMouseClicked

    void listar(String correo) {
        DefaultTableModel tablamodelo = new DefaultTableModel();
        tablamodelo.addColumn("Id");
        tablamodelo.addColumn("Nombre");
        tablamodelo.addColumn("Apellidos");
        tablamodelo.addColumn("Correo");
        tablamodelo.addColumn("Permisos");
        tabla_usuarios.setModel(tablamodelo);
        String sql = "";
        if (correo.equals("")) {
            sql = "Select id_usuario,nombre, apellidos, correo, permisos from usuarios";
        } else {
            //esto es para que busque letra por letra
            sql = "Select id_usuario,nombre, apellidos, correo, permisos from usuarios where correo like'%" + correo + "%'";
        }
        String Usuarios[] = new String[5];
        cn = conexion.conectar();

        try {
            st = cn.createStatement();
            ResultSet resul = st.executeQuery(sql);
            //mandamos datos al jtable
            while (resul.next()) {
                Usuarios[0] = resul.getString(1);
                Usuarios[1] = resul.getString(2);
                Usuarios[2] = resul.getString(3);
                Usuarios[3] = resul.getString(4);
                Usuarios[4] = resul.getString(5);
                tablamodelo.addRow(Usuarios);
            }
            
            tabla_usuarios.setModel(tablamodelo);
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Clientes[] = new String[4];
        cn = conexion.conectar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel btn_admUsuarios;
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JLabel btn_comprobante;
    private javax.swing.JLabel btn_editar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel btn_listado;
    private javax.swing.JLabel btn_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_permiso;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
