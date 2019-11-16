/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

/**
 *
 * @author Salas
 */
public class Acumulador {
    public static void main(String[] args) {
        System.out.println("Trabajando con acumuladores");
        int contador = 1;
        int acumulador = 0;
        while(contador <= 5){
            
            acumulador = acumulador * contador;
            contador ++;
        }
        System.out.println("valor del contador acumulado: " +contador);
        System.out.println("valor del acumulador: " +acumulador);
        
    }
    
}
