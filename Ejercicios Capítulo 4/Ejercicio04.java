/* Ejercicio 4 - Capítulo 4
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio04 {
  public static void main (String[] args) {
    
    System.out.println("Calculador del salario semanal");
    System.out.println("-----------------------------");
    System.out.print("Introduce el número de horas trabajadas a la semana: ");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 0) {
      System.out.print("Has introducido un numero negativo");
    } else if (horasTrabajadas < 41) {
        System.out.print("Salario semanal: " + (horasTrabajadas * 12));
      } else if (horasTrabajadas >= 41) {
         System.out.print("Salario semanal: " + (480 + ((horasTrabajadas - 40) * 16)) + "€");
       }
     }
   }

    
