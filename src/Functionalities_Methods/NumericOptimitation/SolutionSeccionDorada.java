/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionalities_Methods.NumericOptimitation;

/**
 *
 * @author EL_DEO
 */
public class SolutionSeccionDorada {
    
    private Double[] r;

    public SolutionSeccionDorada(Double A, Double B, Double X1, Double X2, Double Fx1, Double Fx2, Double L) {
        
        r = new Double[7];
        r[0]  = A;
        r[1]  = B;
        r[2]  = X1;
        r[3]  = X2;
        r[4]  = Fx1;
        r[5]  = Fx2;
        r[6]  = L;
    }

    public Double[] solution(){
        return r;
    }
    
    
    
    
}
