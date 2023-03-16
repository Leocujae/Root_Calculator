/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_calculator.Method;

import Root_calculator.Controller.Controller;
import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MRegula_falsi extends Method{

    private double toterancia;
    private double MidPoint;
    private double MidPintPrev;
    private double a;
    private double b;
    
    private double fa ;

    
    
    private ArrayList<Object> ListResult;
    
    
    public MRegula_falsi() {
        
       
       loadDate();
       double fa = Calculo(ListResult, String.valueOf(a));
       double fb = Calculo(ListResult, String.valueOf(b));
       MidPoint = (fa * b - fb * a)/(fa - fb);
    }

    
    
    private void setMidpoint(){
        
        MidPintPrev = MidPoint;
        
        double fb = Calculo(ListResult, String.valueOf(b));
        fa = Calculo(ListResult, String.valueOf(a));
        MidPoint = (fa*b-fb*a)/(fa-fb);
    
    }
    
    
    
    @Override
    public double Solution() {
     
      boolean end = false;  
      double Ex;
      do{
           Ex = Math.abs(MidPoint - MidPintPrev);
          System.out.println(Ex);
            if (Ex == 0) {
                end = true;
            } else if (fa * Calculo(ListResult, String.valueOf(MidPoint)) < 0) {
                b = MidPoint;

            } else {
                a = MidPoint;
            }

            setMidpoint();

        } while (Ex > toterancia && !end);
        return MidPoint;
    }

    @Override
    public void loadDate() {
        //Pendiente a mejorar
      
      a = Controller.getInstance().getArreglo()[0];
      b = Controller.getInstance().getArreglo()[1];
      toterancia = Controller.getInstance().getTolerance();
      ListResult = Controller.getInstance().getFunction();
    }
    
}
