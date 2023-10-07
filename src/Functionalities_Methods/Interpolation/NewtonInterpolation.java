/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionalities_Methods.Interpolation;

/**
 *
 * @author EL_DEO
 */
public class NewtonInterpolation {
    
    private double xValues[];
    private double yValues[];
    private double [][]divide_diffetences;
    private double value;
    private int nodos;
    public NewtonInterpolation() {
    }
     
    public void Load(double[] xValues, double[] yValues, double value , int nodos){
        if(xValues.length != yValues.length || xValues.length < nodos ){
            throw new IllegalArgumentException("Error en los datos de entrada");
        }
       this.xValues = xValues;
       this.yValues = yValues;
       this.value = value;
       this.nodos = nodos;
       int n = xValues.length; 
       divide_diffetences = new double[n][n];
        
       this.SOTR_VALUES();
       
       for(int i = 0 ; i < n ; i++){
           divide_diffetences[i][0] = yValues[i];
       }
        
       
       for(int j = 1 ; j < n ; j++){
           
           for(int i = 0 ; i < n - j ; i++){
               divide_diffetences[i][j] = (divide_diffetences[i +1][j-1] - divide_diffetences[i][j-1])/(xValues[i+j]-xValues[i]);
              
           }
       }
 
    }
    
    public double interpolate(double x) {
        double result = divide_diffetences[0][0];
        double term = 1.0;
        
        for (int i = 1; i < nodos; i++) {
            term *= (x - xValues[i-1]);
            result += divide_diffetences[0][i] * term;
        }
        
        return result;
    }
    
    public String getInterpolationPolynomial() {
        StringBuilder polynomial = new StringBuilder();
        
        for (int i = 0; i < nodos; i++) {
            if (i > 0) {
                polynomial.append(" + ");
            }
            
            polynomial.append(String.format("%.4f", divide_diffetences[0][i]));
            
            for (int j = 0; j < i; j++) {
                polynomial.append(" * (x - ").append(xValues[j]).append(")");
            }
        }
        if(value !=  Double.NaN){
        polynomial.append("\n").append("= ").append(interpolate(value));
        }
        return polynomial.toString();
    }
    
    private void SOTR_VALUES(){
        
        
        
        for(int i = 0 ; i < nodos -1 ; i++){
        
        int index = i;
        
        for(int j = i +1 ; j < nodos ; j++){
            if(Math.abs(xValues[j] - value) < Math.abs(xValues[index] - value)){
                index = j;
            }
        }
        double tempXvalue = xValues[index];
        double tempYvalue = yValues[index];
        xValues[index] = xValues[i];
        yValues[index] = yValues[i];
        xValues[i] = tempXvalue;
        yValues[i] = tempYvalue;
        
        }
        
        
    }
    

    public double GET_ERROR_NEWTON(){
        
        if (!(xValues.length > nodos)) {
            throw new IllegalArgumentException("Error en los datos de entrada");
        }
        
        
         double term = 1.0;
        nodos++;
        for (int i = 1; i < nodos; i++) {
            term *= (value - xValues[i-1]);
        }
        return term * divide_diffetences[0][nodos-1];
    }
}
