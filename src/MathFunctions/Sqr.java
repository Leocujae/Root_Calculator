/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathFunctions;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.function.PostfixMathCommand;

/**
 *
 * @author EL_DEO
 */
public class Sqr extends PostfixMathCommand{
    
    
    public Sqr(){
     numberOfParameters = 1;   
    }
    
    @Override
    public void run(Stack inStack) throws ParseException {
        checkStack(inStack);
        Object param = inStack.pop();
        try {   
            inStack.push(sqr(param));
        } catch (Exception ex) {
            Logger.getLogger(Sqr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Object sqr(Object param) throws Exception{
         if((double) param < 0){
             throw new Exception("Parametro invalido para sqr");
         }
         System.out.println(param);
         return Math.sqrt((double) param);
         
    }
    
    
    
    
    
    
    
}
