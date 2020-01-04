/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ejercicio {

    public static void determinar_pares(int numero) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        //determinar_si_es_par(num);
        String msg = determinar_si_es_par_v2(num);
        System.out.println(msg);

    }

    /**
     * Es un mètodo que si retorna un valor Este mètodo sirvve para determinar
     * si un nùmero es par o no
     *
     * @param numero
     */

    public static String determinar_si_es_par_v2(int numero) {
        String mensaje = "";
        if (numero % 2 == 0) {
            System.out.println("Si es par");
        } else {
            System.out.print("No es par");
        }
        return mensaje;
    }

    /**
     * Este mètodo sirve para determinar si un nùmero es par o no
     *
     * @param numero Es el valor que se evalua para determinar si es par o
     */
    public static void determinar_si_es_par(int numero) {

    }

}
