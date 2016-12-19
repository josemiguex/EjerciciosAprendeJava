/* Ejercicio 13 - Capítulo 4
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado
 * Hecho por Jose Miguel Martín Hidalgo
 */

import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce 3 números: ");
    
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    
    if ((a > b) && (b > c)) {
      System.out.print("Ordenando los números de menor a mayor: " + c + " " + b + " " + a);
    } else if ((c > b) && (b > a)) {
      System.out.print("Ordenando los números de menor a mayor: " + a + " " + b + " " + c);
    } else if ((a > b) && (a > c) && (c < b)) {
      System.out.print("Ordenando los números de menor a mayor: " + c + " " + b + " " + a);
    } else if ((a > b) && (a > c) && (c > b)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + c + " " + a);
    } else if ((a > b) && (a > c) && (c == b)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + c + " " + a);
    } else if ((b > c) && (b > a) && (a < c)) {
      System.out.print("Ordenando los números de menor a mayor: " + a + " " + c + " " + b);
    } else if ((b > c) && (b > a) && (a > c)) {
      System.out.print("Ordenando los números de menor a mayor: " + c + " " + a + " " + b);
    } else if ((b > c) && (b > a) && (a == c)) {
      System.out.print("Ordenando los números de menor a mayor: " + a + " " + c + " " + b);
    } else if ((c > a) && (c > b) && (a > b)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + a + " " + c);
    } else if ((c > a) && (c > b) && (a < b)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + c + " " + c);
    } else if ((c > a) && (c > b) && (a == b)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + a + " " + c);
    } else if ((c == a) && (c == b) && (a == b)) {
      System.out.print("Los tres números introducidos son iguales");
    } else if ((a < b) && (a < c) && (c < b)) {
      System.out.print("Ordenando los números de menor a mayor: " + a + " " + c + " " + b);
    } else if ((a < b) && (a < c) && (c > b)) {
      System.out.print("Ordenando los números de menor a mayor: " + a + " " + b + " " + c);
    } else if ((a < b) && (a < c) && (c == b)) {
      System.out.print("Ordenando los números de menor a mayor: " + a + " " + c + " " + b);
    } else if ((b < c) && (b < a) && (a < c)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + a + " " + c);
    } else if ((b < c) && (b < a) && (a > c)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + c + " " + a);
    } else if ((b < c) && (b < a) && (a == c)) {
      System.out.print("Ordenando los números de menor a mayor: " + b + " " + c + " " + a);
    } else if ((c < a) && (c < b) && (a > b)) {
      System.out.print("Ordenando los números de menor a mayor: " + c + " " + b + " " + a);
    } else if ((c < a) && (c < b) && (a < b)) {
      System.out.print("Ordenando los números de menor a mayor: " + c + " " + a + " " + b);
    } else if ((c < a) && (c < b) && (a == b)) {
      System.out.print("Ordenando los números de menor a mayor: " + c + " " + a + " " + b);
    } 
  }
}
