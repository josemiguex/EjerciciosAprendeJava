/* Le quita a un número n dígitos por detrás (por la
 * derecha).
 * 
 */

package funcionesMatematicas;

public class f09quitaPorDetras {
  
  public static long quitaPorDetras(long x, long d) {
    
    do {
      x /= 10;
      d--;
    } while (d > 0);
      
      return x;
  
  }
}
