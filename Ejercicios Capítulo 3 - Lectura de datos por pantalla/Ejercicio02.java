/* Ejercicio 2 - Capítulo 3
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio02 {
  public static void main (String[] args) {
    
    String linea1;
    
    System.out.print("Escribe una cantidad de dinero en euros: ");
    linea1 = System.console().readLine();
    int dineroEnEuros;
    dineroEnEuros = Integer.parseInt(linea1);
    
    double dineroEnPesetas;
    dineroEnPesetas = (double)dineroEnEuros * 166.386;
    
    System.out.print("En pesetas será: " + dineroEnPesetas + " ESP");
    

  }
}
