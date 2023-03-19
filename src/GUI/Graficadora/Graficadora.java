/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Graficadora;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;
import org.lsmp.djep.djep.DJep;

/**
 *
 * @author EL_DEO
 */
public class Graficadora extends JPanel{
    
    
    
    
    public ChartPanel Graficar(String fString) {

        DJep DJep = new DJep();
        DJep.addStandardFunctions();
        DJep.addStandardConstants();
        DJep.addComplex();
        DJep.setAllowUndeclared(true);
        DJep.setAllowAssignment(true);
        DJep.setImplicitMul(true);
        DJep.addStandardDiffRules();
        
        
        double data[][] = new double[2][101];
        DefaultXYDataset dataset = new DefaultXYDataset();

        
        int j =0 ;
        for (double i = -10; i < 10; i+=0.2) {
            
            DJep.addVariable("x", i);
            DJep.parseExpression(fString);
            
            data[0][j] = i;
            double value = DJep.getValue();
            if(value != Double.NaN){
               data[1][j++] = value;
             }
            
        }
        dataset.addSeries(fString, data);
       
       
        JFreeChart chart = ChartFactory.createXYLineChart("Grafico de funcion", "x", "y", dataset,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel panel = new ChartPanel(chart);
      
       JPanel frame = new JPanel();
     
       frame.add(panel);
       frame.setVisible(true);
        
        
        
        
       return panel;
       
       
       
       
       
       
    }
    
    
    
    
}
