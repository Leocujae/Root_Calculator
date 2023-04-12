
package Factory.Factorys;

import Factory.Enum.TypeMethod;
import Root_Calculation_Methods.Method;

/**
 *
 * @author EL_DEO
 */
public interface FactoryMethod {
    
    public ConcreteFactory CreateConcreteFactory(String type);
}
