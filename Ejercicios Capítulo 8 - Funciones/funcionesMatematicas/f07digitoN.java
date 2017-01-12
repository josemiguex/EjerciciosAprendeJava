/* Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @param x número entero
 * @param d posición dentro del número <code>x</code>
 * @return  dígito que está en la posición n del número <code>x</code>
 *          empezando a contar por el 0 y de izquierda a derecha
 */

package funcionesMatematicas;

public class f07digitoN {
  
  public static int digitoN(int x, int d, int c) {
    
    // Primero volteamos el número
    
    if (x < 0) {
      x = -digitoN(-x, 0, 0);
    }
    
    int numAlreves = 0;
    
    int aux = x;
    do {
      numAlreves *= 10;
      
      int resto = aux % 10;
      
      numAlreves += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    x = numAlreves;
    
    int contador = 0;
    do {
      
      c = numAlreves % 10;
      numAlreves /= 10;
      
      contador++; 
    } while (contador <= d);
    
    return c;
  }
}
