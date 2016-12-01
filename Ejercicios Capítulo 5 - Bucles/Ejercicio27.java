/* Ejercicio 27 - Capítulo 5
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio27 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará, contará y sumará los múltiplos de 3 que haya entre 1 y un número leído por teclado");
    System.out.println("-------------------------------------------------------");
    
    System.out.print("Introduce un número(n): ");
    int n = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    int contadorMultiplos = 0;
    int sumadorMultiplos = 0;
    
    while (contador < n)  {
      
      if (contador % 3 == 0) {
        System.out.println(contador);
        contadorMultiplos++;
        sumadorMultiplos += contador;
      }
      
      contador++;
    } 
    
    System.out.println("Número de múltiplos de 3: " + contadorMultiplos);
    System.out.println("Suma de los múltiplos de 3: " + sumadorMultiplos);
  }
}
