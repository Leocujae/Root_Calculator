
package Root_calculator.Method;


public class MethodResult {
    
    
  
    String Xvalue;
    String Em;

    public MethodResult( Double Xvalue, Double Em) {
     
        this.Xvalue = String.valueOf(Xvalue);
        this.Em = String.valueOf(Em);
    }

    public String getXvalue() {
        return Xvalue;
    }

    public String getEm() {
        return Em;
    }
}
