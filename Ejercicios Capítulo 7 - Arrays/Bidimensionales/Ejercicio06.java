/* Ejercicio 6 - Capítulo 7-2
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.println("El mismo ejercicio que el anterior pero no se repetirá ningún número");
    
    //Creamos un array unidimensional que no repita los números
    
    int[] numero = new int[60]; //Array que se generará de forma aleatoria
    int aux = 0;   //Variable auxiliar
    int nuevo = 0; //Cuenta los números que no han aparecido
    int contA = 0; //Contador del bucle While
    
    while (contA < 60) {
      aux = (int)((Math.random()*60)+1);   
      nuevo = 0;                             
      for (int contB = 0;contB < 60;contB++){ 
        if (aux != numero[contB]){          
            nuevo ++;                        
          }
       }
       if (nuevo == 60){                    
         numero[contA] = aux;     
         contA++;           
       }
      }
     //Creamos un array bidimensional y pasamos los números de la variable unidimensional a la variable bidimensional
    int[][] array = new int[6][10];

    int i;
    int j;
    int y = 0;
    
    int max = 0;
    int min = 1000;
    int posicionMaximoFila = 0;
    int posicionMaximoColumna = 0;
    int posicionMinimoFila = 0;
    int posicionMinimoColumna = 0;
    int repeticiones = 0;

    for (i = 0; i < 6; i++) {
        
        for (j = 0; j < 10; j++) {
         array[i][j] = numero[y];
         y++;
         
         if (array[i][j] > max) {
            max = array[i][j];
            posicionMaximoFila = i;
            posicionMaximoColumna = j;
          }
          
          if (array[i][j] < min) {
            min = array[i][j];
            posicionMinimoFila = i;
            posicionMinimoColumna = j;
          }
            }
          
        }
      
      
    
    
    System.out.println("┌─────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
      System.out.println("│ Índice  │Columna0│Columna1│Columna2│Columna3│Columna4│Columna5│Columna6│Columna7│Columna8│Columna9│ ");
      
      
      for (i = 0; i < 6; i++) {
        System.out.println("├─────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

        System.out.print("│ Fila" + i + "   ");
        
        for (j = 0; j < 10; j++) {
          System.out.printf("│ %-7d", array[i][j]);
          }
        System.out.println("│");
      

      }

     
      System.out.println("└─────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    System.out.println("Posición del máximo: fila " + posicionMaximoFila + " columna " + posicionMaximoColumna);
    System.out.println("Posición del mínimo: fila " + posicionMinimoFila + " columna " + posicionMinimoColumna); 

  }
}
