/* Ejercicio 10 - Capítulo 7
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 * es necesario.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio10 {
  public static void main (String[] args) {
    
    System.out.println("Este programa generará un array de 20 números aleatorios entre 0 y 100");
    System.out.println("y pasará todos los números pares a las primeras posiciones del array");
    System.out.println("y los impares a las celdas restantes");
    System.out.println("-------------------------------------");
    
    int[] num = new int[20];
    
    //Generamos 20 números aleatorios entre 0 y 100 y lo almacenamos en el array
    
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);
    }
    
    //Mostramos el array
    System.out.println("Array original:");
    
    for (int j = 0; j < 20; j++) {
      System.out.print(num[j] + " | ");
    }
    
    //Almacenamos el array en un auxiliar
    
    int[] aux = new int[20];
    
    for (int y = 0; y < 20; y++) {
      aux[y] = num[y];
    }
    
    //Modificamos el array para que los primeros números sean los pares y los siguientes los impares
    
    int i = 0;
    
    for (int u = 0; u < 20; u++) {
      if (aux[u] % 2 == 0) {
        num[i] = aux[u];
        i++;
      }
    }
    
    for (int u = 0; u < 20; u++) {
      if (aux[u] % 2 != 0) {
        num[i] = aux[u];
        i++;
      }
    }
    
    //Mostramos el array modificado
    System.out.println();
    System.out.println("Array modificado:");
    
    for (int j = 0; j < 20; j++) {
      System.out.print(num[j] + " | ");
    }
        
  }
}
