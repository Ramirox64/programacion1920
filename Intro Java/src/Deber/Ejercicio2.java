/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[5];
        
        for (int indice = 0; indice < numero.length; indice++) {
            System.out.println("Ingrese el numero");
            numero[indice] = teclado.nextInt();

        }
        int mayor;
        int menor;
        
        
        mayor = menor = numero [0];
        
        for (int indice = 0; indice < numero.length; indice++) {

            if (numero[indice] > mayor) {
                mayor = numero[indice];
                
            }
            if (numero[indice] < menor) {
                menor = numero[indice];

            }
        }
        System.out.println("El mayor venta fue de: " + mayor);
        System.out.println("La menor venta fue de: " + menor);
    }

}
    

