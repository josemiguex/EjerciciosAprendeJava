/* Ejercicios 29-34 - Funciones
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicios29a34 {
  public static void main (String[] args) {
    
    // generaArrayBiInt /////////////////////////////
    arrays.bidimensionales.generaArrayBiInt(3,4,3,8);
    
    System.out.println();
    System.out.println("Array a usar en los siguientes ejercicios:");
    int[][] array = {{1,6,2}, {50,10,49}, {3,5,4}};
    
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.printf("%-3d", array[i][j]);
      }
      System.out.println();
    }
    
    
    // filaDeArrayBiInt /////////////////////////////
    arrays.bidimensionales.filaDeArrayBiInt(array, 2);
    
    // columnaDeArrayBiInt //////////////////////////
    arrays.bidimensionales.columnaDeArrayBiInt(array, 1);
    
    // coordenadasEnArrayBiInt //////////////////////
    System.out.print("El número 4 se encuentra en la posición(fila, columna): ");
    arrays.bidimensionales.coordenadasEnArrayBiInt(array, 4);
    
    
    System.out.println();
    // esPuntoDeSilla ///////////////////////////////
    
    if (arrays.bidimensionales.esPuntoDeSilla(array, 10)) {
      System.out.println("El número 10 es punto de silla");
    }
    
    if (arrays.bidimensionales.esPuntoDeSilla(array, 1)) {
      System.out.println("El número 1 es punto de silla");
    }
    
    System.out.println("Array a usar en el siguiente ejercicio:");
    
    int[][] array2 = {{1,6,2,6,5}, {50,10,49,1,3}, {3,5,4,4,30}, {7,5,12,34,9}};
    
    for (int i = 0; i < array2.length; i++) {
      for (int j = 0; j < array2[0].length; j++) {
        System.out.printf("%-3d", array2[i][j]);
      }
      System.out.println();
    }
    
    // diagonal /////////////////////////////////////
    
    
    arrays.bidimensionales.diagonal(array2, 2, 3, "nose");
  }
}
