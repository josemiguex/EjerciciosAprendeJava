/* Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 * 
 * @param x número del que se quiere saber si es primo
 * @return  verdadero si el número que se pasa como parámetro es primo y falso
 *          en caso contrario
 */

package funcionesMatematicas;

public class f03siguientePrimo {
  
  public static int siguientePrimo(int x) {
    
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
}
