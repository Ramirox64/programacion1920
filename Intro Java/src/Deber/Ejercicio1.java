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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[3];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("INGRESE EL NOMBRE");
            nombre[i] = teclado.next();
        }
        System.out.println("______________");
        System.out.println("Escoja el nombre que desea presentar(1,2,3) ");
        int num = teclado.nextInt();
        System.out.println("El nombre que selecciono es: "+nombre[num]);

    }
    
}
    

