
package Controller;


import Factory.MethodRootCreator;
import Factory.TypeMethod;
import Calculo_De_Raices.Method.Method;
import Calculo_De_Raices.Method.MethodResult;
import Factory.FactoryMethod;
import FuncionesMatematicas.sin;
import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;

/**
 *
 * @author EL_DEO
 */
public class Controller {

     
    
    
    private static Controller controller = null;
  
    private FactoryMethod factory;
    
    
    private  int Titerator;
    private String function;
    private double Tolerance ;
    private TypeMethod typeMethod;
    private double[] intervalos;
    private ArrayList<MethodResult> Solution;
    private DJep DJep;
    
    
    private Controller() {
        
        factory = null;
        
        
        this.Titerator = 100;
        this.Solution = new ArrayList<>();
        this.Tolerance = 0.5;
        this.typeMethod = null;
        this.intervalos  = new double[2];
      
        
        this.DJep = new DJep();
        this.DJep.addStandardFunctions();
        this.DJep.addStandardConstants();
        this.DJep.addComplex();
        this.DJep.setAllowUndeclared(true);
        this.DJep.setAllowAssignment(true);
        this.DJep.setImplicitMul(true);
        this.DJep.addStandardDiffRules();
        
        
        //Nueva funcion seno con metodo para convertir de grados a radianes
        this.DJep.removeFunction("sin");
        this.DJep.addFunction("sin",new sin());
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
    public void setIntervalos(double a , double b ){
        this.intervalos[0] = a;
        this.intervalos[1] = b;
       
    }
    public ArrayList<MethodResult> getSolution(){
        return  Solution;
    }
    
    public DJep getDJep(){
     return DJep;
    }
    
    public int getIteraciones(){
        return Titerator;
    }
    public void setTiterator(int Titerator) {
        this.Titerator = Titerator;
    }
    public void setFunction(String function){
        this.function = function;
    }
    
    public void Resolver() throws Exception{
        
        //Implementar el patros para poder obtener soluciones de las otras fabricas
        try{
        MethodRootCreator Creator = new MethodRootCreator();
        Solution =  ((Method)Creator.CreateMethod(typeMethod)).Solution();
        }catch(Exception e){
            throw new Exception("Nombre de clase incorrecto");
        }
    }

}
