/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root_calculator.Method;
import Root_calculator.Controller.Controller;
import java.util.function.Function;

/**
 *
 * @author EL_DEO
 */
public class Mbiseccion extends Method{

    private double Midpoint ;
    
    private double pointAB[];
    private double tolerance;
    private Function<Double,Double> function;

    
    public Mbiseccion() {
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
        double FunctionPointValue =function.apply(Midpoint) ;
        
        while(pointAB[1] - pointAB[0] > tolerance && !end)
        {
        double fa = function.apply(pointAB[0]);
        //double fb = function.apply(pointAB[1]);
        
            if (fa * FunctionPointValue == 0) {
                end = true;

            } else if (fa * FunctionPointValue > 0) {
                pointAB[0] = Midpoint;
                
            } else {
                pointAB[1] = Midpoint;
                
            }
            setMidPoint();
            FunctionPointValue = function.apply(Midpoint);
        }
        return Midpoint;
    }

    
    @Override
    protected final void loadDate() {
        
        function = Controller.getInstance().getF();
        pointAB[0] = Controller.getInstance().getArreglo()[0];
        pointAB[1] = Controller.getInstance().getArreglo()[1];
        tolerance = Controller.getInstance().getTolerance();
        
    }
        
    
}
