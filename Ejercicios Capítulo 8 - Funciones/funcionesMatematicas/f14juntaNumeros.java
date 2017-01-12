/* Añade un dígito a un número por delante.
 * 
 */

package funcionesMatematicas;

public class f14juntaNumeros {
  
  public static int juntaNumeros(int x, int y) {
    //Contamos el número de dígitos del segundo número
    
    int aux = y;
    int contadorDigitos = 0;
    
    do {
      aux /= 10;
      contadorDigitos++;
    } while (aux > 0);
    
    //Multiplicamos el número por 10 tantas veces según los dígitos del segundo número
    
    do {
      x *= 10;
      contadorDigitos--;
    } while (contadorDigitos > 0);
    
    //Ahora sumamos el primer número por el segundo
    
    x += y;
    
    return x;
  }
}
