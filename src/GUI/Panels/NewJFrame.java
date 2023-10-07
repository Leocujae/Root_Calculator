/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.ParseException;

/**
 *
 * @author EL_DEO
 */
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        K();
   }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables



    public void K(){
        
        
        String function  = "2x+x^3-z";
        String function2 = "4x^2-y";
       
        
        
        DJep DJep2 = new DJep();
        DJep2.addStandardFunctions();
        DJep2.addStandardConstants();
        DJep2.addComplex();
        DJep2.setAllowUndeclared(true);
        DJep2.setAllowAssignment(true);
        DJep2.setImplicitMul(true);
        DJep2.addStandardDiffRules();
        
        
        
        int top = 2;
        double x = 0;
        double h = 1;
        double x1;
        double k1;
        double k2;
        double L1;
        double L2;
        double y = 1;
        double z1 = 1;
        
        System.out.println("Calcular para h =" +h);
        System.out.println("Condiciones Iniciales");
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("z = " +z1);
        
        System.out.println("---------------------------------------");
        
        
        try{
        while(x < top){
            System.out.print("Xi = ");
            double xi = x + h;
            System.out.println(xi);
            
            System.out.print("K1 = ");
            k1 = function1(x,z1);
            System.out.println(k1);
            
            System.out.print("L1 = ");
            L1 = function2(x,y);
            System.out.println(L1);
            
            System.out.print("K2 = ");
            k2 = function1(xi, z1+L1);
            System.out.println(k2);
            
            L2 = function2(xi,y+k1);
            
            
            y = y +(k1 + k2)/2;
            
            z1 = z1 + (L1 + L2)/2;
            
            x = xi;
            
            
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("z = " +z1);
 
        System.out.println("---------------------------------------");
            
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z1);
        
        System.out.println("---------------------------------------");
        }
        catch(Exception e){
            
        }
        
        
    }


public double function1(double x , double z) throws ParseException{
    DJep DJep1 = new DJep();
    DJep1.addStandardFunctions();
    DJep1.addStandardConstants();
    DJep1.addComplex();
    DJep1.setAllowUndeclared(true);
    DJep1.setAllowAssignment(true);
    DJep1.setImplicitMul(true);
    DJep1.addStandardDiffRules();

    String function = "2*x+x*x*x-z";
    DJep1.addVariable("x", x);
    DJep1.addVariable("z", z);
    DJep1.parseExpression(function);
    return DJep1.getValue();
}

public double function2(double x , double y) throws ParseException{
    DJep DJep1 = new DJep();
    DJep1.addStandardFunctions();
    DJep1.addStandardConstants();
    DJep1.addComplex();
    DJep1.setAllowUndeclared(true);
    DJep1.setAllowAssignment(true);
    DJep1.setImplicitMul(true);
    DJep1.addStandardDiffRules();

    String function = "4*x*x-y";
    DJep1.addVariable("x", x);
    DJep1.addVariable("y", y);
     DJep1.parseExpression(function);
    return DJep1.getValue();
}




}
