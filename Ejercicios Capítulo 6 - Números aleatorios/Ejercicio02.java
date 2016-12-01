/* Ejercicio 2 - Capítulo 6
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
 * sería el 1).
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio02 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará al azar el nombre de una carta de la baraja francesa");
    System.out.println("---------------------------------------------------------------------------");
    
    int palo = (int)((Math.random() * 4) + 1);
    
    String tipoPalo = "0";
    
    switch (palo) {
      case 1:
        tipoPalo = "picas";
        break;
      case 2:
        tipoPalo = "corazones";
        break;
      case 3:
        tipoPalo = "diamantes";
        break;
      case 4:
        tipoPalo = "tréboles";
        break;
      }
      
    int carta = (int)((Math.random() * 13) + 1);
    
    String tipoCarta = "0";
    
    switch (carta) {
      case 1:
        tipoCarta = "A";
        break;
      case 2:
        tipoCarta = "2";
        break;
      case 3:
        tipoCarta = "3";
        break;
      case 4:
        tipoCarta = "4";
        break;
      case 5:
        tipoCarta = "5";
        break;
      case 6:
        tipoCarta = "6";
        break;
      case 7:
        tipoCarta = "7";
        break;
      case 8:
        tipoCarta = "8";
        break;
      case 9:
        tipoCarta = "9";
        break;
      case 10:
        tipoCarta = "10";
        break;
      case 11:
        tipoCarta = "J";
        break;
      case 12:
        tipoCarta = "Q";
        break;
      case 13:
        tipoCarta = "K";
        break;
      }
      
      System.out.print(tipoCarta + " de " + tipoPalo);
    
  }
}
