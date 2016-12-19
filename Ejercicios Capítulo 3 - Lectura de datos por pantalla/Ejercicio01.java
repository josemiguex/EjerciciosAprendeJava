/*Ejercicio 1 - Capítulo 3
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * Hecho por Jose Miguel Martín Hidalgo
 */
 
 public class Ejercicio01 {
	 public static void main (String[] args) {
		 
		 String linea1;
		 		 
		 System.out.print("Escribe un número: ");
		 linea1 = System.console().readLine();
		 
		 int numero1;
		 numero1 = Integer.parseInt(linea1);
		 
		 String linea2;
		 
		 System.out.print("Escribe otro número: ");
		 linea2 = System.console().readLine();
		 
		 int numero2;
		 numero2 = Integer.parseInt(linea2);
		 
		 int total;
		 total = numero1*numero2;
		 
		 System.out.print("El resultado al multiplicar los dos números es: " + total);
		 
	 }
 }
		 
 
