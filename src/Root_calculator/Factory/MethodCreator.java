/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_calculator.Factory;

import Root_calculator.Method.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL_DEO
 */
public class MethodCreator implements FactoryMethod{

    public MethodCreator() {}

    //FactoryMethod
    @Override
    public Method CreateMethod(TypeMethod type) {
       
        String classname = "Root_calculator.Method."+ type;
        Method temp = null;
        Class c = null;
        try {
            c = Class.forName(classname);
            temp =   (Method) c.newInstance();
   
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(MethodCreator.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return temp;
    }

 
    
}
