/* Ejercicio 10 - Capítulo 7-2
 * Realiza el juego de las tres en raya.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio10 {
  
  //Creamos unas variables que no cambiarán a lo largo del programa
  static final String jugador = "•";
  static final String maquina = "x";
  
  public static void main (String[] args) {
    
    System.out.println("Este programa simula el juego de las tres en raya");
    System.out.println("-------------------------------------------------");
    String[][] tablero = new String[3][3];
    
    int movimientos = 0;
    
    String nombreFila = "cba";
    String coordenadas;
    
    
    //Creamos las variables que indicarán las filas y las columnas
    int i;
    int j;
    
    //Creamos estas variables para comprobar si gana el jugador o la máquina
    boolean jugadorGana = false;
    boolean maquinaGana = false;
    
    //Creamos el tablero
    for(i = 0; i < 3; i++) {
      for(j = 0; j < 3; j++) {
        tablero[i][j] = " ";
      }
    }
      

    //Empieza el juego
    do {
      
      //Pintamos el tablero
      System.out.println("  -------------");
      for(i = 0; i < 3; i++) {
        System.out.print(nombreFila.charAt(i)+ " ");
        for(j = 0; j < 3; j++) {
          System.out.print("| " + tablero[i][j] + " ");
          }
        System.out.println("|");
        System.out.println("  -------------");
      }
      System.out.println("     1   2   3\n");
      
      //El programa pedirá por pantalla las coordenadas
      System.out.print("¿Dónde quiere situar la piedra?: ");
      coordenadas = System.console().readLine();
      int fila = nombreFila.indexOf(coordenadas.charAt(0));
      int columna = coordenadas.charAt(1) - 1 - 48;
      tablero[fila][columna] = jugador;
      movimientos++;
      
      //Comprobamos si gana el jugador
      jugadorGana = (
        (tablero[0][0] == jugador) && (tablero[0][1] == jugador) && (tablero[0][2] == jugador) ||
        (tablero[1][0] == jugador) && (tablero[1][1] == jugador) && (tablero[1][2] == jugador) ||
        (tablero[2][0] == jugador) && (tablero[2][1] == jugador) && (tablero[2][2] == jugador) ||
        (tablero[0][0] == jugador) && (tablero[1][0] == jugador) && (tablero[2][0] == jugador) ||
        (tablero[0][1] == jugador) && (tablero[1][1] == jugador) && (tablero[2][1] == jugador) ||
        (tablero[0][2] == jugador) && (tablero[1][2] == jugador) && (tablero[2][2] == jugador) ||
        (tablero[0][0] == jugador) && (tablero[1][1] == jugador) && (tablero[2][2] == jugador) ||
        (tablero[0][2] == jugador) && (tablero[1][1] == jugador) && (tablero[2][0] == jugador)
      );
      
      if (!jugadorGana && (movimientos < 9)) {
        //La máquina situa la piedra
        do {
          fila = (int)(Math.random() * 3);
          columna = (int)(Math.random() * 3);
        } while (!tablero[fila][columna].equals(" "));
        
        tablero[fila][columna] = maquina;
        movimientos++;
        
        //Se comprueba si gana la piedra
        maquinaGana = (
          (tablero[0][0] == maquina) && (tablero[0][1] == maquina) && (tablero[0][2] == maquina) ||
          (tablero[1][0] == maquina) && (tablero[1][1] == maquina) && (tablero[1][2] == maquina) ||
          (tablero[2][0] == maquina) && (tablero[2][1] == maquina) && (tablero[2][2] == maquina) ||
          (tablero[0][0] == maquina) && (tablero[1][0] == maquina) && (tablero[2][0] == maquina) ||
          (tablero[0][1] == maquina) && (tablero[1][1] == maquina) && (tablero[2][1] == maquina) ||
          (tablero[0][2] == maquina) && (tablero[1][2] == maquina) && (tablero[2][2] == maquina) ||
          (tablero[0][0] == maquina) && (tablero[1][1] == maquina) && (tablero[2][2] == maquina) ||
          (tablero[0][2] == maquina) && (tablero[1][1] == maquina) && (tablero[2][0] == maquina)
        );
      }  
      
    } while (!jugadorGana && !maquinaGana && (movimientos < 9));
    
    //Pintamos el tablero
    System.out.println("  -------------");
    for(i = 0; i < 3; i++) {
      System.out.print(nombreFila.charAt(i)+ " ");
      for(j = 0; j < 3; j++) {
        System.out.print("| " + tablero[i][j] + " ");
        }
      System.out.println("|");
      System.out.println("  -------------");
    }
    System.out.println("     1   2   3\n");
    
    if (jugadorGana) {
      System.out.println("¡Has ganado!");
    } else if (maquinaGana) {
      System.out.println("Lo siento, has perdido");
    } else {
      System.out.println("Empate.");
    }
  }
}
