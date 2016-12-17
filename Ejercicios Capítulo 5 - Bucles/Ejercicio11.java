/* Ejercicio 11 - Capítulo 5
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio11 {
  public static void main (String[] args) {
    
    int contador = 1;
    
    System.out.println("Este programa calculará el cuadrado y el cubo de 5 números enteros a partir de uno que se introduce por teclado");
    System.out.println("---------------------------------------------------------------------------------------------------------------");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Número | Número al cuadrado | Número al cubo");
    System.out.println("--------------------------------------------");
    
    
    while (contador <= 5) {
      System.out.printf("%-17d %-17d %d\n", numero, (numero * numero), (numero * numero * numero));
      contador++;
      numero += 1;
    }
  }
}
      
