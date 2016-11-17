/* Ejercicio 4 - Capítulo 6
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
 * rados por espacios.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio04 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)");
    System.out.println("-----------------------------------------------------------------------------------");
    
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
  }
}
