/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_While;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Multiplicacion_Numeros {
    public static void main(String[] args) {
        Scanner teclado=new Scanner ( System.in);
        boolean nuevo_numero = true;
        while(nuevo_numero == true){
            System.out.println("Desea ingresar otro número si/no");
            String respuesta = teclado.next();
            if(respuesta == "si"){
                System.out.println("Ingrese el número");
                int numero = teclado.nextInt();
            }else if(respuesta== "no"){
                nuevo_numero = false; //hacemos que finalice el ciclo de repeticion
                
                
            }
        }
        
    }
    
}
