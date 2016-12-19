/* Ejercicio 7 - Capítulo 4
 * Realiza un programa que calcule la media de tres notas.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio07 {
  public static void main (String[] args) {
    
    System.out.println("Calculador de la media de tres notas");
    System.out.println("------------------------------------");
    System.out.print("Dime la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime la nota del tercer examen: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
      System.out.print("Las notas no pueden ser negativas ni mayores de 10");
    } else {
      double nota4 = (nota1 + nota2 + nota3) / 3;
      System.out.printf("Nota media de las tres notas: %.2f", nota4);
    }
  }
}
