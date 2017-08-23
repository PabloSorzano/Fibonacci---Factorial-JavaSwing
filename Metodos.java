/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.factorial;

import java.util.ArrayList;

/**
 *
 * @author Pablo sorzano torres, Yin chew wah
 */
public class Metodos {
    
    private double factorial=1;//variable del factorial
    private int nom2=0;//variable del numero recibido del campo de texto NUMERO para realizar el cálculo del fibonacci
    private double nom;//variable del numero recibido del campo de texto NUMERO para realizar el cálculo del factorial
    private String s="0";//variable del fibonacci
    
    /**
     *
     * @param numero
     */
    public void fibonacci(String numero){
        nom2 = Integer.parseInt(numero);//variable del numero recibido del campo de texto NUMERO para realizar el cálculo del fibonacci
        
        if (nom2>0){ //si el numero recibido es mayor a 0 realizará todo lo de abajo
        int a=0;//variable utilizada para el desarrollo de la formula de fibonacci 
        int b=1;//variable utilizada para el desarrollo de la formula de fibonacci    
        int c;//variable utilizada para el desarrollo de la formula de fibonacci 
            for(int i=1; i<nom2;i++){ 
                c=a+b; //formula de fibonacci
                a=b; //sustitución para cumplir con la formula de fibonacci
                b=c; //sustitución para cumplir con la formula de fibonacci    
                s = s + ", " + a; //acumulador de términos dependiendo del numero recibido (fibonacci)    
            }
        }
      
    }

    /**
     *
     * @return
     */
    public String getFibonacci(){
        return s;//regresa la cadena de fibonacci creada
    }

    /**
     *
     * @param numero
     */
    public void factorial(String numero){
        nom = Double.parseDouble(numero);//variable del numero recibido del campo de texto NUMERO para realizar el cálculo del factorial
        while(nom!=0){//realizar todo el proceso siempre y cuando el numero recibido sea diferente a 0
             factorial=factorial*nom;//multiplicación del numero por el contador factorial
             nom--;//reducción del numero hasta que llegue o tienda a 0
         }
        
    }

    /**
     *
     * @return
     */
    public double getFactorial(){
        return factorial;//regresa el total del factorial
    }
}
