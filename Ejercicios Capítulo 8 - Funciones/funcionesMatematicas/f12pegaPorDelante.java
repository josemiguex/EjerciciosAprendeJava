/* Añade un dígito a un número por delante.
 * 
 */

package funcionesMatematicas;

public class f12pegaPorDelante {
  
  public static int pegaPorDelante(int x, int d) {
    
    //Volteamos el número
    
    int numAlreves = 0;
    
    int aux = x;
    
    do {
      numAlreves *= 10;
      
      int resto = aux % 10;
      
      numAlreves += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    //Le añadimos el dígito
    
    numAlreves *= 10;
    
    numAlreves += d;
    
    //Volvemos a voltear el número
    
    int numAlreves2 = 0;
    
    aux = numAlreves;
    
    do {
      numAlreves2 *= 10;
      
      int resto = aux % 10;
      
      numAlreves2 += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    x = numAlreves2;
    
    return x;
    
    
    
    
      
  
  }
}
