/* Ejercicio 3 - Capítulo 7-2
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */

public class Ejercicio03 {
  public static void main (String[] args) {
    
    int[][] array = new int[4][5];
    int i;
    int j;
    int sumaFilas = 0;
    int sumaColumnas = 0;
    int sumaTotal = 0;
    
    System.out.println("Vamos a hacer un array bidimensional de números aleatorio de 4 filas y 5 columnas");
    
    for (i = 0; i < 4; i++) {
      
      for (j = 0; j < 5; j++) {
       
        array[i][j] = (int)(Math.random() * 900 + 101);
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
