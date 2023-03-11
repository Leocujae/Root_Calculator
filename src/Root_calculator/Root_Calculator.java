

package Root_calculator;

import Root_calculator.Factory.MethodCreator;
import Root_calculator.Factory.TypeMethod;
import static Root_calculator.Factory.TypeMethod.MNewton;
import static Root_calculator.Factory.TypeMethod.MRegula_falsi;
import static Root_calculator.Factory.TypeMethod.Mbiseccion;





/**
 *
 * @author EL_DEO
 */
public class Root_Calculator {

    public static void main(String[] args) {
        
        
        MethodCreator x = new MethodCreator();
        
        TypeMethod temp = MRegula_falsi;
        x.CreateMethod(temp).Solution();
        
        temp = Mbiseccion;
        x.CreateMethod(temp).Solution();
        
        temp = MNewton;
        x.CreateMethod(temp).Solution();
    }

    
}
