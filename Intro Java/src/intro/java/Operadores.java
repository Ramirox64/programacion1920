/*
Esta clase va aservir para trabajar con las distintas clases de operadores en Java
 */
package intro.java;

/**
 *
 * @author Salas
 */
public class Operadores {
      
    public static void main(String[] args) {
       //Operadores aritméticos
       int suma = 14+14;
       int resta = 20-10;
       double multiplicacion = 50 * 0.12;
       int division = 100 / 50;
       int residuo = 7 % 2;
       
        System.out.println("   La suma es: " + suma);
        System.out.println("   La resta es: " + resta);
        System.out.println("   La multiplicación es: " + multiplicacion);
        System.out.println("   La división es: " + division);
        System.out.println("   El residuo es: " + residuo);
        
        //Creadores de incremento y decremento
       int nota = 15;
       nota  = 1 + nota;
        System.out.println("2. OPERADORES DE INCREMENTO Y DECREMENTO");
        System.out.println("   Incremento como nota como nota = nota +1 es: "+ nota);
        nota += 1;
        System.out.println("   Incremento como nota + = 1: "+ nota);
        nota ++;
        System.out.println("   Incremento como nota++: "+ nota);
        nota = nota - 1;
        System.out.println("   Decremento de la variable");
        System.out.println("   Decremento como nota = nota - 1: "+ nota);
        nota -= 1;
        System.out.println("   Decremento como nota- = 1: "+ nota);
        nota --;
        System.out.println("   Decremento como nota --: "+ nota);
        //Área de un triángulo
        System.out.println("3.0 Calcular el area de un triangulo");
        float A_triangulo = 0f;
        int base = 7;
        int altura = 4;
        System.out.println("   La base del triangulo es: "+base);
        System.out.println("   La altura del triangulo es: "+altura);
        System.out.println("   Calcular el Área de un triángulo");
        A_triangulo = (base*altura)/2;
        System.out.println("   El área del triángulo es: " +A_triangulo);
        
    }
    
}
