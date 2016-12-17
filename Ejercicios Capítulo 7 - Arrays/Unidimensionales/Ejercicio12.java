/* Ejercicio 12 - Capítulo 7
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de
 * la posición inicial en la posición final, rotando el resto de números para que no
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio12 {
  public static void main (String[] args) {
    
    System.out.println("Este programa hará un array a partir de 10 números que debes introducir por teclado");
    System.out.println("Luego debe introducir dos números que indicarán las dos posiciones a las que llamaremos inicial y final y luego se intercambiarán");
    System.out.println("Y rotará el resto de números para que no se pierda ninguno");
    System.out.println("------------------------------------------------------------------------");
    
    System.out.println("Escribe 10 números, uno a uno pulsando enter");
    
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
    
    
    
    //Ahora pedirá las posiciones del array que se quieren intercambiar
    
    System.out.println("Indica las 2 posiciones del array que se quieren intercambiar (entre 0 y 9)");
    System.out.print("Inicial: ");
    int pInicial = Integer.parseInt(System.console().readLine());
    
    System.out.print("Final: ");
    int pFinal = Integer.parseInt(System.console().readLine());
  
    int aux = num[9];
    
    int aux2 = num[pInicial];
  
    for (int numArray = 9; numArray > pFinal; numArray--) {
      num[numArray] = num[numArray - 1];

    }
    
    for (int numArray = pInicial; numArray > 0; numArray--) {
      num[numArray] = num[numArray - 1];

    }
    
    num[0] = aux;
    num[pFinal] = aux2;
    
    
    System.out.println("Array modificado");
    
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
    
    
  }
}
