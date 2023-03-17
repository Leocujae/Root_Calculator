/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Root_calculator.Method;

import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MSecante extends Method{

    
   
    
    //Datos individuales
    private double m;
    private double InTX;

    public MSecante() {
        
        loadDate();
    }
    
    private void setM(){
        
        
        
        fa = CalcularFuncion(function, a);
        fb = CalcularFuncion(function, b);
         m =(fb - fa) / (b-a);
 
    }

    
    @Override
    public ArrayList<MethodResult> Solution() {
      
        ArrayList<MethodResult> result = new ArrayList<>();
        int i = 1;
        do{
            
            setM();
            InTX = b-fb/m;
            result.add(new MethodResult(i++,InTX,CalcularFuncion(function, InTX)));
        }
        while(CalcularFuncion(function, InTX)>toterancia);
        return result;
  
    }
    
}
