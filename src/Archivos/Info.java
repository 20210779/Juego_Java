/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.applet.AudioClip;

/**
 *
 * @author Frank
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Info
     */
    public Info() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //rsscalelabel.RSScaleLabel.setScaleLabel(lbStart, "src/imagenes/Rectangle 5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbCorono, "src/imagenes/Group.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbTitulo, "src/imagenes/OCTOPUS RUNS.png");  
        rsscalelabel.RSScaleLabel.setScaleLabel(lbAlga, "src/imagenes/Algas 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbSuelo, "src/imagenes/suelo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbConcha, "src/imagenes/Conchita.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbVolver, "src/imagenes/Rectangle 5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbJugar, "src/imagenes/Rectangle 5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbCamaron, "src/imagenes/camaron 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbCangrejo, "src/imagenes/cangrejo 3.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbSuperConcha, "src/imagenes/conhiman.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(lbGlobo, "src/imagenes/globo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbTiburocín, "src/imagenes/tiburocin.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbPez, "src/imagenes/pezPayaso 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbPez2, "src/imagenes/pescado 2.png");
        
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
        btnVolver = new javax.swing.JButton();
        lbVolver = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        lbJugar = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbAlga = new javax.swing.JLabel();
        lbConcha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbtittle1 = new javax.swing.JLabel();
        lbPez2 = new javax.swing.JLabel();
        lbCangrejo = new javax.swing.JLabel();
        lbCamaron = new javax.swing.JLabel();
        lbPez = new javax.swing.JLabel();
        lbSuelo = new javax.swing.JLabel();
        lbCorono = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbtittle2 = new javax.swing.JLabel();
        lbTiburocín = new javax.swing.JLabel();
        lbGlobo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbtittle = new javax.swing.JLabel();
        lbSuperConcha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1010, 430));

        jPanel1.setBackground(new java.awt.Color(184, 182, 244));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(140, 200, 234));
        btnVolver.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 100, 30));
        jPanel1.add(lbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 120, 40));

        btnJugar.setBackground(new java.awt.Color(140, 200, 234));
        btnJugar.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btnJugar.setBorderPainted(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 90, 30));
        jPanel1.add(lbJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 110, 40));
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, 50));
        jPanel1.add(lbAlga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 270, 340));
        jPanel1.add(lbConcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 130, 110));

        jPanel2.setBackground(new java.awt.Color(170, 197, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtittle1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbtittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtittle1.setText("Debes comer");
        lbtittle1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbtittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 30));
        jPanel2.add(lbPez2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 70, 50));
        jPanel2.add(lbCangrejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 50));
        jPanel2.add(lbCamaron, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 50));
        jPanel2.add(lbPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 170, 330));
        jPanel1.add(lbSuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1010, 50));
        jPanel1.add(lbCorono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 50));

        jPanel3.setBackground(new java.awt.Color(170, 197, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtittle2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbtittle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtittle2.setText("Evitalo !CUIDADO¡");
        lbtittle2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbtittle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));
        jPanel3.add(lbTiburocín, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 50));
        jPanel3.add(lbGlobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 190, 330));

        jPanel4.setBackground(new java.awt.Color(170, 197, 240));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtittle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbtittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtittle.setText("Super Poder");
        lbtittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbtittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 30));
        jPanel4.add(lbSuperConcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 170, 330));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        AudioClip Music;
        Music= java.applet.Applet.newAudioClip(getClass().getResource("Sonidos/musiquita.wav"));
        Music.stop();
        AudioClip Clic;
        Clic= java.applet.Applet.newAudioClip(getClass().getResource("Sonidos/Press botton.wav"));
        Clic.play();
        
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Menu n= new Menu();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAlga;
    private javax.swing.JLabel lbCamaron;
    private javax.swing.JLabel lbCangrejo;
    private javax.swing.JLabel lbConcha;
    private javax.swing.JLabel lbCorono;
    private javax.swing.JLabel lbGlobo;
    private javax.swing.JLabel lbJugar;
    private javax.swing.JLabel lbPez;
    private javax.swing.JLabel lbPez2;
    private javax.swing.JLabel lbSuelo;
    private javax.swing.JLabel lbSuperConcha;
    private javax.swing.JLabel lbTiburocín;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVolver;
    private javax.swing.JLabel lbtittle;
    private javax.swing.JLabel lbtittle1;
    private javax.swing.JLabel lbtittle2;
    // End of variables declaration//GEN-END:variables
}
