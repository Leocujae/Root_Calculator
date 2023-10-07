/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import Controller.Controller;
import Factory.Enum.Type_Method;
import Messages.Messages;
import Functionalities_Methods.Root_Calculation.MethodResult;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL_DEO
 */
public class jPanelRootMethods extends javax.swing.JPanel {
    private Messages SMS ;
    private Controller x = Controller.getInstance();
    private Type_Method type;

    private DecimalFormat formato;
    private String decimales;
//    private Graph grafica = new Graph("Graficadora", "Eje X", "Eje Y");

    public jPanelRootMethods() {
        SMS = new Messages();
        initComponents();
        jLabelAprox.setVisible(false);
        
        AproximacionA.setVisible(false);
        AproximacionB.setVisible(false);
        
        type = Type_Method.Mbiseccion;
        
        decimales = "#.####";
        formato = new DecimalFormat(decimales);
        Funcion.setOpaque(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Funcion = new javax.swing.JTextField();
        jLabelDecimales = new javax.swing.JLabel();
        jLabelAprox = new javax.swing.JLabel();
        AproximacionB = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        jSpinnerDecimales = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jRBisepccion = new javax.swing.JRadioButton();
        jRRegulaFalsi = new javax.swing.JRadioButton();
        jRNewton = new javax.swing.JRadioButton();
        jRSecante = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        A = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        Tolerancia = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();
        AproximacionA = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Funcion.setBackground(new java.awt.Color(0, 0, 0));
        Funcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Funcion.setForeground(new java.awt.Color(255, 255, 255));
        Funcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Funcion.setText("e^(-x)-sin(x)");
        Funcion.setBorder(null);
        Funcion.setOpaque(false);
        Funcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionActionPerformed(evt);
            }
        });
        jPanel1.add(Funcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 36));
        Funcion.getAccessibleContext().setAccessibleName("");
        Funcion.getAccessibleContext().setAccessibleDescription("");

        jLabelDecimales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDecimales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDecimales.setText("Decimales");
        jPanel1.add(jLabelDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 60, 20));

        jLabelAprox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAprox.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAprox.setText("Aproximacion inicial");
        jPanel1.add(jLabelAprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 88, 130, -1));

        AproximacionB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AproximacionB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AproximacionB.setText("1");
        AproximacionB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AproximacionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AproximacionBActionPerformed(evt);
            }
        });
        jPanel1.add(AproximacionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 114, 80, 25));

        B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B.setText("2");
        B.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 171, 80, 28));

        jSpinnerDecimales.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jSpinnerDecimales.setModel(new javax.swing.SpinnerNumberModel(4, 1, 15, 1));
        jSpinnerDecimales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSpinnerDecimales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerDecimalesStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 60, -1));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Métodos para determinar raices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRBisepccion);
        jRBisepccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRBisepccion.setForeground(new java.awt.Color(255, 255, 255));
        jRBisepccion.setSelected(true);
        jRBisepccion.setText("Bisección ");
        jRBisepccion.setOpaque(false);
        jRBisepccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBisepccionActionPerformed(evt);
            }
        });
        jPanel6.add(jRBisepccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        buttonGroup1.add(jRRegulaFalsi);
        jRRegulaFalsi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRRegulaFalsi.setForeground(new java.awt.Color(255, 255, 255));
        jRRegulaFalsi.setText("Regula Falsi");
        jRRegulaFalsi.setOpaque(false);
        jRRegulaFalsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRRegulaFalsiActionPerformed(evt);
            }
        });
        jPanel6.add(jRRegulaFalsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonGroup1.add(jRNewton);
        jRNewton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRNewton.setForeground(new java.awt.Color(255, 255, 255));
        jRNewton.setText("Newton");
        jRNewton.setOpaque(false);
        jRNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNewtonActionPerformed(evt);
            }
        });
        jPanel6.add(jRNewton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        buttonGroup1.add(jRSecante);
        jRSecante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRSecante.setForeground(new java.awt.Color(255, 255, 255));
        jRSecante.setText("Secante");
        jRSecante.setOpaque(false);
        jRSecante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRSecanteMouseClicked(evt);
            }
        });
        jRSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSecanteActionPerformed(evt);
            }
        });
        jPanel6.add(jRSecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tolerancia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 70, -1));

        A.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        A.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A.setText("-2");
        A.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 171, 80, 27));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 204, 0));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(0, 204, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Iteracion", "Valor de X", "Error "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 670, 280));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intervalo donde se extima la raiz");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 150, -1, -1));

        jButtonCalcular.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setFont(new java.awt.Font("Mandalore Expanded", 0, 14)); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 30));

        Tolerancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tolerancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tolerancia.setText("0.002");
        Tolerancia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Tolerancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 120, 30));

        jLabelError.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setFocusable(false);
        jPanel1.add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 670, 30));

        AproximacionA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AproximacionA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AproximacionA.setText("0");
        AproximacionA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AproximacionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AproximacionAActionPerformed(evt);
            }
        });
        jPanel1.add(AproximacionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 114, 80, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
       
        
        
        if(EnableBotton()){
            
            String tempfuncion = Funcion.getText();
            double temptolerancia = Double.valueOf(Tolerancia.getText());
            double a = Double.valueOf(A.getText());
            double b = Double.valueOf(B.getText());
            double aprox1 = Double.valueOf(AproximacionA.getText());
            double aprox2 = Double.valueOf(AproximacionB.getText());
            
            
            if(temptolerancia < 0.0000000000000009){
                JOptionPane.showMessageDialog(this, SMS.Mensage_1());
            }
           
            
            try {           
              
                if (x.Bolsano(a, b, tempfuncion)) {
                    jLabelError.setVisible(false);
                    x.RootCalculator(type, tempfuncion, a, b, temptolerancia, 100, aprox1, aprox2);
                    
                    ArrayList<MethodResult> solution = x.getSolution();
                    DefaultTableModel model = new DefaultTableModel();
                    String row[] = {"Iteracion", "Valor de x", "Error"};

                    model.setColumnIdentifiers(row);

                    for (int i = 0; i < solution.size(); i++) {

                        //Definir cantidad de decimales
                        String Xn = formato.format(solution.get(i).getXvalue());
                        String Em = formato.format(solution.get(i).getEm());

                        row[0] = String.valueOf(i + 1);
                        //System.out.println(temp +"  error = " + temp2);

                        row[1] = String.valueOf(Xn);
                        row[2] = String.valueOf(Em);
                        model.addRow(row);
                    }

                    jTable1.setModel(model);
                    jTable1.setVisible(true);
                    jScrollPane1.setVisible(true);
                    JOptionPane.showMessageDialog(this, SMS.Mensage_2());

                }
                else{
                    jLabelError.setText(SMS.Mensage_3());
                    jLabelError.setVisible(true);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

    }//GEN-LAST:event_AActionPerformed

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        jLabelError.setVisible(false);
    }//GEN-LAST:event_AMouseClicked

    private void AproximacionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AproximacionBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AproximacionBActionPerformed

    private void jSpinnerDecimalesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerDecimalesStateChanged

        //Definir cantidad de lugares luego de la ,
        int value = (int) jSpinnerDecimales.getValue();
        if (value > decimales.length()) {
            decimales = "#.";
            for (int i = 0; i < value ; i++) {
                decimales = decimales + "#";
            }
        } else if (value < decimales.length()) {

            decimales = "#.";
            for (int i = 0; i < value ; i++) {
                decimales = decimales + "#";
            }
        }
        this.formato = new DecimalFormat(decimales);
    }//GEN-LAST:event_jSpinnerDecimalesStateChanged

    private void FuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FuncionActionPerformed

    private void jRSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSecanteActionPerformed
       
    }//GEN-LAST:event_jRSecanteActionPerformed

    private void jRNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNewtonActionPerformed
        if(jRNewton.isSelected()){
            type = Type_Method.MNewton;
            jLabelAprox.setVisible(true);
            AproximacionB.setVisible(false);
            AproximacionA.setVisible(true);
            
        }
    }//GEN-LAST:event_jRNewtonActionPerformed

    private void jRRegulaFalsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRegulaFalsiActionPerformed
        type = Type_Method.MRegula_falsi;
        jLabelAprox.setVisible(false);
        AproximacionB.setVisible(false);
        AproximacionA.setVisible(false);
    }//GEN-LAST:event_jRRegulaFalsiActionPerformed

    private void jRBisepccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBisepccionActionPerformed
        type = Type_Method.Mbiseccion;
        jLabelAprox.setVisible(false);
        AproximacionB.setVisible(false);
        AproximacionA.setVisible(false);
    }//GEN-LAST:event_jRBisepccionActionPerformed

    private void AproximacionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AproximacionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AproximacionAActionPerformed

    private void jRSecanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRSecanteMouseClicked
         type = Type_Method.MSecante;
        jLabelAprox.setVisible(true);
        AproximacionA.setVisible(true);
        AproximacionB.setVisible(true);
    }//GEN-LAST:event_jRSecanteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField AproximacionA;
    private javax.swing.JTextField AproximacionB;
    private javax.swing.JTextField B;
    private javax.swing.JTextField Funcion;
    private javax.swing.JTextField Tolerancia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAprox;
    private javax.swing.JLabel jLabelDecimales;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRBisepccion;
    private javax.swing.JRadioButton jRNewton;
    private javax.swing.JRadioButton jRRegulaFalsi;
    private javax.swing.JRadioButton jRSecante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDecimales;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


    public boolean EnableBotton(){
        
        boolean temp = true;
        if(!(Tolerancia.getText().length() > 0)){
            Tolerancia.setBorder(new LineBorder(Color.RED));
            temp = false;
        }
        else{
            Tolerancia.setBorder(new LineBorder(Color.WHITE));
        }
        if(!(AproximacionA.getText().length() > 0)){
            AproximacionA.setBorder(new LineBorder(Color.RED));
            temp = false;
        }
        else{
            AproximacionA.setBorder(new LineBorder(Color.WHITE));
        }
        if(!(AproximacionB.getText().length() > 0)){
            AproximacionB.setBorder(new LineBorder(Color.RED));
            temp = false;
        }
        else{
            AproximacionB.setBorder(new LineBorder(Color.WHITE));
        }
        if(!(Funcion.getText().length() > 0)){
            Funcion.setBorder(new LineBorder(Color.RED));
            temp = false;
        }
        else{
            Funcion.setBorder(new LineBorder(Color.WHITE));
        }
        if(!(A.getText().length() > 0)){
            A.setBorder(new LineBorder(Color.RED));
            temp = false;
        }
        else{
            A.setBorder(new LineBorder(Color.WHITE));
        }
        if(!(B.getText().length() > 0)){
            B.setBorder(new LineBorder(Color.RED));
            temp = false;
        }
        else{
            B.setBorder(new LineBorder(Color.WHITE));
        }
        return temp;
        
    }








}
