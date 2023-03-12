
package Evaluator;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author EL_DEO
 */
public class ArithmeticEvaluator {

    
    public ArithmeticEvaluator() {
    }
    
    
    public LinkedList ReversePolishNotation(String ecuation) {

        Deque<Character> Operadores = new LinkedList();
        LinkedList<Object> ListResult = new LinkedList();

        int i = 0;
        int size;

        String num = "";
        while (i < ecuation.length()) {

            char pointChar = ecuation.charAt(i);

            if (Character.isDigit(pointChar) || pointChar == '.') {
                num = num + pointChar;
                
        //----------------Elimina Parentecis------------------
            } else if (pointChar == '(') {

                size = ecuation.length() - 1;

                char Charsize = ecuation.charAt(size);

                while (Charsize != ')') {
                    size--;
                    Charsize = ecuation.charAt(size);

                }
        //----------------------------------------------------
                ListResult.addAll(ReversePolishNotation(ecuation.substring(i + 1, size)));
                i = size;
            } else if (pointChar != ')') {
                
                if (!num.equals("")) {
                    ListResult.add(Double.valueOf(num));
                }
                num = "";
                DesapilarOperator(pointChar, Operadores, ListResult);
            }
            i++;

        }

        if (!num.equals("")) {
            ListResult.add(Double.valueOf(num));
        }
        while (!Operadores.isEmpty()) {
            ListResult.add(Operadores.poll());
        }

        return ListResult;
    }
    public double Calculo(LinkedList <Object >ListResult){
        
        Deque<Double> temp = new LinkedList<>();
        
        
        Iterator<Object> it = ListResult.iterator();
        double a ;
        double b ;
        while(it.hasNext()){
            Object num = it.next();
            
            
            if(num instanceof Double){
                temp.push((Double) num);
            }
            else {
                b = temp.pop();
                a = temp.pop();
                switch ((char) num) {
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
        
        
        
        
        return temp.pop() ;
    } 
    private void DesapilarOperator(char operator, Deque<Character> Operadores , LinkedList ListResult) {
        boolean end = false;
       

        int ValueOperator = OperatorValue(operator);

        int ValuedequeOperator;
        while (!Operadores.isEmpty() && !end) {

            ValuedequeOperator = OperatorValue(Operadores.peek());
            if (ValuedequeOperator == -1) {
                Operadores.pop();
            } else if (ValuedequeOperator > ValueOperator) {
                ListResult.add(Operadores.poll());
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
