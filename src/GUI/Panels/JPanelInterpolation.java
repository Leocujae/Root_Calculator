
package GUI.Panels;

import Interpolation_FunctionMethods.Lagrange;
import java.util.ArrayList;
import javax.swing.SwingConstants;
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
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Pizarra = new javax.swing.JTextArea();
        Valor = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(600, 800));
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 669, 113));

        jTextField1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField1.setText("SIn implementar");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Función ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jTextField1.setOpaque(false);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, 60));

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        Pizarra.setBackground(new java.awt.Color(0, 0, 0));
        Pizarra.setColumns(20);
        Pizarra.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        Pizarra.setForeground(new java.awt.Color(0, 255, 0));
        Pizarra.setRows(5);
        jScrollPane4.setViewportView(Pizarra);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 669, 290));

        Valor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valor.setText("1.5");
        Valor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor a calcular"));
        Valor.setOpaque(false);
        add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 112, 60));
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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Pizarra;
    private javax.swing.JTable TablaValores;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerGrado;
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
