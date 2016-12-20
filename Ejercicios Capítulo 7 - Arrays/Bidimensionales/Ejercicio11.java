/* Ejercicio 11 - Capítulo 7-2
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio11 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará por pantalla un array de 10 filas y columnas");
    System.out.println("y luego dirá los números que hay desde la esquina superior izquierda hasta la esquina inferior derecha");
    System.out.println("y el máximo, el mínimo y la media");
    System.out.println("------------------------------");
    
    //Creamos el array
    int[][] array = new int[10][10];

    //Lo mostramos
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        array[i][j] = (int)(Math.random()*101) + 200;
        System.out.printf("%5d", array[i][j]);
        }
      System.out.println();
    }


    System.out.println("\nnúmeros que hay desde la esquina superior izquierda hasta la esquina inferior derecha: ");
    
    int maximo = 200;
    int minimo = 300;
    int suma = 0;
    
    for(int i = 0; i < 10; i++) {
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
