package Otras;

/**
   * Esta función convierte los dígitos del número n en las correspondientes
   * palabras y lo devuelve todo en una cadena de caracteres. 
   * 
   * @param n       Número a pasar a palote
   * @return        Cadena de caracteres equivalente al número pasado como parámetro
   */
   
public class ConvierteEnPalabra {
  public static String convierteEnPalabra(int n) {
    String palabra = "";
     //Ponemos el número al reves para que se cuenten los dígitos vaya de izquierda a derecha
      
      int numeroAlreves = 0;
       while (n > 0) {
        
      numeroAlreves *= 10;
      
      numeroAlreves += n % 10;
      
      n = n / 10;
      }
      
      n = numeroAlreves;
      
      do {
        int resto = n % 10;
        
        switch (resto) {
          case 0:
            palabra += "cero";
            break;
          case 1:
            palabra += "uno";
            break;
          case 2:
            palabra += "dos";
            break;
          case 3:
            palabra += "tres";
            break;
          case 4:
            palabra += "cuatro";
            break;
          case 5:
            palabra += "cinco";
            break;
          case 6:
            palabra += "seis";
            break;
          case 7:
            palabra += "siete";
            break;
          case 8:
            palabra += "ocho";
            break;
          case 9:
            palabra += "nueve";
            break;
          }
          //para que no se muestre la coma al final
          if (n > 9) {
            palabra += ", ";
          }
          
          n /= 10;
      } while (n > 0);
      return palabra;
    }
  
}
