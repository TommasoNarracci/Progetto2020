/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto.Rooms;

import static com.mycompany.progetto.Commands.*;
import java.awt.event.WindowListener;
import javax.swing.Timer;
import java.awt.event.WindowEvent;

/**
 *
 * @author Utente
 */
public class Room1 extends javax.swing.JFrame {

    /**
     * Creates new form Room2
     */
    public Room1() {
        initComponents();
        luogo.setText(" Scalinata");
        this.addWindowListener(l);
    }
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            text.setText("Una scalinata che porta al seminterrato...chissà se ci sarà del cibo!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();

        }

        @Override
        public void windowClosing(WindowEvent arg0) {

        }

        @Override
        public void windowClosed(WindowEvent arg0) {
        }

        @Override
        public void windowIconified(WindowEvent arg0) {

        }

        @Override
        public void windowDeiconified(WindowEvent arg0) {
        }

        @Override
        public void windowActivated(WindowEvent arg0) {
        }

        @Override
        public void windowDeactivated(WindowEvent arg0) {
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luogo = new javax.swing.JLabel();
        sud = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setOpaque(true);
        luogo.setPreferredSize(new java.awt.Dimension(168, 168));
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        sud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SUD.png"))); // NOI18N
        sud.setBorderPainted(false);
        sud.setContentAreaFilled(false);
        sud.setFocusPainted(false);
        sud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudActionPerformed(evt);
            }
        });
        getContentPane().add(sud, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        inventario.setBorderPainted(false);
        inventario.setContentAreaFilled(false);
        inventario.setFocusPainted(false);
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        getContentPane().add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        indietro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        indietro.setBorderPainted(false);
        indietro.setContentAreaFilled(false);
        indietro.setFocusPainted(false);
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });
        getContentPane().add(indietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, -1, -1));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        text.setPreferredSize(new java.awt.Dimension(1080, 40));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scalinata.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventarioActionPerformed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        // TODO add your handling code here:
        goEast(this);
    }//GEN-LAST:event_indietroActionPerformed

    private void sudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sudActionPerformed
        goSouth(this);
    }//GEN-LAST:event_sudActionPerformed

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
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel background;
    private javax.swing.JButton indietro;
    private javax.swing.JButton inventario;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton sud;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}