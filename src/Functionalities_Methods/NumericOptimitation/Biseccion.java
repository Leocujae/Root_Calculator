
package Functionalities_Methods.NumericOptimitation;

import java.util.ArrayList;


public class Biseccion {

    
    String function ;
    double A;
    double B;
  
    double tolerancia;
    
    
    
    public Biseccion() {
    }
    
    
    public ArrayList<SolutionBiseccion> optimitation(char c) {
        
        
        ArrayList<SolutionBiseccion> r = new ArrayList<>();
        double X1;
        double X2;
        double MidPoint;

       
        double Fx1;
        double Fx2;

        while (B - A > tolerancia) {
            
            MidPoint = (A + B) / 2;
            X1 = MidPoint - tolerancia / 2;
            X2 = MidPoint + tolerancia / 2;

            Fx1 = Controller.Controller.getInstance().EvalFunction(function, X1);
            Fx2 = Controller.Controller.getInstance().EvalFunction(function, X2);
            
            SolutionBiseccion temp = new SolutionBiseccion(A, B, MidPoint,X1,X2,Fx1,Fx2);
            r.add(temp);
            System.out.print(Controller.Controller.getInstance().EvalFunction(function, A)+" ");
            System.out.print(Controller.Controller.getInstance().EvalFunction(function, B)+" ");
            System.out.println(Controller.Controller.getInstance().EvalFunction(function, MidPoint));
            if (Fx1 == Fx2) {
                A = X1;
                B = X2;
            }
             else if (c == '<') {
                if (Fx1 < Fx2) {
                    B = X2;
                } else {
                    A = X1;
                }

            } else {

                if (Fx1 > Fx2) {
                    B = X1;
                } else {
                    A = X2;
                }
            }

        }
        return r;
    
}




    public void loadDate(String function ,double A , double B , double tolerancia){
       this.function = function;
       this.A=A;
       this.B=B;
       this.tolerancia=tolerancia;       
   }



}
