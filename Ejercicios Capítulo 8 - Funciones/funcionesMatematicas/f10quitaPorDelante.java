/* Le quita a un número n dígitos por detrás (por la
 * derecha).
 * 
 */

package funcionesMatematicas;

public class f10quitaPorDelante {
  
  public static int quitaPorDelante(int x, int d) {
    
    //Volteamos el número
    
    int numAlreves = 0;
    
    int aux = x;
    
    do {
      numAlreves *= 10;
      
      int resto = aux % 10;
      
      numAlreves += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    //Le quitamos los dígitos
    
    do {
      numAlreves /= 10;
      d--;
    } while (d > 0);
    
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
