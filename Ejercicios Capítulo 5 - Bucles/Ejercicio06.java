/* Ejercicio 6 - Capítulo 5
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle do-while.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while");
    System.out.println("----------------------------------------------------------------------------------------------");
    
    int numero = 320;
    
    do {
      
      System.out.println(numero);
      numero = numero - 20;
    } while (numero >= 160);
  }
}
