/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.Commands.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingWorker;
import javax.swing.Timer;

/**
 *
 * @author MSIGaming
 */
public class Room30 extends javax.swing.JFrame {

    /**
     * Creates new form Room30
     */
    ProjectObject thisring, thisringend, arsword;
    int ringactive = 0, hits = 0;
    JFrame thisroom;

    public Room30() {
        initComponents();
        thisroom = this;
        thisring = new ProjectObject(11, "anello", "/images/ring.jpg", ring, this);
        thisringend = new ProjectObject(11, "anello", "/images/ring.jpg", ringfinal, this);
        ringfinal.setVisible(false);
        this.addWindowListener(l);
    }
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish("SAURON:'Chi osa entrare nel mio Regno!!!!!!!'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Oh guarda guarda...un infimo hobbit è riuscito ad arrivare fin qui...'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Sei stato così scaltro da non essere visto dal mio GRANDE OCCHIO'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Guarda un po cosa hai riportato da me....il MIO ANELLO!L'UNICO ANELLO!!!'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Sarai arrivato fin qui...ma la tua avventura finisce ora!!!'");
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        inventory = new javax.swing.JButton();
        ringfinal = new javax.swing.JButton();
        ring = new javax.swing.JButton();
        rightarm = new javax.swing.JButton();
        leftarm = new javax.swing.JButton();
        head = new javax.swing.JButton();
        legs = new javax.swing.JButton();
        sauron = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1080, 40));

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Orodruin");
        name.setOpaque(true);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        inventory.setBorderPainted(false);
        inventory.setContentAreaFilled(false);
        inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });
        getContentPane().add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        ringfinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ring.png"))); // NOI18N
        ringfinal.setBorderPainted(false);
        ringfinal.setContentAreaFilled(false);
        ringfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringfinalActionPerformed(evt);
            }
        });
        getContentPane().add(ringfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 40, 40));

        ring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ring.png"))); // NOI18N
        ring.setBorderPainted(false);
        ring.setContentAreaFilled(false);
        ring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringActionPerformed(evt);
            }
        });
        getContentPane().add(ring, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 40, 40));

        rightarm.setBorderPainted(false);
        rightarm.setContentAreaFilled(false);
        rightarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightarmActionPerformed(evt);
            }
        });
        getContentPane().add(rightarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 90, 120));

        leftarm.setBorderPainted(false);
        leftarm.setContentAreaFilled(false);
        leftarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftarmActionPerformed(evt);
            }
        });
        getContentPane().add(leftarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 370, 120, 170));

        head.setBorderPainted(false);
        head.setContentAreaFilled(false);
        head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headActionPerformed(evt);
            }
        });
        getContentPane().add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 130, 160));

        legs.setBorderPainted(false);
        legs.setContentAreaFilled(false);
        legs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legsActionPerformed(evt);
            }
        });
        getContentPane().add(legs, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 170, 140));

        sauron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sauron.png"))); // NOI18N
        sauron.setBorderPainted(false);
        sauron.setContentAreaFilled(false);
        sauron.setFocusPainted(false);
        sauron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauronActionPerformed(evt);
            }
        });
        getContentPane().add(sauron, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -10, 400, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fine.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventoryActionPerformed

    private void sauronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauronActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sauronActionPerformed

    private void ringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringActionPerformed
        // TODO add your handling code here:
        ringactive = 1;
        ring.setVisible(false);
        text.setText("Hai attivato l'anello!Ora sei invisibile e hai qualche chance contro il SIGNORE OSCURO!");
        Timer timer = new Timer(3000, event -> {
            text.setText("");
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_ringActionPerformed

    private void leftarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftarmActionPerformed
        // TODO add your handling code here:
        if (ringactive == 1) {
            hits++;
            leftarm.setVisible(false);
            text.setText("SAURON:'AAAAH...hai ferito un mio braccio...ma non sperare di averla vinta!!!'");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        } else {
            text.setText("Non riuscirai mai a batterlo senza il potere dell'anello!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_leftarmActionPerformed

    private void rightarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightarmActionPerformed
        // TODO add your handling code here:
        if (ringactive == 1) {
            hits++;
            rightarm.setVisible(false);
            text.setText("SAURON:'GRRRRR...stupido hobbit per te è FINITA!!!'");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        } else {
            text.setText("Non riuscirai mai a batterlo senza il potere dell'anello!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_rightarmActionPerformed

    private void legsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legsActionPerformed
        // TODO add your handling code here:
        if (ringactive == 1) {
            hits++;
            legs.setVisible(false);
            text.setText("SAURON:'UUURGHHHH...mi sei sfuggito...ORA BASTA!!!'");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        } else {
            text.setText("Non riuscirai mai a batterlo senza il potere dell'anello!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_legsActionPerformed

    private void headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headActionPerformed
        // TODO add your handling code here:
        if (ringactive == 2) {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish("SAURON:'AHHHHHHHHHHH...non ci credo...'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Il SIGNORE OSCURO...battuto da un semplice Hobbit...'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Questo dimostra però la perfezione della mia creazione...L'UNICO ANELLO...'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Andrò via sapendo che ho esaudito il mio desiderio...'");
                    Thread.sleep(3000);
                    this.publish("SAURON:'Creare un anello per domarli tutti...'");
                    Thread.sleep(3000);
                    sauron.setVisible(false);
                    this.publish("HAI BATTUTO SAURON!!!SEI L'EROE DELLA TERRA DI MEZZO!!!");
                    Thread.sleep(3000);
                    this.publish("Ora potrai tornare nella tua terra e,chissà,scrivere un libro sulle tue avventure...");
                    Thread.sleep(3000);
                    this.publish("");
                    goNorth(thisroom);

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
        if (ringactive == 1) {
            if (hits > 2) {
                SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                    @Override
                    protected Void doInBackground() throws Exception {
                        this.publish("SAURON:'AHAHAHAHAHAH...credi di aver vinto?TI SBAGLI DI GROSSO!!!");
                        Thread.sleep(3000);
                        this.publish("SAURON ti ha scoperto...presto,sprigiona tutta la potenza dell'anello!");
                        Thread.sleep(3000);
                        this.publish("Devi batterlo a tutti i costi!!!");
                        Thread.sleep(3000);
                        this.publish("");
                        ringfinal.setVisible(true);
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
            } else {

                text.setText("Indebolisci Sauron prima di finirlo,altrimenti ti scoprirà e ti ucciderà");
                Timer timer = new Timer(3000, event -> {
                    text.setText("");
                });
                timer.setRepeats(false);
                timer.start();
            }

        } else {

            text.setText("Non riuscirai mai a batterlo senza il potere dell'anello!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();

        }
    }//GEN-LAST:event_headActionPerformed

    private void ringfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringfinalActionPerformed
        // TODO add your handling code here:
        ringactive = 2;
        removeObject(thisring);
        ringfinal.setVisible(false);
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

            @Override
            protected Void doInBackground() throws Exception {
                this.publish("L'anello ti conferisce un potere incredibile che durerà per poco tempo,ma la potenza spirgionata l'ha ridotto a brandelli!");
                Thread.sleep(3000);
                this.publish("SAURON:'NOOOOOOOOOOOO...IL MIO ANELLO!!!...IL MIO MAGNIFICO ANELLO!!!'");
                Thread.sleep(3000);
                this.publish("SAURON:'TI UCCIDERO' PER QUESTO...E'ARRIVATA LA TUA ORAAAAAA!!!");
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
    }//GEN-LAST:event_ringfinalActionPerformed

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
            java.util.logging.Logger.getLogger(Room30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room30().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton head;
    private javax.swing.JButton inventory;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JButton leftarm;
    private javax.swing.JButton legs;
    private javax.swing.JLabel name;
    private javax.swing.JButton rightarm;
    private javax.swing.JButton ring;
    private javax.swing.JButton ringfinal;
    private javax.swing.JButton sauron;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
