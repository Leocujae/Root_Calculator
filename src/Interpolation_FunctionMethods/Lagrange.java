package Interpolation_FunctionMethods;


import java.util.ArrayList;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;


//Luego implementar Patron Fabrica

public class Lagrange {
    
    private ArrayList<Double> ValoresX;
    private ArrayList<Double> ValoresY;
    private DJep DJep ; 
    private ArrayList<String> PolinomiosL;
    
    public Lagrange(ArrayList<Double> ValoresX ,ArrayList<Double> ValoresY ) {
        
        //*Hacer carga de datos a traves de la Controladora
        this.ValoresX = ValoresX;
        this.ValoresY = ValoresY;
        this.PolinomiosL = new ArrayList<>();
        
        
        DJep = new DJep();
        DJep.addStandardFunctions();
        DJep.addStandardConstants();
        DJep.addComplex();
        DJep.setAllowUndeclared(true);
        DJep.setAllowAssignment(true);
        DJep.setImplicitMul(true);
        DJep.addStandardDiffRules();
    }
    public double CalcularPL(double x) {
        double r = 0;
        int nodos = ValoresX.size();
        for (int i = 0; i < nodos; i++) {
            r += this.PL(i, x) * ValoresY.get(i);

        }
        return r;
    }
    public double PL(int Xn ,double x){
        double r = 1;
        String numerador ="";
        String denominador ="";
        //Total de nodos Xn
        int nodos = ValoresX.size();
        
        //Valor del nodo correspondiente al P(n)
        double valorXn = ValoresX.get(Xn);
            for (int j = 0; j < nodos; j++) {
                //Si el nodo es diferente del nodo correspondiente al P(n)
                if (j != Xn) {
                    
                    //Almaceno el numerador y el denominador en String
                    numerador = numerador + "(X-" +"X"+ String.valueOf(j+")");
                    denominador = denominador + "("+"X"+ String.valueOf(Xn) + "-X"+String.valueOf(j)+")";
                    r *= ((x -ValoresX.get(j))/(valorXn -ValoresX.get(j)));
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
    public ArrayList<String> getPolinomios(){
        return PolinomiosL;
    }
    public String GetPolinomio() {
        
        String p = "[";
        
        int nodos = ValoresX.size();
        int i;
        for (i = 0; i < nodos-1; i++) {
            p =  p + PolinomiosL.get(i) +"]"+ "Y(" + i + ") + [";

        }
        if(i < nodos){
          p =  p + PolinomiosL.get(i) +"]"+ "Y(" + i + ")";
        }
        return p;
    }
     
     
     
}
