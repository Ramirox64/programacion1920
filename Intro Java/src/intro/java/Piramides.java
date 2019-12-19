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
public class Piramides {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Si ingresa un límite superior a 5 finalizara el programa");
        System.out.println("Ingresar el límite de la pirámide");

        int lim = teclado.nextInt();

        if (lim == 0) {
            System.out.println("Fin programa");
        } else {
            if (lim == 1) {
                System.out.println("1");
            } else {
                if (lim == 2) {
                    System.out.println("1" + '\n' + "12");
                } else {

                    if (lim == 3) {
                        System.out.println("1" + '\n' + "12" + '\n' + "123");
                    } else {
                        if (lim == 4) {
                            System.out.println("1" + '\n' + "12" + '\n' + "123" + '\n' + "1234");

                        } else {
                            if (lim == 5) {
                                System.out.println("1" + '\n' + "12" + '\n' + "123" + '\n' + "1234" + '\n' + "12345");

                            }

                        }

                    }

                }
            }

        }
        System.out.println("Fin del programa");

    }

}
    
    

