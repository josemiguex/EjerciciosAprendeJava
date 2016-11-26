/* Ejercicio 23 - Capítulo 6
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio23 {
  public static void main (String[] args) {
    
    System.out.println("Este programa generará de forma aleatoria la tirada de 5 dados de poker");
    System.out.println("-----------------------------------------------------------------------");
    
    int tiradas = 5;
    
    while (tiradas > 0) {
      
      int numFigura = (int)(Math.random() * 6);
      
      String figura = "";
      
      switch (numFigura) {
        case 0:
          figura = "As";
          break;
        case 1:
          figura = "K";
          break;
        case 2:
          figura = "Q";
          break;
        case 3:
          figura = "J";
          break;
        case 4:
          figura = "7";
          break;
        case 5:
          figura = "8";
          break;
        }
        
        System.out.print(figura + " ");
        tiradas--;
      }
          
  }
}
