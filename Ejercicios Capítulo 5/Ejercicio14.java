/* Ejercicio 14 - Capítulo 5
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 */

public class Ejercicio14 {
  public static void main (String[] args) {
    System.out.println("Este programa calculará la potencia a partir de una base y un exponente");
    System.out.println("-----------------------------------------------------------------------");
    System.out.print("Introduzca la base: ");
    long base = Integer.parseInt(System.console().readLine());
    
    long aux;
    aux = base;
    System.out.print("Introduzca el exponente del número: ");
    long exponente = Integer.parseInt(System.console().readLine());
    long contador = 1;
    
    while (contador < exponente) {
      
      base = base * aux;
      
      contador++;
    }
    System.out.print("Resultado: " + base);
    
  }
}
