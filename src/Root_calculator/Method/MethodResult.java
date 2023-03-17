
package Root_calculator.Method;


public class MethodResult {
    
    
    int IteString;
    String Xvalue;
    String Em;

    public MethodResult(int IteString, Double Xvalue, Double Em) {
        this.IteString = IteString;
        this.Xvalue = String.valueOf(Xvalue);
        this.Em = String.valueOf(Em);
    }

    public int getIteString() {
        return IteString;
    }

    public String getXvalue() {
        return Xvalue;
    }

    public String getEm() {
        return Em;
    }
}
