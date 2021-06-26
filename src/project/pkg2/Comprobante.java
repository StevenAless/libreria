/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static project.pkg2.Login.busqueda_id;

/**
 *
 * @author Casa
 */
public class Comprobante extends javax.swing.JFrame {

    ConexionBD conexion = new ConexionBD();
    Connection cn;
    Statement st;
    ResultSet rs;
    static int idC;
    String combo_tipo, comboC;
    double Ptotal = 0;
    Integer cliente;
    Integer idUsuario = null;

    /**
     * Creates new form Comprobante
     */
    public Comprobante(Integer id) {
        this.idUsuario = id;
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        mostrarcliente();
    }
    DecimalFormat df = new DecimalFormat("0.00");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txt_tipocambio = new javax.swing.JTextField();
        combo_cliente = new javax.swing.JComboBox<>();
        combo_tipoC = new javax.swing.JComboBox<>();
        txt_serie = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        btn_agregarP = new javax.swing.JButton();
        btn_ActualizarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_products = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btn_listadocomp = new javax.swing.JLabel();
        btn_productos = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JLabel();
        btn_guardarP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_nuevoC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_tipocambio.setBorder(null);
        jPanel1.add(txt_tipocambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 110, 20));

        combo_cliente.setBorder(null);
        combo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(combo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 190, 50));

        combo_tipoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Comprobante", "Factura Electronica", "Boleta Electronica" }));
        combo_tipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoCActionPerformed(evt);
            }
        });
        jPanel1.add(combo_tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 200, 40));

        txt_serie.setToolTipText("");
        txt_serie.setBorder(null);
        jPanel1.add(txt_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 60, 20));

        txt_numero.setBorder(null);
        jPanel1.add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 60, 20));

        jdFecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 150, 50));

        btn_agregarP.setText("Agregar Productos");
        btn_agregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, -1));

        btn_ActualizarP.setText("Actualizar");
        btn_ActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarPActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ActualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

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
        jScrollPane1.setViewportView(tbl_products);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 730, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/Menu1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btn_listadocomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu2.png"))); // NOI18N
        btn_listadocomp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listadocompMouseClicked(evt);
            }
        });
        jPanel1.add(btn_listadocomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu-productos.png"))); // NOI18N
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu4.png"))); // NOI18N
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });
        jPanel1.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btn_guardarP.setText("guardar");
        btn_guardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarPActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 630, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/Cliente.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        lbl_nuevoC.setText("+ nuevo");
        lbl_nuevoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nuevoCMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_nuevoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Comprobante/Panel-right.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 680));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Panel-left.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_cliente.setBorder(null);
        jPanel1.add(txt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listadocompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listadocompMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_listadocompMouseClicked

    private void btn_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseClicked
        // TODO add your handling code here:
        Productos pro = new Productos(this.idUsuario);
        pro.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_productosMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        // TODO add your handling code here:
        Clientes clientes = new Clientes(this.idUsuario);
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_clientesMouseClicked

    private void combo_tipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoCActionPerformed
        // TODO add your handling code here:
        Rellenar();
    }//GEN-LAST:event_combo_tipoCActionPerformed

    private void btn_guardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarPActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btn_guardarPActionPerformed

    private void btn_agregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPActionPerformed
        // TODO add your handling code here:
        AgregarProductos agr = new AgregarProductos();
        agr.setVisible(true);

    }//GEN-LAST:event_btn_agregarPActionPerformed

    private void lbl_nuevoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nuevoCMouseClicked
        // TODO add your handling code here:
        NuevoCliente nuevo = new NuevoCliente();
        nuevo.setVisible(true);

    }//GEN-LAST:event_lbl_nuevoCMouseClicked

    private void btn_ActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarPActionPerformed
        // TODO add your handling code here:
        combo_cliente.removeAllItems();
        mostrarcliente();
        listar();
    }//GEN-LAST:event_btn_ActualizarPActionPerformed

    private void combo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_clienteActionPerformed
        // TODO add your handling code here:
        System.out.println(combo_cliente.getSelectedIndex());

    }//GEN-LAST:event_combo_clienteActionPerformed

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

        Integer correlativo = this.getCorrelativo(txt_serie.getText());
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

    void mostrarcliente() {
        String sql = "Select nombre from clientes";
        cn = conexion.conectar();
        try {
            combo_cliente.addItem("Seleccionar Cliente");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo_cliente.addItem(rs.getString("nombre")); //nombre de la cabecera tabla pa mostrar
            }

        } catch (SQLException ex) {
            Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Integer getCorrelativo(String serie) {
        String sql = "SELECT numero_comprobante from comprobante where serie_comprobante='" + serie + "' order by fecha desc limit 1";
        System.out.println("sql: " + sql);
        Integer numero_comprobante = null;
        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                numero_comprobante = Integer.parseInt(rs.getString("numero_comprobante"));
            }
            cn.close();
            return numero_comprobante;
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    private Integer SeleccionarCliente() {
        comboC = combo_cliente.getSelectedItem().toString();
        String sql = "select id_cliente from clientes where nombre='" + comboC + "'";
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

    /*
    void obtenerid() {
        String sql = "Select id_comprobante from comprobante";
        cn = conexion.conectar();
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                idC = rs.getInt("id_comprobante");
            }

        } catch (SQLException ex) {
            Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     */
    void Limpiar() {
        combo_cliente.removeAllItems();
    }

    void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio");
        modelo.addColumn("precio Total");
        tbl_products.setModel(modelo);

        String sql = "select C.id_carrito, P.codigo, P.nombre, C.cantidad, C.precio, C.precioT from carrito C JOIN productos P ON C.id=P.id where facturado=0";
        //sql="Select P.id, P.codigo, P.nombre, P.stock, P.precio_venta, C.nombre from productos P JOIN categoria C ON P.id_categoria=C.id_categoria";

        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] productos = new Object[6];

            while (rs.next()) {
                productos[0] = rs.getString("id_carrito");
                productos[1] = rs.getString("codigo");
                productos[2] = rs.getString("nombre");
                productos[3] = rs.getString("cantidad");
                productos[4] = rs.getString("precio");
                productos[5] = rs.getString("precioT");
                //double total = 0;
                //        total = total + Double.parseDouble((String) productos[5]);
                System.out.println("" + Double.parseDouble((String) productos[5]));
                Ptotal = Ptotal + Double.parseDouble((String) productos[5]);

                modelo.addRow(productos);

            }
            tbl_products.setModel(modelo);

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
                cn = conexion.conectar();
                st = cn.createStatement();

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "comprobante Registrado");

                String sqlFacturado = "UPDATE carrito SET facturado=1";
                st.executeUpdate(sqlFacturado);

                this.Rellenar();
                cn.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "error al regitrar comprobante" + e.getMessage());
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ActualizarP;
    private javax.swing.JButton btn_agregarP;
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JButton btn_guardarP;
    private javax.swing.JLabel btn_listadocomp;
    private javax.swing.JLabel btn_productos;
    private javax.swing.JComboBox<String> combo_cliente;
    private javax.swing.JComboBox<String> combo_tipoC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel lbl_nuevoC;
    private javax.swing.JTable tbl_products;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_serie;
    private javax.swing.JTextField txt_tipocambio;
    // End of variables declaration//GEN-END:variables
}
