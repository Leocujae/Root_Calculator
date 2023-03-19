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
    private void setMidPoint(){
        Midpoint = (b + a) /2;
    }
    @Override
    public ArrayList<MethodResult> Solution() {
        boolean end = false ;
        ArrayList<MethodResult> result = new ArrayList<>();
       
         
        setMidPoint(); 
        double FunctionPointValue =CalcularFuncion(function,Midpoint) ;
        double Em = (b- a) /2;
        result.add(new MethodResult(Midpoint,Em));
        
        while (Em > toterancia && !end) {
            double fa = CalcularFuncion(function, a);

            if (fa * FunctionPointValue == 0) {
                end = true;

            } else if (fa * FunctionPointValue > 0) {
                a = Midpoint;

            } else {
                b = Midpoint;

            }

            setMidPoint();
            Em = (b- a) /2;
            FunctionPointValue = CalcularFuncion(function, Midpoint);
            result.add(new MethodResult(Midpoint, Em));
            
        }
        return result;
    }
}
