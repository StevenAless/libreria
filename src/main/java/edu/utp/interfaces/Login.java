package edu.utp.interfaces;

import java.awt.Color;
import conexion.Metodos_sql;
import java.awt.Toolkit;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge zavala
 */
public class Login extends javax.swing.JFrame {

    public Map<String,String> busqueda_nombre;
    static int busqueda_id;
    
    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/logo.png")));
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        txtcorreo.setBackground(new Color(0, 0, 0, 0));
        txtpwd.setBackground(new Color(0, 0, 0, 0));

    }

    Metodos_sql metodos = new Metodos_sql();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boton_ingresar = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        password1 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        registro = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        DERECHA = new javax.swing.JLabel();
        IZQUIERDA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Boceto.png"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 310, 530, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logologingrande.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 210));

        boton_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/boton.png"))); // NOI18N
        boton_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_ingresarMouseClicked(evt);
            }
        });
        jPanel1.add(boton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 230, 70));

        correo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        correo.setForeground(new java.awt.Color(112, 112, 112));
        correo.setText("Email");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 40, 30));

        txtcorreo.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(112, 112, 112));
        txtcorreo.setText("Ingrese su correo");
        txtcorreo.setBorder(null);
        txtcorreo.setOpaque(false);
        txtcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcorreoFocusGained(evt);
            }
        });
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 360, 30));

        password1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        password1.setForeground(new java.awt.Color(112, 112, 112));
        password1.setText("Password");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 80, 30));

        txtpwd.setForeground(new java.awt.Color(112, 112, 112));
        txtpwd.setText("Contraseña");
        txtpwd.setBorder(null);
        txtpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpwdFocusGained(evt);
            }
        });
        jPanel1.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 360, 30));

        registro.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        registro.setForeground(new java.awt.Color(122, 117, 236));
        registro.setText("Registrate");
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
        });
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 70, 30));

        version.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        version.setForeground(new java.awt.Color(255, 255, 255));
        version.setText("Versión 1.8");
        jPanel1.add(version, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, 30));

        lbl_1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(112, 112, 112));
        lbl_1.setText("Cerrar");
        lbl_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 40, 30));

        lbl_2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_2.setForeground(new java.awt.Color(112, 112, 112));
        lbl_2.setText("No tienes cuenta?");
        jPanel1.add(lbl_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 120, 30));

        DERECHA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Grupo 1.png"))); // NOI18N
        jPanel1.add(DERECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 530, 620));

        IZQUIERDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Left-panel.png"))); // NOI18N
        jPanel1.add(IZQUIERDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 550, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1030, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtcorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusGained
        // TODO add your handling code here:
        txtcorreo.setText("");
    }//GEN-LAST:event_txtcorreoFocusGained

    private void txtpwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpwdFocusGained
        // TODO add your handling code here:
        txtpwd.setText("");
    }//GEN-LAST:event_txtpwdFocusGained

    private void boton_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_ingresarMouseClicked
        // TODO add your handling code here:
        String busqueda_usuario = Metodos_sql.buscarUsuarioRegistrado(txtcorreo.getText(), txtpwd.getText());
        if (busqueda_usuario.equals("Usuario encontrado")) {
            busqueda_nombre = metodos.buscarNombre(txtcorreo.getText());

            JOptionPane.showMessageDialog(this, "Bienvenido(a) \n" + busqueda_nombre.get("nombre"));

            Comprobante comp = new Comprobante(Integer.valueOf(busqueda_nombre.get("id")),Integer.valueOf(busqueda_nombre.get("permisos")));
            
            comp.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no Registrado, por favor Registrese");
        }

    }//GEN-LAST:event_boton_ingresarMouseClicked

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        // TODO add your handling code here:
        Registro reg = new Registro();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registroMouseClicked

    private void lbl_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_1MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DERECHA;
    private javax.swing.JLabel IZQUIERDA;
    private javax.swing.JLabel boton_ingresar;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel registro;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
