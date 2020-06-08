/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.Commands.openInventory;
import static com.mycompany.progetto.Commands.*;
import java.awt.event.WindowListener;
import javax.swing.Timer;
import java.awt.event.WindowEvent;

/**
 *
 * @author MSIGaming
 */
public class Room14 extends javax.swing.JFrame {

    /**
     * Creates new form Room14
     */
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            text.setText("RE GOBLIN: Non puoi scappare da me,,maledetto hobbit!!!");
            Timer timer = new Timer(4000, event -> {
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

    public Room14() {
        initComponents();
        this.addWindowListener(l);
        catturato.setVisible(false);
        luogo.setText("Salone Moria");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        catturato = new javax.swing.JLabel();
        luogo = new javax.swing.JLabel();
        inventario = new javax.swing.JButton();
        Goblin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        text.setPreferredSize(new java.awt.Dimension(1080, 40));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        catturato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/catturato.jpg"))); // NOI18N
        catturato.setText("jLabel2");
        getContentPane().add(catturato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setOpaque(true);
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

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

        Goblin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/realgoblin.png"))); // NOI18N
        Goblin.setBorderPainted(false);
        Goblin.setContentAreaFilled(false);
        Goblin.setFocusPainted(false);
        Goblin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoblinActionPerformed(evt);
            }
        });
        getContentPane().add(Goblin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 540, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/golbin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        openInventory();
    }//GEN-LAST:event_inventarioActionPerformed

    private void GoblinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoblinActionPerformed
        catturato.setVisible(true);
        text.setText("IL GOBLIN E' TROPPO FORTE E TI HA CATTURATO!");
        Timer timer = new Timer(6000, event -> {
            goNorth(this);
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_GoblinActionPerformed

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
            java.util.logging.Logger.getLogger(Room14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Goblin;
    private javax.swing.JLabel catturato;
    private javax.swing.JButton inventario;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel luogo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
