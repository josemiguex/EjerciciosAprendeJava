/* Ejercicio 18 - Funciones
 * Escribe un programa que pase de decimal a binario.
 */

public class Ejercicio18 {
  public static void main (String[] args) {
    
    System.out.println("Este programa convertirá un número decimal a binario");
    System.out.println("----------------------------------------------------");
    
    System.out.print("Introduce un número: ");
    int x = Integer.parseInt(System.console().readLine());
    
    System.out.println("En decimal valdrá " + decimalAbinario(x));
  }
  
  public static int decimalAbinario(int b) {
    
    int exp = 0;
    int binario = 0;
    
    do {
      
      int resto = b % 2;
      
      binario = (int)(binario + resto * Math.pow(10,exp));
      System.out.println(binario);
      exp++;
      b /= 2;
      
    } while (b != 0);
    
    return binario;
  }
}
