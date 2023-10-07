
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EL_DEO
 */
public class Runge_KutaII {
    
    
    
    
    public double RUNGE_KUTA_II(double X0 , double Y0 ,double h , int n ,String function){
        
        double r = 0;
        
        System.out.println(function);
        System.out.println("X0 = " + X0);
        System.out.println("Y(0) = " + Y0);
        System.out.println("h = " + h);
        
        int i = 0;
        double x ;
        double y ;
        double k1;
        double k2;
        while(i < n){
            x = X0 + h;
            try{
            System.out.println("k1 = " + h + "(" + X0 + " + "+ Y0 + " )");
            k1 = h * function(X0, Y0);
            
            Double temp = Y0+k1;
            System.out.println("k1 = " + h + "(" + x + " + "+ temp + " )");
            k2 = h * function(X0+h, Y0 + k1);
            System.out.println("K1 = " + k1);
            System.out.println("K2 = " + k2);
            
            y = Y0 + (k1 + k2) /2;
            i++;
            X0 =x;
            Y0 = y;
            System.out.println("x =" + x + "y =" + y);
            }catch(Exception e){
                
            }   
            
        }
        
        
        
        return r;
    }
    
    
    
    public double function(double x , double y) throws ParseException{
    DJep DJep1 = new DJep();
    DJep1.addStandardFunctions();
    DJep1.addStandardConstants();
    DJep1.addComplex();
    DJep1.setAllowUndeclared(true);
    DJep1.setAllowAssignment(true);
    DJep1.setImplicitMul(true);
    DJep1.addStandardDiffRules();

    String function = "x-y";
    DJep1.addVariable("x", x);
    DJep1.addVariable("y", y);
     DJep1.parseExpression(function);
    return DJep1.getValue();
    
    }
    
}
