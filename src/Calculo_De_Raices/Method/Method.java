
package Calculo_De_Raices.Method;

import Controller.Controller;
import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;


public abstract class Method {

    
    
    DJep DJep;
    protected String function;    
    protected double toterancia;    
    protected int MaxIter;
    protected double a;
    protected double b; 
     
    public abstract ArrayList<MethodResult> Solution()  throws Exception;
    
    
    protected void loadDate() {
        
        DJep = Controller.getInstance().getDJep();
        MaxIter = Controller.getInstance().getIteraciones();
        toterancia = Controller.getInstance().getTolerance();
        function = Controller.getInstance().getFunction();
        a = Controller.getInstance().getArreglo()[0];
        b = Controller.getInstance().getArreglo()[1];
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
