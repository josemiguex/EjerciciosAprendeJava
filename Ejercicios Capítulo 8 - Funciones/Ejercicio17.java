/* Ejercicio 17 - Funciones
 * Escribe un programa que pase de binario a decimal.
 */

public class Ejercicio17 {
  public static void main (String[] args) {
    
    System.out.println("Este programa convertirá un número binario a decimal");
    System.out.println("----------------------------------------------------");
    
    System.out.print("Introduce un número: ");
    int x = Integer.parseInt(System.console().readLine());
    
    System.out.println("En decimal valdrá " + binarioAdecimal(x));
  }
  
  public static int binarioAdecimal(int b) {
    
    int i = 1;
    
    int d = 0;
    
    do {
      int resto = b % 10;
      
      if (resto == 1) {
        d += i;
      }
      b /= 10;
      
      i *= 2;
    } while (b > 0);
    
    return d;
  }
}
