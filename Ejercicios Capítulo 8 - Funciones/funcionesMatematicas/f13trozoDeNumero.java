/* Añade un dígito a un número por delante.
 * 
 */

package funcionesMatematicas;

public class f13trozoDeNumero {
  
  public static int trozoDeNumero(int x, int i, int f) {
    //Contamos el número de dígitos
    
    int aux = x;
    int contadorDigitos = 0;
    
    do {
      aux /= 10;
      contadorDigitos++;
    } while (aux > 0);
    
    //Primero volteamos el número
    int numAlreves = 0;
    
    aux = x;
    
    do {
      numAlreves *= 10;
      
      int resto = aux % 10;
      
      numAlreves += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    //Le quitamos los dígitos de la parte de delante
    
    for (int c = 0; c < i; c++) {
      numAlreves /= 10;
    }
    
    //Volvemos a voltear el números
    
    int numAlreves2 = 0;
    
    aux = numAlreves;
    
    do {
      numAlreves2 *= 10;
      
      int resto = aux % 10;
      
      numAlreves2 += resto;
      
      aux /= 10;
      
    } while (aux > 0);
    
    //Restamos el número de dígitos con la posición final
    
    int p = contadorDigitos - f;
    
    x = numAlreves2;
    
    //Le quitamos los dígitos de la parte de atrás
    
    for (int c = 1; c < p; c++) {
      x /= 10;
    }
    
    return x;
  }
}
