/* Ejercicio 11 - Capítulo 7
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio11 {
  public static void main (String[] args) {
    
    System.out.println("Este programa hará un array a partir de 10 números que debes introducir por teclado");
    System.out.println("Luego desplazará los números primos a las primeras posiciones desplazando el resto y se mostrará el array resultante");
    System.out.println("------------------------------------------------------------------------");
    
    System.out.println("Escribe 10 números, uno a uno pulsando enter");
    
    boolean esPrimo;
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Array original");
    
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int contador = 0; contador < 10; contador++) {
      System.out.printf("│%5d", contador);
    }
    
    System.out.println("│");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
    System.out.print("│ Valor  ");

    for (int i = 0; i < 10; i++) {
      System.out.printf("│%5d", num[i]);
    }
    
    System.out.println("│");
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    //Almacenamos el array en un auxiliar
    
    int[] aux = new int[10];
    
    for (int y = 0; y < 10; y++) {
      aux[y] = num[y];
    }
    
    //Modificamos el array para que los primeros números sean los primos
    
    int i = 0;
    int resto;
    
    //Posicionamos primero los números primos
    for (int u = 0; u < 10; u++) {
      esPrimo = true;
      
      for (int divisor = 2; divisor < aux[u] && esPrimo == true; divisor++) {
        resto = aux[u] % divisor;
        if (resto == 0) {
          esPrimo = false;
        } else {
          esPrimo = true;
      }
      }
      
      if (esPrimo == true) {
        num[i] = aux[u];
        i++;
      }
      
    }
    
    //Y luego el resto
    for (int u = 0; u < 10; u++) {
      esPrimo = true;
      
      for (int divisor = 2; divisor < aux[u] && esPrimo == true; divisor++) {
        resto = aux[u] % divisor;
        if (resto == 0) {
          esPrimo = false;
        } else {
          esPrimo = true;
      }
      }
      
      if (esPrimo == false) {
        num[i] = aux[u];
        i++;
      }
  }
  
    
    //Mostramos el array modificado
    
     System.out.println("Array modificado");
    
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int contador = 0; contador < 10; contador++) {
      System.out.printf("│%5d", contador);
    }
    
    System.out.println("│");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
    System.out.print("│ Valor  ");

    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", num[i]);
    }
    
    System.out.println("│");
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    
    
  }
}
