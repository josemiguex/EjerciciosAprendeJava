/* Ejercicio 3 - Capítulo 6
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * Hecho por Jose Miguel Martín Hidalgo
 */
 
public class Ejercicio03 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará al azar el nombre de una carta de la baraja española");
    System.out.println("---------------------------------------------------------------------------");
    
    int palo = (int)((Math.random() * 4) + 1);
    
    String tipoPalo = "";
    
    switch (palo) {
      case 1:
        tipoPalo = "oros";
        break;
      case 2:
        tipoPalo = "copas";
        break;
      case 3:
        tipoPalo = "bastos";
        break;
      case 4:
        tipoPalo = "espadas";
        break;
      default:
      }
      
    int carta = (int)((Math.random() * 10) + 1);
    
    String tipoCarta = "0";
    
    switch (carta) {
      case 1:
        tipoCarta = "2";
        break;
      case 2:
        tipoCarta = "3";
        break;
      case 3:
        tipoCarta = "4";
        break;
      case 4:
        tipoCarta = "5";
        break;
      case 5:
        tipoCarta = "6";
        break;
      case 6:
        tipoCarta = "7";
        break;
      case 7:
        tipoCarta = "sota";
        break;
      case 8:
        tipoCarta = "caballo";
        break;
      case 9:
        tipoCarta = "rey";
        break;
      case 10:
        tipoCarta = "as";
        break;
      default:
      }
      
      System.out.print(tipoCarta + " de " + tipoPalo);
    
  }
}
