
package Root_calculator.Controller;


import Root_calculator.Factory.MethodCreator;
import Root_calculator.Factory.TypeMethod;
import Root_calculator.Method.Method;
import Root_calculator.Method.MethodResult;
import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public class Controller {

     
    
    
    private static Controller controller = null;
  
    private String function;
    private double Tolerance ;
    private TypeMethod typeMethod;
    private double[] intervalos;
    private ArrayList<MethodResult> Solution;
    
   
    
    private Controller() {
        
        this.Solution = new ArrayList<>();
        this.Tolerance = 0.5;
        this.typeMethod = null;
        this.intervalos  = new double[2];
      
        
    }

    //Singleton
    public static Controller getInstance(){
        
        if(controller == null){
            controller = new Controller();
           
        }
         return controller;
    }

    public String getFunction(){
        return function;
    }
    public double[] getArreglo() {
        return intervalos;
    }
    public double getTolerance() {
        return Tolerance;
    }
    public void setTolerance(double Tolerance) {
        this.Tolerance = Tolerance;
    }
    public void setTypeMethod(TypeMethod type){
        typeMethod = type;
    }
    public void setIntervalos(double a , double b){
        this.intervalos[0] = a;
        this.intervalos[1] = b;
    }
    public ArrayList<MethodResult> getSolution(){
        return  Solution;
    }
    
    public void setFunction(String function){
        this.function = function;
    }
    
    public void Resolver() throws Exception{
        
        try{
        MethodCreator Creator = new MethodCreator();
        Solution =  ((Method)Creator.CreateMethod(typeMethod)).Solution();
        }catch(Exception e){
            throw new Exception("Nombre de clase incorrecto");
        }
    }

}
