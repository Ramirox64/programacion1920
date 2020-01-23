/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Final;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new java.util.Scanner(System.in);
        int i = 1;
        int j = 1;
        int x1 = 0;
        int y1 = 0;
        int result1 = 0;
        int x2 = 0;
        int y2 = 0;
        int result2 = 0;
        System.out.println("Ingrese el valor de la variable independiente de la primera ecuación");
        x1 = teclado.nextInt();
        System.out.println("Ingrese el valor de la variable dependiente de la primera ecuación");
        y1 = teclado.nextInt();
        System.out.println("Ingrese el resultado de la primera ecuación");
        result1 = teclado.nextInt();
        System.out.println("Ingrese el valor de la variable independiente de la segunda ecuación");
        x2 = teclado.nextInt();
        System.out.println("Ingrese el valor de la variable independiente de la segunda ecuación");
        y2 = teclado.nextInt();
        System.out.println("Ingrese el resultado de la segunda ecuación");
        result2 = teclado.nextInt();
        int aux1 = x1;
        int aux2 = x2;
        //
        System.out.println("L1: " + x1 + "x + " + y1 + "y = " + result1);
        System.out.println("L2: " + x2 + "x + " + y2 + "y = " + result2);
        //
        while (x1 != x2) {
            while (x1 < x2) {
                i++;
                x1 = aux1 * i;
            }
            while (x2 < x1) {
                j++;
                x2 = aux2 * j;
            }
        }
        
        y1 = y1 * i; result1 = result1 * i;
        y2 = y2 * j;result2 = result2 * j;
        System.out.println(" ");

        System.out.println("L1: " + x1 + "x + " + y1 + "y = " + result1 + " (" + i + ")");
        System.out.println("L2: " + x2 + "x + " + y2 + "y = " + result2 + " (" + j + ")");
        
        //Restamos la L2 en L1
        int x3;
        int y3;
        int result3;
        x3=x1-x2;
        y3=y1-y2;
        result3=result1-result2;
        System.out.println("L3: " + x3 + "x + " + y3 + "y = " + result3);
        
        //Despejamos la variable dependiente (y)
        System.out.println(" ");
        System.out.println("y = "+result3+"/"+y3);
        result3=result3/y3;
        System.out.println("y= "+result3);
        
        //remplazamos en L1
        System.out.println(" ");
        System.out.println(x1+"x + "+y1+"("+result3+") = "+result1 );
        y1=y1*result3;
        System.out.println(x1+"x + "+y1+" = "+result1 );
        System.out.println(x1+"x  = "+result1+ " - "+y1 );
        result1=result1-y1;
        System.out.println(x1+"x  = "+result1);
        System.out.println("x  = "+result1+"/"+x1);
        x1=result1/x1;
        System.out.println("x = "+x1);
        
        //Presentamos resultados
        System.out.println(" ");
        System.out.println("x = "+x1+"   y = "+result3);
        
        
       

    }

}
