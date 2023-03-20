/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_calculator.Method;
import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public class Mbiseccion extends MethodIntervalos{

    private double Midpoint ;
    
    
   
    
   

    
    public Mbiseccion() {

        loadDate();
        
       
        
    }
   
    @Override
    public ArrayList<MethodResult> Solution() {
        boolean end = false ;
        ArrayList<MethodResult> result = new ArrayList<>();
       
         
       
        
        double Em ;
       
        
        int i = 0;
        do{
            
            
            Midpoint = (b+a)/2;
            Em = (b- a)/2;
            double FunctionPointValue =CalcularFuncion(function,Midpoint) ;
            double fa = CalcularFuncion(function, a);
            if (FunctionPointValue == 0 || Em < toterancia ) {
                end = true;
                Em = 0;
            } else if (fa * FunctionPointValue > 0) {
                a = Midpoint;

            } else {
                b = Midpoint;

            }

            
           
            result.add(new MethodResult(Midpoint, Em));
            
            i++;
        }while (!end && i < MaxIter);
            
            
        
        return result;
    }
}
