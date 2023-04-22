
package EcuacionesLineales_Method;


public class GaussSeidel {
    
    
    
    public double [] GaussSeidel(double [][] M , double [] b , int MaxInt , double[] aproxInicial){
        
        int n =M.length;
        
        //Aprox inic
        double x[] = aproxInicial.clone();
        
        for(int k = 0 ; k < MaxInt ; k ++){
            
            for(int i = 0 ; i < n ; i++){
                double sum = 0;
                for(int j = 0 ; j < n ; j++){
                    if(j != i){
                        sum += M[i][j] * x[j];
                    }
                    
                }
                x[i] =(b[i] - sum) / M[i][i];
                
            } 
        }
        return x;
    }
    
    
    
    
    
    
    
}
