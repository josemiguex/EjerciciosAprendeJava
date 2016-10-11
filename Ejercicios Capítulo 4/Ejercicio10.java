/* Ejercicio 10 - Capítulo 4
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio10 {
  public static void main (String[] args) {
    System.out.println("Horóscopo");
    System.out.println("-------------------------");
    System.out.print("Dime día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Dime mes de nacimiento: ");
    String mes = System.console().readLine().toLowerCase();
    
    if (((dia >= 21 && dia <= 31) && mes.equals("marzo")) || (dia >= 1 && dia <= 20) && mes.equals("abril")) {
      System.out.print("Horóscopo: Aries");
    } else if (((dia >= 21 && dia <= 30) && mes.equals("abril")) || (dia >= 1 && dia <= 21) && mes.equals("mayo")) {
      System.out.print("Horóscopo: Tauro");
    } else if (((dia >= 22 && dia <= 31) && mes.equals("mayo")) || (dia >= 1 && dia <= 21) && mes.equals("junio")) {
      System.out.print("Horóscopo: Géminis");
    } else if (((dia >= 22 && dia <= 31) && mes.equals("junio")) || (dia >= 1 && dia <= 22) && mes.equals("julio")) {
      System.out.print("Horóscopo: Cáncer");
    } else if (((dia >= 23 && dia <= 31) && mes.equals("julio")) || (dia >= 1 && dia <= 22) && mes.equals("agosto")) {
      System.out.print("Horóscopo: Leo");
    } else if (((dia >= 23 && dia <= 31) && mes.equals("agosto")) || (dia >= 1 && dia <= 22) && mes.equals("septiembre")) {
      System.out.print("Horóscopo: Virgo");
    } else if (((dia >= 23 && dia <= 30) && mes.equals("septiembre")) || (dia >= 1 && dia <= 22) && mes.equals("octubre")) {
      System.out.print("Horóscopo: Libra");
    } else if (((dia >= 23 && dia <= 31) && mes.equals("octubre")) || (dia >= 1 && dia <= 22) && mes.equals("noviembre")) {
      System.out.print("Horóscopo: Escorpio");
    } else if (((dia >= 23 && dia <= 30) && mes.equals("noviembre")) || (dia >= 1 && dia <= 21) && mes.equals("diciembre")) {
      System.out.print("Horóscopo: Sagitario");
    } else if (((dia >= 22 && dia <= 31) && mes.equals("diciembre")) || (dia >= 1 && dia <= 21) && mes.equals("enero")) {
      System.out.print("Horóscopo: Capricornio");
    } else if (((dia >= 21 && dia <= 31) && mes.equals("enero")) || (dia >= 1 && dia <= 19) && mes.equals("febrero")) {
      System.out.print("Horóscopo: Acuario");
    } else if (((dia >= 20 && dia <= 28) && mes.equals("febrero")) || (dia >= 1 && dia <= 20) && mes.equals("marzo")) {
      System.out.print("Horóscopo: Piscis");
    } else {
      System.out.print("No has introducido correctamente el día o el mes");
    }
  
  
    
}
}
