/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_calculator.Method;
import Root_calculator.Controller.Controller;
import java.util.ArrayList;

/**
 *
 * @author EL_DEO
 */
public class Mbiseccion extends Method{

    private double Midpoint ;
    private double pointAB[];
    private double tolerance;
    private ArrayList<Object> ListResult;
    
   

    
    public Mbiseccion() {
        
        
        this.ListResult = new ArrayList<>();
        this.pointAB = new double[2];
        loadDate();
        setMidPoint();
       
        
    }
    private void setMidPoint(){
        Midpoint = (pointAB[1] + pointAB[0]) /2;
    }
    
    
    
    
    
    @Override
    public double Solution() {

        boolean end = false ;
        double FunctionPointValue =Calculo(ListResult,String.valueOf(Midpoint)) ;
        
        while(pointAB[1] - pointAB[0] > tolerance && !end)
        {
        double fa = Calculo(ListResult,String.valueOf(pointAB[0]));
       
        
            if (fa * FunctionPointValue == 0) {
                end = true;

            } else if (fa * FunctionPointValue > 0) {
                pointAB[0] = Midpoint;
                
            } else {
                pointAB[1] = Midpoint;
                
            }
            setMidPoint();
            FunctionPointValue = Calculo(ListResult,String.valueOf(Midpoint)) ;
        }
        return Midpoint;
    }

    
    @Override
    protected final void loadDate() {
        
        
        
        ListResult = Controller.getInstance().getFunction();
        pointAB[0] = Controller.getInstance().getArreglo()[0];
        pointAB[1] = Controller.getInstance().getArreglo()[1];
        tolerance = Controller.getInstance().getTolerance();
        
    }
        
    
}
