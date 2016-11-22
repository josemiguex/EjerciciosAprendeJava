/* Ejercicio 13 - Capítulo 6
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio13 {
  public static void main (String[] args) {
    
    System.out.println("Este programa simulará la tirada de dos dados. No parará hasta que los dos dados tengan el mismo valor");
    System.out.println("-----------------------------------------------------------------");
    
    int contadorTiradas = 1;
    
    boolean mismoValor = false;
    
    int dado1 = 0;
    int dado2 = 0;
    
    while (mismoValor == false) {
      System.out.println("Tirada " + contadorTiradas);
      dado1 = (int)((Math.random() * 6) + 1);
      dado2 = (int)((Math.random() * 6) + 1);
      
      System.out.println("Dado 1 = " + dado1);
      System.out.println("Dado 2 = " + dado2);
      
      if (dado1 == dado2) {
        mismoValor = true;
      }
      contadorTiradas++;
    }
  }
}
