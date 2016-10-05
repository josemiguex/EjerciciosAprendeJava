/*Ejercicio 6 - Capítulo 2
*Escribe un programa que calcule el total de una factura a partir de la base
*imponible (precio sin IVA). La base imponible estará almacenada en una
*variable.
*Hecho por Jose Miguel Martín Hidalgo
*/

public class Ejercicio06 {
  public static void main (String[] args) {
  
  double iva = 1.21;
  int baseImponible = 32;  
  System.out.println("Factura");
  System.out.println("-------------------------------");

  System.out.println("Base imponible:            " + baseImponible + " €");
  System.out.println("IVA:                       " + (baseImponible*iva) + " €");
  }
}