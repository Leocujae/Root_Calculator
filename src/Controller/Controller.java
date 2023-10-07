
package Controller;


import Factory.Enum.Type_Method;
import Factory.MethodRootCreator;
import Functionalities_Methods.Interpolation.LagrangeInterpolation;
import Functionalities_Methods.Interpolation.NewtonInterpolation;
import Functionalities_Methods.Root_Calculation.MNewton;
import Functionalities_Methods.Root_Calculation.Method;
import Functionalities_Methods.Root_Calculation.MethodResult;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;


public final class Controller {

    private static LagrangeInterpolation lagrange;  
    private static NewtonInterpolation newtoninterpolation;
    
    private static Controller controller = null;
  
    
    private DJep DJep;
    private ArrayList<MethodResult> Solution;
    
    
   
    
    
    private Controller() {
        this.DJep = new DJep();
        this.DJep.addStandardFunctions();
        this.DJep.addStandardConstants();
        this.DJep.addComplex();
        this.DJep.setAllowUndeclared(true);
        this.DJep.setAllowAssignment(true);
        this.DJep.setImplicitMul(true);
        this.DJep.addStandardDiffRules();
        
    
    }

    //Singleton
    public static Controller getInstance(){
        
        if(controller == null){
            controller = new Controller();
           
        }
         return controller;
    }


   
    public ArrayList<MethodResult> getSolution(){
        return  Solution;
    }
    public DJep getDJep(){
     return DJep;
    }
    
    

    
    
    
    //Calcular las raices
    public void RootCalculator(Type_Method typeMethod,String function, double A ,double B,double Tolerance ,int Titerator,double aproximacionA,double aproximacionB) throws Exception {
        
        MethodRootCreator fabrica = new MethodRootCreator();
        Method temp = (Method) fabrica.CreateMethod(typeMethod);
        temp.loadDate(function, A, B,Tolerance,Titerator, aproximacionA, aproximacionB);
        this.Solution = temp.Solution();
        
    }
    //Interpolacion
    
    
    
    public LagrangeInterpolation MethodLagrange(){
        if(lagrange == null){
            lagrange = new LagrangeInterpolation();
        }
        return lagrange;
    }
    
    public NewtonInterpolation MethodInterpolationNewton(){
        if(newtoninterpolation == null){
            newtoninterpolation = new NewtonInterpolation();
        }
        return newtoninterpolation;
    }
    
            
    
//    public MethodInterpolation Interpolation(TypeInterpolation_Method typeMethod ,ArrayList<Double> ValoresX ,ArrayList<Double> ValoresY ,double value) throws Exception {
//        MethodInterpolationCreator fabrica = new MethodInterpolationCreator();
//        MethodInterpolation temp = ((MethodInterpolation)fabrica.CreateMethod(typeMethod));
//        temp.loadDate(ValoresX, ValoresY,value);
//        temp.CalcularPL(value);
//        return temp;
//    }
//    
    
    
    public String DeriveFunction(String function){
        String r = null;
        Node nodoFuncion;
        Node nodoDerivada;
         try {

            nodoFuncion = this.DJep.parse(function);
            Node DF = this.DJep.differentiate(nodoFuncion,"x");
            nodoDerivada = this.DJep.simplify(DF);
            r = this.DJep.toString(nodoDerivada);
            
        } catch (ParseException ex) {
            Logger.getLogger(MNewton.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public double EvalFunction(String function, double value) {
        double result = Double.NaN;
        try {
            DJep.addVariable("x", value);
            DJep.parseExpression(function);

            result = DJep.getValue();

        } catch (Exception e) {
            //throw new Exception("Función no válida");
        }

        return result;

    }
    public boolean Bolsano(double a , double b , String function){

        boolean r = false;

        DJep.addVariable("x", a);
        DJep.parseExpression(function);
        double fa = DJep.getValue();
        System.out.println(fa);
        DJep.addVariable("x", b);
        DJep.parseExpression(function);
        double fb = DJep.getValue();
        System.out.println(fb);
        if (fa * fb < 0) {
            r = true;
        }
        return r;

    }
}
