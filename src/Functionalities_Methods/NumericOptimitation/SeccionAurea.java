/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionalities_Methods.NumericOptimitation;

import java.util.ArrayList;

  





public class SeccionAurea {
    
    
    String function ;
    double A ;
    double B ;
  
    double tolerancia;

    public SeccionAurea() {
        
    }
    
    public ArrayList<SolutionSeccionDorada> optimitation(char c) {
        
        ArrayList<SolutionSeccionDorada> result = new ArrayList<>();
        
        double phi = 0.382;

        double L = Math.abs(B-A);
        double X1 = A+L*phi;
        double X2 = B-L*phi;
        
        
       
        double Fx1 = Controller.Controller.getInstance().EvalFunction(function, X1);
        double Fx2 = Controller.Controller.getInstance().EvalFunction(function, X2);
        
        
        
        
        while(L > tolerancia){
            
            Fx1 = Controller.Controller.getInstance().EvalFunction(function, X1);
            Fx2 = Controller.Controller.getInstance().EvalFunction(function, X2);
            SolutionSeccionDorada temp = new SolutionSeccionDorada(A, B, X1, X2, Fx1, Fx2, L);
            result.add(temp);
            
            System.out.print(Controller.Controller.getInstance().EvalFunction(function, A)+" ");
            System.out.println(Controller.Controller.getInstance().EvalFunction(function, B)+" ");
            
            //Minimizar
            if (c == '<') {
                if (Fx1 < Fx2) {
                    B = X2;
                } else {
                    A = X1;
                }
            } 
            //Maximizar
            else {
                if (Fx1 > Fx2) {
                    B = X2;
                } else {
                    A = X1;
                }
            }
             L = Math.abs(B-A);
             X1 = A+L*phi;
             X2 = B-L*phi;
             
        }
        
        
        
        
        
//        while (L > tolerancia) {
//            
//            SolutionSeccionDorada temp = new SolutionSeccionDorada(A, B, X1, X2, Fx1, Fx2, L);
//            result.add(temp);
//            //System.out.println("I->"+i++ +"  "+"A="+ A +" "+"B="+B +" "+ "X1=" +X1 +" "+ "F(x1)="+Fx1+" " +"X2=" +X2 +" " +"F(x2)="+ Fx2+" "+"L="+ L);
//            System.out.println(result.get(0).solution()[0]);
//            
//            if (Fx1 == Fx2) {
//                A = X1;
//                B = X2;
//                L = Math.abs(B-A);
//                X1 = A+L*phi;
//                X2 = B-L*phi;
//                
//                Fx1 = Controller.Controller.getInstance().EvalFunction(function, X1);
//                Fx2 = Controller.Controller.getInstance().EvalFunction(function, X2);
//            }
//            
//             else if (c == '<') {
//                 
//                if (Fx1 < Fx2) {
//                    B = X2;
//                    X2 =X1;
//                    Fx2 = Fx1;
//                    X1 = B-L*phi;
//                    Fx1 = Controller.Controller.getInstance().EvalFunction(function, X1);
//                } else {
//                    
//                    A = X1;
//                    X1= X2;
//                    Fx1 = Fx2;
//                    X2 = A +L*phi;
//                    Fx2 = Controller.Controller.getInstance().EvalFunction(function, X2);  
//                }
//
//            } else {
//
//                if (Fx1 > Fx2) {
//                    B = X1;
//                    X1 =X2;
//                    Fx1 = Fx2;
//                    X2 = B-L*phi;
//                    Fx2 = Controller.Controller.getInstance().EvalFunction(function, X2);
//                } else {
//                    A = X2;
//                    X2= X1;
//                    Fx2 = Fx1;
//                    X1 = A +L*phi;
//                    Fx1 = Controller.Controller.getInstance().EvalFunction(function, X1);  
//                }
//            }
//            L = Math.abs(B-A);
//        }
        
        return result;
    
}
    
    
   public void loadDate(String function ,double A , double B , double tolerancia){
       this.function = function;
       this.A=A;
       this.B=B;
       this.tolerancia=tolerancia;       
   }
      
    
    
    
}
