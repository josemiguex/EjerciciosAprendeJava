/* Ejercicio 42 - Capítulo 5
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo o
 * no.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio42 {
  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará los 5 números siguientes a partir de uno introducido");
    System.out.println("y dirá si son primos o no");
    System.out.println("---------------------------------------------------------------------------");
    
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int m = n; //número que tiene el valor de n y que aumenta de 1 en 1 en cada iteración
    
    int contador = 1; //divisor de m
    
    int contadorDivisores = 0; //contador de divisores de m
        
    boolean esPrimo;
    while (m < (n + 5)) {
      
      esPrimo = true;
      while (contador <= m) {
        if (m % contador == 0) {
          contadorDivisores++;
        }
        contador++;
      }
      
       if (contadorDivisores > 2) { //si un número tiene más de 2 divisores no puede ser primo
         esPrimo = false;
       }
      
      if (esPrimo) {
        System.out.println(m + " es primo");
      }
      
      if (esPrimo == false) {
        System.out.println(m + " no es primo");
      }
      
        contador = 1;
        contadorDivisores = 0;
        m++;
    
  }
      
  }
}
