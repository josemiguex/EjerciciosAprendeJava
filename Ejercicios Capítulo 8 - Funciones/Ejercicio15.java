/* Ejercicio 15 - Funciones
 * Muestra los números primos que hay entre 1 y 1000.
 */

public class Ejercicio15 {
  public static void main (String[] args) {
    
    for (int i = 0; i <= 1000; i++) {
      
      if (funcionesMatematicas.f02esPrimo.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
