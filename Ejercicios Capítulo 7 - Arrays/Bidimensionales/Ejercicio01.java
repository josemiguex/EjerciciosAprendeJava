/* Ejercicio 1 - Capítulo 7-2
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio01 {
  public static void main (String[] args) {
    
    int[][] array = new int[3][6];
    int i = 0;
    int j = 0;
    array[0][0] = 0;
    array[0][1] = 30;
    array[0][2] = 2;
    array[0][5] = 5;
    array[1][0] = 75;
    array[1][4] = 0;
    array[2][2] = -2;
    array[2][3] = 9;
    array[2][5] = 11;
    
    System.out.println("┌─────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    System.out.println("│ Índice  │Columna0│Columna1│Columna2│Columna3│Columna4│Columna5│");
    
    
    for (i = 0; i < 3; i++) {
      System.out.println("├─────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

      System.out.print("│ Fila" + i + "   ");
      
      for (j = 0; j < 6; j++) {
        System.out.printf("│ %-7d", array[i][j]);
        }
      System.out.println("│");

    }
    System.out.println("└─────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

  }
}
