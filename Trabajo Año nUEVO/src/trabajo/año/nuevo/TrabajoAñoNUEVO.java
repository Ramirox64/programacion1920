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
public class TrabajoAñoNUEVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número en el sistema decimal positivo");

        int numero = teclado.nextInt();

        String binario = "";

        if (numero > 0) {

            while (numero > 0) {

                if (numero % 2 == 0) {

                    binario = "0" + binario;
                } else {

                    binario = "1" + binario;
                }

                numero = (numero / 2);
            }
        } else if (numero == 0) {

            binario = "0";
        } else {

            binario = "No se pudo convertir el numero";
        }
        System.out.println("El número convertido a binario es: " + binario);
    }
}
        // TODO code application logic here

