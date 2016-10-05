/* Ejercicio 10 - Capítulo 3
 * Realiza un conversor de Mb a Kb.
 * Hecho por Jose Miguel Martín Hidalgo
 */

import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Convertidor de MB a KB");
    System.out.print("Introduzca un valor: ");
    double valorMb;
    valorMb = s.nextDouble();
    
    double valorKb;
    valorKb = valorMb * 1024;
    
    System.out.print(valorMb + "mb en kylobytes valdrá: " + valorKb + "kb"); 
  }
}
    
