/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionalities_Methods.Interpolation;

import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;

/**
 *
 * @author EL_DEO
 */
public  abstract class  Interpolation {
    
    
    protected ArrayList<Double> ValoresX;
    protected ArrayList<Double> ValoresY;
    protected DJep DJep ;
    protected double value ;
    
    
    
   public abstract String GetPolinomio();
   public abstract double CalcularPL(double x , int nodos);
   public abstract String GetStep();

   public void loadDate(ArrayList<Double> ValoresX ,ArrayList<Double> ValoresY , double value){
       
       this.ValoresX = ValoresX;
       this.ValoresY = ValoresY;
       this.value = value;
       this.DJep = Controller.Controller.getInstance().getDJep();
   }

   
   
   
   
   
   
   
}
