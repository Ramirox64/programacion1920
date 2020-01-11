/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author Ramiro
 */
public class correccion_parcial {
    /**
     * Método para verificar si un nùmeros es par o no
     * @param args 
     */

     public static boolean detectar_par(int numero) {
        boolean resultado;
        if (numero %2==0) {
            resultado=true;
            
            
        }else{
            resultado=false;
            
        }
        return resultado;
    }
    public static void main(String[] args) {
        
    
        //Creamos arreglos con valores predefinidos
        int numeros[] = {2, 3, 4, 2, 4, 5, 6, 2, 1, 2};
        //Creamos segundo arreglo con iguall tamaño que el arreglo nùmeros
        int cuadrados[] = new int[numeros.length];
        //Arreglo para almacenar el proceso de la operación
        String procesos[] = new String[numeros.length];
        //Creamos ciclo de repeticiòn para recorrer arreglo 
        for (int indice = 0; indice < numeros.length; indice++) {
            int cuadrado = numeros[indice] * numeros[indice];
            //Almacenamos el proceso de la opreaciòn en el arreglo cuadrados
            cuadrados[indice] = cuadrado;
            
            //Almacenar resultado en el arreglo procesos
            procesos[indice] = numeros[indice] + "x" + numeros[indice];
        }
        //Ciclo de repetición para mostrar arreglos
        String print_numeros   =  "numeros - ";
        String print_cuadrados =  "cuadrados - ";
        String print_procesos   =  "procesoss - ";
        for (int indice = 0; indice < numeros.length; indice++) {
            print_numeros = print_numeros + numeros[indice] + ", ";
            print_cuadrados = print_cuadrados + cuadrados[indice] + ", ";
            print_procesos = print_procesos + procesos[indice] + ", ";

        }
        System.out.println(print_numeros);
        System.out.println(print_cuadrados);
        System.out.println(print_procesos);
        
        //suma solo numeros pares
        int acumulador_pares=0;
        for (int indice = 0; indice < 10; indice++) {
            boolean par= detectar_par(numeros[indice]);
            if (par == true) {
                acumulador_pares = acumulador_pares + numeros[indice];
     
            }
        }
        System.out.println("La suma de los nùmeros pares es: "+acumulador_pares);
        
    }

}
