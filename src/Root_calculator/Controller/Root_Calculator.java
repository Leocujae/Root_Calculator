

package Root_calculator.Controller;

import Evaluator.FunctionEvaluator;
import java.util.ArrayList;


/**
 *
 * @author EL_DEO
 */
public class Root_Calculator {

    public static void main(String[] args) {
        
        
        Controller x = Controller.getInstance();

       
        
        
        
        ArrayList<Object> asd = new ArrayList();
     
        asd.add("e");
        asd.add("^");
        asd.add("2");
        asd.add("+");
        asd.add("1");
       
        
        String X = "10";
        
        FunctionEvaluator temp = new FunctionEvaluator(asd,X);
        System.out.println(temp.Calculo());
        
       
       
        
       
         
        System.out.println("");
        x.setTypeMethod(2);
        x.setFunction(null);
        x.setIntervalos(0, 10);
        x.setTolerance(0.001);
        x.getResulProblem();
    }

    
}
