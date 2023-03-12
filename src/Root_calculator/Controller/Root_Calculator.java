

package Root_calculator.Controller;

import Evaluator.ArithmeticEvaluator;
import java.util.Iterator;


/**
 *
 * @author EL_DEO
 */
public class Root_Calculator {

    public static void main(String[] args) {
        
        
        Controller x = Controller.getInstance();
       
        
        
        ArithmeticEvaluator temp = new ArithmeticEvaluator();
        
      
        
        
        
        
        System.out.println(temp.Calculo(temp.ReversePolishNotation("(5+5)*3^2")));
        
        
        System.out.println("");
        x.setTypeMethod(2);
        x.setFunction(null);
        x.setIntervalos(0, 10);
        x.setTolerance(0.001);
        x.getResulProblem();
    }

    
}
