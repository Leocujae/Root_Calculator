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
public final class MRegula_falsi extends MethodIntervalos{

 
    private double MidPoint;
    private double MidPintPrev;
 
    
    
    public MRegula_falsi() {
        
       
       loadDate();
       double fa = CalcularFuncion(function, a);
       double fb = CalcularFuncion(function, b);
       MidPoint = (fa * b - fb * a)/(fa - fb);
    }
    private void setMidpoint(){
        
        MidPintPrev = MidPoint;
        
        double fb = CalcularFuncion(function,b);
        fa = CalcularFuncion(function, a);
        MidPoint = (fa*b-fb*a)/(fa-fb);
    
    }
    @Override
    public ArrayList<MethodResult> Solution() {
     
      ArrayList<MethodResult> result = new ArrayList<>();
    
        
        
        
      boolean end = false;  
      double Ex;
      do{
           Ex = Math.abs(MidPoint - MidPintPrev);
          
            if (Ex == 0) {
                end = true;
            } else if (fa * CalcularFuncion(function, MidPoint) < 0) {
                b = MidPoint;

            } else {
                a = MidPoint;
            }

            setMidpoint();
            result.add(new MethodResult(MidPoint,Ex));
            
        } while (Ex > toterancia && !end);
        return result;
    }

    
}
