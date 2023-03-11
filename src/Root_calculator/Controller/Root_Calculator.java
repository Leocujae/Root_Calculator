

package Root_calculator.Controller;

import Evaluator.ArithmeticEvaluator;





/**
 *
 * @author EL_DEO
 */
public class Root_Calculator {

    public static void main(String[] args) {
        
        
        Controller x = Controller.getInstance();
       
        
        
        ArithmeticEvaluator temp = new ArithmeticEvaluator();
        System.out.println(temp.ReversePolishNotation("(2+2)+(2+2)*2"));
        
        
        x.setTypeMethod(2);
        x.setFunction(null);
        x.setIntervalos(0, 10);
        x.setTolerance(0.001);
        x.getResulProblem();
    }

    
}
