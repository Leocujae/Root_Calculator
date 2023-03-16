/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Root_calculator.Method;

import Root_calculator.Controller.Controller;
import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MSecante extends Method{

    
    //Datos para una herencia
    private ArrayList<Object> ListResult;    
    private double toterancia;    
    private double a;
    private double b;
    private double fa;
    private double fb;
    
    
    //Datos individuales
    private double m;
    private double InTX;

    public MSecante() {
        
        loadDate();
    }
    
    
    
    
    
    
    
    
    
    
    private void setM(){
        
        fa = Calculo(ListResult, String.valueOf(a));
        fb = Calculo(ListResult, String.valueOf(b));
         m =(fb - fa) / (b-a);
 
    }

    
    @Override
    public double Solution() {
      
        
        do{
            setM();
            InTX = b-fb/m;
        }
        while(Calculo(ListResult, String.valueOf(InTX))>toterancia);
        return InTX;
  
    }

    @Override
    protected void loadDate() {
        
      a = Controller.getInstance().getArreglo()[0];
      b = Controller.getInstance().getArreglo()[1];
      toterancia = Controller.getInstance().getTolerance();
      ListResult = Controller.getInstance().getFunction();   
        
    }
    
}
