/* Ejercicio 36 - Funciones
 * Hecho por Jose Miguel Martín Hidalgo
 */


public class Ejercicio36 {
  public static void main (String[] args) {
    
    int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    
    int[] soloPrimos = Otras.FiltraPrimos.filtraPrimos(array);
    
    for (int i = 0; i < soloPrimos.length; i++) {
      System.out.print(soloPrimos[i] + " ");
    }
    
  }
}
