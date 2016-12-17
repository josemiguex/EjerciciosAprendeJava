/* Ejercicio 16 - Capítulo 7
 * Escribe un programa que rellene un array de 20 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio16 {
  public static void main(String[] args) {
    
    int[] num = new int[20];
    
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 401);
      System.out.print(num[i] + " ");
    }
    
    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7):");
    int respuesta = Integer.parseInt(System.console().readLine());
    
    if (respuesta == 1) {
      
      for (int j = 0; j < 20; j++) {
        if (num[j] % 5 == 0) {
         System.out.print("[" + num[j] + "]" + " ");
        } else {
         System.out.print(num[j] + " ");
        }
      }
    } else if (respuesta == 2) {
      
      for (int j = 0; j < 20; j++) {
        if (num[j] % 7 == 0) {
         System.out.print("[" + num[j] + "]" + " ");
        } else {
         System.out.print(num[j] + " ");
        }
      }
    }
  
  }
}
