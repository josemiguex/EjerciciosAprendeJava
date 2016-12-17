/* Ejercicio 9 - Capítulo 5
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */
public class Ejercicio09 {
  public static void main (String[] args) {
    System.out.println("Programa calculador de los dígitos de un número");
    System.out.println("-------------------------------------------------");
    System.out.print("Escribe un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    
    while (numero >= 10 || numero <= -10) {
      
      numero = numero / 10;
      contador++;
    }
  
  System.out.print("Este dígito tiene " + contador + " cifra/s");
  }
}
