/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Root_Calculation_Methods;

import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MSecante extends Method{

    
   
    
    //Datos individuales
    private double m;
    private double InTX;

    
    private double x0;
    private double x1;
    private double x3;
    private double fx0;
    private double fx1;
    //private double fx3;
    
    
    public MSecante() {
        loadDate();
    }
    
    
    @Override
    public ArrayList<MethodResult> Solution() {
      
        ArrayList<MethodResult> result = new ArrayList<>();
        double Em ;
        x0 = Controller.Controller.getInstance().getAproximacion1();
        x1 = Controller.Controller.getInstance().getAproximacion2();
        
        
        int i = 0;
        do{
            
            fx0 = CalcularFuncion(function, x0);
            fx1 = CalcularFuncion(function, x1);
            x3 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);
            //fx3 = CalcularFuncion(function, x3);
            x0 = x1;
            x1 = x3;
            Em = x1-x0;
            result.add(new MethodResult(x3,Math.abs(Em)));
            i++;
        
            
        }
        while(Math.abs(Em)>toterancia && i < MaxIter);
        return result;
  
    }
    
}
