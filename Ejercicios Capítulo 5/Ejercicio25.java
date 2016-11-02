/* Ejercicio 25 - Capítulo 5
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio25 {
  public static void main (String[] args) {
    
    int ultimoDigito = 0;
    
    System.out.println("En este programa debes introducir un número y se mostrará al revés por pantalla");
    System.out.println("-------------------------------------------------------------------------------");
    
    System.out.print("Introduce un número (n): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    while (numero > 0) {
      
    ultimoDigito *= 10;
    
    ultimoDigito += numero % 10;
    
    numero = numero / 10;
    
    }
  
  System.out.print("El número al revés sería: " + ultimoDigito);
    
    
    
    
    
    
  }
}
