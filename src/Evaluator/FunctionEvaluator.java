
package Evaluator;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author EL_DEO
 */
public class FunctionEvaluator {

    
    
    
    private ArrayList<Object> ecuation ;
    private String X ;
    
    
    public FunctionEvaluator(ArrayList<Object> ecuation , String X) {
        this.ecuation = ecuation;
        this.X = X;
    }

    public double Calculo() {

        
        RemplaceX();
        ArrayList<Object> ListResult = ReversePolishNotation(ecuation);
        
        
        
        Deque<Double> temp = new LinkedList<>();
       
        double a;
        double b;
        
        while (!ListResult.isEmpty()) {
            String num = (String) ListResult.remove(0);

            try {
                
                temp.push(Double.valueOf(num));
                
            } catch (Exception e) {
                char Operator = num.charAt(0);

                b = temp.pop();
                a = temp.pop();
                switch (Operator) {
                    case '+': {

                        temp.push(a + b);
                        break;
                    }
                    case '-': {

                        temp.push(a - b);
                        break;
                    }
                    case '*': {

                        temp.push(a * b);
                        break;
                    }
                    case '/': {

                        temp.push(a / b);
                        break;
                    }
                    case '^': {

                        temp.push(Math.pow(a, b));

                        break;
                    }
                }

            }
            
        }

        return temp.pop();
    }

    
    
    
    //----------------------Utils----------------------------//
    
    private ArrayList<Object> ReversePolishNotation(ArrayList<Object> ecuation ){
        
    //------------Pila para las Operaciones--(+-*/^)------------//
        Deque<Character> Operadores = new LinkedList();
        
    //----------------------Retorno----------------------------//    
        ArrayList<Object> ListResult = new ArrayList<>();

        int i = 0;
        while (i < ecuation.size()) {

            String object = (String) ecuation.get(i);
            try {
                
                Double.valueOf(object);
                ListResult.add(object);
                
            } catch (Exception e) {
                
                
                char operator = object.charAt(0);

                if(operator == 'e'){
        
                    ListResult.add(String.valueOf(Math.exp(1)));
                }
                
                
                else if (operator == '(') {

                    int j = ecuation.size() - 1;
                    while (j > i && operator != ')') {
                        operator = ((String)ecuation.get(j)).charAt(0);
                        j--;
                    }
                    ArrayList<Object> Copy = SubArray(ecuation, i + 1, j);
                    ListResult.addAll(ReversePolishNotation(Copy));
                    i = j + 1;
                } else {
                    DesapilarOperator(operator, Operadores, ListResult);

                }
            }

            i++;
        }
        while (!Operadores.isEmpty()) {
            ListResult.add(String.valueOf(Operadores.poll()));
        }
        return ListResult;
    }
    private ArrayList<Object> RemplaceX(){
        
        for(int i = 0; i < ecuation.size() ; i++){
            if(ecuation.get(i).equals("X")){
                ecuation.set(i,X);
            }
        }
        return ecuation;
    }
    private ArrayList SubArray(ArrayList List, int IndexIni, int IndexEnd) {
        ArrayList Listreturn = new ArrayList();

        while (IndexIni <= IndexEnd) {
            Listreturn.add(List.get(IndexIni));
            IndexIni++;
        }

        return Listreturn;
    }
    private void DesapilarOperator(char operator, Deque<Character> Operadores, ArrayList<Object> ListResult) {
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
    private int OperatorValue(char operator) {

        int value = -1;

        switch (operator) {
            case '+': {
                value = 0;
                break;
            }
            case '-': {
                value = 0;
                break;
            }
            case '*': {
                value = 1;
                break;
            }
            case '/': {
                value = 1;
                break;
            }
            case '^': {
                value = 2;
                break;
            }
            case '(': {
                value = -1;
                break;
            }

        }
        return value;

    }
}
