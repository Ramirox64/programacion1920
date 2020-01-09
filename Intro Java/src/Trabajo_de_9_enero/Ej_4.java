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
public class Ej_4 {
     public static void main(String[] args) {
        Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("Elija la opciòn a realizar");
        System.out.println("1: SUMA");
        System.out.println("2: RESTA");
        System.out.println("3: MULTIPLICACIÓN");
        System.out.println("4: DIVISIÓN");

        int cas = teclado.nextInt();
        System.out.println("Escoga el numero del 1  al 4 para realizar la operaciòn");
        int num = teclado.nextInt();
        switch (cas) {
            case 1: //suma
                System.out.println(suma(num));
                break;
            case 2://resta
                System.out.println(resta(num));
                break;
            case 3://multi
                System.out.println(multi(num));
                break;
            case 4://div
                System.out.println(div(num));
                break;
        }
    }

    public static int suma(int num) {
        int sum = 0;
        for (int i = 0; i <= 12; i++) {
            sum = num + i;
            System.out.println(+num+ " + " + i + " = " + sum);
        }
        return sum;
    }

    public static int resta(int num) {
        int resta = 0;
        for (int i = 0; i <= 12; i++) {
            resta = num - i;
            System.out.println(+num+" - " + i + " = " + resta);
        }
        return resta;
    }

    public static int multi(int num) {
        int multi = 0;
        for (int i = 0; i <= 12; i++) {
            multi = num * i;
            System.out.println(+num+" * " + i + " = " + multi);
        }
        return multi;
    }

    public static double div(double num) {
        double div = 0;
        for (double i = 1; i <= 12; i++) {
            div = num / i;
            System.out.println(+num+" / " + i + " = " + div);
        }
        return div;
    }
    
}
