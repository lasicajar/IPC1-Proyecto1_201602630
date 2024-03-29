/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Lusvin
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtpresta = new javax.swing.JButton();
        jbtbibliovirtual = new javax.swing.JButton();
        jbtLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Usuario");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/user.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/Usac_logo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 180));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 0, -1, -1));

        jbtpresta.setText("Prestamo de Libro");
        jbtpresta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtpresta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtprestaMouseClicked(evt);
            }
        });
        getContentPane().add(jbtpresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 290, 60));

        jbtbibliovirtual.setText("Biblioteca Virtual");
        jbtbibliovirtual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtbibliovirtual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtbibliovirtualMouseClicked(evt);
            }
        });
        getContentPane().add(jbtbibliovirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 290, 60));

        jbtLogout.setText("Cerrar Sesión");
        jbtLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(jbtLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 290, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 270, 40));
        jLabel4.setText(biblioteca.Biblioteca.users[Login.userlogpos].getlogeo());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 350, 210));
        jTextArea1.setText(biblioteca.Biblioteca.users[Login.userlogpos].getDatoslog());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/gradientegrande.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtLogoutMouseClicked
        this.setVisible(false);
        PantallaInicio pi = new PantallaInicio();
        pi.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtLogoutMouseClicked

    private void jbtbibliovirtualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtbibliovirtualMouseClicked
        this.setVisible(false);
        BibliotecaVirtual bv = new BibliotecaVirtual();
        bv.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtbibliovirtualMouseClicked

    private void jbtprestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtprestaMouseClicked
           this.setVisible(false);
           Prestamo pres = new Prestamo();
           pres.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtprestaMouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtLogout;
    private javax.swing.JButton jbtbibliovirtual;
    private javax.swing.JButton jbtpresta;
    // End of variables declaration//GEN-END:variables
}
