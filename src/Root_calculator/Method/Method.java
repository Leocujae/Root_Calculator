
package Root_calculator.Method;

import Root_calculator.Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;


public abstract class Method {

    
    
     JEP jep;
    protected String function;    
    protected double toterancia;    
    protected double a;
    protected double b;
    protected double fa;
    protected double fb;
     
     
    public abstract ArrayList<MethodResult> Solution();
    
    
    protected  void loadDate(){
      jep = new JEP();
      this.jep.addStandardFunctions();
      this.jep.addStandardConstants();
      a = Controller.getInstance().getArreglo()[0];
      b = Controller.getInstance().getArreglo()[1];
      toterancia = Controller.getInstance().getTolerance();
      function = Controller.getInstance().getFunction();
    }
 
    protected double CalcularFuncion(String string, double Xvalue) {
        double result = Double.NaN;
        try{
        jep.addVariable("x", Xvalue);
        jep.parseExpression(string);
        System.out.println(jep.getValue());
        result =jep.getValue();
        
        }catch(Exception e){
           
        }
        
        return result;
    }

    
    
    
    
}
