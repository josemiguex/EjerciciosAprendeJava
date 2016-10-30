/* Ejercicio 16 - Capítulo 5
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio16 {
  public static void main (String[] args) {
    
    System.out.println("Este programa determinará si n número es primo o no");
    System.out.println("---------------------------------------------------");
    
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    int contadorDivisionesExactas = 0;
    
    while (contador <= n) {
      
      int resto = n % contador;
      if (resto == 0) {
        contadorDivisionesExactas++;
        System.out.println(contador + " ");
      } 
      contador++;
    }
    
    if (contadorDivisionesExactas <= 2) {
      System.out.print("El número es primo");
     } else {
        System.out.print("El número no es primo (arriba se muestran los números por los que se puede dividir)");
      }
  }
}
