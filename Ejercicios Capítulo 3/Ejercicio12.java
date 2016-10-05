/* Ejercicio 12 - Capítulo 3
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio12 {
  public static void main (String[] args) {

    System.out.print("Introduce la nota del primer examen: ");
    double notaPrimerExamen; 
    notaPrimerExamen = Double.parseDouble(System.console().readLine());
  
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaPrimerTrimestre;
    notaPrimerTrimestre = Double.parseDouble(System.console().readLine());
    
    double notaSegundoExamen;
    notaSegundoExamen = (notaPrimerTrimestre - 0.40 * notaPrimerExamen) / 0.60;
    
    System.out.print("Para tener un " + notaPrimerTrimestre + " en el primer trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen");
  }
}
