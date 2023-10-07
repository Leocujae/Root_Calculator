
package Functionalities_Methods.Numeric_Integration;

import Controller.Controller;
import java.text.DecimalFormat;


public class Simpson {
    
    
    
    
    
    public double SIMSOM(double a , double b , int n , String function){
        DecimalFormat formato = new DecimalFormat("0.000");
        n ++;
        double x_value[] = new double[n];
        double y_value[] = new double[n];
        int tamlog = n;
        
        double h = (b-a)/(n-1);
        double x = a;
        
        
        int i = 0;
        x_value[i] = x;
        y_value[i] = Controller.getInstance().EvalFunction(function, x);
        i++;
        
        x+=h;
        while(i < n){
            
        x_value[i] = x;
        y_value[i] = Controller.getInstance().EvalFunction(function, x);
        i++;
        x+=h;
        }
        return SIMSOMMATRIX( x_value ,  y_value ,  tamlog , n , h);
        
    }
    
    public double SIMSOMMATRIX(double x_value[] , double y_value[] , int tamlog ,int n , double h){
        
        DecimalFormat formato = new DecimalFormat("0.000");
        

        double r = 0;
        double a = x_value[0];
        double b = x_value[tamlog-1];
        
        double pares = 0;
        double impares = 0;
        
        
        if(h == Double.NaN){
         h = (b-a)/n;
        }
        System.out.println("h = "+h);
        
        
        String paresText ="";
        String imparesText="";
        int step = tamlog /n;
        int i = step;
        boolean par = true;
        while(i < tamlog-1){
            if(!par){
                
                impares += y_value[i];
                double temp = impares;
                
                imparesText += formato.format(temp);
                imparesText += " + ";
                par = true;
            }
            else{
                pares += y_value[i];
                double temp = pares;
                paresText += formato.format(temp);
                par = false;
                paresText += " + ";
            }
            i+=step;
        }
        if(!imparesText.isEmpty())
        imparesText = imparesText.substring(0 ,imparesText.length()-2);
        
        if(!paresText.isEmpty())
        paresText = paresText.substring(0 ,imparesText.length()-2);
       
        System.out.println(formato.format(h)+"/3 * ((" + formato.format(y_value[0])+" + "+formato.format(y_value[tamlog-1])+" ) + 4("+ imparesText +" ) + 2(" + paresText +" ))" );
        
        
        
        
        r = h/3 *((y_value[0]+y_value[tamlog-1]) +4 * pares + 2 * impares);
        System.out.println("El resultado es = "+r);
        
        return r;
    }
    
    public double GET_ERROR_TRUNKAMIENTO(double a , double b , double h , String function , double c){
       
        String Der4 = Controller.getInstance().DeriveFunction(Controller.getInstance().DeriveFunction(Controller.getInstance().DeriveFunction(Controller.getInstance().DeriveFunction(function))));
        double F4 = Controller.getInstance().EvalFunction(Der4, c);

        return (-b - a) / 180 * h * F4;

    }
}
