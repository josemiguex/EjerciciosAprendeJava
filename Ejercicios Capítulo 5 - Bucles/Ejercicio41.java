/* Ejercicio 41 - Capítulo 5
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio41 {
  public static void main (String[] args) {
    
    System.out.println("Este programa contará cuántos dígitos pares y impares tiene un número");
    System.out.println("---------------------------------------------------------------------");
    
    System.out.print("Introduzca un número: ");
    long n = Long.parseLong(System.console().readLine());
    
    int digito;
    
    int contadorDigitosPares = 0;
    int contadorDigitosImpares = 0;
    
    long aux = n; //almacenamos el número en una variable
    while (n > 0) {
      digito = (int)(n % 10);
      
      if (digito % 2 == 0) {
        contadorDigitosPares++;
      }
      
      if (digito % 2 != 0) {
        contadorDigitosImpares++;
      }
      n = n / 10;
    }
    System.out.print("El número " + aux + " tiene " + contadorDigitosPares + " digitos par/es y " + contadorDigitosImpares + " digitos impar/es");
  }
}
