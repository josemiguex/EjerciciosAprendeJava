/* Ejercicio 3 - Capítulo 7
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio03 {
  public static void main (String[] args) {
    
    System.out.println("Debes introducir 10 números, uno a uno pulsando enter");
    
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
     num[i] = Integer.parseInt(System.console().readLine());
  }
  
  //Parte de arriba de la tabla
  System.out.println("Ahora se mostrará los 10 números que has introducido al revés");
  System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
  
  
  for (int y = 9; y >= 0; y--) {
    System.out.printf("│%5d", num[y]);
  } 
  System.out.println("│");
  System.out.println("└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

  }
}
