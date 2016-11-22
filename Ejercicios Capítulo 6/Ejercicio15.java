/* Ejercicio 15 - Capítulo 6
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio15 {
  public static void main (String[] args) {
    
    System.out.println("Generador de notas al azar");
    System.out.println("--------------------------");
    
    int n = (int)(Math.random() * 7 + 1);
    int contadorNotas = (int)((Math.random() + (n * 4)));
    
    int notasTotales = contadorNotas;
    
    String primeraNota = "";
    
    int numeroNota = 0;
    
    String nota = "";
    while (contadorNotas > 0) {
      numeroNota = (int)(Math.random() * 7 + 1);
      
      switch (numeroNota) {
        case 1:
          nota = "do";
          break;
        case 2:
          nota = "re";
          break;
        case 3:
          nota = "mi";
          break;
        case 4:
          nota = "fa";
          break;
        case 5:
          nota = "sol";
          break;
        case 6:
          nota = "la";
          break;
        case 7:
          nota = "si";
          break;
        }
        
        if (contadorNotas == notasTotales) {
          primeraNota = nota;
        }
        
        if (contadorNotas > 1) {
          System.out.print(nota + " ");
        }
        
        if (contadorNotas == 1) {
          System.out.print(primeraNota + " |");
        }
         
          contadorNotas--;
          if (contadorNotas % 4 == 0) {
            System.out.print("| ");
          }
        }
      
      
    
  }
}
