/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import GUI.Graficadora.Graficadora;
import GUI.Graficadora.Plano;
import Root_calculator.Controller.Controller;
import Root_calculator.Factory.TypeMethod;
import Root_calculator.Method.MethodResult;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author EL_DEO
 */
public class Principal extends javax.swing.JFrame {

   private Controller x ;
   private TypeMethod type;
   private Plano xy;
   private int Escale;
   Graficadora as = new Graficadora();
   
    public Principal( ) {
        initComponents();
       
        
        x = Controller.getInstance();
        //xy = new  Plano(Grafica,1);
        Escale = 5;
      
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRBisepccion = new javax.swing.JRadioButton();
        jRRegulaFalsi = new javax.swing.JRadioButton();
        jRNewton = new javax.swing.JRadioButton();
        jRSecante = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        funcion = new javax.swing.JTextField();
        tolerancia = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelIntervalos = new javax.swing.JLabel();
        Prueba = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MN-2023");
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Métodos para determinar raices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        buttonGroup1.add(jRBisepccion);
        jRBisepccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBisepccion.setForeground(new java.awt.Color(255, 255, 255));
        jRBisepccion.setText("Bisepcción ");
        jRBisepccion.setOpaque(false);
        jRBisepccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBisepccionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRRegulaFalsi);
        jRRegulaFalsi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRRegulaFalsi.setForeground(new java.awt.Color(255, 255, 255));
        jRRegulaFalsi.setText("Regula Falsi");
        jRRegulaFalsi.setOpaque(false);
        jRRegulaFalsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRRegulaFalsiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRNewton);
        jRNewton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRNewton.setForeground(new java.awt.Color(255, 255, 255));
        jRNewton.setText("Newton");
        jRNewton.setOpaque(false);
        jRNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNewtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRSecante);
        jRSecante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRSecante.setForeground(new java.awt.Color(255, 255, 255));
        jRSecante.setText("Secante");
        jRSecante.setOpaque(false);
        jRSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSecanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRSecante)
                    .addComponent(jRRegulaFalsi)
                    .addComponent(jRNewton)
                    .addComponent(jRBisepccion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jRNewton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBisepccion)
                .addGap(3, 3, 3)
                .addComponent(jRRegulaFalsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRSecante))
        );

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        funcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        funcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        funcion.setAlignmentX(2.0F);
        funcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        funcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionActionPerformed(evt);
            }
        });

        tolerancia.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        tolerancia.setText("0.0004");
        tolerancia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        tolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        A.setText("-4");
        A.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        B.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        B.setText("4");
        B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Función");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tolerancia");

        jLabelIntervalos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIntervalos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIntervalos.setText("Intervalos");

        javax.swing.GroupLayout PruebaLayout = new javax.swing.GroupLayout(Prueba);
        Prueba.setLayout(PruebaLayout);
        PruebaLayout.setHorizontalGroup(
            PruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        PruebaLayout.setVerticalGroup(
            PruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(funcion)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabelIntervalos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(Prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Prueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Raices", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNewtonActionPerformed
        type = TypeMethod.MNewton;
        jLabelIntervalos.setText("Aproximación inicial");
         
    }//GEN-LAST:event_jRNewtonActionPerformed

    private void jRBisepccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBisepccionActionPerformed
        type = TypeMethod.Mbiseccion;
    }//GEN-LAST:event_jRBisepccionActionPerformed

    private void jRRegulaFalsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRegulaFalsiActionPerformed
        type = TypeMethod.MRegula_falsi;
    }//GEN-LAST:event_jRRegulaFalsiActionPerformed

    private void jRSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSecanteActionPerformed
        type = TypeMethod.MSecante;
    }//GEN-LAST:event_jRSecanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       
        
        
        String tempfuncion = funcion.getText();
        double temptolerancia = Double.valueOf(tolerancia.getText());
        double a = Double.valueOf(A.getText());
        double b = Double.valueOf(B.getText());
        
        x.setFunction(tempfuncion);
        x.setTolerance(temptolerancia);
        x.setIntervalos(a, b);
        x.setTypeMethod(type);
        
        try{
        x.Resolver();
      
 

        
        ArrayList<MethodResult> solution = x.getSolution();
        DefaultTableModel model = new DefaultTableModel();
        String row[] = {"Iteracion","Valor de x" ,"Error"};
        
        model.setColumnIdentifiers(row);
              
        for (int i = 0; i < solution.size(); i++) {
         
            row[0] = String.valueOf(i+1);
            row[1] = solution.get(i).getXvalue();
            row[2] = solution.get(i).getEm();
            model.addRow(row);
        }
        
        
        jTable1.setModel(model);
        jTable1.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Resultado calculado con éxito");

        }catch(Exception e){
             JOptionPane.showMessageDialog(rootPane, "Se ha encontrado un error");
        }
       
 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void funcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionActionPerformed

    private void toleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toleranciaActionPerformed

    
   
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JPanel Prueba;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField funcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIntervalos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRBisepccion;
    private javax.swing.JRadioButton jRNewton;
    private javax.swing.JRadioButton jRRegulaFalsi;
    private javax.swing.JRadioButton jRSecante;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tolerancia;
    // End of variables declaration//GEN-END:variables
}
