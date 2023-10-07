/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionalities_Methods.Root_Calculation;

import Controller.Controller;
import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public final class MNewton extends Method{

    private String Derivada;
    private double x;
    
    
    
    public MNewton() {
    }

    @Override
    public ArrayList<MethodResult> Solution() throws Exception{
        x = apriximacioninicialA;
        Derivada = Controller.getInstance().DeriveFunction(function);
        
        if( x < a || x > b){
            throw new Exception("La aproximación inicial debe estar contenida en el intervalo a,b.");
        }
        Derivada = Controller.getInstance().DeriveFunction(function);
        double x1;

        ArrayList<MethodResult> result = new ArrayList<>();
        int i = 0;

        double Em = Double.NaN;

         do{
            
             
             result.add(new MethodResult(x, Em));
             x1 = x-CalcularFuncion(function,x)/CalcularFuncion(Derivada,x);
             Em = Math.abs(x1-x);
             
             x = x1;
             
             
             i++;
         }while(Em > tolerancia && i < MaxIter);

      return result;
    }

}
