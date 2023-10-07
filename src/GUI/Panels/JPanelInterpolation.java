
package GUI.Panels;

import Controller.Controller;
import Functionalities_Methods.Interpolation.LagrangeInterpolation;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL_DEO
 */
public class JPanelInterpolation extends javax.swing.JPanel {

    public JPanelInterpolation() {
        initComponents();
        CentrarTabla();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerGrado = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaValores = new javax.swing.JTable();
        Function = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Valor = new javax.swing.JTextField();
        jError_Interpolation = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Pizarra = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(650, 600));
        setMinimumSize(new java.awt.Dimension(650, 600));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSpinnerGrado.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jSpinnerGrado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerGradoStateChanged(evt);
            }
        });
        add(jSpinnerGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, 50, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setText("Grado del Polinomio");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, 25));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 200, 13));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 630, 117));

        Function.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Function.setText("e^(x)");
        Function.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Función ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        Function.setOpaque(false);
        Function.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FunctionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FunctionKeyReleased(evt);
            }
        });
        add(Function, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 70));

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        Valor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valor.setText("1.5");
        Valor.setToolTipText("");
        Valor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valor a calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        Valor.setMaximumSize(new java.awt.Dimension(120, 50));
        Valor.setMinimumSize(new java.awt.Dimension(120, 50));
        Valor.setOpaque(false);
        Valor.setPreferredSize(new java.awt.Dimension(120, 50));
        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });
        Valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ValorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorKeyReleased(evt);
            }
        });
        add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 189, -1, 70));

        jError_Interpolation.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jError_Interpolation.setForeground(new java.awt.Color(255, 255, 255));
        jError_Interpolation.setText("Mostrar Error De interpolación");
        jError_Interpolation.setOpaque(false);
        jError_Interpolation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jError_InterpolationMouseReleased(evt);
            }
        });
        jError_Interpolation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jError_InterpolationActionPerformed(evt);
            }
        });
        add(jError_Interpolation, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 189, -1, -1));

        Pizarra.setBackground(new java.awt.Color(0, 0, 0));
        Pizarra.setColumns(20);
        Pizarra.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        Pizarra.setForeground(new java.awt.Color(0, 255, 0));
        Pizarra.setRows(5);
        jScrollPane4.setViewportView(Pizarra);

        jScrollPane1.setViewportView(jScrollPane4);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 640, 300));
    }// </editor-fold>//GEN-END:initComponents

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

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        
        

        
        DecimalFormat formato = new DecimalFormat("#.######");
        int nodos = (int) jSpinnerGrado.getValue() +1;
        double value = Double.NaN;
        
        
        try {
            ArrayList<Double> X = new ArrayList<>();
            ArrayList<Double> Y =new ArrayList<>();
            
            DefaultTableModel modelo = (DefaultTableModel) TablaValores.getModel();
            
            for(int i = 0 ; i < modelo.getColumnCount() ; i++){
                System.out.print(TablaValores.getValueAt(0, i)+"-");
                System.out.println(TablaValores.getValueAt(1, i));
                
                X.add(Double.valueOf((String)TablaValores.getValueAt(0, i)));
                Y.add(Double.valueOf((String) TablaValores.getValueAt(1, i)));
            }
            
            LagrangeInterpolation lagrange = Controller.getInstance().MethodLagrange();
            lagrange.loadDate(nodos, X, Y, value);
            String text;
            
            if (Valor.getText().length() > 0) {
                value = Double.valueOf(Valor.getText());
                lagrange.loadDate(nodos, X, Y, value);
                text = lagrange.GetStep();
            } else {
                text = lagrange.GetPolinomio();
            }
            if (jError_Interpolation.isSelected()) {
                text = text + "\nInterpolación E(x) = " + formato.format(lagrange.ERROR_INTERPOLATION(Function.getText()));
            }

            Pizarra.setText(text);

        } catch (Exception ex) {
            Logger.getLogger(JPanelInterpolation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CalcularActionPerformed

    private void jError_InterpolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jError_InterpolationActionPerformed
        EnableCalcular();    
    }//GEN-LAST:event_jError_InterpolationActionPerformed

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
     
    }//GEN-LAST:event_ValorActionPerformed

    private void ValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorKeyPressed

       EnableCalcular();
    }//GEN-LAST:event_ValorKeyPressed

    private void ValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorKeyReleased
       EnableCalcular();
    }//GEN-LAST:event_ValorKeyReleased

    private void FunctionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FunctionKeyReleased
       EnableCalcular();
    }//GEN-LAST:event_FunctionKeyReleased

    private void FunctionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FunctionKeyPressed
        
       EnableCalcular();
    }//GEN-LAST:event_FunctionKeyPressed

    private void jError_InterpolationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jError_InterpolationMouseReleased
       EnableCalcular();
    }//GEN-LAST:event_jError_InterpolationMouseReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Function;
    private javax.swing.JTextArea Pizarra;
    private javax.swing.JTable TablaValores;
    private javax.swing.JTextField Valor;
    private javax.swing.JCheckBox jError_Interpolation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerGrado;
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
    
    
    private void EnableCalcular(){
        boolean z = jError_Interpolation.isSelected();
        int valor = Valor.getText().length();
        int function = Function.getText().length();
        
        if(z && valor == 0){
            Valor.setBorder(javax.swing.BorderFactory.createTitledBorder(new LineBorder(Color.RED),"Valor a calcular"));
        }
        else{
            Valor.setBorder(javax.swing.BorderFactory.createTitledBorder(new LineBorder(Color.WHITE),"Valor a calcular"));
        }
       
        
        if(z && function == 0){
            Function.setBorder(javax.swing.BorderFactory.createTitledBorder(new LineBorder(Color.RED),"Valor a calcular"));
        }
        else{
            Function.setBorder(javax.swing.BorderFactory.createTitledBorder(new LineBorder(Color.WHITE),"Valor a calcular"));
        }
       
        if (z && function > 0 && valor > 0) {
            Calcular.setEnabled(true);
        } else if (z && (function == 0 || valor == 0)) {
            Calcular.setEnabled(false);
        } else {
            Calcular.setEnabled(true);
        }
        
    }


}
