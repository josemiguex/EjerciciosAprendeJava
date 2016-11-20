/* Ejercicio 7 - Capítulo 6
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio07 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará 3 apuestas de la quiniela en tres columnas");
    System.out.println("para los 14 partidos y el pleno al 15");
    System.out.println("----------------------------------------");
    
    int contadorFila = 1;
    
    int contadorColumna = 1;
    
    while (contadorFila <= 15) {
      System.out.printf("%3d. |", contadorFila);
      
      while (contadorColumna <= 3) {
        int apuesta = (int)(Math.random() * 3);
        
        String resultado = "";
        
        switch (apuesta) {
          case 0:
            resultado = "1    ";
            break;
          case 1:
            resultado = "  X  ";
            break;
          case 2:
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
