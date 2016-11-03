/* Ejercicio 29 - Capítulo 5
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio29 {
  public static void main(String[] args) {
    
    System.out.println("En este programa debes introducir dos números");
    System.out.println("y se mostrará por pantalla todos los números");
    System.out.println("menores al primer número y que no sean divisibles");
    System.out.println("por el segundo número");
    System.out.println("----------------------------------------------");
    
    System.out.print("Introduzca el primer número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    int n2 = Integer.parseInt(System.console().readLine());

    while (n > 0) {
      if (n % n2 != 0) {
        System.out.println(n);
      }
      n--;
    }

  }
}
