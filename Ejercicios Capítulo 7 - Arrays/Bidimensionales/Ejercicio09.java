/* Ejercicio 9 - Capítulo 7
 * Realiza un programa que sea capaz de rotar todos los elementos de una
 * matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
 * debe tener 12 filas por 12 columnas y debe contener números generados al
 * azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 * resultado, ambas con los números convenientemente alineados.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio09 {
  public static void main (String[] args) {
    
    //Creamos el array
    int[][] array = new int[12][12];
    int capa;
    
    int aux1;
    int aux2;
    
    //Creamos las variables que indican las filas y las columnas
    int i;
    int j;
    
    System.out.println("Este programa genera un array de 12 filas y columnas y luego rota todos los elementos en el sentido de las agujas del relog");
    System.out.println("---------------------------------------------------");
    
    //Damos valores al array
    
    System.out.println("Array original");
    System.out.println("--------------");

    for(i = 0; i < 12; i++) {
      for(j = 0; j < 12; j++) {
        array[i][j] = (int)(Math.random()*101);
        System.out.printf("%4d", array[i][j]);

        }
      System.out.println();
    }


    //Rotamos el array

    for(capa = 0; capa < 6; capa++) {
      
      //Rotamos la parte de arriba
      aux1 = array[capa][11 - capa];
      for (i = 11 - capa; i > capa; i--) {
        array[capa][i] = array[capa][i - 1];
      }
        
      //Rotamos la parte de la derecha     
      aux2 = array[11 - capa][11 - capa];
      for (i = 11 - capa; i > capa + 1; i--) {
        array[i][11 - capa] = array[i - 1][11 - capa];
      }
      array[capa + 1][11 - capa] = aux1;
      
      //Rotamos la parte de abajo
      aux1 = array[11 - capa][capa];
      
      for (i = capa; i < 11 - capa - 1; i++) {
        array[11 - capa][i] = array[11 - capa][i + 1];
      }
      array[11 - capa][11 - capa - 1] = aux2;
        
      //Rotamos la parte de la izquierda
      for (i = capa; i < 11 - capa - 1; i++) {
        array[i][capa] = array[i + 1][capa];
      }
      array[11 - capa - 1][capa] = aux1;

    }


    //Mostramos el array rotado
    
    System.out.println("\n\nArray modificado");
    System.out.println("--------------------------------------------------");

    for(i = 0; i < 12; i++) {
      for(j = 0; j < 12; j++) {
        System.out.printf("%4d", array[i][j]);
      }
      System.out.println();
    }
    
  }
}
