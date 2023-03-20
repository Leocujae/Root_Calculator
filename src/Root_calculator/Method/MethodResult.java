
package Root_calculator.Method;

import java.text.DecimalFormat;


public class MethodResult {
    
    
  
    String Xvalue;
    String Em;

    public MethodResult( Double Xvalue, Double Em) {
     
       
        
        
        DecimalFormat formato = new DecimalFormat("#.#####");
        
        
        
        this.Xvalue = String.valueOf(formato.format(Xvalue));
        this.Em = String.valueOf(Em);
    }

    public String getXvalue() {
        return Xvalue;
    }

    public String getEm() {
        return Em;
    }
}
