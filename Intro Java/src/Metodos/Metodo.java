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
public class Metodo {

    public static void main(String[] args) {
        //Lamamos al mètodo, pasando las variables String e int
        //saludar_n_veces("Ramiro", 12);
        int resultado = sumar_dos_numeros(10, 7);
        System.out.println("El resultado de la suma es: "+resultado);
        int resultado2 = sumar_dos_numeros(1, 2);
        System.out.println("El resultado de la suma es: "+resultado2);

    }

    /**
     * MÈTODO QUE NO RETORNA VALOR 
     * Mètodo para presentar un saludo en pantalla n veces
     * @param nombre
     * @param nro_veces
     */
    public static void saludar_n_veces(String nombre, int nro_veces) {
        for (int i = 0; i < nro_veces; i++) {
            System.out.println("Feliz año 2020 " + nombre);

        }
    }
    /**
     * MÈTODO QUE SI RETORNA UN VALOR
     *
     * @param nro_1 primer numero a sumar
     * @param nro_2 segundo nùmero a sumar
     * @return
     */
    

    static int sumar_dos_numeros(int nro_1, int nro_2) {
        int suma = 0;
        suma = nro_1 + nro_2;
        //retornamos el resultado de la suma
        return suma;

    }

}
