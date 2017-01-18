/* Ejercicio 38 - Funciones
 * Hecho por Jose Miguel Martín Hidalgo
 */


public class Ejercicio38 {
  public static void main (String[] args) {
    
    int[] array = {121, 234, 2001, 2002, 876};
    
    int[] filtraCapicuas = Otras.FiltraCapicuas.filtraCapicuas(array);
    
    for (int i = 0; i < filtraCapicuas.length; i++) {
      System.out.print(filtraCapicuas[i] + " ");
    }
    
  }
}
