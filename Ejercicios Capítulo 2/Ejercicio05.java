/*Ejercicio 5 - Capítulo 2
*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
*convertir deberá estar almacenada en una variable.
*Hecho por Jose Miguel Martín Hidalgo
*/

public class Ejercicio05 {
  public static void main (String[] args) {
  
  int precioEnPesetas = 200;
  double diferenciaPesetasEuros = 0.006010;
  double precioEnEuros = (double)precioEnPesetas*diferenciaPesetasEuros;
  
  System.out.println("Precio en pesetas: " + precioEnPesetas + " ESP");
  System.out.println("Precio en euros: " + precioEnEuros + " €");
  }
}