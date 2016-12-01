/* Ejercicio 2 - Capítulo 5 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio02 {
  public static void main (String[] args) {
    
    System.out.println("Números múltiplos de 5 de 0 a 100 utilizando un bucle while");
    System.out.println("-----------------------------------------------------------");
    
    int multiplo5 = 5;
    
    while (multiplo5 <= 100) {
      System.out.println(multiplo5);
      multiplo5 = multiplo5 + 5;
    }
  }
}
    
