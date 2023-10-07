
package Functionalities_Methods.Numeric_Integration;

import Controller.Controller;
import java.text.DecimalFormat;


public class Trapecios {
    
    
    
    
    
    public double GET_H(double a , double b , int n){
        return (b-a)/n;
    }
    public double GET_TRAPECIO(double a , double b , double h , String function){
        DecimalFormat formato = new DecimalFormat("0.000");
        
        System.out.println("Formula");
        System.out.println("Sumatoria h*(x + xi)/2");
        System.out.println("h = "+h);
        double x = a;
        
        
        double Fxi = Controller.getInstance().EvalFunction(function, x);
        System.out.println("F("+ x +") ="+Fxi);
       
        double Fx;
        double r = 0;
        x += h;
        while(x <= b){
            
            Fx =Controller.getInstance().EvalFunction(function, x);
            
            
            r+= h*(Fxi + Fx)/2;
            
            System.out.print(h +" * ("+ formato.format(Fxi) +" + "+ formato.format(Fx) +")/2  +");
            
            x +=h;
            Fxi = Fx;
        }
        System.out.println();
        System.out.println(r);
        System.out.println();
        return r;
    }
    public double GET_TRAPECIO(double x_value[],int tamLog, double y_value[] , int n){
            
        DecimalFormat formato = new DecimalFormat("0.000");
        double r = 0;
        System.out.println("Formula");
        System.out.println("Sumatoria h*(x + xi)/2");
        
        double a = x_value[0];
        double b = x_value[tamLog-1];
        
        double h = ((b -a) /n);
        System.out.println("h =" +h);
        
        
        double y = y_value[0];
        
         
        int step = tamLog / n;
        int i = step;
        while(i < tamLog ){
             
             double yi = y_value[i];
             r += h*(y + yi)/2;
             System.out.print(h +" * ("+ formato.format(y) +" + "+ formato.format(yi) +")/2  +");
             y = yi;
             i+=step;
         }
       
       
        return r;
    
    }
    
    
    public double GET_TRUNCAMIENTO_ERROR(double a , double b , double h ,double c, String function){
        
        function = Controller.getInstance().DeriveFunction(Controller.getInstance().DeriveFunction(function));
        double functionResult =Controller.getInstance().EvalFunction(function, c);
        double r = (-b-a)/12*h*h*functionResult;
        
        
        System.out.print("(-" + b + " -"+a +" )/12 * " + h +"^2" + " f''("+c+")");
        
        return r;
    }
    public double GET_ASINTOTIC(double a , double b , double h , String function){
        
        function  = Controller.getInstance().DeriveFunction(function);
       
        
        double Fa = Controller.getInstance().EvalFunction(function, a);
        double Fb = Controller.getInstance().EvalFunction(function, b);
        System.out.print((Fb -Fa)/12 *h *h);
        
        double r = (Fb -Fa)/12 *h *h;
        return r;
    }
    
    
    public double GET_DOUBLE_ERROR(double a, double b, double h, String function) {

        double ErrorI = GET_TRAPECIO(a, b, h, function);
        double ErrorII = GET_TRAPECIO(a, b, h * 2, function);
        return (ErrorI - ErrorII) / 2;
    }
}
