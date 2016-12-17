/* Ejercicio 9 - Capítulo 7
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio09 {
  public static void main (String[] args) {
    
    System.out.println("Introduce 8 números, uno a uno pulsando enter, después se indicará para cada uno si es par o no");
    System.out.println("--------------------------------------------------");
    
    int[] numero = new int[8];
    
    for (int i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Ahora el programa indicará para cada número si es par e impar");
    for (int j = 0; j < 8; j++) {
      if (numero[j] % 2 == 0) {
        System.out.println(numero[j] + ": par");
      } else {
        System.out.println(numero[j] + ": impar");
      }
    }
  }
}
