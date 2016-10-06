/* Ejercicio 2 - Capítulo 4
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 * Hecho por Jose Miguel Martin Hidalgo
 */

public class Ejercicio02 {
  public static void main (String[] args) {
    
    System.out.print("Escribe una hora del día (sin los minutos): ");
    int horaDelDia = Integer.parseInt(System.console().readLine());
    
    if (6 <= horaDelDia && horaDelDia <= 12) {
      System.out.print("Buenos días");
    } else if (13 <= horaDelDia && horaDelDia <= 20) {
      System.out.print("Buenas tardes");
    } else if (21 <= horaDelDia && horaDelDia <= 23 || 0 <= horaDelDia && horaDelDia <= 5) {
      System.out.print("Buenas noches");
    } else if (horaDelDia == 24) {
      System.out.print("Buenas noches");
    } else {
      System.out.print("No es una hora del día");
    }
      
  }
}
