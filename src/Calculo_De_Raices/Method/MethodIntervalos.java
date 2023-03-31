/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_De_Raices.Method;

import Controller.Controller;

/**
 *
 * @author EL_DEO
 */
public abstract class MethodIntervalos extends Method{

    protected double a;
    protected double b;
    protected double fa;
    protected double fb;
    
    
    
    @Override
     protected void loadDate(){
        super.loadDate();
        a = Controller.getInstance().getArreglo()[0];
        b = Controller.getInstance().getArreglo()[1];
      

    }
    
    
    
    
}
