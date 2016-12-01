/* Ejercicio 11 - Capítulo 6
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio11 {
  public static void main (String[] args) {
    
    System.out.println("Este programa generará 20 notas al azar y se indicará si es un suspenso, suficiente, bien, notable, o sobresalientes");
    System.out.println("Al final se dirán el número de cada tipo de nota");
    System.out.println("----------------------------------------------------");
    
    int contadorNotas = 1;
    
    int contadorSuspensos = 0;
    int contadorSuficientes = 0;
    int contadorBien = 0;
    int contadorNotables = 0;
    int contadorSobresalientes = 0;
    
    while (contadorNotas <= 20) {
      
      int nota = (int)(Math.random() * 11);
      
      System.out.print(nota + " = ");
      
      if (nota >= 0 && nota <= 4) {
        System.out.print("Suspenso");
        contadorSuspensos++;
      }
      
      if (nota == 5) {
        System.out.print("Suficiente");
        contadorSuficientes++;
      }
      
      if (nota == 6) {
        System.out.print("Bien");
        contadorBien++;
      }
      
      if (nota >= 7 && nota <= 9) {
        System.out.print("Notable");
        contadorNotables++;
      }
      
      if (nota == 10) {
        System.out.print("Sobresaliente");
        contadorSobresalientes++;
      }
      
      contadorNotas++;
      System.out.println();
    }
    
    System.out.println("Total:");
    System.out.println("Suspensos = " + contadorSuspensos);
    System.out.println("Suficientes = " + contadorSuficientes);
    System.out.println("Bien = " + contadorBien);
    System.out.println("Notables = " + contadorNotables);
    System.out.println("Sobresalientes = " + contadorSobresalientes);
      
      
      
  }
}
