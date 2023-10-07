/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionalities_Methods.Interpolation;

import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;


public class LagrangeInterpolation {
    
    
  
    private ArrayList<String> PolinomiosL;
    private int nodos;
    private ArrayList<Double> ValoresX;
    private ArrayList<Double> ValoresY;
    private DJep DJep ;
    private double value ;

    
    
     
   
    public double CalcularPL(double x ,int nodos) {
        double r = 0;
        for (int i = 0; i < nodos; i++) {
            r += this.PL(i, x) * ValoresY.get(i);
        }
        return r; 
    }
    
    private void CalcularPLString(int nodos) {
        for (int i = 0; i < nodos; i++) {
           PLString(i);
        }
    }
    
    
    
    
    
    
    public double PL(int Xn ,double x){
        double r = 1;

        //Valor del nodo correspondiente al P(n)
        double valorXn = ValoresX.get(Xn);
            for (int j = 0; j < nodos; j++) {
                //Si el nodo es diferente del nodo correspondiente al P(n)
                if (j != Xn) {
                    
                    //Almaceno el numerador y el denominador en String
                   
                    r *= ((x -ValoresX.get(j))/(valorXn -ValoresX.get(j)));
                } 
        }
       
        return r;
    }
    
    public String GetPolinomio() {
        
        CalcularPLString(nodos);
        
        String p = "[";
        
        int i;
        for (i = 0; i < nodos-1; i++) {
            p =  p + PolinomiosL.get(i) +"]"+ "Y(" + i + ") + [";

        }
        if(i < nodos){
          p =  p + PolinomiosL.get(i) +"]"+ "Y(" + i + ")";
        }
        return p;
    }
    
    
    public String GetStep(){
        
        CalcularPLString(nodos);
        double result = this.CalcularPL(value,nodos);
        
        
        String text ="";
        for(int i = 0 ; i < PolinomiosL.size() ; i++){
            text =text +"L("+i+") = "+ PolinomiosL.get(i) +"\n";

        }

        text = text + "P(X) = " + this.GetPolinomio() +"\n" +"P("+value+") = " +  result;
        return text;
        
    }
    
    
    public void loadDate(int nodos, ArrayList<Double> ValoresX, ArrayList<Double> ValoresY, double value) {
        this.PolinomiosL = new ArrayList<>();
        this.nodos = nodos;
        this.ValoresX = ValoresX;
        this.ValoresY = ValoresY;
        this.DJep = Controller.Controller.getInstance().getDJep();
        this.value = value;
    }
    
    public double ERROR_INTERPOLATION(String function){
        return Controller.Controller.getInstance().EvalFunction(function, value) -CalcularPL(value, nodos);
    }


    private String PLString(int Xn ){
        String r = "";
        String numerador ="";
        String denominador ="";

        //Valor del nodo correspondiente al P(n)
            for (int j = 0; j < nodos; j++) {
                //Si el nodo es diferente del nodo correspondiente al P(n)
                if (j != Xn) {
                    
                    //Almaceno el numerador y el denominador en String
                    numerador = numerador + "(X-" +"X"+ String.valueOf(j+")");
                    denominador = denominador + "("+"X"+ String.valueOf(Xn) + "-X"+String.valueOf(j)+")";
                    //r *= ((x -ValoresX.get(j))/(valorXn -ValoresX.get(j)));
                } 
        }
        try{
        //Sustituyo valores de X    
        String polinomio ="";
        for(int i = 0 ; i < nodos ; i++){
          numerador = numerador.replace("X"+i,String.valueOf(ValoresX.get(i)));
          denominador = denominador.replace("X"+i,String.valueOf(ValoresX.get(i)));
        }
        
        //Simplifico el denominador
        Node nodop = DJep.parse(denominador);
        denominador = DJep.toString(DJep.simplify(nodop));
        
        
        //Creo el polinomio
        polinomio = numerador + "/"+ denominador;
        
        
        //Simplifico
        Node nodoFuncion = DJep.parse(polinomio);
        PolinomiosL.add(DJep.toString(nodoFuncion));
        
        //DJep.simplify(nodoFuncion);
        System.out.println("L("+Xn+")= "+DJep.toString(nodoFuncion));
        }
        catch(Exception e){
            System.out.print("No sirve");
        }
        return r;
    }
    
  


}
