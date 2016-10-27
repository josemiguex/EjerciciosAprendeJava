/* Ejercicio 7 - Capítulo 5
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * Hecho por Jose Miguel Martín Hidalgo
 */

import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Control de acceso a una caja fuerte");
    System.out.println("-----------------------------------");
    
    int contador = 1;
    
    int combinacion = 0;
    
    while (contador <= 4 && combinacion != 4602) {
      
      System.out.print("Escribe la combinación para abrirla: ");
      combinacion = s.nextInt();
      
      if (combinacion != 4602) {
        System.out.println("Lo siento, esa no es la combinación");
      } else {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      }
      contador++;
    }
    
  }
}
