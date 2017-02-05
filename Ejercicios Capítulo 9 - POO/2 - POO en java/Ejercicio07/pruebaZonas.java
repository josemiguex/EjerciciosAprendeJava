/* Ejercicio 7 - POO en java
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas dispo-
 * nibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.
 */

public class pruebaZonas {
  public static void main (String[] args) {
    
    int opcion = 0;
    int subOpcion = 0;
    
    int entradas = 0;
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    do {
      
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      if (opcion == 1) {
        
        System.out.println("Zona principal: " + principal.getEntradasPorVender());
        System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender());
        System.out.println("Zona vip: " + vip.getEntradasPorVender());
      } else if (opcion == 2) {
        
        System.out.println("¿Para qué zona quieres las entradas?");
        
        System.out.println("1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. vip");
        
        subOpcion = Integer.parseInt(System.console().readLine());
        
        System.out.println("¿Cuántas entradas quieres?");
        
        entradas = Integer.parseInt(System.console().readLine());
        
        switch (subOpcion) {
          case 1:
            principal.vender(entradas);
            break;
          case 2:
            compraVenta.vender(entradas);
            break;
          case 3:
            vip.vender(entradas);
            break;
          }
        
      }
    } while (opcion != 3);
    
  }
}
