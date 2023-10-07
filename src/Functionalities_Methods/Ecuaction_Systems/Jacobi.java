
package Functionalities_Methods.Ecuaction_Systems;


public class Jacobi extends Ecuation_Systems{
    


    public double[] jacobi(double[][] M, double[] b, double tolerancia , double[] prevX ) {

        int n = M.length; //Cantidad de incognitas
        double result[][] = new double[100][n+1]; //Almacenar resultados + error en n+1;
        
        
        double[] x = new double[n]; //Vector con nuevas soluciones
        double error = Double.MAX_VALUE;
        
        int k = 0;
        while ( k < 100 && error > tolerancia) {
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum += M[i][j] * prevX[j];
                    }

                }
                x[i] = (b[i] - sum) / M[i][i];
                result[k][i] = x[i];
            }
            
            tamlog++;//se puede sustituir por k
            
            error = calcularteError(prevX, x);
            result[k][n] = error;
            prevX = x.clone();
            k++;
        }
        this.result = result;
        return x ;
    }
    

    
}
