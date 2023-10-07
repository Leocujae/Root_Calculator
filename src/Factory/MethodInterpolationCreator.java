
package Factory;

import Factory.Factorys.ConcreteFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL_DEO
 */
public class MethodInterpolationCreator implements ConcreteFactory{

    
    @Override
    public Object CreateMethod(Object type) {
        
        String classname = "Functionalities_Methods.Interpolation."+ type;
        Object temp = null;
        Class c = null;
        System.out.print(type.toString());
        try {
            c = Class.forName(classname);
            temp =  c.newInstance();
   
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(MethodRootCreator.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return temp;
    }
}
