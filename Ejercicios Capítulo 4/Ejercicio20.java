/* Ejercicio 20 - Capítulo 4
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio20 {
  public static void main (String[] args) {
    
    System.out.println("Detector de números capicúa");
    System.out.println("---------------------------");
    System.out.print("Escribe un número (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero >= 0 && numero < 10) {
      System.out.print("El número introducido es capicúa (sólo tiene una cifra)");
    } else if (numero >= 10 && numero < 100) {
      System.out.print("El número introducido no es capicúa (dos cifras nunca se van a poder leer igual por ambos lados)");
    } else if (numero >= 100 && numero < 1000) {
      int resto = numero % 10;
      int division = numero / 100;
      if (resto == division) {
        System.out.print("El número introducido es capicúa");
      } else {
        System.out.print("El número introducido no es capicúa");
      }
    }  else if (numero >= 1000 && numero < 10000) {
      int resto = numero % 10;
      int division = numero / 1000;
      int resto2 = (numero % 100) / 10;
      int division2 = (numero / 100) % 10;
      

        if ((resto == division) && (resto2 == division2)) {
          System.out.print("Este número es capicúa");
        } else {
          System.out.print("Este número no es capicúa");
        }
    } else if (numero >= 10000 && numero < 100000) {
        int resto = numero % 10;
        int division = numero / 10000;
        int resto2 = (numero % 100) / 10;
        int division2 = (numero % 10000) / 1000;
        
        if ((resto == division) && (resto2 == division2)) {
          System.out.print("Este número es capicúa");
        } else { 
          System.out.print("Este número no es capicúa");
        }
      } else if (numero < 0) {
          System.out.print("Este número es menor que 0");
        } else if (numero > 100000) {
          System.out.print("Este número tiene más de 5 cifras");
        }
    
  }
}
