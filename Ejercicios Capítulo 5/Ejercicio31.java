/* Ejercicio 31 - Capítulo 5
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 */

public class Ejercicio31 {
  public static void main(String[] args) {
    System.out.println("Este programa pintará una L por pantalla de asteriscos");
    System.out.println("Debe introducir la altura y el palo horizontal tendrá una longitud");
    System.out.println("de la mitad de la altura más uno");
    System.out.println("------------------------------------------------------------------");
    
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    
    while (contador < altura) {
      System.out.println("*");
      contador++;
    }
    
    int horizontal = (altura / 2) + 1;
    contador = 1;
    
    while (contador <= horizontal) {
      System.out.print("* ");
      contador++;
    }
  }
}
