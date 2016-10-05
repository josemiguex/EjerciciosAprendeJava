/* Ejercicio 5 - Capítulo 3
 * Escribe un programa que calcule el área de un rectángulo.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio05 {
	public static void main (String[] args) {
		
		String linea1;
		
		System.out.println("Calculador del área de un rectángulo (en centímetros).");
		System.out.print("Base: ");
		linea1 = System.console().readLine();
	  
	  int base;
	  base = Integer.parseInt(linea1);
	  
	  String linea2;
	  
	  System.out.print("Altura: ");
	  linea2 = System.console().readLine();
	  
	  int altura;
	  altura = Integer.parseInt(linea2);
	  
	  int area;
	  area = base * altura;
	  
	  System.out.println("Área: " + area + "cm^2");
	}
}
	  
		
