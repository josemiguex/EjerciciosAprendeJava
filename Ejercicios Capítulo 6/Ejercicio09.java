/* Ejercicio 9 - Capítulo 6
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio09 {
  public static void main (String[] args) {
    
    System.out.println("Este programa irá generando numeros aleatorios pares entre 0 y 100");
    System.out.println("Parará cuando saque el 24");
    System.out.println("------------------------------------");
    
    int contadorNumeros = 0;
    
    int n = 0;
    
    boolean es24 = false;
    
    while (es24 == false) {
      
      n = (int)(Math.random() * 101);
      
      if (n % 2 == 0) {
        System.out.print(n + " ");
        contadorNumeros++;
      }
      
      if (n == 24) {
        es24 = true;
      }
      

    }
    
    System.out.println();
    System.out.print("Números generados: " + contadorNumeros);
  }
}
