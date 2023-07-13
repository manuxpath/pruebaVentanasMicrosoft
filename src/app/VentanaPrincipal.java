/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import conexion.EstablecerConexionDB;
import javax.swing.*;
import java.sql.*;
import javax.sound.sampled.*;
import sonido.Sonidos;

/**
 *
 * @author shiba
 */
public class VentanaPrincipal extends JFrame implements Sonidos{

    /**
     * Creates new form VentanaInicio
     */
    public VentanaPrincipal() {
        initComponents();
        setTitle("Microsoft Software");
        setResizable(false);
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

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        salir = new javax.swing.JButton();
        consultaPersona = new javax.swing.JButton();
        registroPersona = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        salir.setBackground(new java.awt.Color(0, 0, 255));
        salir.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("CERRAR SESIÓN");
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 410, -1));

        consultaPersona.setBackground(new java.awt.Color(0, 0, 255));
        consultaPersona.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        consultaPersona.setForeground(new java.awt.Color(255, 255, 255));
        consultaPersona.setText("CONSULTAR PERSONA");
        consultaPersona.setFocusable(false);
        consultaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPersonaActionPerformed(evt);
            }
        });
        jPanel2.add(consultaPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 410, -1));

        registroPersona.setBackground(new java.awt.Color(0, 0, 255));
        registroPersona.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        registroPersona.setForeground(new java.awt.Color(255, 255, 255));
        registroPersona.setText("REGISTRAR PERSONA");
        registroPersona.setFocusable(false);
        registroPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroPersonaActionPerformed(evt);
            }
        });
        jPanel2.add(registroPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 390));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MICROSOFT SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/microsoft.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        VentanaInicio vI = new VentanaInicio();
        reproducirSonido("disparo.wav");
        this.dispose();
        vI.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void consultaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPersonaActionPerformed
        reproducirSonido("disparo.wav");
        VentanaConsulta vC = new VentanaConsulta();
        this.dispose();
        vC.setVisible(true);
    }//GEN-LAST:event_consultaPersonaActionPerformed

    private void registroPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroPersonaActionPerformed
        VentanaRegistroPersona vRP = new VentanaRegistroPersona();
        reproducirSonido("disparo.wav");
        this.dispose();
        vRP.setVisible(true);
    }//GEN-LAST:event_registroPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    @Override
    public void reproducirSonido(String sonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(VentanaInicio.class.getResourceAsStream("/sonido/" + sonido));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultaPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton registroPersona;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
