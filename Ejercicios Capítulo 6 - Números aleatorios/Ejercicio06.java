/* Ejercicio 6 - Capítulo 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 * ducido es menor o mayor que el número secreto.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.println("¿En qué número estoy pensando (del 1 al 100)?");
    
    int oportunidades = 5;
    
    int numero = (int)(Math.random() * 101);
    
    int numeroEscrito = 0;
    
    boolean numCorrecto = false;
    do {
      
      System.out.println("Tienes " + oportunidades + " oportunidades");
      numeroEscrito = Integer.parseInt(System.console().readLine());
      
      if (numero < numeroEscrito) {
        System.out.println("El número es menor");
      }
      
      if (numero > numeroEscrito) {
        System.out.println("El número es mayor");
      }
      
      if (numero == numeroEscrito) {
        System.out.println("Correcto!");
        numCorrecto = true;
      }
      
      oportunidades--;
      } while (oportunidades > 0 && numero != numeroEscrito);
        
      if (numCorrecto == false) {
        System.out.println("No tienes más oportunidades, el número en el que estaba pensando era el " + numero);
      }
      
    
    
  }
}
