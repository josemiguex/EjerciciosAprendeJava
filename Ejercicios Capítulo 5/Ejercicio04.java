/* Ejercicio 4 - Capítulo 5
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio04 {
  public static void main (String[] args) {
    
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for");
    
    for (int numero = 320; numero >= 160; numero = numero - 20) {
      System.out.println(numero);
    }
  }
}
