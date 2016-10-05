/*Ejercicio 4 - Capítulo 2
*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
*convertir deberá estar almacenada en una variable.
*Hecho por Jose Miguel Martín Hidalgo
*/

public class Ejercicio04 {
  public static void main (String[] args) {
  
  double precioEnEuros;
  
  precioEnEuros = 3;
  
  double diferenciaEurosPesetas = 166.39;
  
  double precioEnPesetas = (double)precioEnEuros*diferenciaEurosPesetas;
  
  System.out.println("Precio en euros: " + precioEnEuros + " €");
  System.out.println("Precio en pesetas: " + precioEnPesetas + " ESP");
  }
}