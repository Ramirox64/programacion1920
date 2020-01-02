/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.año.nuevo;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class binario {

     public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[2][3];
        int[][] c = new int[3][3];
        int i, j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Datos de la Matriz A :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                a[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Datos de la Matriz A :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                b[i][j] = teclado.nextInt();
            }
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        System.out.println("Matriz resultante de la multiplicación :");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");

        }
    }
}