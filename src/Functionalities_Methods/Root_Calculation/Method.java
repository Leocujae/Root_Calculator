
package Functionalities_Methods.Root_Calculation;

import Controller.Controller;
import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;


public abstract class Method {

    
    
    DJep DJep;
    protected String function;    
    protected double tolerancia;    
    protected int MaxIter;
    protected double a;
    protected double b; 
     
    
    protected double apriximacioninicialA;
    protected double apriximacioninicialB;
    
    
    
    public abstract ArrayList<MethodResult> Solution()  throws Exception;
    
    
    public void loadDate(String function , double a , double b , double tolerancia ,int MaxIter ,double apriximacioninicialA ,double apriximacioninicialB) {
        
        this.DJep = Controller.getInstance().getDJep();
        this.function = function;
        this.a = a;
        this.b = b;
        this.MaxIter = MaxIter;
        this.tolerancia = tolerancia;
        this.apriximacioninicialA = apriximacioninicialA;
        this.apriximacioninicialB = apriximacioninicialB;
    }
 
    protected double CalcularFuncion(String function, double Xvalue) {
       
        double result = Controller.getInstance().EvalFunction(function , Xvalue);
        return result;
    }

    
    
    
    
}
