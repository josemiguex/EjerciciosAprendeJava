/* Ejercicio 14 - Capítulo 7
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 */

public class Ejercicio14 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pedirá 8 palabras y las almacenará en un array");
    System.out.println("A continuación, las palabras correspondientes a colores se deben almacenar al");
    System.out.println("comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays");
    System.out.println("auxiliares como quieras. Los colores que conoce el programa deben estar en");
    System.out.println("otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,");
    System.out.println("blanco y morado");
    System.out.println("-----------------------------------------------");
    
    boolean esUnColor = false;
    String[] colores = new String[9];
    
    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";
    
    System.out.println("Vaya introduciendo palabras una a una pulsando enter");
    String[] palabra = new String[8];
    
    for (int j = 0; j < 8; j++) {
      palabra[j] = System.console().readLine();
      
    }
    
    //Mostramos el array
    
    System.out.println("Array original");
    
    System.out.println("┌────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
    System.out.print("│ Índice ");
    
    for (int contador = 0; contador < 8; contador++) {
      System.out.printf("│%9s", contador);
    }
    
    System.out.println("│");
    System.out.println("├────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤");
    
    System.out.print("│ Valor  ");

    for (int i = 0; i < 8; i++) {
      System.out.printf("│%9s", palabra[i]);
    }
    
    System.out.println("│");
    System.out.println("└────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
    
    //Almacenamos el array en un auxiliar
    
    String[] aux = new String[8];
    
    for (int j = 0; j < 8; j++) {
      aux[j] = palabra[j];
    }
    
    //Modificamos el array para que muestre primero los colores y luego el resto
    
    int r = 0;
    for (int y = 0; y < 8; y++) {
      esUnColor = false;
      
      for (int t = 0; t < 9 && esUnColor == false; t++) {
        if (aux[y].equals(colores[t])) {
          esUnColor = true;
        } else {
          esUnColor = false;
        }
      }
    
      
      if (esUnColor) {
        palabra[r] = aux[y];
        r++;
      }
    }
    
    for (int y = 0; y < 8; y++) {
      esUnColor = false;
      
      for (int t = 0; t < 9 && esUnColor == false; t++) {
        if (aux[y].equals(colores[t])) {
          esUnColor = true;
        } else {
          esUnColor = false;
        }
      }
      
      if (esUnColor == false) {
        palabra[r] = aux[y];
        r++;
      }
    }
    
    
    //Mostramos el array modificado
    
    System.out.println("Array modificado");
    
    System.out.println("┌────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
    System.out.print("│ Índice ");
    
    for (int contador = 0; contador < 8; contador++) {
      System.out.printf("│%9s", contador);
    }
    
    System.out.println("│");
    System.out.println("├────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤");
    
    System.out.print("│ Valor  ");

    for (int i = 0; i < 8; i++) {
      System.out.printf("│%9s", palabra[i]);
    }
    
    System.out.println("│");
    System.out.println("└────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
      
  }
}
