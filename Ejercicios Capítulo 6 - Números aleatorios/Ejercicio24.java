/* Ejercicio 24 - Capítulo 6
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio24 {
  public static void main (String[] args) {
    
    System.out.println("En este programa debes introducir un número por teclado y se eligirá al azar uno de sus dígitos");
    System.out.println("-----------------------------------------------------------------------------------------------");
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int n = Integer.parseInt(System.console().readLine());
    
    //Contamos el número de dígitos del número
    
    int aux = n;
    
    int contadorDigitos = 1;
    while (n >= 10) {
      
      n /= 10;
      contadorDigitos++;
    }
    
    n = aux;
    int digitoAelegir = (int)(Math.random() * (contadorDigitos) + 1);
    
    System.out.println("Posición del dígito elegida (de derecha a izquierda): " + digitoAelegir);
    
    while (digitoAelegir > 1) {
      n /= 10;
      digitoAelegir--;
    }
      
  int digito = n % 10;
  
  System.out.print("Digito elegido: " + digito);
  }
}
