/* Funciones de arrays unidimensionales
 * Hecho por Jose Miguel Martín Hidalgo
 */
package arrays;
public class unidimensionales {
  
  /** 
   * generaArrayInt
   * Genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * @param n   Tamaño del array
   * @param min Número más pequeño
   * @param max Número más grande
   * @return array
   */
  
  public static void generaArrayInt(int n, int min, int max) {
    
    int[] array = new int[n];
    
    for (int i = 0; i < n; i++) {
      array[i] = (int)(Math.random() * (max - min) + min);
      System.out.print(array[i] + " ");
    }
    
  }
    
  /** 
   * minimoArrayInt
   * Devuelve el mínimo del array que se pasa comoparámetro.
   * @param array   nombre del array
   * @return min    devuelve el número más pequeño del array
   */
    
  public static int minimoArrayInt(int[] array) {
    
    int min = 999999999;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    
    return min;
  }
  
  /** 
   * maximoArrayInt
   * Devuelve el máximo del array que se pasa comoparámetro.
   * @param array   nombre del array
   * @return max    devuelve el número más grande del array
   */
  
  public static int maximoArrayInt(int[] array) {
    
    int max = 0;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    
    return max;
  }
  
  /** 
   * mediaArrayInt
   * Devuelve la media del array que se pasa como parámetro.
   * @param array   nombre del array
   * @return media    devuelve la media del array
   */
  
  public static double mediaArrayInt(int[] array) {
    
    double media = 0;
    
    for (int i = 0; i < array.length; i++) {
      media += array[i];
    }
    
    media /= array.length;
    
    return media;
  }
  
  /** 
   * estaEnArrayInt
   * Devuelve la media del array que se pasa como parámetro.
   * @param array   nombre del array
   * @param x       número a comprobar si está en el array
   * @return boolean devuelve si existe o no ese número
   */
  
  public static boolean estaEnArrayInt(int[] array, int x) {
    
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] == x) {
        return true;
      }
    }
    
    return false;
  }
  
  /** 
   * posicionEnArray
   * Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
   * @param array   nombre del array
   * @param x       un número del array
   * @return p      posición del número en ese array
   */
  
  public static int posicionEnArray(int[] array, int x) {
    
    int p = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == x) {
        p = i;
      }
    }
    
    return p;
  }
  
  /** 
   * volteaArrayInt
   * Le da la vuelta a un array.
   * @param array   nombre del array
   */
  
  public static void volteaArrayInt(int[] array) {
    
    int[] arrayInvertido = new int[array.length];
    
    int j = array.length - 1;
    
    for (int i = 0; i < array.length; i++) {
      
      arrayInvertido[i] = array[j];

      j--;
    }
    
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrayInvertido[i] + " ");
    }
  }
  
  /** 
   * rotaDerechaArrayInt
   * Rota n posiciones a la derecha los números deun array.
   * @param array   nombre del array
   * @param n       posiciones a rotar
   */
  
  public static void rotaDerechaArrayInt(int[] array, int n) {
    
    int[] arrayRotado = new int[array.length];
    
    int[] arrayAux = new int[n];
    
    int j = array.length - 1;
    
    for (int i = arrayAux.length - 1; i >= 0; i--) {
      arrayAux[i] = array[j];
      j--;
    }
    
    for (int i = array.length - 1; i >= n; i--) {
      
      arrayRotado[i] = array[i - n];
    }
    
    for (int i = 0; i < n; i++) {
      arrayRotado[i] = arrayAux[i];
      
    }
    
    
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrayRotado[i] + " ");
    }
    
  }
  
  /** 
   * rotaIzquierdaArrayInt
   * Rota n posiciones a la izquierda los números deun array.
   * @param array   nombre del array
   * @param n       posiciones a rotar
   */
  
  public static void rotaIzquierdaArrayInt(int[] array, int n) {
    
    int[] arrayRotado = new int[array.length];
    
    int[] arrayAux = new int[n];
    
    for (int i = 0; i < n; i++) {
      arrayAux[i] = array[i];
    }
    
    for (int i = 0; i < (array.length - n); i++) {
      
      arrayRotado[i] = array[i + n];
    }
    
    int j = 0;
    
    for (int i = array.length - n; i < array.length; i++) {
      arrayRotado[i] = arrayAux[j];
      j++;
      
    }
    
    
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrayRotado[i] + " ");
    }
    
  }
}
