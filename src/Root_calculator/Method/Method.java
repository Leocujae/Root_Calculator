
package Root_calculator.Method;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


public abstract class Method {

    public abstract double Solution();
    protected abstract void loadDate();
    
    
  

    protected double Calculo(ArrayList<Object> ListResult, String Xvalue) {

        
        ArrayList<Object> InvPolacEcuation =  new ArrayList();
        
        ListResult.stream().forEach((element) -> {
            if (element.equals('x')) {
                InvPolacEcuation.add(Xvalue);
            } else {
                InvPolacEcuation.add(element);
            }
        });

        

        Deque<Double> temp = new LinkedList<>();

        double a;
        double b;

        while (!InvPolacEcuation.isEmpty()) {
            String num = (String) InvPolacEcuation.remove(0);

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

    
    
    
    
}
