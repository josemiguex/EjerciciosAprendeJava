/* Ejercicio 5 - Capítulo 7
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio05 {
  public static void main (String[] args) {
    
    System.out.println("Introduce 10 números uno a uno pulsando enter, luego se mostrarán los 10");
    System.out.println("y el programa dirá cuál es el máximo y el mínimo");
    
    int[] num = new int[10];
    
    int min = 999999999;
    int max = 0;
    
    for (int i = 0; i < 10; i++) {
     num[i] = Integer.parseInt(System.console().readLine());
     
     if (i == 0) {
       min = num[0];
       max = num[0];
     }
     if (i > 0) {
     if (num[i] > max) {
       max = num[i];
     } 
     
     if (num[i] < min) {
       min = num[i];
     } 
   }
     
  }
  
  System.out.println("--------------------------------------");
  
  System.out.println("Números introducidos:");
  
  for (int i = 0; i < 10; i++) {
    
    System.out.print(num[i]);
    
    if (num[i] == max) {
      System.out.print("--> Máximo");
  }
  
  if (num[i] == min) {
      System.out.print("--> Mínimo");
  }
  System.out.println();
}
    
  }
}
