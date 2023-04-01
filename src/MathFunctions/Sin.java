
package MathFunctions;

import java.util.Stack;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.function.PostfixMathCommand;


public class Sin extends PostfixMathCommand{
    
    
    public Sin(){
     numberOfParameters = 1;   
    }
    
    @Override
    public void run(Stack inStack) throws ParseException{
        checkStack(inStack);
        Object param = inStack.pop();
        inStack.push(sin(param));   
    }
    
    
    public Object sin(Object param){
         return Math.sin((double)Math.toRadians((double) param));
         
    }
    
    
    
}

