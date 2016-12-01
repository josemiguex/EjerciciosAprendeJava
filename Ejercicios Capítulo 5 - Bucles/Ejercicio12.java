/* Ejercicio 12 - Capítulo 5
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
 * debe introducir por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio12 {
  public static void main (String[] args) {
    System.out.println("Mostrador de n términos de la serie Fibonacci");
    System.out.println("---------------------------------------------");
    
    System.out.print("Introduce un número (n): ");
    int n = Integer.parseInt(System.console().readLine());
    
    if (n == 1) {
      System.out.print("0");
    } else if (n == 2) {
      System.out.print("0 1"); 
    } else if (n > 1) {
      System.out.print("0 1");
      int numeroFibonacci1 = 0;
      int numeroFibonacci2 = 1;
      int aux;
        while(n > 2) {
            aux = numeroFibonacci1;
            numeroFibonacci1 = numeroFibonacci2;
            numeroFibonacci2 = aux + numeroFibonacci2;
            System.out.print(" " + numeroFibonacci2);
            n--;
        }
      
    }
    
  }
}
      
