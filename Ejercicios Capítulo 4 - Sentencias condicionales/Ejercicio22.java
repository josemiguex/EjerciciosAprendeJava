/* Ejercicio 22 - Capítulo 4
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio22 {
  public static void main (String[] args) {
    
    int numeroSemana;
    
    System.out.println("¿Cuánto falta para el fin de semana?");
    System.out.println("------------------------------------");
    System.out.print("Escribe el día de la semana: ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    switch (diaSemana) {
      case "lunes":
        numeroSemana = 1;
        break;
      case "martes":
        numeroSemana = 2;
        break;
      case "miércoles":
        numeroSemana = 3;
        break;
      case "jueves":
        numeroSemana = 4;
        break;
      case "viernes":
        numeroSemana = 5;
        break;
      case "sábado":
        numeroSemana = 6;
        break;
      case "domingo":
        numeroSemana = 7;
        break;
      default:
        System.out.println("No has escrito un día de la semana");
        numeroSemana = 8;
        break;
   }
    System.out.println("Escribe la hora");
    System.out.print("Hora (1 - 24): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Minutos (1 - 59): ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    if (hora < 0 || hora > 24 || minuto < 0 || minuto > 59) {
      System.out.println("Te has pasado de los límites");
    } else if (numeroSemana == 8) {
      System.out.println("No podemos calcular cuántos minutos faltan pues no especificaste un día de la semana anteriormente");
    } else if (numeroSemana >= 6 || (numeroSemana == 5 && hora >= 15)) {
      System.out.print("Ya estás en el fin de semana");
    } else {
      int minutosRestantes = 6660 - (((numeroSemana - 1) * 24 * 60) + (hora * 60 + minuto));
      System.out.print("Faltan " + minutosRestantes + " minuto/s para llegar al fin de semana");
    }
    

  }
}
