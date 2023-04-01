
package Root_Calculation_Methods;

import java.text.DecimalFormat;


public class MethodResult {
    
    
  
    double Xvalue;
    double Em;

    public MethodResult(Double Xvalue, Double Em) {

        DecimalFormat formato = new DecimalFormat("#.#####");

        this.Xvalue = Xvalue;
        this.Em = Em;
    }

    public double getXvalue() {
        return Xvalue;
    }

    public double getEm() {
        return Em;
    }
}
