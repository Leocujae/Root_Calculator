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
public class Mbiseccion extends Method{

    private double Midpoint ;
    
    
   
    
   

    
    public Mbiseccion() {

        loadDate();
        setMidPoint();
       
        
    }
    private void setMidPoint(){
        Midpoint = (b + a) /2;
    }
    @Override
    public ArrayList<MethodResult> Solution() {

         ArrayList<MethodResult> result = new ArrayList<>();
         int i = 1;
         
         
        boolean end = false ;
        double FunctionPointValue =CalcularFuncion(function,Midpoint) ;
        result.add(new MethodResult(i++, Midpoint, b - a));
        
        while (b - a > toterancia && !end) {
            double fa = CalcularFuncion(function, a);

            if (fa * FunctionPointValue == 0) {
                end = true;

            } else if (fa * FunctionPointValue > 0) {
                a = Midpoint;

            } else {
                b = Midpoint;

            }

            setMidPoint();
            FunctionPointValue = CalcularFuncion(function, Midpoint);
            result.add(new MethodResult(i++, Midpoint, b - a));
        }
        return result;
    }
}
