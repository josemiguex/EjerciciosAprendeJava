/* Ejercicio 17 - Capítulo 7
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir
 * un número al usuario. Se debe comprobar que el número introducido por
 * teclado se encuentra dentro del array, en caso contrario se mostrará un
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
 * introduzca uno correctamente. A continuación, el programa rotará el array
 * hacia la derecha las veces que haga falta hasta que el número introducido 
 * quede situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio17 {
  public static void main (String[] args) {
    
    boolean mismoValor = false;
    int[] array = new int[10];
    int i;
    int posicion = 0;
    
    for (i = 0; i < 10; i++) {
      array[i] = (int)(Math.random() * 101);
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("Escribe un número (que esté dentro del array):");
    int n = Integer.parseInt(System.console().readLine());
    
    do {
      for (i = 0; i < 10; i++) {
      if (array[i] == n) {
          mismoValor = true;
          System.out.println("El número introducido se encuentra dentro del array");
          posicion = i;
      }
    }
      
      if (!mismoValor) {
        System.out.println("El número introducido no se encuentra dentro del array");
        
      }
    } while (!mismoValor);
  
    //Rotamos el array de forma que el valor introducido sea el primero
    
    //Creamos un array auxiliar

    int[] aux = new int[10];
    
    for (i = 0; i < 10; i++) {
      aux[i] = array[i];
    }
  
    //Rotamos el Array
    
    int g = 0;
    for (i = 0; i < 10; i++) {
      
      if (posicion < 10) {
        array[i] = aux[posicion];
        posicion++;
      } else {
        array[i] = aux[g];
        g++;
      }
    }
    
    
    
    //Mostramos el Array
    System.out.println("Pasamos el número introducido a la primera posición");
    for (i = 0; i < 10; i++) {
      System.out.print(array[i] + " ");
    }
  
    
  }
}
