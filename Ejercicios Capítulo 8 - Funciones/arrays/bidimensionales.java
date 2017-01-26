/* Funciones de arrays unidimensionales
 * Hecho por Jose Miguel Martín Hidalgo
 */

package arrays;

public class bidimensionales {
  
  /**
   * generaArrayBiInt
   * Genera un array de tamaño n x m con números
   * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * <p>
   * 
   * @param filas           número de filas que tendrá el array
   * @param columnas        número de columnas que tendrá el array
   * @param min             límite inferior del intervalo de números aleatorios
   * @param max             límite superior del intervalo de números aleatorios
   *                 
   */
   
   public static void generaArrayBiInt(int filas, int columnas, int min, int max) {
     int[][] arrayBi = new int[filas][columnas];
     
     //Crea el array
     for (int i = 0; i < filas; i++) {
       
       for (int j = 0; j < columnas; j++) {
         arrayBi[i][j] = (int)(Math.random() *(max - min) + min);
       }
     }
     
     //Muestra el array
     for (int i = 0; i < filas; i++) {
       
       for (int j = 0; j < columnas; j++) {
         System.out.print(arrayBi[i][j] + " ");
       }
       System.out.println();
     }
     
     
   }
   
   /**
   * filaDeArrayBiInt
   * Devuelve la fila i-ésima del array que se pasa como parámetro.
   * 
   * 
   * @param arrayBi         array a usar
   * @param fila            numero de la fila que se va a mostrar por pantalla
   *                 
   */
   
   public static void filaDeArrayBiInt(int[][] arrayBi, int fila) {
     
     //Muestra el array
     
     System.out.print("Fila " + fila + " del array: ");
     for (int j = 0; j < arrayBi.length; j++) {
       System.out.print(arrayBi[fila][j] + " ");
       
     }
     
     System.out.println();
   }
   
   /**
   * columnaDeArrayBiInt
   * Devuelve la columna j-ésima del array que se pasa como parámetro.
   * 
   * 
   * @param arrayBi            array a usar
   * @param columna            numero de la fila que se va a mostrar por pantalla
   *                 
   */
   
   public static void columnaDeArrayBiInt(int[][] arrayBi, int columna) {
     
     //Muestra el array
     
     System.out.print("Columna " + columna + " del array: ");
     for (int i = 0; i < arrayBi[0].length; i++) {
       System.out.print(arrayBi[i][columna] + " ");
       
     }
     
     System.out.println();
   }
   
   /**
   * coordenadasEnArrayBiInt
   * Devuelve la fila y la columna (en un array
   * con dos elementos) de la primera ocurrencia de un número dentro de un
   * array bidimensional. Si el número no se encuentra en el array, la función
   * devuelve el array {-1, -1}
   * 
   * @param arrayBi            array a usar
   * @param numero             número que debe de estar dentro del array
   *                 
   */
   
   public static void coordenadasEnArrayBiInt(int[][] arrayBi, int numero) {
     
     int[] coordenadas = new int[2];
     
     coordenadas[0] = -1;
     coordenadas[1] = -1;
           
     for (int i = 0; i < arrayBi.length; i++) {
       for (int j = 0; j < arrayBi[0].length; j++) {
         
         if (arrayBi[i][j] == numero) {
           coordenadas[0] = i;
           coordenadas[1] = j;
         }
       }
     }
     
     for (int i = 0; i < coordenadas.length; i++) {
       System.out.print(coordenadas[i] + " ");
     }
   }
   
   /**
   * esPuntoDeSilla
   * Dice si un número es o no punto de silla, es decir,
   * mínimo en su fila y máximo en su columna.
   * 
   * @param arrayBi            array a usar
   * @param numero             número que debe de estar dentro del array
   *                 
   */
   
   public static boolean esPuntoDeSilla(int[][] arrayBi, int numero) {
     
     //Primero miramos en qué fila y columna está el número
    int coordenadasi = 0;
    int coordenadasj = 0;
           
     for (int i = 0; i < arrayBi.length; i++) {
       for (int j = 0; j < arrayBi[0].length; j++) {
         
         if (arrayBi[i][j] == numero) {
           coordenadasi = i;
           coordenadasj = j;
         }
       }
     }
     
     //Ahora miramos si ese número es el mínimo en su fila y máximo en su columna
     
     int min = 9999999;
     int max = 0;
     
     for (int j = 0; j < arrayBi.length; j++) {
       if (arrayBi[coordenadasi][j] < min) {
         min = arrayBi[coordenadasi][j];
       }
     }
     
     for (int i = 0; i < arrayBi[0].length; i++) {
       if (arrayBi[i][coordenadasj] > max) {
         max = arrayBi[i][coordenadasj];
       }
     }
     
     if (min == numero && max == numero) {
       return true;
     } else {
       return false;
     }
     //return (minimoArrayInt(filaArrayIntBi(x),f) == x[f][c]) && (maximoArrayInt(columnaArrayIntBi(x,c)) == x[f][c]);
   }
   
   /**
   * diagonal
   * Devuelve un array que contiene una de las diagonales del
   * array bidimensional que se pasa como parámetro. Se pasan como
   * parámetros fila, columna y dirección. La fila y la columna determinan
   * el número que marcará las dos posibles diagonales dentro del array. La
   * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
   * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
   * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
   * que va del noreste hacia el suroeste.
   * 
   * 
   * @param arrayBi         array a usar
   * @param fila            numero de la fila 
   * @param columna         numero de la columna
   * @param direccion       Diagonal a usar (nose or neso)
   *                 
   */
   
   public static void diagonal(int[][] arrayBi, int fila, int columna, String direccion) {
    
      int elementos = 0, i, j;
      int[] diagonalAux = new int [1000];
      
      for (i = 0; i < arrayBi.length; i++) {
        for (j = 0; j < arrayBi[0].length; j++) {
          if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
            || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
            diagonalAux[elementos++] = arrayBi[i][j];
          }
        }
      }
              
      int[] diagonal = new int[elementos];
      for (j = 0; j < elementos; j++) {
        diagonal[j] = diagonalAux[j];
      }
        
       for (i = 0; i < diagonal.length; i++) {
         System.out.print(diagonal[i] + " ");
       }
     
   }
   
}
