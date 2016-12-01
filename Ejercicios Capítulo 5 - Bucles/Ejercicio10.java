/* Ejercicio 10 - Capítulo 5
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio10 {
  public static void main (String[] args) {
    
    System.out.println("Media de un conjunto de números");
    System.out.println("El programa finalizará cuando introduzca un número negativo");
    System.out.println("-----------------------------------------------------------");
    
    double sumaNumeros = 0;
    double contadorDeNumeros = 0;
    double numero = 0;
    System.out.println("Vaya escribiendo los números uno a uno pulsando enter");
    
    while (numero >= 0) {
      numero = Integer.parseInt(System.console().readLine());
      
      sumaNumeros += numero;
      contadorDeNumeros++;
    } 
    
    System.out.print("Media de todos los números: " + (sumaNumeros - numero) / (contadorDeNumeros - 1));
  }
}
      
