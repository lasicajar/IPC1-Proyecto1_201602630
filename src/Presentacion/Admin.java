
package Presentacion;

/**
 *
 * @author Lusvin
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio
     */
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpbg = new javax.swing.JPanel();
        jbtlogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtadddoc = new javax.swing.JButton();
        jbtverlibro = new javax.swing.JButton();
        jbtmodillibro = new javax.swing.JButton();
        jbtdeletedoc = new javax.swing.JButton();
        jbtreportlibro = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jbtadduser1 = new javax.swing.JButton();
        jbtvisualizaruser = new javax.swing.JButton();
        jbtmodiuser1 = new javax.swing.JButton();
        jbtdeleteuser1 = new javax.swing.JButton();
        jbtReportuser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo del Administrador");
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

        jbtlogout.setText("Cerrar Seción");
        jbtlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtlogoutMouseClicked(evt);
            }
        });
        jbtlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtlogoutActionPerformed(evt);
            }
        });
        jpbg.add(jbtlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 140, 50));

        jPanel2.setBackground(new java.awt.Color(0, 161, 251));
        jPanel2.setPreferredSize(new java.awt.Dimension(880, 145));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtadddoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtadddoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/adddoc.png"))); // NOI18N
        jbtadddoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtadddoc.setMaximumSize(new java.awt.Dimension(64, 32));
        jbtadddoc.setPreferredSize(new java.awt.Dimension(64, 32));
        jbtadddoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtadddocMouseClicked(evt);
            }
        });
        jbtadddoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtadddocActionPerformed(evt);
            }
        });
        jPanel2.add(jbtadddoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 135, 135));

        jbtverlibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtverlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/verdoc.png"))); // NOI18N
        jbtverlibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtverlibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtverlibroMouseClicked(evt);
            }
        });
        jPanel2.add(jbtverlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 135, 135));

        jbtmodillibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/modidoc.png"))); // NOI18N
        jbtmodillibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtmodillibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtmodillibroMouseClicked(evt);
            }
        });
        jPanel2.add(jbtmodillibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 135, 135));

        jbtdeletedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/deletedoc.png"))); // NOI18N
        jbtdeletedoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtdeletedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtdeletedocMouseClicked(evt);
            }
        });
        jPanel2.add(jbtdeletedoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 135, 135));

        jbtreportlibro.setText("Reporte Libros");
        jbtreportlibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jbtreportlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 140, 50));

        jpbg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 870, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("LIBROS");
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jpbg.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText("      Agregar\t              Visualizar                      Modificar\t           Eliminar");
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jTextArea2.setEnabled(false);
        jTextArea2.setOpaque(false);
        jTextArea2.setRequestFocusEnabled(false);
        jTextArea2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jpbg.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 660, 40));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea3.setRows(5);
        jTextArea3.setText("USUARIO");
        jTextArea3.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jTextArea3.setEnabled(false);
        jTextArea3.setOpaque(false);
        jTextArea3.setRequestFocusEnabled(false);
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jpbg.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea4.setRows(5);
        jTextArea4.setText("      Agregar\t              Visualizar                      Modificar\t           Eliminar");
        jTextArea4.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jTextArea4.setEnabled(false);
        jTextArea4.setOpaque(false);
        jTextArea4.setRequestFocusEnabled(false);
        jTextArea4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jpbg.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 660, 40));

        jPanel3.setBackground(new java.awt.Color(0, 241, 143));
        jPanel3.setPreferredSize(new java.awt.Dimension(880, 145));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtadduser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtadduser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/adduser.png"))); // NOI18N
        jbtadduser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtadduser1.setMaximumSize(new java.awt.Dimension(64, 32));
        jbtadduser1.setPreferredSize(new java.awt.Dimension(64, 32));
        jbtadduser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtadduser1MouseClicked(evt);
            }
        });
        jbtadduser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtadduser1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtadduser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 135, 135));

        jbtvisualizaruser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtvisualizaruser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/veruser.png"))); // NOI18N
        jbtvisualizaruser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtvisualizaruser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtvisualizaruserMouseClicked(evt);
            }
        });
        jPanel3.add(jbtvisualizaruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 135, 135));

        jbtmodiuser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/modiuser.png"))); // NOI18N
        jbtmodiuser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtmodiuser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtmodiuser1MouseClicked(evt);
            }
        });
        jPanel3.add(jbtmodiuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 135, 135));

        jbtdeleteuser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/eliminaruser.png"))); // NOI18N
        jbtdeleteuser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtdeleteuser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtdeleteuser1MouseClicked(evt);
            }
        });
        jPanel3.add(jbtdeleteuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 135, 135));

        jbtReportuser.setText("Reporte Usuarios");
        jbtReportuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtReportuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtReportuserMouseClicked(evt);
            }
        });
        jPanel3.add(jbtReportuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 140, 50));

        jpbg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 870, -1));

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

    private void jbtadddocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtadddocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtadddocActionPerformed

    private void jbtadduser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtadduser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtadduser1ActionPerformed

    private void jbtlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtlogoutMouseClicked
        this.setVisible(false);
        PantallaInicio pi = new PantallaInicio();
        pi.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtlogoutMouseClicked

    private void jbtadduser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtadduser1MouseClicked
        CrearUser cu = new CrearUser();
        cu.setVisible(true);
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jbtadduser1MouseClicked

    private void jbtvisualizaruserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtvisualizaruserMouseClicked
            VerUser vus = new VerUser();
            vus.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jbtvisualizaruserMouseClicked

    private void jbtmodiuser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtmodiuser1MouseClicked
                ModificarUser mu = new ModificarUser();
                mu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtmodiuser1MouseClicked

    private void jbtdeleteuser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtdeleteuser1MouseClicked
            EliminarUser eu = new EliminarUser();
            eu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtdeleteuser1MouseClicked

    private void jbtadddocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtadddocMouseClicked
            CrearBiblio cb = new CrearBiblio();
            cb.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtadddocMouseClicked

    private void jbtverlibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtverlibroMouseClicked
            VerLibro vl = new VerLibro();
            vl.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtverlibroMouseClicked

    private void jbtmodillibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtmodillibroMouseClicked
            ModificarLibro ml = new ModificarLibro();
            ml.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtmodillibroMouseClicked

    private void jbtdeletedocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtdeletedocMouseClicked
            EliminarLibro el = new EliminarLibro();
            el.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtdeletedocMouseClicked

    private void jbtReportuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtReportuserMouseClicked
        VerUsuario vu = new VerUsuario();
        vu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtReportuserMouseClicked

    private void jbtlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtlogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton jbtReportuser;
    private javax.swing.JButton jbtadddoc;
    private javax.swing.JButton jbtadduser1;
    private javax.swing.JButton jbtdeletedoc;
    private javax.swing.JButton jbtdeleteuser1;
    private javax.swing.JButton jbtlogout;
    private javax.swing.JButton jbtmodillibro;
    private javax.swing.JButton jbtmodiuser1;
    private javax.swing.JButton jbtreportlibro;
    private javax.swing.JButton jbtverlibro;
    private javax.swing.JButton jbtvisualizaruser;
    private javax.swing.JPanel jpbg;
    // End of variables declaration//GEN-END:variables
}
