/* Ejercicio 18 - Capítulo 6
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio18 {
  public static void main (String[] args) {
    
    System.out.println("Este programa generará de forma aleatoria 3 colores, 1 para cada dormitorio");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("Nota: como en java no hay colo amarillo pongo el amarillo como naranja pero en vez de colorear la palabra colorea el fondo");
    int numeroHabitacion = 1;
    
    int numColor = 0;
    
    int aux = 7;
    int aux2 = 7;
    
    
    String color = "";
    while (numeroHabitacion <= 3) {
      
      numColor = (int)(Math.random() * 6);
    
    while (numColor == aux || numColor == aux2) {
      numColor = (int)(Math.random() * 6);
    }
      
      switch (numColor) {
        case 0:
          color = "\033[31m"; //rojo
          break;
        case 1:
          color = "\033[34m"; //azul
          break;
        case 2:
          color = "\033[32m"; //verde
          break;
        case 3:
          color = "\033[43m"; //amarillo
          break;
        case 4:
          color = "\033[35m"; //violeta
          break;
        case 5:
          color = "\033[33m"; //naranja
          break;
        }
        
        if (numeroHabitacion == 1) {
        aux = numColor;
      }
      
      if (numeroHabitacion == 2) {
        aux2 = numColor;
      }
        System.out.print("\033[40m" + " " + color + "Habitación" + numeroHabitacion + " |" + "\033[37m");
        numeroHabitacion++;
      }
      
      }
}
