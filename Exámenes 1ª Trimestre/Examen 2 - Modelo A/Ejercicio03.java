/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15-12-2016
 * Modelo A
 */

public class Ex25jmmh3 {
  public static void main (String[] args) {
  
    System.out.println("Este programa generará al azar las capturas que ha hecho un jugador durante la partida (de 0 a 15)");
    
    int numCapturasTotales = (int)(Math.random() * 16);
    
    int numCaptura = numCapturasTotales;
    
    //Primero hacemos un array de tipo String que nos muestre las piezas
    String[] pieza = new String[5];
    
    pieza[0] = "Dama";
    pieza[1] = "Torre";
    pieza[2] = "Alfil";
    pieza[3] = "Caballo";
    pieza[4] = "Peón";
    
    //Y en un array de tipo Integer el valor de cada pieza
    
    int[] valorPieza = new int[5];
    
    valorPieza[0] = 9;
    valorPieza[1] = 5;
    valorPieza[2] = 3;
    valorPieza[3] = 2;
    valorPieza[4] = 1;
    
    //Este array indica cuántas veces se puede capturar cada pieza
    int[] vecesCapturables = new int[5];
    
    vecesCapturables[0] = 1;
    vecesCapturables[1] = 2;
    vecesCapturables[2] = 2;
    vecesCapturables[3] = 2;
    vecesCapturables[4] = 8;
    
    int sumaPeones = 0;
    
    int numPieza;
    
    System.out.println("Fichas capturadas por el jugador:");
    System.out.println();
    
    boolean piezaCapturada;
    
    //Este bucle se repetirá mientras que la variable numCaptura sea mayor que 0
    do {
      piezaCapturada = false;
      //Generamos un valor de 0 a 4
      
      //Hacer esto mientras el número generado sea de una pieza cuyo número de veces capturables sea mayor que 0
      //Con esto evitamos por ejemplo que un peón se capture más de 8 veces
      do {
      numPieza = (int)(Math.random() * 5);
      
      if (vecesCapturables[numPieza] > 0) {
         piezaCapturada = true;
         vecesCapturables[numPieza]--;
       }
      
      } while (!piezaCapturada);
      System.out.println(pieza[numPieza] + "(" + valorPieza[numPieza] + " peones)");
      sumaPeones += valorPieza[numPieza];
      numCaptura--;

    } while (numCaptura > 0);
    
    //Mostramos los puntos totales
    System.out.println();
    System.out.println("Puntos totales: " + sumaPeones + " peones");
  } 
}
