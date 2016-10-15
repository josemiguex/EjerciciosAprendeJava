/* Ejercicio 19 - Capítulo 4
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio19 {
  public static void main (String[] args) {
    System.out.println("Programa calculador de los dígitos de un número");
    System.out.println("-------------------------------------------------");
    System.out.print("Escribe un número (Máximo 5 dígitos): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero >= 0 && numero < 10) || (numero < 0 && numero > -10)) {
      System.out.print("El número tiene un dígito");
    } else if ((numero >= 10 && numero < 100) || (numero <= -10 && numero > -100)) {
      System.out.print("El número tiene dos dígitos");
    } else if ((numero >= 100 && numero < 1000) || (numero <= -100 && numero > -1000)) {
      System.out.print("El número tiene tres dígitos");
    } else if ((numero >= 1000 && numero < 10000) || (numero <= -1000 && numero > -10000)) {
      System.out.print("El número tiene cuatro dígitos");
    } else if ((numero >= 10000 && numero < 100000) || (numero <= -10000 && numero > -100000)) {
      System.out.print("El número tiene cinco dígitos");
    } else if (numero <= 100000 || numero >= 100000) {
      System.out.print("El número tiene más de 5 dígitos");
    }
  }
}

    

    
