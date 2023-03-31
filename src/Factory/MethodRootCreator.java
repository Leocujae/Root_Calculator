/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Calculo_De_Raices.Method.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL_DEO
 */
public class MethodRootCreator implements FactoryMethod{

    public MethodRootCreator() {}

    //FactoryMethod
    @Override
    public Method CreateMethod(TypeMethod type) {
        
        String classname = "Calculo_De_Raices.Method."+ type;
        Method temp = null;
        Class c = null;
        try {
            c = Class.forName(classname);
            temp =   (Method) c.newInstance();
   
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(MethodRootCreator.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return temp;
    }

 
    
}
