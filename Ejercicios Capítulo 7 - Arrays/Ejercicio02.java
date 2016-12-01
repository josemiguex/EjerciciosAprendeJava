/* Ejercicio 2 - Capítulo 7
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio02 {
  public static void main (String[] args) {
    
    char[] caracter = new char[10];
    
    caracter[0] = 'a';
    caracter[1] = 'x';
    caracter[4] = '@';
    caracter[6] = ' ';
    caracter[7] = '+';
    caracter[8] = 'Q';
    
    System.out.println("Tabla con un array de 10 carácteres");
    //Parte de arriba de la tabla

    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int contador = 0; contador < 10; contador++) {
      System.out.printf("│%5d", contador);
    }
    
    System.out.println("│");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
    System.out.print("│ Valor  ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%5c", caracter[i]);
    }
    
    System.out.println("│");
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
