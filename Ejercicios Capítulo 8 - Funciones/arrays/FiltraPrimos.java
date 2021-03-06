package arrays;
public class FiltraPrimos {
  
  /**
   * Devuelve un array con todos los números primos que se encuentren
   * en otro array que se pasa como parámetro. Obviamente el tamaño del array
   * que se devuelve será menor o igual al que se pasa como
   * parámetro.
   * @param  x[]               array del que se quiere filtrar los primos
   * @return filtraPrimosArray devuelve un array con sólo primos
   */
   
   
  public static int[] filtraPrimos(int x[]) {
    
    int[] filtraPrimosAux = new int[1000];
    
    
    int i;
    int j = 0;
    for (i = 0; i < x.length; i++) {
      
      
      boolean esPrimo = true;
      
      for (int a = 2; a < x[i]; a++) {
        
        if ((x[i] % a) == 0) {
          esPrimo = false;
        }
      } 
      
      if (esPrimo) {
        filtraPrimosAux[j] = x[i];
        j++;
      }
      
    }
    
    int[] filtraPrimosArray;
    
    if (j > 0) {
      
      filtraPrimosArray = new int[j];
      for (i = 0; i < filtraPrimosArray.length; i++) {
        filtraPrimosArray[i] = filtraPrimosAux[i];
      }
    } else {
      filtraPrimosArray = new int[1];
      filtraPrimosArray[0] = -1;
    }
    
    return (filtraPrimosArray);
  }
}
