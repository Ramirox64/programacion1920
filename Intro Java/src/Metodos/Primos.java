/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Ramiro
 */
public class Primos {

    /**
     * Método para verificar si un número dado es primo o no
     *
     * @param numero
     * @return
     */
    public static boolean verificar_primo(int numero) {
        int cont_divisores = 0;
        for (int indice = 0; indice < numero; indice++) {
            if (numero % indice == 0) {
                cont_divisores = cont_divisores + 1;
            }
        }
        boolean resultado = false;
        if (cont_divisores == 2) {
            resultado = true;
        }
        return resultado;
    }
    /**
     * Método que permite contabilizar cuantos numeros primos existen hasta el límite indicado
     * @param limite //Valor máximo para evaluar y contabilizar primos 
     */
    public static void contabilizar_numeros_primos(int limite){
        int cont_primos=0;
        int verificar_primos[];
        for (int indice = 1; indice <=limite; indice++) {
            if (verificar_primos(indice) == true) {
                cont_primos++;//contabilizamos que hemos encontrado un número primo
                
            }
            
            
        }
        System.out.println("Se han encontrado: "+cont_primos+"números primos hasta el "+limite);
        
    }
    public static void main(String[] args) {
        //cuantos numeros primos existen hasta el 100.000
        contabilizar_numeros_primos(1000);
        
    }
}
