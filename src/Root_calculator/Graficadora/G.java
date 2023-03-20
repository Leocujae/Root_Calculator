/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Root_calculator.Graficadora;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author EL_DEO
 */
public class G {
    
    JFreeChart grafica ;
    XYSeriesCollection datos ;
    String titulo;
    String Ejex;
    String Ejey;
    
    
    
    public G(String titulo , String ejex , String ejey) {
        datos = new XYSeriesCollection();
        this.titulo = titulo;
        this.Ejex = ejex;
        this.Ejey = ejey;
        
        grafica = ChartFactory.createXYLineChart(titulo, ejey, ejey, datos,PlotOrientation.VERTICAL,true,true,true);
    }

    public void AgregarGrafica(String ID , double[] x , double[] y){
        
        
        XYSeries Serie = new XYSeries(ID);
        int n = x.length;
        for(int i = 0 ; i < n ; i++){
         Serie.add(x[i],y[i]);
        }
        datos.addSeries(Serie);
    }
    
    public void crearGrafica(String ID , double[] x , double[] y){
        datos.removeAllSeries();
        this.AgregarGrafica(ID, x, y);
    }
    public JPanel DibujarGrafica(){
        return new ChartPanel(grafica); 
    }
 
}
