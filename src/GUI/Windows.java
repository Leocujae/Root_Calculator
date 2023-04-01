/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Interpolation_FunctionMethods.Lagrange;
import Controller.Controller;
import Factory.TypeMethod;
import Grapher.Function;
import Grapher.Graph;
import Root_Calculation_Methods.MethodResult;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL_DEO
 */
public class Windows extends javax.swing.JFrame {

    Controller x = Controller.getInstance();
    TypeMethod type ;
    
    DecimalFormat formato ;
    String decimales;
    
    Graph grafica = new Graph("Graficadora", "Eje X", "Eje Y");
    public Windows() {
        initComponents();
        Aproximacion.setVisible(false);
        CentrarTabla();
        decimales = "#.####";
        formato = new DecimalFormat(decimales);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jRBisepccion = new javax.swing.JRadioButton();
        jRRegulaFalsi = new javax.swing.JRadioButton();
        jRNewton = new javax.swing.JRadioButton();
        jRSecante = new javax.swing.JRadioButton();
        Funcion = new javax.swing.JTextField();
        jSpinnerDecimales = new javax.swing.JSpinner();
        jPanelGrafica = grafica.DibujarGrafica();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        Tolerancia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Aproximacion = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        D = new javax.swing.JTextField();
        jLabelDecimales = new javax.swing.JLabel();
        B1 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();
        B = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelAprox1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSpinnerGrado = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaValores = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Pizarra = new javax.swing.JTextArea();
        Valor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MN-2023");
        setMaximumSize(new java.awt.Dimension(650, 800));
        setMinimumSize(new java.awt.Dimension(650, 800));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(650, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 150));

        Funcion.setBackground(new java.awt.Color(0, 0, 0));
        Funcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Funcion.setForeground(new java.awt.Color(255, 255, 255));
        Funcion.setText("e^(x*2)+x");
        Funcion.setBorder(null);
        Funcion.setOpaque(false);
        Funcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionActionPerformed(evt);
            }
        });
        jPanel2.add(Funcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 280, 30));

        jSpinnerDecimales.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jSpinnerDecimales.setModel(new javax.swing.SpinnerNumberModel(4, 1, 9, 1));
        jSpinnerDecimales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerDecimalesStateChanged(evt);
            }
        });
        jPanel2.add(jSpinnerDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 740, 40, 30));

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

        jPanel2.add(jPanelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 370, 350));

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 670, 260));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, 10));

        Tolerancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tolerancia.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Tolerancia.setText("0.002");
        jPanel2.add(Tolerancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 25));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Funcíon");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tolerancia");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 30));

        Aproximacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aproximacion.setText("1");
        Aproximacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AproximacionActionPerformed(evt);
            }
        });
        jPanel2.add(Aproximacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 40, 25));

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
        jPanel2.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 25));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Mandalore Expanded", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 90, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Mandalore Expanded", 0, 14)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 280, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Mandalore Expanded", 0, 18)); // NOI18N
        jButton3.setText("Graficar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, 30));

        D.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        D.setText("0.1");
        jPanel2.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 40, 30));

        jLabelDecimales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDecimales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDecimales.setText("Decimales");
        jPanel2.add(jLabelDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 720, 60, 20));

        B1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        B1.setText("5");
        B1.setMaximumSize(new java.awt.Dimension(6, 20));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel2.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 40, 30));

        A1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        A1.setText("-5");
        A1.setMaximumSize(new java.awt.Dimension(6, 20));
        jPanel2.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 40, 30));

        jLabelError.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setFocusable(false);
        jPanel2.add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 424, 670, 30));

        B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B.setText("2");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel2.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intervalo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 60, 30));

        jLabelAprox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAprox1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAprox1.setText("Aproximacion inicial");
        jPanel2.add(jLabelAprox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 800));

        jTabbedPane1.addTab("Calcular Raices", jPanel1);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jSpinnerGrado.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jSpinnerGrado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerGradoStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setText("Grado del Polinomio");

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla de nodos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 14))); // NOI18N

        TablaValores.setBackground(new java.awt.Color(0, 0, 0));
        TablaValores.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        TablaValores.setForeground(new java.awt.Color(0, 255, 0));
        TablaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2"},
                {"2.72", "7.39"}
            },
            new String [] {
                "X0", "X1"
            }
        ));
        TablaValores.setGridColor(new java.awt.Color(0, 255, 204));
        TablaValores.setRowHeight(24);
        TablaValores.setRowSelectionAllowed(false);
        TablaValores.setSelectionBackground(new java.awt.Color(255, 255, 255));
        TablaValores.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaValores);

        jTextField1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField1.setText("SIn implementar");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Función ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jTextField1.setOpaque(false);

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Pizarra.setBackground(new java.awt.Color(0, 0, 0));
        Pizarra.setColumns(20);
        Pizarra.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        Pizarra.setForeground(new java.awt.Color(0, 255, 0));
        Pizarra.setRows(5);
        jScrollPane4.setViewportView(Pizarra);

        Valor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valor.setText("1.5");
        Valor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor a calcular"));
        Valor.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinnerGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Valor))
                .addGap(36, 36, 36)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        jTabbedPane1.addTab("Interpolar Funciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 813, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FuncionActionPerformed

    private void jRBisepccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBisepccionActionPerformed
        type = TypeMethod.Mbiseccion;
        jLabelDecimales.setVisible(false);
        Aproximacion.setVisible(false);
    
    }//GEN-LAST:event_jRBisepccionActionPerformed

    private void jRRegulaFalsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRegulaFalsiActionPerformed
        type = TypeMethod.MRegula_falsi;
        jLabelDecimales.setVisible(false);
        Aproximacion.setVisible(false);
    }//GEN-LAST:event_jRRegulaFalsiActionPerformed

    private void jRNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNewtonActionPerformed
  if(jRNewton.isSelected()){
        type = TypeMethod.MNewton;
        jLabelDecimales.setVisible(true);
        Aproximacion.setVisible(true);    
        }

    }//GEN-LAST:event_jRNewtonActionPerformed

    private void jRSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSecanteActionPerformed
        type = TypeMethod.MSecante;
         jLabelDecimales.setVisible(false);
        Aproximacion.setVisible(false);
    }//GEN-LAST:event_jRSecanteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        if(type != null){
            
          
        String tempfuncion = Funcion.getText();
        double temptolerancia = Double.valueOf(Tolerancia.getText());
        double a = Double.valueOf(A.getText());
        double b = Double.valueOf(B.getText());
        double aprox = Double.valueOf(Aproximacion.getText());
        x.setFunction(tempfuncion);
        x.setTolerance(temptolerancia);
        x.setIntervalos(a, b);
        x.setTypeMethod(type);
        x.setAproximacion(aprox);
        
        Function e = new Function(tempfuncion);
        try {
            
            //System.out.println(e.eval(a));
            //System.out.println(e.eval(b));
            
            if (e.eval(a) * e.eval(b) < 0) {
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
                JOptionPane.showMessageDialog(rootPane, "Resultado calculado con éxito");

            }
            else{
                jLabelError.setText("En el intervalo la funcion debe sufrir cambio de monotonía y presentar una unica raiz");
                jLabelError.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        }
        else{
            jLabelError.setText("Seleccione el método a utilizar");
            jLabelError.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AproximacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AproximacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AproximacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
        grafica.Limpiar();
      
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
     
    }//GEN-LAST:event_AActionPerformed

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
         jLabelError.setVisible(false);
    }//GEN-LAST:event_AMouseClicked

    private void jSpinnerGradoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerGradoStateChanged
        
        DefaultTableModel modelo = (DefaultTableModel) TablaValores.getModel();
        int columnas = modelo.getColumnCount();
        int nodos = (int) jSpinnerGrado.getValue() +1;
       
        if(columnas < nodos){
        for(int i = columnas ; i < nodos ; i++){
            modelo.addColumn("X"+i);
        }
        }
        else if(columnas > nodos){
            modelo.setColumnCount(nodos);
        }
        
        this.CentrarTabla();
        
    }//GEN-LAST:event_jSpinnerGradoStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y =new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) TablaValores.getModel();
        
        
        for(int i = 0 ; i < modelo.getColumnCount() ; i++){
            System.out.print(TablaValores.getValueAt(0, i)+"-");
            System.out.println(TablaValores.getValueAt(1, i));
            
           X.add(Double.valueOf((String)TablaValores.getValueAt(0, i)));
           Y.add(Double.valueOf((String)TablaValores.getValueAt(1, i))); 
        }
        Lagrange temp = new Lagrange(X, Y);
        double result = temp.CalcularPL(Double.valueOf(Valor.getText()));
        
        
        ArrayList<String> Polis =  temp.getPolinomios();
        String text ="";
        for(int i = 0 ; i < Polis.size() ; i++){
          text =text +"L("+i+") = "+ Polis.get(i) +"\n";
            
        }
        
        text = text + "P(X) = " + temp.GetPolinomio() +"\n" +"P("+Valor.getText()+") = " +  result;
        Pizarra.setText(text);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

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
        System.out.println(decimales);
        this.formato = new DecimalFormat(decimales);
    }//GEN-LAST:event_jSpinnerDecimalesStateChanged

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
            @Override
            public void run() {
                new Windows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField A1;
    private javax.swing.JTextField Aproximacion;
    private javax.swing.JTextField B;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField D;
    private javax.swing.JTextField Funcion;
    private javax.swing.JTextArea Pizarra;
    private javax.swing.JTable TablaValores;
    private javax.swing.JTextField Tolerancia;
    private javax.swing.JTextField Valor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAprox1;
    private javax.swing.JLabel jLabelDecimales;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JRadioButton jRBisepccion;
    private javax.swing.JRadioButton jRNewton;
    private javax.swing.JRadioButton jRRegulaFalsi;
    private javax.swing.JRadioButton jRSecante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerDecimales;
    private javax.swing.JSpinner jSpinnerGrado;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables




    private void CentrarTabla() {

        DefaultTableCellRenderer centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < TablaValores.getColumnCount(); i++) {
            TablaValores.getColumnModel().getColumn(i).setCellRenderer(centrar);
            DefaultTableCellRenderer r = (DefaultTableCellRenderer) TablaValores.getTableHeader().getDefaultRenderer();
            r.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }





}
