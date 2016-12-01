/* Ejercicio 39 - Capítulo 5
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio39 {
  public static void main(String[] args) {
    
    System.out.println("En este programa debes introducir un número entero positivo");
    System.out.println("y se mostrará por pantalla desde el 1 al número introducido");
    System.out.println("-----------------------------------------------------------");
    
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    int multiplicador = 1;
    long factorial = 1;
    while (contador <= n) {
      
      while (multiplicador <= contador) {
        
        factorial *= multiplicador;
        multiplicador++;
      }
      System.out.println(contador + "!" + " = " + factorial);
      multiplicador = 1;
      contador++;
      factorial = 1;
    }
  }
}
