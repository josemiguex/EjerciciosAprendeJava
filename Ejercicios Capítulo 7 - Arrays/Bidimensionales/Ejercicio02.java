/* Ejercicio 2 - Capítulo 7-2
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio02 {
  public static void main (String[] args) {
    
    int[][] array = new int[4][5];
    int i;
    int j;
    int sumaFilas = 0;
    int sumaColumnas = 0;
    int sumaTotal = 0;
    
    System.out.println("Vamos a hacer un array bidimensional de 4 filas y 5 columnas, vaya introduciendo los números que quiera que tenga este array");
    
    for (i = 0; i < 4; i++) {
      System.out.println("Fila " + i + ":");
      
      for (j = 0; j < 5; j++) {
        System.out.print("Columna " + j + ": ");
        array[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    
    System.out.println("┌─────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    System.out.println("│ Índice  │Columna0│Columna1│Columna2│Columna3│Columna4│  Suma  │ ");
    
    
    for (i = 0; i < 4; i++) {
      System.out.println("├─────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

      System.out.print("│ Fila" + i + "   ");
      
      for (j = 0; j < 5; j++) {
        System.out.printf("│ %-7d", array[i][j]);
        sumaFilas += array[i][j];
        }
        
      System.out.printf("│ %-7d", sumaFilas);
      System.out.println("│");
      sumaTotal += sumaFilas;
      sumaFilas = 0;

    }
    System.out.println("├─────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    System.out.print("│ Suma    ");
    
    for (j = 0; j < 5; j++) {
      
      for (i = 0; i < 4; i++) {
        sumaColumnas += array[i][j];
      }
      System.out.printf("│ %-7d", sumaColumnas);
      sumaColumnas = 0;
    }
    
    System.out.printf("│ %-7d", sumaTotal);
    System.out.print("│");

    System.out.println();
    System.out.println("└─────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  }
}
