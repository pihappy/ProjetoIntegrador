/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikael
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin1
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTelaLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblIntroducaoLogin = new javax.swing.JLabel();
        lblNomeLogin = new javax.swing.JLabel();
        lblSenhaLogin = new javax.swing.JLabel();
        txtNomeLogin = new javax.swing.JTextField();
        btnEntrarLogin = new javax.swing.JButton();
        txtSenhaLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PiHappy - Login");

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dadodbrinquedo (1) (1).png"))); // NOI18N

        lblIntroducaoLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblIntroducaoLogin.setText("Entre com seus dados");

        lblNomeLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNomeLogin.setText("Nome:");

        lblSenhaLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSenhaLogin.setText("Senha:");

        txtNomeLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnEntrarLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEntrarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        btnEntrarLogin.setText("Entrar");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTelaLoginLayout = new javax.swing.GroupLayout(pnlTelaLogin);
        pnlTelaLogin.setLayout(pnlTelaLoginLayout);
        pnlTelaLoginLayout.setHorizontalGroup(
            pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeLogin)
                    .addComponent(lblSenhaLogin)
                    .addComponent(txtNomeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnEntrarLogin))
                    .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblIntroducaoLogin))
                    .addComponent(txtSenhaLogin))
                .addGap(27, 27, 27))
        );

        pnlTelaLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblNomeLogin, lblSenhaLogin});

        pnlTelaLoginLayout.setVerticalGroup(
            pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblIntroducaoLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenhaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEntrarLogin)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        String usuario = "Pihappy";
        String senha = "pihappy123";
        if(usuario.equalsIgnoreCase(txtNomeLogin.getText())){
            if(senha.equals(valueOf(txtSenhaLogin.getPassword()))){
                TelaPrincipal form2 = new TelaPrincipal();  
                form2.setVisible(true);  
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário incorreto!");
        }
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JLabel lblIntroducaoLogin;
    private javax.swing.JLabel lblNomeLogin;
    private javax.swing.JLabel lblSenhaLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlTelaLogin;
    private javax.swing.JTextField txtNomeLogin;
    private javax.swing.JPasswordField txtSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
