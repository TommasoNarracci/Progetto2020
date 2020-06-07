/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;
import static com.mycompany.progetto.Commands.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Timer;
/**
 *
 * @author MSIGaming
 */
public class Room16 extends javax.swing.JFrame {

    /**
     * Creates new form Room16
     */
    private ProjectObject sword;
    public Room16() {
        initComponents();
         sword = new ProjectObject(1,"spada","/images/sword.jpeg",north,this);
         this.addWindowListener(l);
    }
WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {
            text.setText("Ti ritrovi davanti a questo bellissimo fiume...chissà cose troverai proseguendo!");
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

        name = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        north = new javax.swing.JButton();
        inventory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Fiume Incantato");
        name.setOpaque(true);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1080, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        north.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aragornsw.png"))); // NOI18N
        north.setText("jButton2");
        north.setBorderPainted(false);
        north.setContentAreaFilled(false);
        north.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                northActionPerformed(evt);
            }
        });
        getContentPane().add(north, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 70));

        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        inventory.setBorderPainted(false);
        inventory.setContentAreaFilled(false);
        inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });
        getContentPane().add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entratagollum.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void northActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_northActionPerformed
        // TODO add your handling code here:
        PickObject(sword);
    }//GEN-LAST:event_northActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        goWest(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventoryActionPerformed

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
            java.util.logging.Logger.getLogger(Room16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inventory;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JButton north;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
