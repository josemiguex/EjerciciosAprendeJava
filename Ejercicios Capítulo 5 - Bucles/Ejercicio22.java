/* Ejercicio 22 - Capítulo 5
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio22 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará por pantalla todos los números primos entre 2 y 100, ambos incluidos");
    System.out.println("-------------------------------------------------------------------------------------------");
    
    boolean esPrimo = true;
    int contadorNumero;
    int Divisor;
    
    for (contadorNumero = 2; contadorNumero <= 100; contadorNumero++) {
      
      esPrimo = true; //ahora comprobará si el número introducido es primo
      for (Divisor = 2; Divisor < contadorNumero; Divisor++) {
        if (contadorNumero % Divisor == 0) {
          esPrimo = false; //Si se cumple que el resto vale 0, esPrimo = false, como en los números primos esto es cumple 2 veces, esPrimo = false dos veces es igual a true
        }
      }
        
        if (esPrimo) { 
          System.out.print(contadorNumero + " "); //Si es primo se mostrará por pantalla
        }
      
    }
  }
}
