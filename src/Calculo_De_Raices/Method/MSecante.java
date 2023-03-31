/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_De_Raices.Method;

import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MSecante extends MethodIntervalos{

    
   
    
    //Datos individuales
    private double m;
    private double InTX;

    
    private double x1;
    private double x2;
    private double x3;
    private double fx1;
    private double fx2;
    private double fx3;
    
    
    public MSecante() {
        loadDate();
    }
    
    
    @Override
    public ArrayList<MethodResult> Solution() {
      
        ArrayList<MethodResult> result = new ArrayList<>();
       
        x1 = a;
        x2 = b;
        
        
        int i = 0;
        do{
            
            fx1 = CalcularFuncion(function, x1);
            fx2 = CalcularFuncion(function, x2);
            x3 = x2 - (fx2 * (x1 - x2)) / (fx1 - fx2);
            fx3 = CalcularFuncion(function, x3);
            x1 = x2;
            x2 = x3;
            result.add(new MethodResult(x3,Math.abs(x2-x1)));
            i++;
        
            
        }
        while(Math.abs(x2-x1)>toterancia && i < MaxIter);
        return result;
  
    }
    
}
