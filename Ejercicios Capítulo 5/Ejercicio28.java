/* Ejercicio 28 - Capítlo 5
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado. 
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio28 {
  public static void main(String[] args) {
    
    System.out.println("Este programa calculará el factorial de un número");
    System.out.println("-------------------------------------------------");
    
    System.out.print("Introduce un número(n): ");
    int n = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    
    int factorial = 1;
    
    while (contador <= n) {
      factorial *= contador;
      contador++;
    }
    System.out.print("Factorial de " + n + ": " + factorial);
  }
}
