/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio04 {
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
		 
		 int suma;
		 suma = numero1 + numero2;
		 
		 System.out.println("Suma: " + suma);
		 
		 int resta;
		 resta = numero1 - numero2;
		 
		 System.out.println("Resta: " + resta);
		 
		 int multiplicacion;
		 multiplicacion = numero1 * numero2;
		 
		 System.out.println("Multiplicación: " + multiplicacion);
		 
		 double division;
		 division = (double)numero1 / (double)numero2;
		 
		 System.out.println("División: " + division);
	 }
 }
