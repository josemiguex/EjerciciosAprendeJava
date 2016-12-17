/* Ejercicio 16 - Capítulo 5
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón. 
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio16 {
  public static void main (String[] args) {
    
    System.out.println("Este programa simula una máquina tragaperras simplificada");
    System.out.println("---------------------------------------------------------");
    
    int tirada1 = (int)(Math.random() * 5 + 1);
    
    String figura1 = "";
    
    int mismoValor = 0;
    
    switch (tirada1) {
      case 1:
        figura1 = "corazón";
        break;
      case 2:
        figura1 = "diamante";
        break;
      case 3:
        figura1 = "herradura";
        break;
      case 4:
        figura1 = "campana";
        break;
      case 5:
        figura1 = "limón";
        break;
      }
      
      System.out.print(figura1 + " ");
      
    int tirada2 = (int)(Math.random() * 5 + 1);
    
    String figura2 = "";
    
    switch (tirada2) {
      case 1:
        figura2 = "corazón";
        break;
      case 2:
        figura2 = "diamante";
        break;
      case 3:
        figura2 = "herradura";
        break;
      case 4:
        figura2 = "campana";
        break;
      case 5:
        figura2 = "limón";
        break;
      }
      
      System.out.print(figura2 + " ");
      
      if (tirada2 == tirada1) {
        mismoValor++;
      }
      
    int tirada3 = (int)(Math.random() * 5 + 1);
    
    String figura3 = "";
    
    switch (tirada3) {
      case 1:
        figura3 = "corazón";
        break;
      case 2:
        figura3 = "diamante";
        break;
      case 3:
        figura3 = "herradura";
        break;
      case 4:
        figura3 = "campana";
        break;
      case 5:
        figura3 = "limón";
        break;
      }
      
      System.out.print(figura3 + " ");
      
      if (tirada3 == tirada2) {
        mismoValor++;
      }
      
      if (tirada3 == tirada1) {
        mismoValor++;
      }
      
      System.out.println();
      
      if (mismoValor == 0) {
        System.out.print("Lo siento, ha perdido");
      }
      
      if (mismoValor == 1) {
        System.out.print("Bien, ha recuperado su moneda");
      }
      
      if (mismoValor > 1) {
        System.out.print("Enhorabuena, ha ganado 10 monedas");
      }
  }
}
