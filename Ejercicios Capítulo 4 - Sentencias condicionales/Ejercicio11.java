/* Ejercicio 11 - Capítulo 4
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio11 {
  public static void main (String[] args) {
    
    System.out.println("¿Cuánto segundos faltan para que llegue la media noche?");
    System.out.println("-------------------------------------------------------");
    System.out.println("¿Qué hora es?");
    System.out.print("Hora(0-24): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos(0-60): ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    if ((hora < 0 || hora > 24) || (minuto < 0 || minuto > 60)) {
      System.out.print("Número/s fuera de lo permitido");
    } else if (hora == 0) {
      System.out.print("Ya son las medianoche");
    } else {
      int medianoche = 86400 - ((hora * 3600) + (minuto * 60));
      System.out.print(medianoche);
}

    
  }
}
