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
    int resto2 = numero%5;
    
    if (resto == 0) {
      System.out.print("El número introducido es par y no divisible entre 5");
    } else if (resto2 == 0) {
       System.out.print("El número introducido es impar y divisible entre 5");
      } else {
      System.out.print("El número introducido es impar y no divisible entre 5");
    }
  }
}
