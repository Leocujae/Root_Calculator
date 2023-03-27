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
       
       
        double last = Double.NaN;
        boolean end = false;
        int i = 0;
        do{
            
            setM();
            InTX = b-fb/m;
            if(InTX != last ){
            result.add(new MethodResult(InTX,CalcularFuncion(function, InTX)));
            i++;
            last = InTX;
            }
            else{
                end = true;
            }
            
        }
        while(CalcularFuncion(function, InTX)>toterancia && i < MaxIter && !end);
        return result;
  
    }
    
}
