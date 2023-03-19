
package Root_calculator.Method;

import Root_calculator.Controller.Controller;
import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;


public abstract class Method {

    
    
    DJep DJep;
    protected String function;    
    protected double toterancia;    
   
     
     
    public abstract ArrayList<MethodResult> Solution();
    
    
    protected void loadDate() {
        
        DJep = new DJep();
        this.DJep.addStandardFunctions();
        this.DJep.addStandardConstants();
        this.DJep.addComplex();
        this.DJep.setAllowUndeclared(true);
        this.DJep.setAllowAssignment(true);
        this.DJep.setImplicitMul(true);
        this.DJep.addStandardDiffRules();

        toterancia = Controller.getInstance().getTolerance();
        function = Controller.getInstance().getFunction();
    }
 
    
    
    
    protected double CalcularFuncion(String string, double Xvalue) {
       
        double result = Double.NaN;
        try{
        DJep.addVariable("x", Xvalue);
        DJep.parseExpression(string);
        result =DJep.getValue();
        
        }catch(Exception e){
          //throw new Exception("Función no válida");
        }
        
        return result;
    }

    
    
    
    
}
