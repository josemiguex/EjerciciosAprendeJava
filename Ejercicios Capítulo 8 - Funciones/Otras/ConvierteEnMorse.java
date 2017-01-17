package Otras;

/**
   * Esta función convierte el número n al sistema Morse y lo devuelve en una
   * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
   * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
   * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
   * desde el programa principal.
   * 
   * @param n             número a pasar a morse
   * @return String       Cadena de caracteres en morse equivalente al número pasado como parámetro
   */
   
   
public class ConvierteEnMorse {
  public static String convierteEnMorse(int n) {
    
    String morse = "";
    
    int aux = n;
    
    
    //Volteamos el número
    
    int numAlReves = 0;
    
    do {
      numAlReves *= 10;
      
      int resto = aux % 10;
      
      numAlReves += resto;
      
      aux /= 10;
    } while (aux > 0);
    
    //Sacamos cada uno de los dígitos del número y a partir de ahí hacemos el morse
    
    do {
      int digito = numAlReves % 10;
      
      switch (digito) {
        case 1:
          morse += ". _ _ _ _ ";
          break;
        case 2:
          morse += ". . _ _ _ ";
          break;
        case 3:
          morse += ". . . _ _ ";
          break;
        case 4:
          morse += ". . . . _ ";
          break;
        case 5:
          morse += ". . . . . ";
          break;
        case 6:
          morse += "_ . . . . ";
          break;
        case 7:
          morse += "_ _ . . . ";
          break;
        case 8:
          morse += "_ _ _ . . ";
          break;
        case 9:
          morse += "_ _ _ _ . ";
          break;
        case 0:
          morse += "_ _ _ _ _ ";
          break;
        }
        numAlReves /= 10;
    } while (numAlReves > 0);
    
    return morse;
  }
}
