

package Root_calculator.Controller;

import Root_calculator.Factory.MethodCreator;
import Root_calculator.Factory.TypeMethod;
import static Root_calculator.Factory.TypeMethod.MNewton;
import static Root_calculator.Factory.TypeMethod.MRegula_falsi;
import static Root_calculator.Factory.TypeMethod.Mbiseccion;
import Root_calculator.Method.Method;





/**
 *
 * @author EL_DEO
 */
public class Root_Calculator {

    public static void main(String[] args) {
        
        
        Controller x = Controller.getInstance();
       
        
        x.setTypeMethod(2);
        x.setFunction(null);
        x.setIntervalos(0, 10);
        x.setTolerance(0.001);
        x.getResulProblem();
    }

    
}
