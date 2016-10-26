/* Ejercicio 5 - Capítulo 5
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio05 {
  public static void main (String[] args) {
    
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while");
    System.out.println("----------------------------------------------------------------------------------------------");
    
    int numero = 320;
    
    while (numero >= 160) {
      
      System.out.println(numero);
      numero = numero - 20;
    }
  }
}
