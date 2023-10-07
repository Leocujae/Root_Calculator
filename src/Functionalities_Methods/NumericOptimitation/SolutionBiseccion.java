
package Functionalities_Methods.NumericOptimitation;


public class SolutionBiseccion {
    
    
      
    private Double[] r;

    public SolutionBiseccion(Double A, Double B, Double Midpoint, Double X1, Double X2, Double Fx1, Double Fx2) {
        
        r = new Double[8];
        r[0]  = A;
        r[1]  = B;
        r[2]  = Midpoint;
        r[3]  = X1;
        r[4]  = X2;
        r[5]  = Fx1;
        r[6]  = Fx2;
        r[7]  = B-A;
    }

    public Double[] solution(){
        return r;
    }
    
    
    
    
    
    
    
    
    
}
