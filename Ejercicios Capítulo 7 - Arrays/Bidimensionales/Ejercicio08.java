/* Ejercicio 8 - Capítulo 7 - 2
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
 * indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
 * 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
 * se indican del 1 al 8.
 * Hecho por Jose Miguel Martín Hidalgo
 */
 
 public class Ejercicio08 {
   
   // Definimos primero las variables constantes que serán el contenido de las celdas
   
  static final String reinicio = "\033[0m";
  static final String inverso = "\033[7m";
  static final String celdaBlanca = "  ";
  static final String celdaNegra = inverso + celdaBlanca + reinicio;
  static final String alfil = "♝ ";  
  static final String movimientoBlanco = "• ";
  static final String movimientoNegro = inverso + movimientoBlanco + reinicio;
   
   public static void main (String[] args) {
     
    System.out.println("Este programa nos dirá a qué posiciones podría saltar un array a partir de una posición inicial introducida por teclado");
    System.out.println("---------------------------------------------------------");
    
    String[][] tableroAjedrez = new String[9][9]; //Creamos el array "tablero"
    int i;
    int j;
    String casilla;

    // Con este bucle pintaremos el tablero de ajedrez vacío
    System.out.println("   a b c d e f g h");
    System.out.println();
    casilla = celdaBlanca;
    for(i = 8; i >= 1; i--) {
      System.out.print( i + "  ");
      for(j = 1; j <= 8; j++) {
        //Se decide el color de las celdas dependiendo de si la columna o fila es par o impar
        if ((i % 2) == 1) { 
          if ((j % 2) == 1) { 
            casilla = celdaBlanca;
          } else {
            casilla = celdaNegra;
          }
        } else { 
          if ((j % 2) == 1) { 
            casilla = celdaNegra;
          } else {
            casilla = celdaBlanca;
          }
        }
        System.out.print(casilla);
				tableroAjedrez[i][j] = casilla;
        

      }
      System.out.println("  " + i);      
    }
    System.out.println();
    System.out.println("   a b c d e f g h");
    
    // El programa pedirá por teclado las coordenadas
    System.out.print("\n¿Dónde quieres que se situe el alfil? (por ejemplo a1) ");
    
    //Situamos el alfil
    String posicionAlfil = System.console().readLine();
    int jAlfil = (int)(posicionAlfil.charAt(0)) - 96;
    int iAlfil = (int)(posicionAlfil.charAt(1)) - 48;
     
    if ((((iAlfil % 2) + (jAlfil % 2)) % 2) == 0) {
      tableroAjedrez[iAlfil][jAlfil] = alfil;
    } else {
      tableroAjedrez[iAlfil][jAlfil] = inverso + alfil + reinicio;
    }
    
    System.out.println("El alfil situado en la posición " + posicionAlfil + " se puede situar en las siguientes posiciones: ");
    
    System.out.println();
    System.out.println("   a b c d e f g h");
    System.out.println();
    
    // Volvemos a pintar el tablero pero con el alfil y las posiciones a las que puede saltar
    for(i = 8; i >= 1; i--) {
      System.out.print( i + "  ");
      for(j = 1; j <= 8; j++) {
        if (((iAlfil - i) == (jAlfil - j)) && (! ((iAlfil == i) && (jAlfil == j)))) {
          if (tableroAjedrez[i][j] == celdaBlanca) {
            tableroAjedrez[i][j] = movimientoBlanco;
          } else {
            tableroAjedrez[i][j] = movimientoNegro;
          }
        }
        System.out.print(tableroAjedrez[i][j]);
      }
      System.out.println("  " + i);  
    }
    
    System.out.println();
    System.out.println("   a b c d e f g h");
     
     
   }
 }
