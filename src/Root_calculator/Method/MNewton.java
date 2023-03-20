/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_calculator.Method;

import Root_calculator.Controller.Controller;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lsmp.djep.djep.DJep;
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
        DJep = new DJep(); 
        loadDate();
    }

    @Override
    public ArrayList<MethodResult> Solution() {
        
        
        
        double x1 = 0;

        ArrayList<MethodResult> result = new ArrayList<>();
        int i = 0;

        double Em = x;

         do{
             x1 = x-CalcularFuncion(function,x)/CalcularFuncion(Derivada,x);
             Em = Math.abs(x1-x);
             result.add(new MethodResult(x, Em));
             x = x1;
             
             
             i++;
         }while(Em > toterancia && i < MaxIter);

      return result;
    }


    
    @Override
    public void loadDate() {
        
        DJep = new DJep();
        this.DJep.addStandardFunctions();
        this.DJep.addStandardConstants();
        this.DJep.addComplex();
        this.DJep.setAllowUndeclared(true);
        this.DJep.setAllowAssignment(true);
        this.DJep.setImplicitMul(true);
        this.DJep.addStandardDiffRules();
        
        
        MaxIter = 80;
        toterancia = Controller.getInstance().getTolerance();
        function = Controller.getInstance().getFunction();
        x = Controller.getInstance().getArreglo()[0];
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
