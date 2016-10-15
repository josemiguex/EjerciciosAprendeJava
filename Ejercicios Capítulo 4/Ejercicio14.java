/* Ejercicio 14 - Capítulo 4
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio14 {
  public static void main (String[] args) {
    
    System.out.println("Detector de si un número es par y/o divisible entre 5");
    System.out.println("-----------------------------------------------------");
    System.out.print("Escribe un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int resto = numero%2;
    
    if (resto == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }
  }
}
