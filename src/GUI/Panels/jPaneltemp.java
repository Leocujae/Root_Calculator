/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import Functionalities_Methods.NumericOptimitation.Biseccion;
import Functionalities_Methods.NumericOptimitation.SolutionBiseccion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL_DEO
 */
public class jPaneltemp extends javax.swing.JPanel {

    
    char c ;
    public jPaneltemp() {
        initComponents();
        c ='>';
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TextFuncion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TexIntA = new javax.swing.JTextField();
        TextIntB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextTolerancia = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jRadioButtonMaximizar = new javax.swing.JRadioButton();
        jRadioButtonMinimizar = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        TextFuncion.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Función");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Intervalo para calcular ");

        TexIntA.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        TexIntA.setText("-10");

        TextIntB.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        TextIntB.setText("10");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Tolerancia");

        TextTolerancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextTolerancia.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        TextTolerancia.setText("0.002");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Mandalore Expanded", 0, 18)); // NOI18N
        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMaximizar);
        jRadioButtonMaximizar.setText("Maximizar");
        jRadioButtonMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaximizarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMinimizar);
        jRadioButtonMinimizar.setText("Minimizar");
        jRadioButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMinimizarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "I", "A", "B", "X1", "X2", "F(x1)", "F(x2)", "L"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(TextFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TexIntA, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextIntB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMaximizar)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonMinimizar))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TexIntA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextIntB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMaximizar)
                    .addComponent(jRadioButtonMinimizar)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String def = TextFuncion.getText();
        double A = Double.valueOf(TexIntA.getText());
        double B = Double.valueOf(TextIntB.getText());
        double Tolerancia = Double.valueOf(TextTolerancia.getText());

        Biseccion metodo = new Biseccion();
        metodo.loadDate(def, A, B, Tolerancia);
        ArrayList<SolutionBiseccion> temp = metodo.optimitation(c);

        DefaultTableModel model = new DefaultTableModel();
        String row[] = {"I", "A","B", "X1", "X2", "Mid", "F(x1)", "F(x2)"};

        model.setColumnIdentifiers(row);

        for (int i = 0; i < temp.size(); i++) {

            //                        //Definir cantidad de decimales
            //                        String Xn = formato.format(solution.get(i).getXvalue());
            //                        String Em = formato.format(solution.get(i).getEm());

            row[0] = String.valueOf(i);
            row[1] = String.valueOf(temp.get(i).solution()[0]);
            row[2] = String.valueOf(temp.get(i).solution()[1]);
            row[3] = String.valueOf(temp.get(i).solution()[2]);
            row[4] = String.valueOf(temp.get(i).solution()[3]);
            row[5] = String.valueOf(temp.get(i).solution()[4]);
            row[6] = String.valueOf(temp.get(i).solution()[5]);
            row[7] = String.valueOf(temp.get(i).solution()[6]);

            model.addRow(row);
        }
        jTable1.setModel(model);
        jTable1.setVisible(true);
        //jScrollPane1.setVisible(true);
        //JOptionPane.showMessageDialog(this, SMS.Mensage_2());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButtonMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaximizarActionPerformed
        if(jRadioButtonMaximizar.isSelected()){
            c = '>';
        }
        else{
            c ='<';
        }
    }//GEN-LAST:event_jRadioButtonMaximizarActionPerformed

    private void jRadioButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMinimizarActionPerformed
        if(jRadioButtonMinimizar.isSelected()){
            c = '<';
        }
        else{
            c = '>';
        }
    }//GEN-LAST:event_jRadioButtonMinimizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexIntA;
    private javax.swing.JTextField TextFuncion;
    private javax.swing.JTextField TextIntB;
    private javax.swing.JTextField TextTolerancia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButtonMaximizar;
    private javax.swing.JRadioButton jRadioButtonMinimizar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
