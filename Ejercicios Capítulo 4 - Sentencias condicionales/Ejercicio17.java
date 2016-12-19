/* Ejercicio 17 - Capítulo 4
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio17 {
  public static void main (String[] args) {
    System.out.println("Mostrador de la última cifra de un número entero");
    System.out.println("------------------------------------------------");
    System.out.print("Escribe un número: ");
    int numero = Integer.parseInt(System.console().readLine());
  
    int resto = numero % 10;
    System.out.print("Última cifra del número: " + Math.abs(resto));
    
    
  }
}
