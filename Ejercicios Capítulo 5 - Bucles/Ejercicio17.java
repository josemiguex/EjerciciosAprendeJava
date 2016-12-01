/* Ejercicio 17 - Capítulo 5
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio17 {
  public static void main (String[] args) {
    
    System.out.println("Este programa sumará los 100 números siguientes a un número entero positivo");
    System.out.println("---------------------------------------------------------------------------");
    
    System.out.print("Introduzca un número (debe ser positivo): ");
    int numero = Integer.parseInt(System.console().readLine());
    int aux = numero;
    
    int contador = numero + 1;
    
    if (numero > 0) {
      while (contador < (100 + aux)) {
        numero += contador;
        contador++;
      }
      System.out.print("Resultado al sumar los 100 números siguientes: " + numero);
      
      } else {
        System.out.print("El número introducido es negativo");
      }
  }
}
