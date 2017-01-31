/* Ejercicio 2 - POO en java
 * Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y
 * kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea
 * también algún método específico para cada una de las subclases.
 */

public class pruebaVehiculos {
  public static void main (String[] args) {
    int opcion = 0;
    int km = 0;
    String e;
    
    Bicicleta bici1 = new Bicicleta();
    Coche coche1 = new Coche();
    
    do {
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1: 
          System.out.print("¿Cuántos kilómetros quieres recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          bici1.andaBici(km);
          break;
        case 2:
          bici1.hacerElCaballito(1);
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quieres recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          coche1.andaCoche(km);
          break;
        case 4:
          coche1.quemaRueda(1);
          break;
        case 5:
          System.out.println("Has recorrido " + bici1.getKilometrosRecorridos() + "km con la bici");
          break;
        case 6:
          System.out.println("Has recorrido " + coche1.getKilometrosRecorridos() + "km con el coche");
          break;
        case 7:
          System.out.println("Has recorrido " + Vehiculo.getKilometrosTotales() + "km en total");
          break;
      }
      if (opcion < 8) {
        System.out.print("Pulsa enter para continuar");
        e = System.console().readLine();
      } 
    } while (opcion != 8);
    
    
  }
}
