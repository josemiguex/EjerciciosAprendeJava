/* Ejercicio 6 - Capítulo 7
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.println("Vamos a hacer un array, debes introducir 15 números, uno a uno pulsando enter");
    System.out.println("El programa invertirá el array y se mostrará el original y el invertido");
    
    int[] num = new int[15];
    
    for (int i = 0; i < 15; i++) {
     num[i] = Integer.parseInt(System.console().readLine());
  }
  System.out.println();
  
  //Mostramos el array original
  System.out.println("┌───────────────┐");
  System.out.println("│Array original │");
  System.out.println("├───────────────┤");
  
    for (int numArray = 0; numArray < 15; numArray++) {
     System.out.printf("│Array %-2d: %-5d│\n", numArray, num[numArray]);
  }
  System.out.print("└───────────────┘");
  System.out.println();
  
  //Rotamos el array
  
  int aux = num[14];
  
  for (int numArray = 14; numArray > 0; numArray--) {
    num[numArray] = num[numArray - 1];

  }

  num[0] = aux;
  
  System.out.println("┌───────────────┐");
  System.out.println("│Array invertido│");
  System.out.println("├───────────────┤");
  
  for (int numArray = 0; numArray < 15; numArray++) {
    System.out.printf("│Array %-2d: %-5d│\n", numArray, num[numArray]);
  }
  
  System.out.print("└───────────────┘");
   
   
  }    
}

