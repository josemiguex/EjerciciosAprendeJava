/* Ejercicio 7 - Capítulo 3
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */

public class Ejercicio07 {
	public static void main (String[] args) {
		System.out.println("Factura");
		System.out.println("-----------------");
		System.out.print("Base imponible: ");
		double baseImponible;
		baseImponible = Double.parseDouble(System.console().readLine());
		
		double precioConIva;
		precioConIva = baseImponible * 1.21;
		
		System.out.print("Precio con IVA: " + precioConIva + "€");
		
	}
}

		
