/* Ejercicio 1 - Capítulo 6
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio01 {
  public static void main (String[] args) {
    
    System.out.println("En este programa se tirarán 3 dados y se mostrará la suma total");
    System.out.println("---------------------------------------------------------------");
    
    System.out.print("Pulsa enter para tirar el primer dado");
    String enter = System.console().readLine();
    
    int dado1 = (int)(Math.random()*6) + 1;
    
    System.out.println("Primer dado: " + dado1 + " punto/s");
    
    System.out.print("Pulsa enter para tirar el segundo dado");
    enter = System.console().readLine();
    
    int dado2 = (int)(Math.random()*6) + 1;
    
    System.out.println("Segundo dado: " + dado2 + " punto/s");
    
    System.out.print("Pulsa enter para tirar el tercer dado");
    enter = System.console().readLine();
    
    int dado3 = (int)(Math.random()*6) + 1;
    
    System.out.println("Tercer dado: " + dado3 + " punto/s");
    System.out.println("----------------------------------");
    System.out.print("Suma de los 3 dados: " + (dado1 + dado2 + dado3) + " puntos");
    
  }
}
