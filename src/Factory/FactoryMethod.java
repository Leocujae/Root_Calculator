
package Factory;

import Root_Calculation_Methods.Method;

/**
 *
 * @author EL_DEO
 */
public interface FactoryMethod {
    
    public Method CreateMethod(TypeMethod type);
}
