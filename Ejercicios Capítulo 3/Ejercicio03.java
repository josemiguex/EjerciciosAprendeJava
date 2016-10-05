/* Ejercicio 3 - Capítulo 3
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 *convertir debe ser introducida por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio03 {
  public static void main (String[] args) {
    
    String linea1;
    
    System.out.print("Escribe una cantidad de dinero en pesetas: ");
    linea1 = System.console().readLine();
    int dineroEnPesetas;
    dineroEnPesetas = Integer.parseInt(linea1);
    
    double dineroEnEuros;
    dineroEnEuros = (double)dineroEnPesetas / 166.386;
    
    System.out.printf("En euros será %.2f %s ", dineroEnEuros, "€");
    

  }
}
