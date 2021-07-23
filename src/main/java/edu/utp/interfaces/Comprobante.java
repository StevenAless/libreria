/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utp.interfaces;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class Comprobante extends javax.swing.JFrame implements MouseListener {

    ConexionBD conexion = new ConexionBD();
    Connection cn;
    Statement st;
    ResultSet rs;
    ResultSet rs1;
    static int idC;
    String combo_tipo, comboC;
    double Ptotal = 0;
    Integer cliente;
    Integer idUsuario = null;
    Integer idPermisos = null;

    public Comprobante(Integer id, Integer permisos) {
        this.idUsuario = id;
        this.idPermisos = permisos;
        initComponents();
        this.tbl_products.addMouseListener(this);
        setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        mostrarcliente();
        jdFecha.setDateFormatString("dd/MM/yyyy");
        visible();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/logo.png")));
    }
    DecimalFormat df = new DecimalFormat("0.00");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        combo_cliente = new javax.swing.JComboBox<>();
        combo_tipoC = new javax.swing.JComboBox<>();
        txt_serie = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_products = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btn_listadocomp = new javax.swing.JLabel();
        btn_productos = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JLabel();
        lbl_nuevoC = new javax.swing.JLabel();
        btn_agregarPr = new javax.swing.JLabel();
        btn_descartar = new javax.swing.JLabel();
        btn_generarC = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo_cliente.setBorder(null);
        combo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(combo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 260, 50));

        combo_tipoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Comprobante", "Factura Electronica", "Boleta Electronica" }));
        combo_tipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoCActionPerformed(evt);
            }
        });
        jPanel1.add(combo_tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 260, 50));

        txt_serie.setToolTipText("");
        txt_serie.setBorder(null);
        jPanel1.add(txt_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 50, 20));

        txt_numero.setBorder(null);
        txt_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numeroActionPerformed(evt);
            }
        });
        jPanel1.add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 50, 20));

        jdFecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 160, 40));

        tbl_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_products.setEnabled(false);
        tbl_products.setRowHeight(25);
        jScrollPane1.setViewportView(tbl_products);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 720, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/Menu1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 190, 270, 70));

        btn_listadocomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu2.png"))); // NOI18N
        btn_listadocomp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listadocompMouseClicked(evt);
            }
        });
        jPanel1.add(btn_listadocomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 280, 270, 70));

        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu-productos.png"))); // NOI18N
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 380, 270, -1));

        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu4.png"))); // NOI18N
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });
        jPanel1.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 470, 270, -1));

        lbl_nuevoC.setText("+ nuevo");
        lbl_nuevoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nuevoCMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_nuevoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        btn_agregarPr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/btn-agregarP.png"))); // NOI18N
        btn_agregarPr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarPrMouseClicked(evt);
            }
        });
        jPanel1.add(btn_agregarPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, -1, -1));

        btn_descartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/btn-descartar.png"))); // NOI18N
        btn_descartar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_descartarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_descartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        btn_generarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/btn-generar.png"))); // NOI18N
        btn_generarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_generarCMouseClicked(evt);
            }
        });
        jPanel1.add(btn_generarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, -1, -1));

        btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Usuarios/Menu5.png"))); // NOI18N
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 560, 270, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/NewEdit/btn_salir.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/panel-right-2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 860, 680));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Panel-left.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listadocompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listadocompMouseClicked
        Listado pro = new Listado(this.idUsuario, this.idPermisos);
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_listadocompMouseClicked

    private void btn_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseClicked
        // TODO add your handling code here:
        Productos pro = new Productos(this.idUsuario, this.idPermisos);
        pro.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_productosMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        // TODO add your handling code here:
        Clientes clientes = new Clientes(this.idUsuario, this.idPermisos);
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_clientesMouseClicked

    private void combo_tipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoCActionPerformed
        // TODO add your handling code here:
        Rellenar();
    }//GEN-LAST:event_combo_tipoCActionPerformed

    private void lbl_nuevoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nuevoCMouseClicked
        // TODO add your handling code here:
        NuevoCliente nuevo = new NuevoCliente(this, null);
        nuevo.setVisible(true);

    }//GEN-LAST:event_lbl_nuevoCMouseClicked

    private void combo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_clienteActionPerformed
        // TODO add your handling code here:
        System.out.println("combo index: " + combo_cliente.getSelectedIndex());

    }//GEN-LAST:event_combo_clienteActionPerformed

    private void btn_descartarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descartarMouseClicked
        // TODO add your handling code here:
        borrarproductos(null);
    }//GEN-LAST:event_btn_descartarMouseClicked

    private void btn_agregarPrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPrMouseClicked
        // TODO add your handling code here:
        AgregarProductos agr = new AgregarProductos(this);
        agr.setVisible(true);
    }//GEN-LAST:event_btn_agregarPrMouseClicked

    private void btn_generarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generarCMouseClicked
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btn_generarCMouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseClicked
        // TODO add your handling code here:
        AdminUsuarios user = new AdminUsuarios(this.idUsuario, this.idPermisos);
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_usuariosMouseClicked

    private void txt_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numeroActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    void visible() {
        if (idPermisos == 1) {
            btn_usuarios.setVisible(true);
        } else {
            btn_usuarios.setVisible(false);
        }
    }

    public void Rellenar() {
        String sql = "select * from numeracion where id_numeracion=1";
        combo_tipo = combo_tipoC.getSelectedItem().toString();
        System.out.println(combo_tipo);

        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] numeracion = new Object[3];

            while (rs.next()) {
                numeracion[0] = rs.getString("id_numeracion");
                numeracion[1] = rs.getString("contFactura");
                numeracion[2] = rs.getString("contBoleta");

                if ("Factura Electronica".equals(combo_tipo)) {
                    txt_serie.setText("F001");
                    txt_numero.setText("000" + numeracion[1]);

                } else if ("Boleta Electronica".equals(combo_tipo)) {
                    txt_serie.setText("B001");
                    txt_numero.setText("000" + numeracion[2]);
                }
            }
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());

        }

        Integer correlativo = this.getCorrelativo(txt_serie.getText()).get("numero");
        System.err.println("correlativo: " + correlativo);
        Integer correlativoValor = correlativo == null ? 1 : correlativo + 1;
        txt_numero.setText("000" + correlativoValor);
        this.listar();
    }

    public void insertarFechas() {
        String sql = "insert into comprobante(fecha) values (?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            //st=cn.PreparedStatement();
            ResultSet rs = st.executeQuery(sql);
            pst.setString(7, ((JTextField) jdFecha.getDateEditor().getUiComponent()).getText());

            pst.execute();
            System.out.println("Fecha registrada");
        } catch (Exception e) {
            System.out.println(" error : " + e.getMessage());
        }
    }

    public void mostrarcliente() {
        String sql = "Select nombre, apellidos from clientes";
        cn = conexion.conectar();
        try {
            combo_cliente.addItem("Seleccionar Cliente");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo_cliente.addItem(rs.getString("apellidos") + ", " + rs.getString("nombre")); //nombre de la cabecera tabla pa mostrar
            }

        } catch (SQLException ex) {
            Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Map<String, Integer> getCorrelativo(String serie) {
        String sql = "SELECT numero_comprobante,id_comprobante from comprobante where serie_comprobante='" + serie + "' order by fecha desc limit 1";
        System.out.println("sql: " + sql);
        Map<String, Integer> map = new HashMap<>();
        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                map.put("numero", Integer.parseInt(rs.getString("numero_comprobante")));
                map.put("id", Integer.parseInt(rs.getString("id_comprobante")));
            }
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    private Integer SeleccionarCliente() {
        comboC = combo_cliente.getSelectedItem().toString();
        String sql = "select id_cliente from clientes where nombre='" + comboC.split(",")[1].trim() + "'";
        Integer idCliente = null;
        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                cliente = Integer.parseInt(rs.getString("id_cliente"));
                System.out.println("" + cliente);
                idCliente = Integer.parseInt(rs.getString("id_cliente"));
            }
            return idCliente;
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    void Limpiar() {
        combo_cliente.removeAllItems();
    }

    void borrarproductos(Integer idcarrito) {
        String sqlselect = "select * from carrito where facturado=0";
        String sqldelete = "delete from carrito where facturado=0";
        cn = conexion.conectar();
        try {
            st = cn.createStatement();
            System.out.println(idcarrito);
            if (idcarrito != null) {
                sqlselect = "select * from carrito where facturado=0 and id_carrito=" + idcarrito;
                sqldelete = "delete from carrito where facturado=0 and id_carrito=" + idcarrito;
            }

            ResultSet rs = st.executeQuery(sqlselect);
            List<Map<String, Integer>> lista = new ArrayList();
            while (rs.next()) {
                Map<String, Integer> item = new HashMap<>();
                item.put("id", rs.getInt("id"));
                item.put("cantidad", rs.getInt("cantidad"));
                lista.add(item);
            }
            this.resetStock(cn, st, lista);

            st.execute(sqldelete);
            cn.close();
            this.Rellenar();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error:" + e.getMessage());
        }
    }

    public void resetStock(Connection cn, Statement st, List<Map<String, Integer>> data) {
        data.forEach(d -> {
            Integer contador_stock = 0;
            String sqlproducto = "select * from productos where id = " + d.get("id");
            try {
                ResultSet rs1 = st.executeQuery(sqlproducto);
                while (rs1.next()) {
                    contador_stock = rs1.getInt("stock");
                }
                contador_stock = contador_stock + d.get("cantidad");
                String sqlupdate = "UPDATE productos SET stock=" + contador_stock + " WHERE id =" + d.get("id");
                st.executeUpdate(sqlupdate);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }

    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio");
        modelo.addColumn("precio Total");
        modelo.addColumn(" ");

        tbl_products.setModel(modelo);

        String sql = "select C.id_carrito, P.codigo, P.nombre, C.cantidad, C.precio, C.precioT from carrito C JOIN productos P ON C.id=P.id where facturado=0";
        //sql="Select P.id, P.codigo, P.nombre, P.stock, P.precio_venta, C.nombre from productos P JOIN categoria C ON P.id_categoria=C.id_categoria";

        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] productos = new Object[7];

            while (rs.next()) {
                productos[0] = rs.getString("id_carrito");
                productos[1] = rs.getString("codigo");
                productos[2] = rs.getString("nombre");
                productos[3] = rs.getString("cantidad");
                productos[4] = rs.getString("precio");
                productos[5] = rs.getString("precioT");
                productos[6] = "icono";
                //double total = 0;
                //        total = total + Double.parseDouble((String) productos[5]);
                System.out.println("" + Double.parseDouble((String) productos[5]));
                Ptotal = Ptotal + Double.parseDouble((String) productos[5]);

                modelo.addRow(productos);

            }
            tbl_products.setModel(modelo);
            tbl_products.getColumnModel().getColumn(6).setCellRenderer(new GestionCeldas("icono"));

        } catch (SQLException e) {
            System.out.println("error");
            System.out.println("esto viene de editar error id:" + idC);
        }
    }

    void guardar() {

        String tipo_comprobante = combo_tipo;
        String serie = txt_serie.getText();
        String numero = txt_numero.getText();
        //String Cliente=comboC;
        String Impuesto = df.format((Ptotal / 1.18) * 0.18);
        double precioT = Ptotal;
        System.out.println("idUsuario: " + this.idUsuario);
        int usuario = this.idUsuario;
        Integer idCliente = this.SeleccionarCliente();
        System.err.println("cliente: " + idCliente);

        //String sql="insert comprobante set id_cliente='"+cliente+"',id_usuario='"+usuario+"',tipo_comprobante='"+tipo_comprobante+"',serie_comprobante='"+serie+
        //        "',numero_comprobante='"+numero+"',impuesto='"+Impuesto+"',total_venta='"+precioT+"' where id_comprobante="+idC;
        String sql = "insert into comprobante (id_cliente,id_usuario,tipo_comprobante,serie_comprobante,numero_comprobante,impuesto,total_venta)"
                + "values('" + idCliente + "','" + usuario + "','" + tipo_comprobante + "','" + serie + "','" + numero + "','" + Impuesto + "','" + precioT + "')";

        if (combo_tipo.equals("") || txt_serie.equals("") || txt_numero.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos obligatorios");
        } else {
            try {
                cn = ConexionBD.conectar();
                st = cn.createStatement();

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "comprobante Registrado");

                Integer idcomprobante = this.getCorrelativo(txt_serie.getText()).get("id");

                String sqlFacturado = "UPDATE carrito SET facturado=1, Identificador=" + idcomprobante + " where facturado=0";
                st.executeUpdate(sqlFacturado);

                this.Rellenar();
                cn.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "error al regitrar comprobante" + e.getMessage());
            }
        }
    }
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprobante(0).setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_agregarPr;
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JLabel btn_descartar;
    private javax.swing.JLabel btn_generarC;
    private javax.swing.JLabel btn_listadocomp;
    private javax.swing.JLabel btn_productos;
    private javax.swing.JLabel btn_usuarios;
    private javax.swing.JComboBox<String> combo_cliente;
    private javax.swing.JComboBox<String> combo_tipoC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel lbl_nuevoC;
    private javax.swing.JTable tbl_products;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_serie;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = tbl_products.rowAtPoint(e.getPoint());
        int columna = tbl_products.columnAtPoint(e.getPoint());
        System.out.println(e);
        if (columna == 6) {
            String id = tbl_products.getValueAt(fila, 0).toString();
            borrarproductos(Integer.valueOf(id));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
