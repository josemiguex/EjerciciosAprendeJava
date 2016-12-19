/* Ejercicio 8 - Capítulo 3
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 */

public class Ejercicio08 {
	public static void main (String[] args) {
		
		System.out.println("Calculador de salario semanal ");
		System.out.print("¿Cuántas horas trabajas a la semana? ");
		int horasTrabajadas;
		horasTrabajadas = Integer.parseInt(System.console().readLine());
		
		int salarioSemanal;
		salarioSemanal = horasTrabajadas * 12;
		
		System.out.print("Salario semanal: " + salarioSemanal + "€");
	}
}
