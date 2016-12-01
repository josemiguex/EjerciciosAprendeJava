/* Ejercicio 8 - Capítulo 5
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Tabla de multiplicar de un número");
    System.out.println("---------------------------------");
    
    int multiplicacion = 0;
    
    System.out.print("Escribe un número: ");
    int  numero = s.nextInt();
    
    while (multiplicacion <= 10) {
      
      System.out.println(numero + " * " + multiplicacion + " = " + (numero * multiplicacion));
      multiplicacion++;
    }
    
  }
}
