/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Grupal;

/**
 *
 * @author UTPL
 */
public class T2 {
    public static void main(String[] args) {
        int cont = 0;
        int num[] = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = cont + 2;
            cont = cont + 2;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(+num[i]);
        }
    }

}
    

