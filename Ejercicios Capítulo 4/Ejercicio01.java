/* Ejercicio 1 - Capítulo 4
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio01 {
  public static void main (String[] args) {
    System.out.print("Escribe un día de la semana: ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    if (diaSemana.equals("lunes")) {
      System.out.print("A primera hora toca Sistemas informáticos");
      } else if (diaSemana.equals("martes")) {
      System.out.print("A primera hora toca Programación");
      } else if (diaSemana.equals("miércoles")) {
      System.out.print("A primera hora toca Programación");
      }  else if (diaSemana.equals("jueves")) {
      System.out.print("A primera hora toca Base de datos");
      } else if (diaSemana.equals("viernes")) {
      System.out.print("A primera hora toca Lenguaje de marcas");
    } else {
      System.out.print("No es un día de la semana");
    }
    
   
 }   
}
