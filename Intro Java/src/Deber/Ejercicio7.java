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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[15];
        int numero = 0;
        int op = teclado.nextInt();
        int sitio = 0;
        int j = 0;

        for (int i = 0; i < num.length - 1; i++) {
            System.out.println("ingrese numeros");
            num[i] = teclado.nextInt();

        }

        System.out.println("porfavor presione 1 para afirmar que desea introducir un nuevo numero");
        op = teclado.nextInt();
        if (op == 1) {
            System.out.println("ingrese un numero a insertar");
            numero = teclado.nextInt();

        } else {
            if (op != 0) {

            }

        }
        while (num[j] < numero && j < 5) {
            sitio++;
            j++;

        }
        System.out.println("el anterior arreglo arreglo");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }

        for (int i = 13; i >= sitio; i--) {
            num[i + 1] = num[i];

        }
        num[sitio] = numero;
        System.out.println("el nuevo arreglo queda :");
        for (int i = 0; i < 15; i++) {
            System.out.println(num[i]);

        }

    }
}
    

