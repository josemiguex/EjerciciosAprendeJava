/* Devuelve verdadero si el número que se pasa como pará-
 * metro es capicúa y falso en caso contrario.
 */

package funcionesMatematicas;

public class f01esCapicua {
  
  public static boolean esCapicua(int x) {
    
    int numAlreves = 0;
    
    int aux = x;
    do {
      numAlreves *= 10;
      
      int resto = aux % 10;
      
      numAlreves += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    if (numAlreves == x) {
      return true;
    } else {
      return false;
    }
      
  }
}
