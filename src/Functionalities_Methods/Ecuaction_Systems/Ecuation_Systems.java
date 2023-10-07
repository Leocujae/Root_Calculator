/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionalities_Methods.Ecuaction_Systems;

import java.text.DecimalFormat;

/**
 *
 * @author EL_DEO
 */
public class Ecuation_Systems {
    
     protected int tamlog;
     protected double result[][];
     
     
    public Ecuation_Systems(){
        this.tamlog = 0;
    } 
     
    public String  getsteps(DecimalFormat formato){
        
         
//        DecimalFormat formato = new DecimalFormat("#.######");
        
        
        String result_text ="";
        String text;
        
        for(int i = 0 ; i < tamlog ;i++){
            result_text =result_text + (i+1) +"\n";
            for(int j = 0 ; j < result[i].length-1 ; j++){
                text = formato.format(result[i][j]);
                result_text =  result_text + "X"+j+ " = "+ text +"\n";
            }
             text = formato.format(result[i][result[i].length-1]);
             result_text  =result_text +"E = "+text+ "\n";
             result_text = result_text +"-----------------------------------\n";
             

        }
        return result_text;
    }
    public double calcularteError(double x[] , double xnew[]){
        double error = 0;
        for(int i = 0 ; i < x.length ; i++){
            error += Math.pow(xnew[i] - x[i],2);
        }
        System.out.println(error);
        return error;
    }
    
    
    
    
    
    
    
    
}
