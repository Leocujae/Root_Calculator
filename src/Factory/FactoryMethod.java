
package Factory;

import Calculo_De_Raices.Method.Method;

/**
 *
 * @author EL_DEO
 */
public interface FactoryMethod {
    
    public Method CreateMethod(TypeMethod type);
}
