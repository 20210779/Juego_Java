/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Archivos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frank
 */
public class Menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_principal
     */
   /* public void process(){
        try {
            //Metodo para contar el tiempo de la interfaz cargando
            Thread.sleep(2000);
             
        } catch (InterruptedException ex) {
            
        }
    }*/
    
    
    public Menu_principal() {          
        initComponents();
        this.setVisible(true);
        //Contador 
        //Posiciona al centro el JFrame
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(lbPuntitos, "src/imagenes/Load2.gif");
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
        jProgress = new javax.swing.JProgressBar();
        lbPuntitos = new javax.swing.JLabel();
        lbCargando = new javax.swing.JLabel();
        lbConcha = new javax.swing.JLabel();
        lbSuelo = new javax.swing.JLabel();
        lbOceano = new javax.swing.JLabel();
        lbOceano2 = new javax.swing.JLabel();
        lbOceano3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 182, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgress.setBackground(new java.awt.Color(255, 0, 0));
        jProgress.setForeground(new java.awt.Color(0, 153, 153));
        jProgress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgress.setBorderPainted(false);
        jPanel1.add(jProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 860, -1));
        jPanel1.add(lbPuntitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 30, 10));

        lbCargando.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lbCargando.setText("Cargando");
        jPanel1.add(lbCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));
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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
         Menu_principal Men=new Menu_principal();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                Men.setVisible(true);
                //new Menu_principal().setVisible(true);
            }
        });
        Menu M= new Menu();
        try{
            for(int seg=0; seg<=100;seg++)
            {
                Thread.sleep(30);
                Men.jProgress.setValue(seg);
            }
        }
        catch(Exception ex){         
        }
        new Menu_principal().setVisible(false);
        Men.dispose();
        M.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgress;
    private javax.swing.JLabel lbCargando;
    private javax.swing.JLabel lbConcha;
    private javax.swing.JLabel lbOceano;
    private javax.swing.JLabel lbOceano2;
    private javax.swing.JLabel lbOceano3;
    private javax.swing.JLabel lbPuntitos;
    private javax.swing.JLabel lbSuelo;
    // End of variables declaration//GEN-END:variables
}
