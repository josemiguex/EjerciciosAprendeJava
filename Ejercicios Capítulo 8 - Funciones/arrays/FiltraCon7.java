package arrays;
public class FiltraCon7 {
  
  /**
   * Devuelve un array con todos los números que contienen el 7 (por ej. 7, 27, 782)
   * que se encuentren en otro array que se pasa como parámetro. El tamaño del array
   * que se devuelve será menor o igual al que se pasa como parámetro.
   * @param  x[]               array del que se quiere filtrar los 7
   * @return filtraCon7 devuelve un array con sólo números que contengan el 7
   */
   
   
  public static int[] filtraCon7(int x[]) {
    
    int[] filtraCon7Aux = new int[1000];
    
    
    int i;
    int j = 0;
    for (i = 0; i < x.length; i++) {
      
      
      boolean tieneEl7 = false;
      
      int aux = x[i];
      do {
        int resto = aux % 10;
        
        if (resto == 7) {
          tieneEl7 = true;
        }
        
        aux /= 10;
        
      } while (aux > 0 && !tieneEl7);
      
      if (tieneEl7) {
        filtraCon7Aux[j] = x[i];
        j++;
      }
    }
    
    int[] filtraCon7Array;
    
    if (j > 0) {
      
      filtraCon7Array = new int[j];
      for (i = 0; i < filtraCon7Array.length; i++) {
        filtraCon7Array[i] = filtraCon7Aux[i];
      }
    } else {
      filtraCon7Array = new int[1];
      filtraCon7Array[0] = -1;
    }
    
    return (filtraCon7Array);
  }
}
