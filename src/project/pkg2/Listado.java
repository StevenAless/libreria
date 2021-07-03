package project.pkg2;

import com.google.gson.GsonBuilder;
import static conexion.ConexionBD.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JsonDataSource;

public class Listado extends javax.swing.JFrame implements MouseListener {

    Connection cn;
    Statement st;
    static int idC;
    double Ptotal = 0;
    Integer cliente;
    Integer idUsuario = null;
    Integer idPermisos = null;

    public Listado(Integer id,Integer permisos) {
        this.idUsuario = id;
        this.idPermisos = permisos;
        initComponents();
        txt_fecha.setDateFormatString("dd/MM/yyyy");
        this.tbl_comprobantes.addMouseListener(this);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        this.listar("");
        visible();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_comprobantes = new javax.swing.JTable();
        btn_comprobante = new javax.swing.JLabel();
        btn_listadocomp = new javax.swing.JLabel();
        btn_productos = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JLabel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        combo_comprobante = new javax.swing.JComboBox<>();
        txt_cliente = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JLabel();
        btn_filtrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_comprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_comprobantes.setEnabled(false);
        tbl_comprobantes.setRowHeight(25);
        tbl_comprobantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_comprobantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_comprobantes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 690, 360));

        btn_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Menu1.png"))); // NOI18N
        btn_comprobante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprobanteMouseClicked(evt);
            }
        });
        jPanel1.add(btn_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 70));

        btn_listadocomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/Menu2.png"))); // NOI18N
        btn_listadocomp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listadocompMouseClicked(evt);
            }
        });
        jPanel1.add(btn_listadocomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 70));

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
        jPanel1.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        txt_fecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 160, 40));

        combo_comprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Comprobante", "Factura Electronica", "Boleta Electronica" }));
        combo_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_comprobanteActionPerformed(evt);
            }
        });
        jPanel1.add(combo_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 260, 40));

        txt_cliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        txt_cliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_cliente.setText("Ingrese nombre de cliente");
        txt_cliente.setToolTipText("");
        txt_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_clienteFocusGained(evt);
            }
        });
        jPanel1.add(txt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 510, 30));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/btn_limpiar.png"))); // NOI18N
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, -1));

        btn_filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/btn_filtrar.png"))); // NOI18N
        btn_filtrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filtrarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/CLIENTE.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/TIPO DE COMPROBANTE.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/FECHA.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Usuarios/Menu5.png"))); // NOI18N
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 270, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Listado/Fondo-derecha.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clientes/Panel-left.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        jButton2.setText("filtrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listadocompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listadocompMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_listadocompMouseClicked

    private void btn_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseClicked
        Productos pro = new Productos(this.idUsuario,this.idPermisos);
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_productosMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        Clientes clientes = new Clientes(this.idUsuario,this.idPermisos);
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_clientesMouseClicked

    private void tbl_comprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_comprobantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_comprobantesMouseClicked

    private void combo_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_comprobanteActionPerformed

    }//GEN-LAST:event_combo_comprobanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        filtrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_clienteFocusGained
        // TODO add your handling code here:
        txt_cliente.setText("");
    }//GEN-LAST:event_txt_clienteFocusGained

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        // TODO add your handling code here:
        limpiar();

    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void btn_filtrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtrarMouseClicked
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_btn_filtrarMouseClicked

    private void btn_comprobanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobanteMouseClicked
        // TODO add your handling code here:
        Comprobante comp = new Comprobante(this.idUsuario,this.idPermisos);
        comp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_comprobanteMouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseClicked
        // TODO add your handling code here:
        AdminUsuarios usuarios = new AdminUsuarios(this.idUsuario,this.idPermisos);
        usuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_usuariosMouseClicked

    void visible(){
        if(idPermisos == 1){
            btn_usuarios.setVisible(true);
        } else {
            btn_usuarios.setVisible(false);
        }
    }
    
    private void limpiar() {
        combo_comprobante.setSelectedIndex(0);
        txt_fecha.setDate(null);
        txt_cliente.setText("");
        filtrar();
    }

    private void filtrar() {
        String filtro = "";
        Locale loc = new Locale("es", "PE");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
        String combo = combo_comprobante.getSelectedItem().toString();
        if ("Factura Electronica".equalsIgnoreCase(combo) || "Boleta Electronica".equalsIgnoreCase(combo)) {
            filtro += "AND c.tipo_comprobante='" + combo + "'";
        }
        if (txt_fecha.getDate() != null) {
            String[] date = dateFormat.format(txt_fecha.getDate()).split("/");
            filtro += " AND c.fecha like '%" + date[2] + "-" + date[1] + "-" + date[0] + "%'";
        }
        final String cliente = txt_cliente.getText();
        if (!"".equals(cliente.trim())) {
            filtro += " AND cl.nombre like '%" + cliente + "%'";
        }
        System.err.println(filtro);
        listar(filtro);
    }

    private void listar(String filtro) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("#");
        modelo.addColumn("FECHA DE EMISIÓN");
        modelo.addColumn("CLIENTE");
        modelo.addColumn("TIPO COMPROBANTE");
        modelo.addColumn("SERIE CORRELATIVO");
        modelo.addColumn("T. GRAVADO");
        modelo.addColumn("T. IGV");
        modelo.addColumn(" ");

        tbl_comprobantes.setModel(modelo);

        String sql = "select c.*, cl.nombre as cliente from comprobante c inner join clientes cl on c.id_cliente = cl.id_cliente WHERE 1=1 " + filtro;

        cn = conectar();
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Object[] productos = new Object[8];

            while (rs.next()) {
                productos[0] = rs.getString("id_comprobante");
                productos[1] = rs.getString("fecha").split(" ")[0];
                productos[2] = rs.getString("cliente");
                productos[3] = rs.getString("tipo_comprobante");
                productos[4] = String.valueOf(rs.getString("serie_comprobante") + "-" + rs.getString("numero_comprobante"));
                productos[5] = rs.getDouble("total_venta");
                productos[6] = rs.getDouble("impuesto");
                productos[7] = "iconopdf";
                modelo.addRow(productos);
            }
            tbl_comprobantes.setModel(modelo);
            tbl_comprobantes.getColumnModel().getColumn(0).setPreferredWidth(4);
            tbl_comprobantes.getColumnModel().getColumn(4).setPreferredWidth(6);
            tbl_comprobantes.getColumnModel().getColumn(5).setPreferredWidth(8);
            tbl_comprobantes.getColumnModel().getColumn(6).setPreferredWidth(8);
            tbl_comprobantes.getColumnModel().getColumn(7).setPreferredWidth(4);
            tbl_comprobantes.getColumnModel().getColumn(7).setCellRenderer(new GestionCeldas("iconopdf"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Listado(0).setVisible(true);
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JLabel btn_comprobante;
    private javax.swing.JLabel btn_filtrar;
    private javax.swing.JLabel btn_limpiar;
    private javax.swing.JLabel btn_listadocomp;
    private javax.swing.JLabel btn_productos;
    private javax.swing.JLabel btn_usuarios;
    private javax.swing.JComboBox<String> combo_comprobante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_comprobantes;
    private javax.swing.JTextField txt_cliente;
    private com.toedter.calendar.JDateChooser txt_fecha;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = tbl_comprobantes.rowAtPoint(e.getPoint());
        int columna = tbl_comprobantes.columnAtPoint(e.getPoint());
        if (columna == 7) {
            Integer id = Integer.valueOf(tbl_comprobantes.getValueAt(fila, 0).toString());
            List<Map<String, Object>> items = get_items(id);
            if (items.size() <= 0) {
                JOptionPane.showMessageDialog(this, "No se encontraron items para el comprobante");
            } else {
                String json = new GsonBuilder().setPrettyPrinting().create().toJson(items);
                System.out.println(json);
                generarReporte(json, get_comprobante(id));
            }
        }
    }

    public static void generarReporte(String json, Map parameters) {
        final String output = System.getProperty("user.home") + File.separator + "comprobantes" + File.separator;
        File theDir = new File(output);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        try (InputStream fileIn = Listado.class.getResourceAsStream("factura_v_6.jasper")) {
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

    public List<Map<String, Object>> get_items(Integer id) {
        String sql = "select c.*,p.codigo, p.descripcion from carrito c inner join productos p on p.id = c.id where c.Identificador=" + id;
        List<Map<String, Object>> lista = new ArrayList<>();

        cn = conectar();
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("codigo", rs.getString("codigo"));
                map.put("cantidad", rs.getString("cantidad"));
                map.put("precio", rs.getString("precio"));
                map.put("preciototal", rs.getString("precioT"));
                map.put("descripcion", rs.getString("descripcion"));
                lista.add(map);
            }
            cn.close();
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public Map<String, String> get_comprobante(Integer id) {
        String sql = " select c.*, cl.nombre as cliente, cl.tipo_documento as tipodoc, cl.numero_documento as numdoc, cl.direccion from comprobante c inner join clientes cl on c.id_cliente = cl.id_cliente WHERE c.id_comprobante=" + id;
        Map<String, String> map = new HashMap<>();

        cn = conectar();
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                map.put("id", rs.getString("id_comprobante"));
                map.put("fecha", rs.getString("fecha").split(" ")[0]);
                map.put("cliente", rs.getString("cliente"));
                map.put("tipocomprobante", rs.getString("tipo_comprobante").toUpperCase());
                map.put("serie", String.valueOf(rs.getString("serie_comprobante") + "-" + rs.getString("numero_comprobante")));
                map.put("total", rs.getString("total_venta"));
                map.put("impuesto", rs.getString("impuesto"));
                map.put("tipodoc", rs.getString("tipodoc"));
                map.put("numdoc", rs.getString("numdoc"));
                map.put("direccion", rs.getString("direccion"));
                map.put("montoletras", NumeroLetras.Convertir(rs.getString("total_venta"), true));
            }
            cn.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
