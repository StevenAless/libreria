/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utp.interfaces;
import java.awt.Color;
import conexion.Metodos_sql;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author Casa
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/logo.png")));
    }
    
    Metodos_sql metodos = new Metodos_sql();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();
        Version = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombre.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(112, 112, 112));
        txtnombre.setText("Ingrese su nombre");
        txtnombre.setBorder(null);
        txtnombre.setOpaque(false);
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 360, 30));

        txtapellido.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(112, 112, 112));
        txtapellido.setText("Ingrese su apellido");
        txtapellido.setBorder(null);
        txtapellido.setOpaque(false);
        txtapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapellidoFocusGained(evt);
            }
        });
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 360, 30));

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
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 360, 30));

        txtpwd.setForeground(new java.awt.Color(112, 112, 112));
        txtpwd.setText("Contraseña");
        txtpwd.setBorder(null);
        txtpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpwdFocusGained(evt);
            }
        });
        jPanel1.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 360, 30));

        Version.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Version.setForeground(new java.awt.Color(255, 255, 255));
        Version.setText("Versión 1.8");
        jPanel1.add(Version, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, 30));

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt1.setForeground(new java.awt.Color(112, 112, 112));
        txt1.setText("Cerrar");
        txt1.setToolTipText("");
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 40, 30));

        txt2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt2.setForeground(new java.awt.Color(112, 112, 112));
        txt2.setText("Ya tienes cuenta?");
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 120, 30));

        btn_login.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        btn_login.setForeground(new java.awt.Color(122, 117, 236));
        btn_login.setText("Ingresar");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, 70, 30));

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/registrar.png"))); // NOI18N
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logologingrande.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 410, 210));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Boceto.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 540, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Plantilla-registro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 530, 620));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Left-panel.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusGained
        // TODO add your handling code here:
        txtcorreo.setText("");
    }//GEN-LAST:event_txtcorreoFocusGained

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        // TODO add your handling code here:
        txtnombre.setText("");
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapellidoFocusGained
        // TODO add your handling code here:
        txtapellido.setText("");
    }//GEN-LAST:event_txtapellidoFocusGained

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtpwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpwdFocusGained
        // TODO add your handling code here:
        txtpwd.setText("");
    }//GEN-LAST:event_txtpwdFocusGained

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseClicked
        // TODO add your handling code here:
        int i = metodos.guardar(txtnombre.getText(), txtapellido.getText(), txtcorreo.getText(), txtpwd.getText());
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "Usuario Registrado Correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar al usuario");
        }

        Login log = new Login();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_registrarMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Version;
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables
}
