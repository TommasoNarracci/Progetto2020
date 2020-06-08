/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.ProjectGameDescription.getInventory;
import static com.mycompany.progetto.ProjectGameDescription.getRooms;
import static com.mycompany.progetto.Commands.*;
import java.awt.Image;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
import static com.mycompany.progetto.Inventory.*;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingWorker;

/**
 *
 * @author MSIGaming
 */
public class Room7 extends javax.swing.JFrame {

    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

          SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish("SAM:'Bilbo mi sono rifugiato qui appana ho sentito dei troll...'");
                    Thread.sleep(3000);
                    this.publish("SAM:'Ho 2 spade con me'");
                    Thread.sleep(3000);
                    this.publish("SAM:'Prendine una,magari ti può tornare utile!'");
                    Thread.sleep(3000);
                    this.publish("");
                    return null;
                }

                @Override
                protected void process(List<String> res) {
                    for (String thistext : res) {
                        text.setText(thistext);
                    }
                }

            };

            worker.execute();

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
     * Creates new form Room7
     */
   
    
    
    
    
     ProjectObject spada;
    public Room7() {
        initComponents();
        this.addWindowListener(l);
        luogo.setText("Rifugio Sam"); 
          spada=new ProjectObject(6,"spada","/images/sword.png",sword,this);
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
        inventario = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        sword = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        indietro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        indietro.setBorderPainted(false);
        indietro.setContentAreaFilled(false);
        indietro.setFocusPainted(false);
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });
        getContentPane().add(indietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        sword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sword.png"))); // NOI18N
        sword.setBorderPainted(false);
        sword.setContentAreaFilled(false);
        sword.setFocusPainted(false);
        sword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swordActionPerformed(evt);
            }
        });
        getContentPane().add(sword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 490, 480));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        text.setPreferredSize(new java.awt.Dimension(1080, 40));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sam.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        goEast(this);
    }//GEN-LAST:event_indietroActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
       openInventory();  
    }//GEN-LAST:event_inventarioActionPerformed

    private void swordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swordActionPerformed
        PickObject(spada);
    }//GEN-LAST:event_swordActionPerformed

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
            java.util.logging.Logger.getLogger(Room7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton indietro;
    private javax.swing.JButton inventario;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton sword;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
