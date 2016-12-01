/* Ejercicio 1 - Capítulo 5
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio01 {
  public static void main (String[] args) {
    
    System.out.println("Multiplos de 5 de 0 a 100 utilizando un bucle for");
    System.out.println("-------------------------");
    for (int multiplo5 = 5; multiplo5 <= 100; multiplo5 = multiplo5 + 5) {
      System.out.println(multiplo5);
    }
  }
}
