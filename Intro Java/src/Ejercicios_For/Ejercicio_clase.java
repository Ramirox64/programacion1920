/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio_clase {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la distancia del puente");
        int distancia=teclado.nextInt();
        System.out.println("Ingrese distancia del puente");
        int distancia_puente = teclado.nextInt();
        System.out.println("Ingrese la altura de la columna");
        int alto_columna = teclado.nextInt();
        System.out.println("Ingrese la distancia entre columnas");
        int distancia_entre_col = teclado.nextInt();
        for (int i = 0; i < distancia; i++) {
            System.out.print("- ");
            
        }

        for (int fila = 0; fila < alto_columna; fila++) {
            for (int col = 0; col <= distancia_puente; col++) {
                if (fila == 0) {
                    System.out.print("- ");
                } else if (col % (distancia_entre_col + 1) == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }

            }
            System.out.println("");

        }

    }

}
