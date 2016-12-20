/* Ejercicio 12 - Capítulo 7-2
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio12 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará por pantalla un array de 0 filas y columnas");
    System.out.println("y luego dirá los números que hay desde la esquina inferior izquierda hasta la esquina superior derecha");
    System.out.println("y el máximo, el mínimo y la media de esa diagonal");
    System.out.println("------------------------------");
    
    //Creamos el array
    int[][] array = new int[10][10];

    //Lo mostramos
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        array[i][j] = (int)(Math.random()*401) + 500;
        System.out.printf("%5d", array[i][j]);
        }
      System.out.println();
    }


    System.out.println("\nnúmeros que hay desde la esquina inferior izquierda hasta la esquina superior derecha: ");
    
    int maximo = 500;
    int minimo = 900;
    int suma = 0;
    
    for(int i = 9; i >= 0; i--) {
      int numero = array[i][i];
      System.out.print(numero + " ");
      if (numero > maximo) {
        maximo = numero;
      }
      if (numero < minimo) {
        minimo = numero;
      }
      suma += numero;
    }
    
    //Mostramos el máximo, el mínimo y la media
    System.out.println("\nMáximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + ((double)suma / 10));
  }
}
