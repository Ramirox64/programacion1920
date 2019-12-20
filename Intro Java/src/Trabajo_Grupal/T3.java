/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Grupal;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class T3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el 1er numero");
            a[i] = teclado.nextInt();
            System.out.println("Ingrese el 2do numero");
            b[i] = teclado.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }

    }

}
    

