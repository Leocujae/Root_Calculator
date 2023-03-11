
package Root_calculator.Factory;

import Root_calculator.Method.Method;

/**
 *
 * @author EL_DEO
 */
public interface FactoryMethod {
    
    public Method CreateMethod(TypeMethod type);
}
