/* Ejercicio 23 - Capítulo 5
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio23 {
  public static void main (String[] args) {
    
    System.out.println("En este programa debes ir introduciendo numeros hasta que la suma total sea mayor que 10000");
    System.out.println("------------------------------------------------------------------------------------------");
    
    System.out.println("Vaya introduciendo los números 1 a 1 pulsando enter");
    
    int suma = 0;
    int contador;
    for (contador = 0; suma < 10000; contador++) {
      int numero = Integer.parseInt(System.console().readLine());
      
      suma += numero;
    }
   System.out.println("---------------------------");
   System.out.println("Total acumulado: " + suma);
   System.out.println("Números introducidos: " + contador);
   System.out.println("Media: " + ((double)suma / (double)contador));
  }
}
