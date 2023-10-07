
package Functionalities_Methods.Ecuaction_Systems;

import java.util.Arrays;


public class Gauss_Seidel extends Ecuation_Systems {
    
   

   
    
    
    public double [] GaussSeidel(double [][] M , double [] b , Double tolerancia , double[] aproxInicial){

        int n =M.length;
        double result[][] = new double[100][n+1];
        
        double x[] = aproxInicial.clone();
        double error = Double.MAX_VALUE;
        int k = 0;
        
        
        while ( k < 100 && error > tolerancia && error != 0) {
            
            for(int i = 0 ; i < n ; i++){
                double sum = 0;
                for(int j = 0 ; j < n ; j++){
                    
                    if(j != i){
                        //System.out.print("("+M[i][j] * x[j] + ") + ");
                        sum += M[i][j] * x[j];
                    }
                    
                }
                //System.out.println("X[i] = (" + b[i] +" - " + sum+ " ) /" + M[i][i]);
                x[i] =(b[i] - sum) / M[i][i];
                //System.out.println("= " +x[i]);
                result[k][i] = x[i];
                
            }
            
            tamlog++;
            k++;
            error = calcularteError(aproxInicial, x);
            aproxInicial = Arrays.copyOf(x, n);
            result[k][n] = error;
            
        }
        this.result = result;
        return x;
    }
    
    
    
    
}
