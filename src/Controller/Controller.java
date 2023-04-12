
package Controller;


import Factory.MethodRootCreator;
import Factory.Enum.TypeMethod;
import Factory.FactoryOfTactories;
import Factory.Factorys.ConcreteFactory;
import Root_Calculation_Methods.Method;
import Root_Calculation_Methods.MethodResult;
import Factory.Factorys.FactoryMethod;
import Root_Calculation_Methods.MNewton;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lsmp.djep.djep.DJep;
import org.lsmp.djep.xjep.NodeFactory;
import org.nfunk.jep.ASTFunNode;
import org.nfunk.jep.ASTStart;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

/**
 *
 * @author EL_DEO
 */
public final class Controller {

     
    
    
    private static Controller controller = null;
  
    private ConcreteFactory factory;
    private DJep DJep;
     
    
    private double aproximacion1;
    private double aproximacion2;
    private double Tolerance ;
    private double[] intervalos;
    
    private  int Titerator;
    private String function;
    private TypeMethod typeMethod;

    private ArrayList<MethodResult> Solution;
    
    
   
    
    
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
        
        this.setFactoryType("1");
        //Nueva funcion seno con metodo para convertir de grados a radianes
        //this.DJep.removeFunction("sin");
        //this.DJep.addFunction("sin",new Sin());
      
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

    public double getAproximacion2() {
        return aproximacion2;
    }
    public void setAproximacion2(double aproximacion) {
        this.aproximacion2 = aproximacion;
    }

    public double getAproximacion1() {
        return aproximacion1;
    }

    public void setAproximacion1(double aproximacion1) {
        this.aproximacion1 = aproximacion1;
    }
    
    
    public void setFactoryType(String type){
        FactoryOfTactories temp = new FactoryOfTactories();
        factory = (ConcreteFactory)temp.CreateConcreteFactory(type);
   
    }
    
    
    
    
    public void Resolver() throws Exception {
        //Implementar el patros para poder obtener soluciones de las otras fabricas
        Solution = ((Method)factory.CreateMethod(typeMethod)).Solution();

    }
    
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

            //
            DominioDefinition(function);

            result = DJep.getValue();

        } catch (Exception e) {
            //throw new Exception("Función no válida");
        }

        return result;

    }

    public void DominioDefinition(String function) {
         //Identificar Dominio

        try {
            Node nodo = DJep.parse(function);
            for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                String functionName = "";
                if (nodo instanceof ASTFunNode) {
                    functionName = ((ASTFunNode) nodo).getName();
                } else if (nodo instanceof ASTStart) {
                    functionName = "sqrt";
                }
                switch (functionName) {
                    case "/": {
                        System.out.println("/");
                        break;
                    }
                    case "sqrt": {
                        System.out.println("Raiz");
                        break;
                    }
                }
                nodo = nodo.jjtGetChild(i);
            }
        } catch (Exception e) {

        }
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
