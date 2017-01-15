/* Le da la vuelta a un número
 * @param x número al que se le quiere dar la vuelta
 * @return  número volteado (al revés)
 */

package funcionesMatematicas;

public class f06voltea {
  
  public static long voltea(long x) {
    
    if (x < 0) {
      return -voltea(-x);
    }
    
    long numAlreves = 0;
    
    long aux = x;
    
    do {
      numAlreves *= 10;
      
      int resto = (int)(aux % 10);
      
      numAlreves += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    
    return numAlreves;
      
  }
}
