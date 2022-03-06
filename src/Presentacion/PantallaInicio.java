
package Presentacion;

/**
 *
 * @author Lusvin
 */
public class PantallaInicio extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio
     */
    public PantallaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpbg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtLogin = new javax.swing.JButton();
        jbtabout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IPC PROYECTO 1");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.lightGray);
        setLocationByPlatform(true);
        setName("frPantallaInicio"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        jpbg.setBackground(new java.awt.Color(0, 241, 143));
        jpbg.setPreferredSize(new java.awt.Dimension(900, 500));
        jpbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 161, 251));
        jPanel2.setPreferredSize(new java.awt.Dimension(880, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/user.png"))); // NOI18N

        jbtLogin.setBackground(new java.awt.Color(0, 241, 143));
        jbtLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtLogin.setText("Login");
        jbtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtLogin.setMaximumSize(new java.awt.Dimension(64, 32));
        jbtLogin.setPreferredSize(new java.awt.Dimension(64, 32));
        jbtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtLoginMouseClicked(evt);
            }
        });
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });

        jbtabout.setBackground(new java.awt.Color(0, 241, 143));
        jbtabout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtabout.setText("About");
        jbtabout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jbtabout, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtabout, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpbg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 870, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/Usac_logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jpbg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 500, 210));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("La Tricentenaria Universidad \nde San Carlos de Guatemala\nse caracteriza por tener una \nde las bibliotecas más mamalonas\nque se pueden encontran en el \nterritorio de Centro America.");
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jpbg.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 340, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/gradientegrande.png"))); // NOI18N
        jpbg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jbtLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtLoginMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.setVisible(false);
               
    }//GEN-LAST:event_jbtLoginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JButton jbtabout;
    private javax.swing.JPanel jpbg;
    // End of variables declaration//GEN-END:variables
}
