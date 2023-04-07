/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import Controller.Controller;
import Factory.TypeMethod;
import Grapher.Function;
import Grapher.Graph;
import Messages.Messages;
import Root_Calculation_Methods.MethodResult;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL_DEO
 */
public class jPanelRootMethods extends javax.swing.JPanel {
    Messages SMS ;
    Controller x = Controller.getInstance();
    TypeMethod type;

    DecimalFormat formato;
    String decimales;
    Graph grafica = new Graph("Graficadora", "Eje X", "Eje Y");

    public jPanelRootMethods() {
        SMS = new Messages();
        initComponents();
        jLabelAprox.setVisible(false);
        
        Aproximacion1.setVisible(false);
        Aproximacion2.setVisible(false);
        
        
        
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
        jButton1 = new javax.swing.JButton();
        A1 = new javax.swing.JTextField();
        Aproximacion2 = new javax.swing.JTextField();
        jPanelGrafica = grafica.DibujarGrafica();
        D = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jRBisepccion = new javax.swing.JRadioButton();
        jRRegulaFalsi = new javax.swing.JRadioButton();
        jRNewton = new javax.swing.JRadioButton();
        jRSecante = new javax.swing.JRadioButton();
        jSpinnerDecimales = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        A = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        Tolerancia = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        B1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Aproximacion1 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 800));
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
        jPanel1.add(Funcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 58, 260, 40));
        Funcion.getAccessibleContext().setAccessibleName("");
        Funcion.getAccessibleContext().setAccessibleDescription("");

        jLabelDecimales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDecimales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDecimales.setText("Decimales");
        jPanel1.add(jLabelDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 720, 60, 20));

        jLabelAprox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAprox.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAprox.setText("Aproximacion inicial");
        jPanel1.add(jLabelAprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Mandalore Expanded", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 90, 30));

        A1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        A1.setText("-5");
        A1.setMaximumSize(new java.awt.Dimension(6, 20));
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 40, 30));

        Aproximacion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aproximacion2.setText("1");
        Aproximacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aproximacion2ActionPerformed(evt);
            }
        });
        jPanel1.add(Aproximacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 25));

        javax.swing.GroupLayout jPanelGraficaLayout = new javax.swing.GroupLayout(jPanelGrafica);
        jPanelGrafica.setLayout(jPanelGraficaLayout);
        jPanelGraficaLayout.setHorizontalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanelGraficaLayout.setVerticalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 370, 350));

        D.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        D.setText("0.1");
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 40, 30));

        B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B.setText("2");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 25));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, 10));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Métodos para determinar raices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRBisepccion);
        jRBisepccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRBisepccion.setForeground(new java.awt.Color(255, 255, 255));
        jRBisepccion.setText("Bisección ");
        jRBisepccion.setOpaque(false);
        jRBisepccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBisepccionActionPerformed(evt);
            }
        });
        jPanel6.add(jRBisepccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, 144, -1));

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
        jPanel6.add(jRRegulaFalsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));

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
        jPanel6.add(jRNewton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, -1, -1));

        buttonGroup1.add(jRSecante);
        jRSecante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRSecante.setForeground(new java.awt.Color(255, 255, 255));
        jRSecante.setText("Secante");
        jRSecante.setOpaque(false);
        jRSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSecanteActionPerformed(evt);
            }
        });
        jPanel6.add(jRSecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, 150));

        jSpinnerDecimales.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jSpinnerDecimales.setModel(new javax.swing.SpinnerNumberModel(4, 1, 15, 1));
        jSpinnerDecimales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerDecimalesStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 740, 60, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tolerancia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 30));

        A.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        A.setText("-2");
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
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 25));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 670, 260));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intervalo donde se extima la raiz");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 30));

        jButtonCalcular.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setFont(new java.awt.Font("Mandalore Expanded", 0, 14)); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 290, 30));

        Tolerancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tolerancia.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Tolerancia.setText("0.002");
        jPanel1.add(Tolerancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 25));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Mandalore Expanded", 0, 18)); // NOI18N
        jButton3.setText("Graficar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 100, 30));

        jLabelError.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setFocusable(false);
        jPanel1.add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 424, 670, 30));

        B1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        B1.setText("5");
        B1.setMaximumSize(new java.awt.Dimension(6, 20));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 40, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Funcíon :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        Aproximacion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aproximacion1.setText("0");
        Aproximacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aproximacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(Aproximacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 40, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String def = Funcion.getText();
        double x0 = Double.parseDouble(A1.getText());
        double xn = Double.parseDouble(B1.getText());
        double d = Double.parseDouble(D.getText());

        Function f = new Function(def);
        double [] x =f.rango(x0, xn, d);
        try{
            double [] y =f.eval(x);
            grafica.crearGrafica(def, x, y);
            grafica.DibujarGrafica();

        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
       
        if(type != null){
            String tempfuncion = Funcion.getText();
            double temptolerancia = Double.valueOf(Tolerancia.getText());
            double a = Double.valueOf(A.getText());
            double b = Double.valueOf(B.getText());
            double aprox1 = Double.valueOf(Aproximacion1.getText());
            double aprox2 = Double.valueOf(Aproximacion2.getText());
            x.setFunction(tempfuncion);
            
            if(temptolerancia < 0.0000000000000009){
                JOptionPane.showMessageDialog(this, SMS.Mensage_1());
            }
            x.setTolerance(temptolerancia);
            x.setIntervalos(a, b);
            x.setTypeMethod(type);
            x.setAproximacion1(aprox1);
            x.setAproximacion2(aprox2);
            
            try {           
              
                if (x.Bolsano(a, b, tempfuncion)) {
                    jLabelError.setVisible(false);
                    x.Resolver();

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
        else{
            jLabelError.setText(SMS.Mensage_4());
            jLabelError.setVisible(true);
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        grafica.Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

    }//GEN-LAST:event_AActionPerformed

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        jLabelError.setVisible(false);
    }//GEN-LAST:event_AMouseClicked

    private void Aproximacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aproximacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Aproximacion2ActionPerformed

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
        type = TypeMethod.MSecante;
        jLabelAprox.setVisible(true);
        Aproximacion1.setVisible(true);
        Aproximacion2.setVisible(true);
    }//GEN-LAST:event_jRSecanteActionPerformed

    private void jRNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNewtonActionPerformed
        if(jRNewton.isSelected()){
            type = TypeMethod.MNewton;
            jLabelAprox.setVisible(true);
            Aproximacion1.setVisible(true);
            Aproximacion2.setVisible(false);
        }
    }//GEN-LAST:event_jRNewtonActionPerformed

    private void jRRegulaFalsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRegulaFalsiActionPerformed
        type = TypeMethod.MRegula_falsi;
        jLabelAprox.setVisible(false);
        Aproximacion2.setVisible(false);
        Aproximacion1.setVisible(false);
    }//GEN-LAST:event_jRRegulaFalsiActionPerformed

    private void jRBisepccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBisepccionActionPerformed
        type = TypeMethod.Mbiseccion;
        jLabelAprox.setVisible(false);
        Aproximacion2.setVisible(false);
        Aproximacion1.setVisible(false);
    }//GEN-LAST:event_jRBisepccionActionPerformed

    private void Aproximacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aproximacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Aproximacion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField A1;
    private javax.swing.JTextField Aproximacion1;
    private javax.swing.JTextField Aproximacion2;
    private javax.swing.JTextField B;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField D;
    private javax.swing.JTextField Funcion;
    private javax.swing.JTextField Tolerancia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAprox;
    private javax.swing.JLabel jLabelDecimales;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JRadioButton jRBisepccion;
    private javax.swing.JRadioButton jRNewton;
    private javax.swing.JRadioButton jRRegulaFalsi;
    private javax.swing.JRadioButton jRSecante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerDecimales;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
