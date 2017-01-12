/* Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * @param x número entero
 * @param d dígito a buscar dentro del número
 * @return  posición de la primera ocurrencia del dígito dentro del número o
 *          -1 si no se encuentra
 */

package funcionesMatematicas;

public class f08posicionDeDigito {
  
  public static int posicionDeDigito(int x, int d, int contadorPosicionDigito) {
    
    // Primero volteamos el número
    
    if (x < 0) {
      x = -posicionDeDigito(-x, 0, 0);
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
    
    int c = 0;
    
    boolean digitoExiste = true;
    do {
      
      c = numAlreves % 10;
      numAlreves /= 10;
      
      contadorPosicionDigito++; 
      
      if (c == 0) {
        digitoExiste = false;
      }
      
    } while (c != d && digitoExiste);
    
    
      if (digitoExiste) {
        return contadorPosicionDigito;
      } else {
        return -1;
      }
      
      
  
  }
}
