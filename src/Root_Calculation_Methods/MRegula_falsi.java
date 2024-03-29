/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_Calculation_Methods;

import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MRegula_falsi extends Method{

 
    private double MidPoint;
    private double MidPointPrev;
    private double fa;
   
    
    
    public MRegula_falsi() {
        
       
       loadDate();
       double fa = CalcularFuncion(function, a);
       double fb = CalcularFuncion(function, b);
       MidPoint = (fa * b - fb * a)/(fa - fb);
    }
    private void setMidpoint(){
        
        MidPointPrev = MidPoint;
        double fb = CalcularFuncion(function,b);
        fa = CalcularFuncion(function, a);
        MidPoint = (fa*b-fb*a)/(fa-fb);
    
    }
    @Override
    public ArrayList<MethodResult> Solution() {
     
      ArrayList<MethodResult> result = new ArrayList<>();
    
        
        
      fa = CalcularFuncion(function, a);  
      
      
      boolean end = false;  
      double Ex = Double.NaN;
      int i = 0;
      do{
          result.add(new MethodResult(MidPoint,Ex));
           Ex = Math.abs(MidPoint - MidPointPrev);
          
            if (Ex == 0 || CalcularFuncion(function, MidPoint) == 0) {
                end = true;
            } else if (fa * CalcularFuncion(function, MidPoint) < 0) {
                b = MidPoint;

            } else {
                a = MidPoint;
            }

            setMidpoint();
            
            i++;
        } while (Ex > toterancia && !end && i<MaxIter);
        return result;
    }

    
}
