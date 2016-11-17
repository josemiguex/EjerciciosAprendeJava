/* Ejercicio 5 - Capitulo 6
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio05 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)");
    System.out.println("También mostrará el máximo, el mínimo, y la media de esos números");
    System.out.println("-----------------------------------------------------------------");
    
    
    int minimo = 199;
    int maximo = 100;
    
    int aux = 0;
    
    int suma = 0;
    
    for (int i = 0; i < 50; i++) {
      
      int n = (int)(Math.random()*100) + 100;
      
      System.out.print(n + " ");
      
      if (n < minimo) {
        minimo = n;
      }
      
      if (n > maximo) {
        maximo = n;
      }
      
      suma += n;
      
    }
    
    System.out.println();
    System.out.println("---------------------");
    System.out.println("Mínimo = " + minimo);
    System.out.println("Máximo = " + maximo);
    System.out.println("Media = "  + (suma / 50));
  }
}
