/* Ejercicio 40 - Capítulo 5
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio40 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará un rombo dependiendo de los datos que introduzca");
    System.out.println("La altura debe ser impar y mayor que 3");
    System.out.println("--------------------------------------------------------------------------");
    
    System.out.print("Introduzca la altura del rombo: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    int alturaParteArriba = 0;
    int saltoDeLinea = 0;
    
    int i = 0;
    int y = 0;
    
    boolean esImpar = true;
    boolean mayorQueTres = true;
    
      if (alturaTotal % 2 == 0) {
      System.out.println("El número introducido es par");
      esImpar = false;
    }
    
    if (alturaTotal < 3) {
      System.out.println("El número es menor que 3");
      mayorQueTres = false;
    }
    
    //Parte de arriba del rombo
    if (esImpar && mayorQueTres) {
    while (alturaParteArriba <= alturaTotal / 2) {
      
      for (int espaciosParteArriba = alturaTotal / 2 - i; espaciosParteArriba > 0; espaciosParteArriba--) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      for (int espaciosInternos = i + y; espaciosInternos > 0; espaciosInternos--) {
        System.out.print(" ");
      }
      
      if (alturaParteArriba >= 1) { //Sólo se mostrará este asterisco cuando la variable altura sea mayor o igual que uno para que no se muestre dos asteriscos en la primera línea
      System.out.print("*");
    }
      System.out.println();
      alturaParteArriba++;
      i++;
      
      if (i >= 2) {
      y++;
    }
    saltoDeLinea++;
      
    }    
    int alturaParteAbajo = 0;
    
    int x = i + y;
    i = 1;
    y = 0;
    
    
    while (alturaParteAbajo < (alturaTotal / 2)) {
      
      for (int espaciosParteAbajo = i; espaciosParteAbajo > 0; espaciosParteAbajo--) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      for (int espaciosParteAbajoInternos = x - 4 - y ; espaciosParteAbajoInternos > 0; espaciosParteAbajoInternos--) {
        System.out.print(" ");
      } 
      
      if (alturaParteAbajo < (alturaTotal / 2) - 1) {
      System.out.print("*");
    }
    
      System.out.println();
      i++;
      y += 2;
      alturaParteAbajo++;
      
      
    }
  }
    
    
  }
}
