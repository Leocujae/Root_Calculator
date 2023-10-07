/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Functionalities_Methods.NumericOptimitation.SeccionAurea;
import GUI.Panels.JPanelGraficadora;


/**
 *
 * @author EL_DEO
 */
public class Windows extends javax.swing.JFrame {

    
   
    JPanelGraficadora graficadora = new JPanelGraficadora(this, rootPaneCheckingEnabled);    
    public Windows() {
        initComponents();

        SeccionAurea temp = new SeccionAurea();
        temp.optimitation('<');
        
        
        
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRootMethods2 = new GUI.Panels.jPanelRootMethods();
        jPanelSistemasDeEcuaciones1 = new GUI.Panels.jPanel_Ecuation_Systems();
        jPanelInterpolation1 = new GUI.Panels.JPanelInterpolation();
        jPanelInterpolationNewton1 = new GUI.Panels.JPanelInterpolationNewton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMostrarGraficadora = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 700));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setMaximumSize(new java.awt.Dimension(650, 600));
        jPanel.setMinimumSize(new java.awt.Dimension(650, 600));
        jPanel.setPreferredSize(new java.awt.Dimension(650, 600));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(650, 510));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(650, 510));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(650, 510));

        jPanelRootMethods2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanelRootMethods2.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelRootMethods2.setPreferredSize(new java.awt.Dimension(800, 500));
        jTabbedPane1.addTab("Calcular Raices", jPanelRootMethods2);
        jTabbedPane1.addTab("Sistema de ecuaciones", jPanelSistemasDeEcuaciones1);

        jPanelInterpolation1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanelInterpolation1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanelInterpolation1.setPreferredSize(new java.awt.Dimension(600, 500));
        jTabbedPane1.addTab("Interpolación Lagrange", jPanelInterpolation1);
        jTabbedPane1.addTab("Interpolación Newton", jPanelInterpolationNewton1);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Calcular raices de funciones");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Interpolar funciones");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Calcular sistemas de ecuaciones");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ver");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jCheckBoxMostrarGraficadora.setText("Mostrar Graficadora");
        jCheckBoxMostrarGraficadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMostrarGraficadoraActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMostrarGraficadora);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMostrarGraficadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMostrarGraficadoraActionPerformed
        
        if(jCheckBoxMostrarGraficadora.isSelected()){
            graficadora.setVisible(true);
        }
        else{
            graficadora.setVisible(false);
        }
        
    }//GEN-LAST:event_jCheckBoxMostrarGraficadoraActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Windows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMostrarGraficadora;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel;
    private GUI.Panels.JPanelInterpolation jPanelInterpolation1;
    private GUI.Panels.JPanelInterpolationNewton jPanelInterpolationNewton1;
    private GUI.Panels.jPanelRootMethods jPanelRootMethods2;
    private GUI.Panels.jPanel_Ecuation_Systems jPanelSistemasDeEcuaciones1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
