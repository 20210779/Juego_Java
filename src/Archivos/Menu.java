/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.applet.AudioClip;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class Menu extends javax.swing.JFrame {

    
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        AudioClip Music;
        Music= java.applet.Applet.newAudioClip(getClass().getResource("Sonidos/musiquita.wav"));
        Music.play();      
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(lbName, "src/imagenes/Rectangle 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbStart, "src/imagenes/Rectangle 5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbCorono, "src/imagenes/Group.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbTitulo, "src/imagenes/OCTOPUS RUNS.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbPulpo, "src/imagenes/Pulpi.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbAlguita, "src/imagenes/algas-marinas 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbAlga1, "src/imagenes/Algas 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbAlga, "src/imagenes/algas-marinas 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbOceano3, "src/imagenes/oceano 1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbOceano2, "src/imagenes/oceano 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbOceano, "src/imagenes/oceano 3.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbSuelo, "src/imagenes/suelo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbConcha, "src/imagenes/Conchita.png");
        
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
        btnStart = new javax.swing.JButton();
        lbStart = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbCorono = new javax.swing.JLabel();
        lbPulpo = new javax.swing.JLabel();
        lbAlga1 = new javax.swing.JLabel();
        lbAlga = new javax.swing.JLabel();
        lbAlguita = new javax.swing.JLabel();
        lbConcha = new javax.swing.JLabel();
        lbSuelo = new javax.swing.JLabel();
        lbOceano = new javax.swing.JLabel();
        lbOceano2 = new javax.swing.JLabel();
        lbOceano3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(184, 182, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(140, 200, 234));
        btnStart.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnStart.setText("Iniciar");
        btnStart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btnStart.setBorderPainted(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 120, 30));
        jPanel1.add(lbStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 140, 50));

        txtName.setBackground(new java.awt.Color(217, 217, 217));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 102)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 170, 20));
        jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 210, 50));
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 50));
        jPanel1.add(lbCorono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, 40));
        jPanel1.add(lbPulpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 420, 330));
        jPanel1.add(lbAlga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 300));
        jPanel1.add(lbAlga, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 180, 180));
        jPanel1.add(lbAlguita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 100));
        jPanel1.add(lbConcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 130, 110));
        jPanel1.add(lbSuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1010, 50));
        jPanel1.add(lbOceano, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 490, 360));
        jPanel1.add(lbOceano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 220));
        jPanel1.add(lbOceano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 630, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        
        String sentencia = "INSERT INTO Resultados (Nombre) VALUES (?);";
        
        try 
        {
            if (txtName.getText().length()== 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un nombre");
            }
            
            else
            {
            PreparedStatement addRegistro = conexion.getConexion().prepareStatement(sentencia);
            addRegistro.setString(1,txtName.getText());
            addRegistro.executeUpdate();
            
            txtName.setText("");
               
            win abrir= new win();
            this.setVisible(false);
            abrir.setVisible(true);
            } 
        } 
        catch (SQLException ex) 
        {
            
            JOptionPane.showMessageDialog(this, ex.toString());
        }

    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAlga;
    private javax.swing.JLabel lbAlga1;
    private javax.swing.JLabel lbAlguita;
    private javax.swing.JLabel lbConcha;
    private javax.swing.JLabel lbCorono;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbOceano;
    private javax.swing.JLabel lbOceano2;
    private javax.swing.JLabel lbOceano3;
    private javax.swing.JLabel lbPulpo;
    private javax.swing.JLabel lbStart;
    private javax.swing.JLabel lbSuelo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private static class Musica {

        public Musica() {
        }
    }
}
