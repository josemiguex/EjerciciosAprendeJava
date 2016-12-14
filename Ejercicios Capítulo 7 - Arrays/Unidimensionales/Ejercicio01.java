/* Ejercicio 1 - Capítulo 7
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio01 {
  public static void main (String[] args)
    throws InterruptedException {
    int[] num = new int[12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[8] = 5;
    num[9] = 120;
    
    System.out.println("Tabla con un array de 12 números enteros");
    //Parte de arriba de la tabla
    
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int contador = 0; contador < 12; contador++) {
      System.out.printf("│%5d", contador);
      Thread.sleep(100);
    }
    System.out.println("│");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
    System.out.print("│ Valor  ");

    for (int i = 0; i < 12; i++) {
      System.out.printf("│%5d", num[i]);
      Thread.sleep(100);
    }
    System.out.println("│");
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.print("Si no inicializas el valor en el array automáticamente se le asignará el valor 0");
    
    
  }
}
