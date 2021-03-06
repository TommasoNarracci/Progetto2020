/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto.Rooms;

import com.mycompany.progetto.ProjectObject;
import com.mycompany.progetto.Room;
import static com.mycompany.progetto.Commands.*;
import java.awt.event.WindowListener;
import javax.swing.Timer;
import java.awt.event.WindowEvent;

/**
 *
 * @author Utente
 */
public class Room2 extends javax.swing.JFrame {

    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            text.setText("Speravi ci fosse del cibo ma potrebbe essrci qualcosa di utile qui!");
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
     * Creates new form Room2
     */
    private static Room room2;
    ProjectObject mappa, chiave;
    int scrignoaperto = 0;

    public Room2() {
        initComponents();
        this.addWindowListener(l);
        luogo.setText(" Seminterrato");
        map.setVisible(false);
        key.setVisible(false);
        mappa = new ProjectObject(2, "mappa", "/images/mappa.png", map, this);
        chiave = new ProjectObject(0, "chiave", "/images/key.png", key, this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luogo = new javax.swing.JLabel();
        indietro = new javax.swing.JButton();
        scrgno = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        map = new javax.swing.JButton();
        key = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setOpaque(true);
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        indietro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        indietro.setBorderPainted(false);
        indietro.setContentAreaFilled(false);
        indietro.setFocusPainted(false);
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });
        getContentPane().add(indietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, -1));

        scrgno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scrigno.png"))); // NOI18N
        scrgno.setBorderPainted(false);
        scrgno.setContentAreaFilled(false);
        scrgno.setFocusPainted(false);
        scrgno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrgnoActionPerformed(evt);
            }
        });
        getContentPane().add(scrgno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 220, 200));

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

        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mappa.png"))); // NOI18N
        map.setBorderPainted(false);
        map.setContentAreaFilled(false);
        map.setFocusPainted(false);
        map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapActionPerformed(evt);
            }
        });
        getContentPane().add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 80, 70));

        key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        key.setBorderPainted(false);
        key.setContentAreaFilled(false);
        key.setFocusPainted(false);
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        getContentPane().add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        text.setPreferredSize(new java.awt.Dimension(1080, 40));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seminterrato.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        goNorth(this);
    }//GEN-LAST:event_indietroActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventarioActionPerformed

    private void scrgnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrgnoActionPerformed

        if (scrignoaperto == 0) {
            map.setVisible(true);
            key.setVisible(true);
            scrignoaperto = 1;
        }
    }//GEN-LAST:event_scrgnoActionPerformed

    private void mapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapActionPerformed
        // TODO add your handling code here:

        PickObject(mappa);
        text.setText("Questa mappa è di origine elfica,devo trovare qualcuno che riesca a tradurla...");
        Timer timer = new Timer(5000, event -> {
            text.setText("");
        });
        timer.setRepeats(false);
        timer.start();


    }//GEN-LAST:event_mapActionPerformed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        PickObject(chiave);
        text.setText("Una chiave...sarà quella della porta principale?");
        Timer timer = new Timer(5000, event -> {
            text.setText("");
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_keyActionPerformed

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
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton indietro;
    private javax.swing.JButton inventario;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JButton key;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton map;
    private javax.swing.JButton scrgno;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
