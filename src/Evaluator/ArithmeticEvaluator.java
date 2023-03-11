
package Evaluator;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author EL_DEO
 */
public class ArithmeticEvaluator {

    
    
    public ArithmeticEvaluator() {
        
    }

    public String ReversePolishNotation(String ecuation) {

        String expretion = "";
        Deque<Character> Operadores = new LinkedList();
        
        
        int i = 0;
        int size;

        String num = "";
        while (i < ecuation.length()) {

            char pointChar = ecuation.charAt(i);

            if (Character.isDigit(pointChar)) {
                num = num + pointChar;
            } else if (pointChar == '(') {
                size = i + 1;
                char Charsize = ecuation.charAt(size);

                while (Charsize != ')') {
                    Charsize = ecuation.charAt(size);
                    size++;
                }
                num = ReversePolishNotation(ecuation.substring(i+1, size-1));
                i = size-1;
            } else {
                expretion = expretion + num + " ";
                num = "";
                expretion = DesapilarOperator(pointChar, expretion , Operadores);
            }
            i++;
        }
        expretion = expretion +num +" ";
        
        
        while(!Operadores.isEmpty() ){
            expretion = expretion + Operadores.poll();
        }
        //System.out.println(expretion);
        return expretion;
    }
    
    private String DesapilarOperator(char operator, String expretion , Deque<Character> Operadores) {
        boolean end = false;
        Deque temp = new LinkedList();

        int ValueOperator = OperatorValue(operator);

        int ValuedequeOperator;
        while (!Operadores.isEmpty() && !end) {

            ValuedequeOperator = OperatorValue(Operadores.peek());
            if (ValuedequeOperator == -1) {
                temp.push(Operadores.pop());
            } else if (ValuedequeOperator > ValueOperator) {

                expretion = expretion + Operadores.pop() + " ";
            } else {
                end = true;
            }
        }

        Operadores.push(operator);
        return expretion;
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
    
    
    

    

