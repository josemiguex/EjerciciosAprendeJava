/* Ejercicio 25 - Capítulo 6
 * Escribe un programa que muestre por pantalla 100 números enteros separa-
 * dos por un espacio. Los números deben estar generados de forma aleatoria
 * en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio25 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará por pantalla 100 números enteros entre 10 y 200");
    System.out.println("Los primos aparecen entre almohadillas (##) y los múltiplos de 5 entre corchetes ([])");
    System.out.println("--------------------------------------------------------------------------------");
    
    for (int i = 100; i > 0; i--) {
      
      boolean esPrimo = true;
      
      int n = (int)(Math.random() * 191 + 10);
      
      for (int divisor = 2; divisor < n; divisor++) {
        
        int resto = n % divisor;
        
        if (resto == 0) {
          esPrimo = false;
        }
      }
        
      if (esPrimo == true) {
      System.out.print("#" + n + "#" + " ");
        } else if (n % 5 == 0) {
      System.out.print("[" + n + "]" + " ");
    } else {
      System.out.print(n + " ");
    }
    
    
    }
  }
}
