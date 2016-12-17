/* Ejercicio 8 - Capítulo 7
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio08 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pedirá la temperatura media que ha hecho en cada mes de un determinado año");
    System.out.println("y a continuación se mostrará un diagrama de barras horizontales con esos datos");
    System.out.println("------------------------------------------------------------------------------");
    
    int[] tempMedia = new int[12];
    
    String[] mes = new String[12];
    
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] = "Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";
    
    for (int i = 0; i < 12; i++) {
      
      System.out.print(mes[i] + ": ");
      tempMedia[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    System.out.println("Ahora se mostrará el diagrama de barras:");
    System.out.println("----------------------------------------");
    
    for (int j = 0; j < 12; j++) {
      System.out.print(mes[j] + ":");
      
      for (int y = tempMedia[j]; y > 0; y--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
