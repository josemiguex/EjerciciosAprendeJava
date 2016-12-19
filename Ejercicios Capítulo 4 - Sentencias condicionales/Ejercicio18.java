/* Ejercicio 18 - Capítulo 4
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio18 {
  public static void main (String[] args) {
    System.out.println("Mostrador de la primera cifra de un número entero");
    System.out.println("------------------------------------------------");
    System.out.print("Escribe un número (Máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10 && numero >= 0) {
      System.out.print("El número introducido sólo tiene una cifra");
    } else if (numero >= 10 && numero < 100) {
      System.out.print("Primera cifra del número: " + (numero / 10));
    } else if (numero >= 100 && numero < 1000) {
      System.out.print("Primera cifra del número: " + (numero / 100));
    } else if (numero >= 1000 && numero < 10000) {
      System.out.print("Primera cifra del número: " + (numero / 1000));
    } else if (numero >= 10000 && numero < 100000) {
      System.out.print("Primera cifra del número: " + (numero / 10000));
    } else if (numero >= 100000) {
      System.out.print("El número tiene más de 5 cifras");
    }
    
  }
}
