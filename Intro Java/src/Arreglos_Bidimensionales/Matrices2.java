/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Bidimensionales;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Matrices2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CREAR UNA MATRIZ");
        System.out.println("Ingrese el número de filas de la matriz: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int cols = teclado.nextInt();

        //Creación de una matriz vacía
        String nombres[][] = new String[filas][cols];//dimension2x5
        //vamos a colocar los elementos dentro de nuestra raiz
        System.out.println("Escritura de los elementos de la matriz");
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres[fila].length;
            for (int col = 0; col < tam_cols; col++) {
                System.out.println("Ingrese un valor");
                String valor=teclado.nextLine();
                nombres[filas][col]=valor;

            }
        }
        System.out.println("Lectura elementos de la matriz");
        //recorrer la matriz filas y columnas
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres[fila].length;
            for (int col = 0; col < tam_cols; col++) {
                System.out.println(nombres[filas][col] + "\t");

            }
            System.out.println("");
        }

    }
}
