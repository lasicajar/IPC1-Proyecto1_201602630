/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Lusvin
 */
public class Prestamo extends javax.swing.JFrame {

    /**
     * Creates new form Prestamo
     */
    public Prestamo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbxfiltro = new javax.swing.JComboBox<>();
        jtxbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtbuscar = new javax.swing.JButton();
        jbtmisprestamos = new javax.swing.JButton();
        jbtfiltro = new javax.swing.JButton();
        jbtreportedoc = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtlogout = new javax.swing.JButton();
        jbtback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamos Documentos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/Usac_logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 482, 180));

        jcbxfiltro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jcbxfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Libro", "Revista", "Tesis" }));
        getContentPane().add(jcbxfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 190, -1));
        getContentPane().add(jtxbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 190, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "TITULO", "AUTOR", "DESCRIPCION", "TEMAS", "EDICIÓN", "DISPONIBLE", "COPIAS", "PRESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 810, 140));

        jbtbuscar.setText("Buscar");
        getContentPane().add(jbtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 90, -1));

        jbtmisprestamos.setText("Ver Mis Prestamos");
        jbtmisprestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtmisprestamosMouseClicked(evt);
            }
        });
        getContentPane().add(jbtmisprestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 40));

        jbtfiltro.setText("Filtrar");
        jbtfiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtfiltroMouseClicked(evt);
            }
        });
        getContentPane().add(jbtfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 100, 30));

        jbtreportedoc.setText("Reporte Existencias");
        getContentPane().add(jbtreportedoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 40));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "año", "autor", "edicion", "id" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 190, 20));

        jLabel4.setText("Filtrar Por:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/user.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        jbtlogout.setText("Cerrar Sesión");
        jbtlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtlogoutMouseClicked(evt);
            }
        });
        getContentPane().add(jbtlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 58, 126, 48));

        jbtback.setText("Regresar");
        jbtback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtbackMouseClicked(evt);
            }
        });
        getContentPane().add(jbtback, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 124, 126, 43));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 270, 40));
        jLabel5.setText(biblioteca.Biblioteca.users[Login.userlogpos].getlogeo());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/img/gradientegrande.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtbackMouseClicked
        this.setVisible(false);
        User us = new User();
        us.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtbackMouseClicked

    private void jbtlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtlogoutMouseClicked
        this.setVisible(false);
        PantallaInicio pi = new PantallaInicio();
        pi.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtlogoutMouseClicked

    private void jbtmisprestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtmisprestamosMouseClicked
        this.setVisible(false);
        VerPrestamo vpres = new VerPrestamo();
        vpres.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtmisprestamosMouseClicked

    private void jbtfiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtfiltroMouseClicked
            
         if (((String) jcbxfiltro.getSelectedItem()).equalsIgnoreCase("-")){
       JOptionPane.showMessageDialog(null, "Seleccione un filtro de documento...", "Error documento", JOptionPane.WARNING_MESSAGE);

         }else if (((String) jcbxfiltro.getSelectedItem()).equalsIgnoreCase("Libro")) {
             
             String  tablaLibro[][] = new String [biblioteca.Biblioteca.contlibros][10];
        
        for (int i = 0; i < biblioteca.Biblioteca.contlibros; i++) {
            Boolean prestado = false;
            tablaLibro[i][0]= (Integer.toString(i));
            tablaLibro[i][1]=biblioteca.Biblioteca.libros[i].getIsbn().toString();
            tablaLibro[i][2]=biblioteca.Biblioteca.libros[i].getTitulo();
            tablaLibro[i][3]=biblioteca.Biblioteca.libros[i].getAutor();
            tablaLibro[i][4]=biblioteca.Biblioteca.libros[i].getDescripcion();
            tablaLibro[i][5]=Arrays.toString(biblioteca.Biblioteca.libros[i].getTemas());
            tablaLibro[i][6]=biblioteca.Biblioteca.libros[i].getEdicion().toString();           
            tablaLibro[i][7]=biblioteca.Biblioteca.libros[i].getDisponibles().toString();
            tablaLibro[i][8]=biblioteca.Biblioteca.libros[i].getCopias().toString();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            tablaLibro,
            new String [] {
                "No.", "ID", "TITULO", "AUTOR", "DESCRIPCION", "TEMAS", "EDICIÓN", "DISPONIBLE", "COPIAS", "PRESTADO"
            }));
        }else if (((String) jcbxfiltro.getSelectedItem()).equalsIgnoreCase("Revista")) {
             
             String  tablaRevista[][] = new String [biblioteca.Biblioteca.contrevistas][10];
        
        for (int i = 0; i < biblioteca.Biblioteca.contrevistas; i++) {
            Boolean prestado = false;
            tablaRevista[i][0]= (Integer.toString(i));
            tablaRevista[i][1]=biblioteca.Biblioteca.revistas[i].getId().toString();
            tablaRevista[i][2]=biblioteca.Biblioteca.revistas[i].getTitulo();
            tablaRevista[i][3]=biblioteca.Biblioteca.revistas[i].getAutor();
            tablaRevista[i][4]=biblioteca.Biblioteca.revistas[i].getDescripcion();
            tablaRevista[i][5]=Arrays.toString(biblioteca.Biblioteca.revistas[i].getTemas());
            tablaRevista[i][6]=biblioteca.Biblioteca.revistas[i].getEdicion().toString();           
            tablaRevista[i][7]=biblioteca.Biblioteca.revistas[i].getDisponibles().toString();
            tablaRevista[i][8]=biblioteca.Biblioteca.revistas[i].getCopias().toString();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            tablaRevista,
            new String [] {
                "No.", "ID", "TITULO", "AUTOR", "DESCRIPCION", "TEMAS", "EDICIÓN", "DISPONIBLE", "COPIAS", "PRESTADO"
            }));
        }
         else if (((String) jcbxfiltro.getSelectedItem()).equalsIgnoreCase("Tesis")) {
             
             String  tablaTesis[][] = new String [biblioteca.Biblioteca.conttesis][10];
        
        for (int i = 0; i < biblioteca.Biblioteca.conttesis; i++) {
            Boolean prestado = false;
            tablaTesis[i][0]= (Integer.toString(i));
            tablaTesis[i][1]=biblioteca.Biblioteca.tesis[i].getId().toString();
            tablaTesis[i][2]=biblioteca.Biblioteca.tesis[i].getTitulo();
            tablaTesis[i][3]=biblioteca.Biblioteca.tesis[i].getAutor();
            tablaTesis[i][4]=biblioteca.Biblioteca.tesis[i].getDescripcion();
            tablaTesis[i][5]=Arrays.toString(biblioteca.Biblioteca.tesis[i].getTemas());
            tablaTesis[i][6]=biblioteca.Biblioteca.tesis[i].getEdicion().toString();           
            tablaTesis[i][7]=biblioteca.Biblioteca.tesis[i].getDisponibles().toString();
            tablaTesis[i][8]=biblioteca.Biblioteca.tesis[i].getCopias().toString();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            tablaTesis,
            new String [] {
                "No.", "ID", "TITULO", "AUTOR", "DESCRIPCION", "TEMAS", "EDICIÓN", "DISPONIBLE", "COPIAS", "PRESTADO"
            }));
        }

    }//GEN-LAST:event_jbtfiltroMouseClicked

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
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtback;
    private javax.swing.JButton jbtbuscar;
    private javax.swing.JButton jbtfiltro;
    private javax.swing.JButton jbtlogout;
    private javax.swing.JButton jbtmisprestamos;
    private javax.swing.JButton jbtreportedoc;
    private javax.swing.JComboBox<String> jcbxfiltro;
    private javax.swing.JTextField jtxbuscar;
    // End of variables declaration//GEN-END:variables
}
