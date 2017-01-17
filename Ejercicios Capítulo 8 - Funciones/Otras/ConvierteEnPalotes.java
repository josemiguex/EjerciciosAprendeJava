package Otras;

/**
   * Esta función convierte el número n al sistema de palotes y lo devuelve en una
   * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
   * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
   * para comprobar que funciona bien. Desde la función no se debe mostrar nada
   * por pantalla, solo se debe usar print desde el programa principal.
   * 
   * @param n       Número a pasar a palotes
   * @return        Cadena de caracteres de palotes equivalente al número pasado como parámetro
   */
   
public class ConvierteEnPalotes {
  public static String convierteEnPalotes(int n) {
    
     //Ponemos el número al reves para que el sistema de palotes vaya de izquierda a derecha
      String palotes = "";
      int numeroAlreves = 0;
       while (n > 0) {
        
      numeroAlreves *= 10;
      
      numeroAlreves += n % 10;
      
      n = n / 10;
      }
      
      n = numeroAlreves;
      
      long contador = 0;
      long digito = 0;
      while (n > 0) {
      
        digito = n % 10;
        
        while (contador < digito) {
          palotes += "|";
          contador++;
        }
        n = n / 10;
        contador = 0; //Reseteo el contador
        
        if (n > 0) { //Esto sirve para que no se muestre la barrita cuando sólo quede un dígito
        palotes += "-";
      }
      }
      return palotes;
    }
  
}
