/* Ejercicio 6 - Capítulo
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.println("Calculador del tiempo que tardará en caer un objeto");
    System.out.println("---------------------------------------------------");
    System.out.print("¿Desde qué altura se va a tirar el objeto? (en metros): ");
    
    double gravedad = 9.81;
    double altura = Double.parseDouble(System.console().readLine());
    double tiempo = Math.sqrt((2 * altura) / gravedad);
    
    if (altura < 0) {
      System.out.print("Error, la altura no puede ser negativa");
    } else {
      System.out.print("El tiempo que tardará el objeto en llegar al suelo será: " + tiempo);
    }
  }
}

    
