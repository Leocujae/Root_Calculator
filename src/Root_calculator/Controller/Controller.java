
package Root_calculator.Controller;


import Root_calculator.Factory.MethodCreator;
import Root_calculator.Factory.TypeMethod;
import Root_calculator.Method.Method;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author EL_DEO
 */
public class Controller {

     
    
    
    private static Controller controller = null;
  
    private ArrayList<Object> ListResult;
    private double Tolerance ;
    private TypeMethod typeMethod;
    private double[] intervalos;
    

   
    
    private Controller() {
        
        this.ListResult = new ArrayList<>();
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

   
    public void setFunction(ArrayList<Object> function){
        ReversePolishNotation(function);
    }
    public ArrayList<Object> getFunction(){
        
        return ListResult;
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
 


    public double getResulProblem(){
        double solution = 0 ;
        MethodCreator Creator = new MethodCreator();
        solution = ((Method)Creator.CreateMethod(typeMethod)).Solution();
        System.out.println(solution);
        return solution;
    }
    
    
    private void ReversePolishNotation(ArrayList<Object> ecuation ){
        
    //------------Pila para las Operaciones--(+-*/^)------------//
        Deque<Character> Operadores = new LinkedList();
        int i = 0;
        while (i < ecuation.size()) {

            String object = (String) ecuation.get(i);
            try {
                
                Double.valueOf(object);
                ListResult.add(object);
                
            } catch (Exception e) {

                char operator = object.charAt(0);

                switch (operator) {
                    case 'e': {
                        ListResult.add(String.valueOf(Math.exp(1)));
                        break;
                    }
                    case 'x': {
                        ListResult.add(operator);
                        break;
                    }
                    default: {
                        DesapilarOperator(operator, Operadores);
                    }
                }

            }

            i++;
        }
        while (!Operadores.isEmpty()) {
            ListResult.add(String.valueOf(Operadores.poll()));
        }
    }
    private void DesapilarOperator(char operator, Deque<Character> Operadores) {
      
       
        if (operator == '(') {
            Operadores.push(operator);
        } else if (operator == ')') {
            char tempOperator = Operadores.pop();
            while (tempOperator != '(') {
                ListResult.add(String.valueOf(tempOperator));
                tempOperator = Operadores.pop();
            }
        } else {
            
            boolean end = false;
            int ValueOperator = OperatorValue(operator);

            int ValuedequeOperator;
            while (!Operadores.isEmpty() && !end) {

                ValuedequeOperator = OperatorValue(Operadores.peek());
                if (ValuedequeOperator == -1) {
                    Operadores.pop();
                } else if (ValuedequeOperator > ValueOperator) {
                    ListResult.add(String.valueOf(Operadores.poll()));
                } else {
                    end = true;
                }
            }
            Operadores.push(operator);
        }
    }
    private int OperatorValue(char operator) {

        int value = -1;

        switch (operator) {
            
            case '(': {
                value = 0;
                break;
            }
            case '+': {
                value = 1;
                break;
            }
            case '-': {
                value = 1;
                break;
            }
            case '*': {
                value = 2;
                break;
            }
            case '/': {
                value = 2;
                break;
            }
            case '^': {
                value = 3;
                break;
            }
           

        }
        return value;

    }


    
    
    public  ArrayList<Object> ConvertirFuncion( String funcion){
         ArrayList<Object> result = new ArrayList<>();
        
        int i = 0;
        
        
        char index;
        char last = 'a';
        String num ="";
        
        while(i < funcion.length()){
            
            index = funcion.charAt(i);
            
            if(Character.isDigit(index)){
                num = num + index;
            }
            else if(index =='-' && num.isEmpty() && Character.isDigit(last) ){
                 num = "-";
            }
            else{
                if(!num.isEmpty()){
                    result.add(num);
                    num="";
                }
                result.add(String.valueOf(index));
            }
            last = index;
            i++;
        }
         if(!num.isEmpty()){
                    result.add(num);
         }
        
        return result;
    }
    
    
    
    
    
    
}
