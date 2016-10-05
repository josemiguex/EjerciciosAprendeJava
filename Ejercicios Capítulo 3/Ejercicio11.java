/* Ejercicio 11 - Capítulo 3
 * Realiza un conversor de Mb a Kb.
 * Hecho por Jose Miguel Martín Hidalgo
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Convertidor de KB a MB");
		System.out.print("Introduzca un valor: ");
		double valorKb;
		valorKb = s.nextDouble();
		
		double valorMb;
		valorMb = valorKb / 1024;
		
		System.out.print(valorKb + "kb en kylobytes valdrá: " + valorMb + "mb"); 
	}
}
