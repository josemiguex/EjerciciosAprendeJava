/* Ejercicio 9 - Capítulo 5
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax^2 + bx + c = 0)
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio09 {
  public static void main (String[] args) {
    
    double x;
    double x1;
    
    System.out.println("Calculador de ecuaciones de segundo grado");
    System.out.println("-----------------------------------------");
    System.out.print("Dime el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());

    System.out.print("Dime el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    if (a == 0 && b == 0 && c == 0) {
      System.out.print("La ecuación no tiene solución");
    } else if (c == 0) {
      x = -b/a;
      System.out.print("Soluciones de la ecuación: 0 y " + x);
    } else if ((b*b - 4*a*c) < 0) {
      System.out.print("La ecuación no tiene solución (La raíz es negativa)");
  }  else {
      x = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
      x1 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
      System.out.print("Soluciones de las ecuaciones: " + x + " " + x1);
    }
  }
}
