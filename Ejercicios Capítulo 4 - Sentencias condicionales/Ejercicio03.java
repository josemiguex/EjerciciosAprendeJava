/* Ejercicio 3 - Capítulo 4
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio03 {
  public static void main (String[] args) {
    
    System.out.print("Escribe un número del 1 al 7: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    String diaSemana;
    
    switch (numero) {
      case 1:
        diaSemana = "Lunes";
        break;
      case 2:
        diaSemana = "Martes";
        break;
      case 3:
        diaSemana = "Miércoles";
        break;
      case 4:
        diaSemana = "Jueves";
        break;
      case 5:
        diaSemana = "Viernes";
        break;
      case 6:
        diaSemana = "Sábado";
        break;
      case 7:
        diaSemana = "Domingo";
        break;
      default:
        diaSemana = "No existe este día de la semana";
      
    }
    
    System.out.print("Día " + numero + ": " + diaSemana);
     } 
}
