/* Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 * 
 * @param x número del que se quiere saber si es capicúa
 * @return  verdadero si el número que se pasa como parámetro es capicúa y
 *          falso en caso contrario
 */

package funcionesMatematicas;

public class f02esPrimo {
  
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
}
