/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int promedio = 1;
        int newnum = 1;
        int cont = 1;
        int suma = 0;
        System.out.println("Ingrese un número");
        int numero = teclado.nextInt();
        System.out.println("Cuando quiera obtener el promedio de los números ingresados digite 0");
        while (newnum != 0) {
            System.out.println("Ingrese otro número");
            newnum = teclado.nextInt();
            numero = newnum + numero;
            suma = numero;
            cont = cont + 1;
            System.out.println("La suma es: " + suma);
            if (newnum == 0) {
                System.out.println("Se procedera a realizar el promedio");
                promedio = suma/cont;
            }
        }

        System.out.println("El promedio es de: " + promedio);
    }
}
