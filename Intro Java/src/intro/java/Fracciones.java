/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Fracciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        int den = 2;
        int n = 0;
        System.out.println("Ingrese el límite de la serie");
        int lim = teclado.nextInt();
        while (n < lim) {
            System.out.println(+num + "/" + den + ";");
            n++;
            den = den + 1;

        }

    }

}
    

