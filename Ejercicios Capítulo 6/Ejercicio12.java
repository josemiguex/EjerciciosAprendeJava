/* Ejercicio 12 - Capítulo 6
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio12 {
  public static void main (String[] args) {
    
    String verde = "\033[32m";
    while (1 < 2) {
      
      char caracter = (char)((Math.random() * 94) + 32);
      
      System.out.print(verde + caracter);
    }
  }
}
