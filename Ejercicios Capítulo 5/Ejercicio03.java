/* Ejercicio 3 - Capítulo 5
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio03 {
  public static void main (String[] args) {
    
    System.out.println("Multiplos de 5 de 0 a 100 utilizando un bucle do-while");
    System.out.println("------------------------------------------------------");
    
    int multiplo5 = 5;
    do {
      System.out.println(multiplo5);
      multiplo5 = multiplo5 + 5;
    } while (multiplo5 <= 100);
  }
}
