/* Ejercicio 15 - Capítulo 5
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio15 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido");
    System.out.println("-------------------------------------------------------");
    
    System.out.print("Introduzca un número real como base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    double exponente = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    double aux;
    aux = base;
    
      while (contador <= exponente) {
      
      System.out.println(aux + "^" + contador + ": " + base);
      base = base * aux;
      
      contador++;
    }
    
    
    
  }
}
