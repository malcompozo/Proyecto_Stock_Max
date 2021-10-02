package vista;

import bd.Conexion;
import controlador.UsuarioControlador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.UsuarioAdmin;

public class Login extends javax.swing.JFrame {

    Main principal = new Main();
    private boolean validacion;

    public Login() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/usuario.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();
        iniciarSesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        crearUsuario = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        txtCrearUsuario = new javax.swing.JTextField();
        txtCrearPass = new javax.swing.JPasswordField();
        txtCrearCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesion");
        setBackground(new java.awt.Color(110, 160, 186));
        setResizable(false);

        layeredPane.setLayout(new java.awt.CardLayout());

        iniciarSesion.setBackground(new java.awt.Color(57, 109, 145));
        iniciarSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        iniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText(" Contraseña");
        iniciarSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        iniciarSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText(" Usuario");
        iniciarSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        iniciarSesion.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, -1));

        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        iniciarSesion.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 106, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/STOCK.png"))); // NOI18N
        iniciarSesion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        btnCrear.setText("Crear Usuario");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        iniciarSesion.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stockmax1.png"))); // NOI18N
        iniciarSesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        layeredPane.add(iniciarSesion, "card2");

        crearUsuario.setBackground(new java.awt.Color(57, 109, 145));
        crearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        crearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        crearUsuario.add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));
        crearUsuario.add(txtCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 173, -1));
        crearUsuario.add(txtCrearPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 173, -1));
        crearUsuario.add(txtCrearCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 173, -1));

        jLabel3.setText("Nombre Usuario:");
        crearUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel4.setText("Contraseña:");
        crearUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel5.setText("Correo:");
        crearUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        crearUsuario.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stockmax1.png"))); // NOI18N
        crearUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        layeredPane.add(crearUsuario, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        try {
            UsuarioAdmin user = new UsuarioAdmin(true, this.txtUsuario.getText(), this.txtPass.getText(), null);
            UsuarioControlador controlador = new UsuarioControlador();
            controlador.buscarUsuario(user);
            validacion = controlador.validarSesion(user.getNombreUsuario(), user.getPass());

            if (validacion) {
                if (Conexion.buscarUsuario) {
                    this.setVisible(false);
                    principal.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta", "Error", 1);
                    this.txtUsuario.setText("");
                    this.txtPass.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Faltan campos por rellenar", "Error", 1);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        cambiarPanel(crearUsuario);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        try {
            UsuarioAdmin user = new UsuarioAdmin(true, this.txtCrearUsuario.getText(), this.txtCrearPass.getText(), this.txtCrearCorreo.getText());
            UsuarioControlador controlador = new UsuarioControlador();
            validacion = controlador.validarCreacion(user.getNombreUsuario(), user.getPass(), user.getCorreo());

            if (validacion) {
                if (!Conexion.buscarUsuario) {
                    controlador.agregarUsuario(user);
                    JOptionPane.showMessageDialog(null, "Datos almacenados", "Guardar", 1);
                    cambiarPanel(iniciarSesion);
                    this.txtCrearUsuario.setText("");
                    this.txtCrearCorreo.setText("");
                    this.txtCrearPass.setText("");
                } else {
                    System.out.println("El usuario ya existe");
                    JOptionPane.showMessageDialog(null, "Usuario ya existe", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Faltan campos por rellenar", "Error", 0);
            }
        } catch (Exception e) {
            System.out.println("Error al crear usuario");
        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        cambiarPanel(iniciarSesion);
    }//GEN-LAST:event_btnVolverActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void cambiarPanel(JPanel panel) {
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JPanel iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JTextField txtCrearCorreo;
    private javax.swing.JPasswordField txtCrearPass;
    private javax.swing.JTextField txtCrearUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
