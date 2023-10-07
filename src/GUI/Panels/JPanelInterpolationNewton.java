
package GUI.Panels;

import Controller.Controller;
import Functionalities_Methods.Interpolation.NewtonInterpolation;
import java.awt.Color;
import java.text.DecimalFormat;
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
public class JPanelInterpolationNewton extends javax.swing.JPanel {

    public JPanelInterpolationNewton() {
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
        jButton4 = new javax.swing.JButton();
        Valor = new javax.swing.JTextField();
        jError_Interpolation = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Pizarra = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(650, 500));
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
        Function.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Función ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        Function.setOpaque(false);
        add(Function, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, 220, -1));

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        Valor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valor.setText("1.5");
        Valor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor a calcular"));
        Valor.setOpaque(false);
        add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 189, 110, -1));

        jError_Interpolation.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jError_Interpolation.setForeground(new java.awt.Color(255, 255, 255));
        jError_Interpolation.setText("Mostrar error de interpolación de newton");
        jError_Interpolation.setOpaque(false);
        jError_Interpolation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jError_InterpolationActionPerformed(evt);
            }
        });
        add(jError_Interpolation, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 189, -1, -1));

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
        jError_Interpolation.setSelected(false);
        this.CentrarTabla();

    }//GEN-LAST:event_jSpinnerGradoStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DecimalFormat formato = new DecimalFormat("#.######");
        
        DefaultTableModel modelo = (DefaultTableModel) TablaValores.getModel();
        int n  =  modelo.getColumnCount();
        
        int nodos = (int) jSpinnerGrado.getValue()+1;
        
       
        try {
            double X[] = new double[n];
            double Y[] = new double[n];
            double value = Double.NaN;
            try{
             value = Double.valueOf(Valor.getText());
            }
            catch(Exception ex){
                 //Logger.getLogger(JPanelInterpolationNewton.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(int i = 0 ; i < modelo.getColumnCount() ; i++){
//                System.out.print(TablaValores.getValueAt(0, i)+"-");
//                System.out.println(TablaValores.getValueAt(1, i));
                
                X[i] =(Double.valueOf((String)TablaValores.getValueAt(0, i)));
                Y[i] =(Double.valueOf((String) TablaValores.getValueAt(1, i)));
            }

            NewtonInterpolation newtonInterpolation = Controller.getInstance().MethodInterpolationNewton();
            newtonInterpolation.Load(X, Y ,value ,nodos);

            String text = newtonInterpolation.getInterpolationPolynomial();

            if (jError_Interpolation.isSelected()) {
                text = text + "\nInterpolación E(x) = " + formato.format(newtonInterpolation.GET_ERROR_NEWTON());
            }
           
            Pizarra.setText(text);

        } catch (Exception ex) {
            Logger.getLogger(JPanelInterpolationNewton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jError_InterpolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jError_InterpolationActionPerformed
        
        if(Valor.getText().length() > 0){
        DefaultTableModel modelo = (DefaultTableModel) TablaValores.getModel();
        int columnas = modelo.getColumnCount();
        if(jError_Interpolation.isSelected()){
            
            
            modelo.addColumn("X"+columnas);
        }
        else{
           modelo.setColumnCount(columnas-1);
        }
        this.CentrarTabla();
        }
        
    }//GEN-LAST:event_jError_InterpolationActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Function;
    private javax.swing.JTextArea Pizarra;
    private javax.swing.JTable TablaValores;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton jButton4;
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



}
