
package Root_calculator.Controller;

import Root_calculator.Factory.MethodCreator;
import Root_calculator.Factory.TypeMethod;
import Root_calculator.Method.Method;
import java.util.function.Function;

/**
 *
 * @author EL_DEO
 */
public class Controller {

     
    
    
    private static Controller controller = null;
    
    private double Tolerance ;
    private Function <Double,Double> f;
    private MethodCreator Creator ;
    private TypeMethod typeMethod ;
    private double[] arreglo;
    
    
    
    private Controller() {
        this.Tolerance = 0.5;
        this.Creator = new MethodCreator();
        this.typeMethod = null;
        this.arreglo  = new double[2];
        this.f = null;
    }

    //Singleton
    public static Controller getInstance(){
        
        if(controller == null){
            controller = new Controller();
           
        }
         return controller;
    }

    public Function<Double, Double> getF() {
        return f;
    }

    public double[] getArreglo() {
        return arreglo;
    }

    public double getTolerance() {
        return Tolerance;
    }

    public void setTolerance(double Tolerance) {
        this.Tolerance = Tolerance;
    }
    public void setTypeMethod(int index){
        typeMethod = TypeMethod.values()[index];
    }
    public void setIntervalos(double a , double b){
        this.arreglo[0] = a;
        this.arreglo[1] = b;
    }
    public void setFunction(String ecuation){ 
        
        //Prueba
        f = x -> 3/x -3;
      
    }


    public double getResulProblem(){
        double solution = 0 ;
        solution = ((Method)Creator.CreateMethod(typeMethod)).Solution();
        System.out.println(solution);
        return solution;
    }
    
    
    
    
    
}
