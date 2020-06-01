/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.Commands.*;
import static com.mycompany.progetto.ProjectGameDescription.getInventory;
import static com.mycompany.progetto.ProjectGameDescription.getRooms;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Utente
 */
public class Room0 extends javax.swing.JFrame {

    /**
     * Creates new form Room1
     */
    private static ProjectObject bow, north;
    private Room currentroom = new Room();

    public Room0() {
        initComponents();
        currentroom = findCurrentRoom(this);
        bow = new ProjectObject(0, "arco", "/images/bow.jpg", Object, this);
        north = new ProjectObject(1, "nord", "/images/inventory.png", jButton1, this, 1);
        north.setEnable(0);
        /*jButton2.addActionListener(l);*/
        jButton1.addActionListener(l);

        //room = new Room(1,this,"C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg","Caverna",backscreen);
        //room2 = new Room(2,new Room2(),"Boh");
        //room.setNorth(room2);
    }

    public ActionListener l = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {

            if (findObject(bow) >= 0) {
                north.setEnable(1);
                removeObject(bow);
                System.out.println(getInventory().getInventoryList());
            }

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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Object = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backscreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GIOCOMAP");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("GIOCOMAP"); // NOI18N
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        Object.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bow.jpg"))); // NOI18N
        Object.setBorder(new javax.swing.border.MatteBorder(null));
        Object.setContentAreaFilled(false);
        Object.setFocusPainted(false);
        Object.setMaximumSize(new java.awt.Dimension(30, 30));
        Object.setMinimumSize(new java.awt.Dimension(30, 30));
        Object.setPreferredSize(new java.awt.Dimension(30, 30));
        Object.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjectActionPerformed(evt);
            }
        });
        getContentPane().add(Object, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 30, 30));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        backscreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CAVE22.jpg"))); // NOI18N
        backscreen.setMaximumSize(new java.awt.Dimension(1080, 720));
        backscreen.setMinimumSize(new java.awt.Dimension(1080, 720));
        backscreen.setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().add(backscreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*public ActionListener l = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {

            activate();

        }
    };

    public void activate() {
        if (findObject(bow) >= 0) {
            jButton3.setEnabled(true);
        }
    }*/

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //getRooms().get(0).getNorth().getThisRoom().setVisible(true);
        //getThisGame().getmyRoom(0).getNorth().getThisRoom().setVisible(true);
        //this.dispose();
        if (north.isEnable() == 1) {
            System.out.println("Hai usato chiave!");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                
            }
            goNorth(this);
        } else {
            System.out.println("Non hai la chiave per passare");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        /* getInventory().refreshInventory();
        getInventory().getInventoryform().setVisible(true);*/
        openInventory();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjectActionPerformed
        // TODO add your handling code here:
        PickObject(bow);
        //getInventory().add(bow);
        //System.out.println(getInventory().Size());
        //Object.setVisible(false);
    }//GEN-LAST:event_ObjectActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //getRooms().get(0).getSouth().getThisRoom().setVisible(true);
        goSouth(this);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Room0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Object;
    public javax.swing.JLabel backscreen;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
