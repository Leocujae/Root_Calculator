
package EcuacionesLineales_Method;


public class Jacobi {
    

    public double[] jacobi(double[][] M, double[] b , int MaxInt , double[] aproxInicial) {
        int n = M.length;
        
        double[] x = new double[n];
        double[] prevX = aproxInicial.clone();

        for (int k = 0; k < MaxInt; k++) {
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum += M[i][j] * prevX[j];
                    }

                }
                x[i] = (b[i] - sum) / M[i][i];
            }
            prevX = x.clone();
        }
        return x ;
    }
    
    
    
    
    
    
    
    
    
}
