/* Ejercicio 5 - Capítulo 7-2
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio05 {
  public static void main (String[] args) {
    
    int[][] array = new int[6][10];
    int i;
    int j;
    
    int max = 0;
    int min = 1000;
    int posicionMaximoFila = 0;
    int posicionMaximoColumna = 0;
    int posicionMinimoFila = 0;
    int posicionMinimoColumna = 0;
    for (i = 0; i < 6; i++) {
        
        for (j = 0; j < 10; j++) {
         
          array[i][j] = (int)(Math.random() * 1001);
          if (array[i][j] > max) {
            max = array[i][j];
            posicionMaximoFila = i;
            posicionMaximoColumna = j;
          }
          
          if (array[i][j] < min) {
            min = array[i][j];
            posicionMinimoFila = i;
            posicionMinimoColumna = j;
          }
        }
    }
    
    System.out.println("┌─────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
      System.out.println("│ Índice  │Columna0│Columna1│Columna2│Columna3│Columna4│Columna5│Columna6│Columna7│Columna8│Columna9│ ");
      
      
      for (i = 0; i < 6; i++) {
        System.out.println("├─────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

        System.out.print("│ Fila" + i + "   ");
        
        for (j = 0; j < 10; j++) {
          System.out.printf("│ %-7d", array[i][j]);
          }
        System.out.println("│");
      

      }

     
      System.out.println("└─────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    System.out.println("Posición del máximo: fila " + posicionMaximoFila + " columna " + posicionMaximoColumna);
    System.out.println("Posición del mínimo: fila " + posicionMinimoFila + " columna " + posicionMinimoColumna); 

  }
}
