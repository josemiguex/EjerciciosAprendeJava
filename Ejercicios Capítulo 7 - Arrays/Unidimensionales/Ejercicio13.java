/* Ejercicio 13 - Capítulo 7
 * Escribe un programa que rellene un array de 100 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio13 {
  public static void main (String[] args) {
    
    System.out.println("Este programa rellenará un array de 100 elementos con números enteros aleatorios");
    System.out.println("comprendidos entre 0 y 500. A continuación el programa mostrará el array y preguntará");
    System.out.println("si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el");
    System.out.println("array escribiendo el número destacado entre dobles asteriscos");
    System.out.println("--------------------------------------------------------------------");
    
    int min = 500;
    int max = 0;
    
    //Creo el array
    int[] num = new int[100];
    
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 501);
      
      if (num[i] < min) {
        min = num[i];
      }
      
      if (num[i] > max) {
        max = num[i];
      }
      
    }
    
    //Muestro el array
    
    for (int j = 0; j < 100; j++) {
      System.out.print(num[j] + " ");
    }
    
    System.out.println();
    System.out.println("¿Qué número/s quiere destacar? (pon el número)");
    System.out.println("1 - El mínimo");
    System.out.println("2 - El máximo");
    
    int answer = Integer.parseInt(System.console().readLine());
    
    switch (answer) {
      case 1:
        for (int u = 0; u < 100; u++) {
          if (num[u] == min) {
            System.out.print("**" + num[u] + "**" + " ");
          } else {
            System.out.print(num[u] + " ");
          }
        }
        break;
      case 2:
        for (int u = 0; u < 100; u++) {
          if (num[u] == max) {
            System.out.print("**" + num[u] + "**" + " ");
          } else {
            System.out.print(num[u] + " ");
          }
        }
        break;
      default:
        System.out.println("Opción inválida");
        break;
      }
  }
}
