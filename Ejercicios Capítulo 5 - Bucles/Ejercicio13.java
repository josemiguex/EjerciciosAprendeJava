/* Ejercicio 13 - Capítulo 5
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio13 {
  public static void main (String[] args) {
    System.out.println("Este programa determinará cuantos números son positivos y cuántos negativos");
    System.out.println("---------------------------------------------------------------------------");
    
    int contadorNegativo = 0;
    int contadorPositivo = 0;
    int contadorTotal = 0;
    
    System.out.println("Vaya introduciendo los números uno a uno pulsando a enter (10 en total)");
    
    while (contadorTotal <= 10) {
      int numero = Integer.parseInt(System.console().readLine());
      
      if (numero < 0) {
        contadorNegativo++;
      } else if (numero >= 0) {
        contadorPositivo++;
      }
      contadorTotal++;
    }
    System.out.print("Has introducido " + contadorPositivo + " números positivos y " + contadorNegativo + " números negativos");
  }
}
