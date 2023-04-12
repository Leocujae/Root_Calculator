/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.Factorys.ConcreteFactory;
import Factory.Factorys.FactoryMethod;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL_DEO
 */

public class FactoryOfTactories implements FactoryMethod {

    @Override
    public ConcreteFactory CreateConcreteFactory(String num) {

        ConcreteFactory r = null;
        try {
            String classname = null;
            Class c = null;

            switch (num) {

                case "1":
                    classname = "Factory.MethodRootCreator";
                    break;
                case "2":
                    classname = "Factory.MethodInterpolationCreator";
                    break;

            }
            c = Class.forName(classname);
            r = (ConcreteFactory) c.newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(MethodRootCreator.class.getName()).log(Level.SEVERE, null, ex);
        }

        return r;
    }
}
