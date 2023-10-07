
import Functionalities_Methods.Numeric_Integration.Simpson;
import Functionalities_Methods.Numeric_Integration.Trapecios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EL_DEO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        Trapecios x = new Trapecios();
        Simpson y = new Simpson();
        Runge_KutaII z = new Runge_KutaII();
        //double x_value[] ={0,50,100,150,200,250,300,350,400};
        //double y_value[] ={4.5,6.8,5.3,3.6,4.7,7.3,6.2,5.8,4.2};
        //System.out.print(x.GET_TRAPECIO(1.2, 2.4, 0.9, "1/sqrt(2*3.1413)*e^(x^2/2)"));
//        System.out.println(y.SIMSOM(0, 4, 10, "x"));
        //System.out.print(x.GET_DOUBLE_ERROR(0, 4, 0.01, "x" ));
        z.RUNGE_KUTA_II(4, 3.1496, 0.05, 1, "x-y");
        
    }
    
}
