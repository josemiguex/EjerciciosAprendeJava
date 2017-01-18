package arrays;
public class FiltraCapicuas {
  
  /**
   * Devuelve un array con todos los números capicúa que se encuentren en otro array
   * que se pasa como parámetro. Obviamente el tamaño del array que se
   * devuelve será menor o igual al que se pasa como parámetro
   * @param  x[]               array del que se quiere filtrar los capicuas
   * @return filtraCapicuasArray devuelve un array con sólo capicuas
   */
   
   
  public static int[] filtraCapicuas(int x[]) {
    
    int[] filtraCapicuasAux = new int[1000];
    
    
    int i;
    int j = 0;
    for (i = 0; i < x.length; i++) {
      
      //Volteamos el número y comprobamos si es igual al original
      
      int aux = x[i];
      
      int numAlReves = 0;
      
      do {
        numAlReves *= 10;
        
        int resto = aux % 10;
        
        numAlReves += resto;
        
        aux /= 10;
      } while (aux > 0);
      
      if (numAlReves == x[i]) {
        filtraCapicuasAux[j] = x[i];
        j++;
      }
      
    }
    int[] filtraCapicuasArray;
    
    if (j > 0) {
      
      filtraCapicuasArray = new int[j];
      for (i = 0; i < filtraCapicuasArray.length; i++) {
        filtraCapicuasArray[i] = filtraCapicuasAux[i];
      }
    } else {
      filtraCapicuasArray = new int[1];
      filtraCapicuasArray[0] = -1;
    }
    
    return (filtraCapicuasArray);
  }
}
