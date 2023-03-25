package Root_calculator.Method;


import java.util.ArrayList;








public class Lagrang {
    
    ArrayList<Double> ValoresX;
    ArrayList<Double> ValoresY;
    
    public Lagrang(ArrayList<Double> ValoresX ,ArrayList<Double> ValoresY ) {
        this.ValoresX = ValoresX;
        this.ValoresY = ValoresY;
    }
    
    
    
    public double CalcularPL(double x){
        double r = 0;
        
        int nodos = ValoresX.size();
        for(int i = 0 ; i < nodos ; i++){
            r += this.PL(i, x)*ValoresY.get(i);
            
        }
        return r;
    }
    
     public double PL(int Xn ,double x){
        double r = 1;

        //Total de nodos Xn
        int nodos = ValoresX.size();
        
        //Valor del nodo correspondiente al P(n)
        double valorXn = ValoresX.get(Xn);
            for (int j = 0; j < nodos; j++) {
                //Si el nodo es diferente del nodo correspondiente al P(n)
                if (j != Xn) {
                    
                    System.out.println("2  "+x+" - "+ValoresX.get(j)+"/"+valorXn+" - "+ValoresX.get(j));
                    r *= ((x -ValoresX.get(j))/(valorXn -ValoresX.get(j)));
                    System.out.println(r);
                }
        }
        return r;
    }
    
//     public double Error(){
//         
//     }
//     
     
}
