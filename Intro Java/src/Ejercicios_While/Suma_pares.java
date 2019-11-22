/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_While;


/**
 *
 * @author UTPL
 */
public class Suma_pares {
    public static void main(String[] args) {
        System.out.println("Sumar los 100 primeros números pares");
        
        int contador = 0;
        int numero = 0;
        
        while(contador <100){
            contador = contador +2;
            numero = numero + contador;
            System.out.println("El valor de la suma de los 100 primeros números pares es: "+numero);
        }
        
                
        
    }
    
}
