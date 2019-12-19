/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimensionales;

/**
 *
 * @author UTPL
 */
public class Ejemplo {
    public static void main(String[] args) {
        //1. Declaracion de arreglo con valores iniciales
        String universidades [] = {"utpl","unl","ucuenca"};
        
        //2. declaración de arreglo, indicando su longitud
        String estudiantes [] = new String [20];
        estudiantes[0]="Inicio";
        estudiantes[10]= "Ramiro";
        estudiantes[19]="final";
        estudiantes[0]="nuevo valor";
        for (int indice = 0; indice < estudiantes.length; indice++) {
            System.out.println("estudiantes ["+indice+"] = "+estudiantes[indice]);
             
        }
        
        //obtenemos el valor de la segunda posicion del arreglo
        //System.out.println(universidades[1]);
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.println(universidades[indice]);
            
        }
    }
    
}
