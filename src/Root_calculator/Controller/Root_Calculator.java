

package Root_calculator.Controller;

import java.util.ArrayList;


/**
 *
 * @author EL_DEO
 */
public class Root_Calculator {

    public static void main(String[] args) {
        
        
        Controller x = Controller.getInstance();

       
        
        
        
        ArrayList<Object> asd = new ArrayList();
     
       
        asd.add("x");
       
       
        //String X = "10";
        

         
        System.out.println(asd);
        System.out.print("La raiz es aproximadamente :");
        x.setTypeMethod(2);
        x.setFunction(asd);
        x.setIntervalos( -0.1, 10);
        x.setTolerance(0.012);
        x.getResulProblem();
    }

    
}
