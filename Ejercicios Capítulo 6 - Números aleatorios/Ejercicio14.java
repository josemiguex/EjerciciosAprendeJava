/* Ejercicio 14 - Capítulo 6
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio14 {
  public static void main (String[] args) {
    
    System.out.println("Piensa en un número y yo intentaré adivinar en cuál estás pensando (entre 0 y 100)");
    System.out.println("----------------------------------------------------------------------------------");
    
    int numero = (int)(Math.random() * 101);
    int min = 0;
    int max = 100;
    
    boolean correcto = false;
    
    int oportunidades = 5;
    
    while (correcto == false && oportunidades > 0) {

    System.out.println("Numero de oportunidades: " + oportunidades);
    System.out.println("---------------------------");
    System.out.println("¿Estás pensando en el " + numero + "?");
    
    String respuesta = System.console().readLine();
    
    switch (respuesta) {
      case "si":
        System.out.println("Bien, lo he adivinado");
        correcto = true;
        break;
      case "no":
        System.out.println("¿Es menor o es mayor?");
        
        String respuesta2 = System.console().readLine();
        
          switch (respuesta2) {
            case "menor":
            max = numero;
              numero = (int)(Math.random() * ((max - 1) - min) + min + 1);
              break;
            case "mayor":
            min = numero;
              numero = (int)(Math.random() * ((max - 1) - min) + min + 1);
              break;
            }
        break;
      }
      oportunidades--;
      
      if (oportunidades == 0 && correcto == false) {
        System.out.println("No he conseguido adivinarlo :(");
      }
      System.out.println();
    }
        
      
  }
}
