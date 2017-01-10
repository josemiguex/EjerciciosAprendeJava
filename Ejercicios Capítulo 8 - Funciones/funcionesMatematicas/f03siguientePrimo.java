/* Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 */

package funcionesMatematicas;

public class f03siguientePrimo {
  
  public static int siguientePrimo(int x) {
    
    boolean esPrimo = true;
    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        esPrimo = false;
      }
    }
    
    
    if (esPrimo) {
      boolean siguientePrimo;
      
      do {
        x++;
        
        siguientePrimo = true;
        for (int i = 2; i < x; i++) {
          if (x % i == 0) {
            siguientePrimo = false;
          }
        }
        
      } while (siguientePrimo == false);
      
      return x;
    }
    
      return 0;
    
  }
}
