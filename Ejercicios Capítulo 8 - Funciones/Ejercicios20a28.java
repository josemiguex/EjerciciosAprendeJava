/* Ejercicios 20 a 28 - Funciones
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicios20a28 {
  public static void main (String[] args) {
    
    // generaArrayInt ////////////////////////////
    arrays.unidimensionales.generaArrayInt(10,3,45);
    System.out.println();
    System.out.println();
    // minimoArrayInt ////////////////////////////
    
    int array[] = {9,1,5,6,4,3};
    
    System.out.print("Array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("El número más pequeño del array es el " + arrays.unidimensionales.minimoArrayInt(array));
    
    // maximoArrayInt ////////////////////////////
    
    System.out.println("El número más grande del array es el " + arrays.unidimensionales.maximoArrayInt(array));
    
    // mediaArrayInt ////////////////////////////
    
    System.out.println("La media del array es " + arrays.unidimensionales.mediaArrayInt(array));
    
    // estaEnArrayInt ////////////////////////////
    
    if (arrays.unidimensionales.estaEnArrayInt(array,5)) {
      System.out.println("El número 5 está en el array");
    } else {
      System.out.println("El número no 5 está en el array");
    }
    
    if (arrays.unidimensionales.estaEnArrayInt(array,10)) {
      System.out.println("El número 10 está en el array");
    } else {
      System.out.println("El número no 10 está en el array");
    }
    
    // posicionEnArray ///////////////////////////
    
    System.out.println("El número 5 del array se encuentra en la posición " + arrays.unidimensionales.posicionEnArray(array, 5));
    System.out.println("El número 9 del array se encuentra en la posición " + arrays.unidimensionales.posicionEnArray(array, 9));
    
    // volteaArrayInt ////////////////////////////
    System.out.print("Array volteado: ");
    arrays.unidimensionales.volteaArrayInt(array);
    
    System.out.println();
    
    // rotaDerechaArrayInt ///////////////////////
    System.out.print("Array rotado 4 posiciones a la derecha: ");

    arrays.unidimensionales.rotaDerechaArrayInt(array, 4);
    
    System.out.println();

    
    // rotaIzquierdaArrayInt ///////////////////////
    System.out.print("Array rotado 3 posiciones a la izquierda: ");
    arrays.unidimensionales.rotaIzquierdaArrayInt(array, 3);
    
  }
}
