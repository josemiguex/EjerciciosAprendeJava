/* Ejercicio 10 - Capítulo 6
 * Realiza un programa que pinte por pantalla diez líneas formadas por carac-
 * teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio10 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará por pantalla diez líneas formadas por caracteres");
    System.out.println("El caracter se elige de forma aleatoria entre *, -, =, ., |, @. ");
    System.out.println("La longitud de cada linea es entre 1 y 40 caracteres");
    System.out.println("----------------------------------------------------");
    
    System.out.println();
    
    int contadorLinea = 0;
    
    while (contadorLinea < 10) {
      
      int numCaracter = (int)(Math.random() * 6);
      
      String caracter = "";
      
      switch (numCaracter) {
        case 0:
          caracter = "*";
          break;
        case 1:
          caracter = "-";
          break;
        case 2:
          caracter = "=";
          break;
        case 3:
          caracter = ".";
          break;
        case 4:
          caracter = "|";
          break;
        case 5:
          caracter = "@";
          break;
        default:
      }
      
      int longitud = (int)(Math.random() * 41);
      
      while (longitud > 0) {
        System.out.print(caracter);
        longitud--;
      }
      System.out.println();
      contadorLinea++;
    }
  }
}
