/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logica.datos;

/**
 *
 * @author osboxes
 */
public class connect extends javax.swing.JFrame {

    /**
     * Creates new form connect
     */
    
    private String _ip;
    private int _puerto;
    private datos _dp;
    
    public connect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        puerto = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ip = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        conectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 270));
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(puerto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 180, 415, 32);

        jScrollPane2.setViewportView(ip);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 110, 415, 32);

        jLabel1.setText("Puerto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 180, 63, 25);

        jLabel2.setText("IP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 18, 25);

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        getContentPane().add(conectar);
        conectar.setBounds(580, 140, 110, 37);

        jLabel3.setText("Conectar con Spider Engine");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 30, 280, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        // TODO add your handling code here:
        this._ip=ip.getText();
        this._puerto=Integer.parseInt(puerto.getText());
        this._dp._ip=_ip;
        this._dp._puerto=_puerto;
    }//GEN-LAST:event_conectarActionPerformed

    public void setDato(datos dp){
        this._dp=dp;
    }
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
            java.util.logging.Logger.getLogger(connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new connect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conectar;
    private javax.swing.JTextPane ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane puerto;
    // End of variables declaration//GEN-END:variables
}