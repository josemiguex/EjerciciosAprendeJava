/* Ejercicio 5 - Capítulo 4
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0)
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio05 {
  public static void main (String[] args) {
    
    System.out.println("Programa resolvedor de ecuaciones de primer grado (ax + b = 0) ");
    System.out.println("-------------------------------------------------------------- ");

    
    System.out.print("Da un valor a la variable a: ");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Da un valor a la variable b: ");
    int b = Integer.parseInt(System.console().readLine());
    
    double x = (double)-b / (double)a;

    if (a == 0) {
      System.out.print("La ecuación no tiene solución real");
    } else {
      System.out.print("Valor de la x: " + x);
    }
  }
}
