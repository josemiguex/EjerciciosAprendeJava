/* Cuenta el número de dígitos de un número entero.
 * 
 * @param x número al que se le quieren contar los dígitos
 * @return  número de dígitos que tiene el número que se pasa como parámetro
 */

package funcionesMatematicas;

public class f05digitos {
  
  public static long digitos(long x, int c) {
    
    
    do {
      
      x /= 10;
      
      c++;
      
    } while (x > 0);
    
    return c;
  }
}
