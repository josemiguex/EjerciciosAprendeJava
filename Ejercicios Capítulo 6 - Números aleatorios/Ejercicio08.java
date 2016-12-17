/* Ejercicio 8 - Capítulo 5
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio08 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará 3 apuestas de la quiniela en tres columnas");
    System.out.println("para los 14 partidos y el pleno al 15");
    System.out.println("Probabilidades: 1 = 1/2, x = 1/3 y 2 = 1/3");
    System.out.println("----------------------------------------");
    
    int contadorFila = 1;
    
    int contadorColumna = 1;
    
    while (contadorFila <= 15) {
      System.out.printf("%3d. |", contadorFila);
      
      while (contadorColumna <= 3) {
        int apuesta = (int)(Math.random() * 6);
        
        String resultado = "";
        
        switch (apuesta) {
          case 0:
          case 1:
          case 2:
            resultado = "1    ";
            break;
          case 3:
          case 4:
            resultado = "  X  ";
            break;
          case 5:
            resultado = "    2";
            break;
          default:
        }
        
        System.out.print(resultado);
        System.out.print("|");

        contadorColumna++;
      }
      contadorFila++;
      contadorColumna = 1;
      
      if (contadorFila == 15) {
        contadorColumna = 3;
      }

      System.out.println();
    }
      
  }
}
