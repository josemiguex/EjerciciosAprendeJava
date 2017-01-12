/* Dada una base y un exponente devuelve la potencia.
 * 
 * @param base      base de la potencia
 * @param exponente exponente de la potencia
 * @return          número resultante de elevar la base a la potencia indicada
 */

package funcionesMatematicas;

public class f04potencia {
  
  public static double potencia(int x, int y) {
    
    int aux = x;
    
    
    if (y == 0) {
      return 1;
    }
    
    if (y > 0) {
      for (int i = 1; i < y; i++) {
        x *= aux;
      }
      return x;
    }
    
    if (y < 0) {
      return 1/potencia(x, -y);
    }
    
    return 0;
  }
}
