/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Bidimensionales;

/**
 *
 * @author UTPL
 */
public class Matrices {

    public static void main(String[] args) {
        //Declaración de matriz con valores conocidos
        String nombres[][] = {
            {"Alex", "Isaías", "Dodi", "Mario", "Luis"},
            {"Génesis", "Diego", "Ramiro", "Anthonny", "Ariel"}
        };
        //System.out.println(nombres[0][2]);
        //System.out.println(nombres[1][4]);
        System.out.println("fila: " + nombres.length);//devuelve el numero de filas
        //Vamos a recorrer la matriz con ayuda de 2 índices
        for (int fila = 0; fila < 5; fila++) {//Recorremos las filas
            //int tam_cols = nombres[fila].length;//obtenemos el numero de columnas de la fila
            //Vamos a recorrer cada uno de los elementos de la fila 
            for (int col = 0; col < 2; col++) {//recorremos columnas
                System.out.print(nombres[col][fila]+"\t");

            }
            System.out.println("");

        }
    }

}
