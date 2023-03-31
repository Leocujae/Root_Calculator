/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo_De_Raices.Method;

import Controller.Controller;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

/**
 *
 * @author EL_DEO
 */
public final class MNewton extends Method{

    private String Derivada;
    private double x;
    
    
    
    public MNewton() {
       
        loadDateNewtom();
    }

    @Override
    public ArrayList<MethodResult> Solution() throws Exception{
        
        if( x < a || x > b){
            throw new Exception("La aproximación inicial debe estar contenida en el intervalo a,b.");
        }
        
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
         }while(Em > toterancia && i < MaxIter);

      return result;
    }


    
  
 
    public void loadDateNewtom() {
     
        this.loadDate();
        x = Controller.getInstance().getAproximacion();
        Node nodoFuncion;
        Node nodoDerivada;
        try {

            nodoFuncion = this.DJep.parse(function);
            Node DF = this.DJep.differentiate(nodoFuncion,"x");
            nodoDerivada = this.DJep.simplify(DF);
            this.Derivada = this.DJep.toString(nodoDerivada);
            
        } catch (ParseException ex) {
            Logger.getLogger(MNewton.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
