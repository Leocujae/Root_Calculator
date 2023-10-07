/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionalities_Methods.Root_Calculation;

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
      
      double fa = CalcularFuncion(function, a);
      double fb = CalcularFuncion(function, b);
      MidPoint = (fa * b - fb * a)/(fa - fb);
       
        
      fa = CalcularFuncion(function, a);  
      
      
      boolean end = false;  
      double Ex = Double.NaN;
      int i = 0;
      do{
      System.out.println("");
      System.out.println(function);
      System.out.println("punto medio = " + MidPoint);
      System.out.println("Evaluada en " + a + " = " + fa);  
      System.out.println("Evaluada en " + b + " = " + fb); 
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
            System.out.println("Nuevo punto medio = " + MidPoint);
            i++;
        } while (Ex > tolerancia && !end && i<MaxIter);
        return result;
    }

    
}
