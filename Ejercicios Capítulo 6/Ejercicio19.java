/* Ejercicio 19 - Capítulo 6
 * Escribe un programa que muestre 50 números enteros aleatorios comprendi-
 * dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * Hecho por Jose Miguel Martín Hidalgo
 */
 
public class Ejercicio19 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará 50 números enteros aleatorios comprendidos entre el -100 y el 200");
    System.out.println("Luego se mostrará el máximo de los pares, el mínimo de los impares y la media de toods los números generados");
    System.out.println("--------------------------------------------------");
    
    int n;
    
    int max = -100;
    int min = 300;
    
    int suma = 0;
    
    for (int i = 50; i >= 0; i--) {
      n = (int)(Math.random() * 301 - 100);
      System.out.print(n + " ");
      
      if (n > max && n % 2 == 0) {
        max = n;
      }
      
      if (n < min && n % 2 != 0) {
        min = n;
      }
      
      suma += n;
    }
    System.out.println();
    System.out.println("El mayor de los pares es el " + max);
    System.out.println("El mínimo de los impares es el " + min);
    System.out.println("La media de los números generados: " + (suma / 50));

  }
}
