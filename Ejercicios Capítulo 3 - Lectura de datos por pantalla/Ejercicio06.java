/* Ejercicio 6 - Capítulo 3
 * Escribe un programa que calcule el área de un triángulo.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio06 {
	public static void main (String[] args) {
		
		System.out.println("Calculador del área de un triángulo (en centímetros)");
		System.out.print("Base: ");
		double base = Double.parseDouble(System.console().readLine());
		System.out.print("Altura: ");
		double altura = Double.parseDouble(System.console().readLine());
		
		double area = (base * altura) / 2;
		
		System.out.print("Área: " + area + "cm^2");
	}
}

		
