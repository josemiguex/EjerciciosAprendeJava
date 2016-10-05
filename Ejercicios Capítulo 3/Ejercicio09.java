/* Ejercicio 9 - Capítulo 3
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio09 {
  public static void main (String[] args) {
    
    System.out.println("Calculador del volumen de un cono (en centímetros) ");
    System.out.print("Radio del cono: ");
    double radioCono;
    radioCono = Double.parseDouble(System.console().readLine());
    
    System.out.print("Altura del cono: ");
    double alturaCono;
    alturaCono = Double.parseDouble(System.console().readLine());
    
    double volumenCono;
    volumenCono = (1.0 / 3.0) * Math.PI * (radioCono * radioCono) * alturaCono;
    
    System.out.printf("Volumen del cono: %.2f %s ", volumenCono, "cm^3");
  }
}
