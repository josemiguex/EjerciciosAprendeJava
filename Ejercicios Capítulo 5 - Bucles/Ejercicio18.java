/* Ejercicio 18 - Capítulo 5
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio18 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará los números comprendidos entre dos, incrementando de 7 en 7");
    System.out.println("----------------------------------------------------------------------------------");
    
    System.out.print("Introduzca el primer número: ");
    int n1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    int n2 = Integer.parseInt(System.console().readLine());
    
    
    if (n1 == n2) {
      
      System.out.print("Los números introducidos son iguales");
      
    } else if (n1 < n2) {
      
    while (n1 <= n2) {
      System.out.print(n1 + " ");
      n1 += 7;
    } 
    
  } else if (n1 >= n2) {
    
    while (n2 <= n1) {
      System.out.print(n2 + " ");
      n2 += 7;
      
    }
    
  }
}
}
