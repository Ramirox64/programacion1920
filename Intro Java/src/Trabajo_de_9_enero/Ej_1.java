/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_de_9_enero;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ej_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número a procesar:");

        int num = teclado.nextInt();

        System.out.println("Que opcion desea realizar");
        System.out.println("1. Tangente");
        System.out.println("2. Cotangente");
        System.out.println("3. Secante");
        System.out.println("4. Cosecante");

        int casos = teclado.nextInt();

        switch (casos) {
            case 1:
                System.out.println(tangente(num));
                break;
            case 2:
                System.out.println(cotangente(num));
                break;
            case 3:
                System.out.println(secante(num));
                break;
            case 4:
                System.out.println(cosecante(num));
                break;
        }
    }

    public static double tangente(double num) {
        double tan = 0;
        tan = Math.sin(num) / Math.cos(num);
        return tan;
    }

    public static double cotangente(double num) {
        double cotangente = 0;
        cotangente = Math.cos(num) / Math.sin(num);
        return cotangente;
    }

    public static double secante(double num) {
        double secante = 0;
        secante = 1 / Math.cos(num);
        return secante;
    }

    public static double cosecante(double num) {
        double cosec = 0;
        cosec = 1 / Math.sin(num);
        return cosec;
    }
}
    

