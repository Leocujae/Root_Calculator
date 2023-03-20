
package Root_calculator.Graficadora;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;
import org.lsmp.djep.djep.DJep;


public class Function {
    
    
   
    //private IMathParser parser =  MathParserFactory.create();
    String definition;
    DJep DJep ;
    public Function(String definition) {
        
        this.definition = definition;
        DJep = new DJep();
        DJep.addStandardFunctions();
        DJep.addStandardConstants();
        DJep.addComplex();
        DJep.setAllowUndeclared(true);
        DJep.setAllowAssignment(true);
        DJep.setImplicitMul(true);
        DJep.addStandardDiffRules();
        
        
        
        
        
//        
//        parser.setExpression(definition);
    }

    public double eval(double x) throws Exception {
        double r = Double.NaN;
        DJep.parseExpression(definition);
        DJep.addVariable("x", x);
        
        r = DJep.getValue();
        return r;
    }

    public double[] eval(double[] x) throws Exception {

        int n = x.length;
        double[] r = new double[n];

        for (int i = 0; i < n; i++) {
            r[i] = eval(x[i]);
        }
        return r;
    }

    public double[] rango(double x0, double xn, double d) {
        int n = (int) Math.abs(xn - x0 / d);

        double[] r = new double[n];
        for (int i = 0; i < n; i++) {
            r[i] = x0;
            x0 += d;

        }
        return r;
    }
}
