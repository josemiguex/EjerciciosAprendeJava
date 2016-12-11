/* Ejercicio 15 - Capítulo 7
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 * personas como máximo e intente de nuevo”. Para el grupo que llega,
 * se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
 * libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
 * grupo es de dos personas, se podrá colocar donde haya una o dos personas.
 * Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
 * vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 * Los grupos no se pueden romper aunque haya huecos sueltos suficientes
 * Hecho por Jose Miguel Martín Hidalgo
 */
  
public class Ejercicio15 {
  public static void main (String[] args) {
    
    //Creamos una lista de mesas al azar
    boolean mesaVacia = false;
    boolean mesaUsada = false;
    int[] mesa = new int[11];
    
    int i;
    for (i = 1; i < 11; i++) {
      mesa[i] = (int)(Math.random() * 5);
    }
    
    int respuesta = 0;
    do {
      
      System.out.println("┌──────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Mesa     ");
      
      for (i = 1; i < 11; i++) {
        System.out.printf("│%5d", i);
      }
      
      System.out.println("│");
      System.out.println("├──────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
      System.out.print("│ Ocupación");

      for (i = 1; i < 11; i++) {
        System.out.printf("│%5d", mesa[i]);
      }
      
      System.out.println("│");
      System.out.println("└──────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      respuesta = Integer.parseInt(System.console().readLine());
      
      if (respuesta <= 4) {
        mesaVacia = false;
        mesaUsada = false;
        for (i = 1; i < 11; i++) {
          if (mesa[i] == 0 && !mesaVacia) {
            mesaVacia = true;
            mesa[i] = respuesta;
            System.out.println("Por favor, siéntense en la mesa número " + i);
          }
        }
        
         if (!mesaVacia) {
            for (i = 1; i < 11; i++) {
            if (mesa[i] + respuesta <= 4 && !mesaUsada) {
              mesa[i] = mesa[i] + respuesta;
              System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + i);
              mesaUsada = true;
            }
          }
        }
        
        if (!mesaUsada && !mesaVacia) {
          System.out.println("Lo siento, en estos momentos no queda sitio.");
        }
      } else {
        System.out.println("Lo siento, no admitimos grupos de " + respuesta + ", haga grupos de 4 personas como máximo e intente de nuevo");
      }
      System.out.println();
    } while (respuesta != -1);
    
  }
}
