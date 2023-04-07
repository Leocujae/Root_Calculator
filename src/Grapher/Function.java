
package Grapher;

import org.lsmp.djep.djep.DJep;


public class Function {
    
    
    String definition;
    DJep DJep ;
    public Function(String definition) {
        
        
        //Cargar por la controladora
        this.definition = definition;
        DJep = new DJep();
        DJep.addStandardFunctions();
        DJep.addStandardConstants();
        DJep.addComplex();
        DJep.setAllowUndeclared(true);
        DJep.setAllowAssignment(true);
        DJep.setImplicitMul(true);
        DJep.addStandardDiffRules();
        //DJep.removeFunction("sin");
        //DJep.addFunction("sin",new Sin());
      
        
   
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
        int n = (int) Math.abs((xn - x0) / d);
        
        double[] r = new double[n];
        for (int i = 0; i < n; i++) {
            r[i] = x0;
            x0 += d;

        }
        return r;
    }
}
