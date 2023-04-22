
package Root_Calculation_Methods;

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
 
    protected double CalcularFuncion(String function, double Xvalue) {
       
        double result = Controller.getInstance().EvalFunction(function , Xvalue);
        return result;
    }

    
    
    
    
}
