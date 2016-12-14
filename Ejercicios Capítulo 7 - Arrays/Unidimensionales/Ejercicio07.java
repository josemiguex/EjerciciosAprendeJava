/* Ejercicio 7 - Capítulo 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio07 {
  public static void main (String[] args) {
    
    System.out.println("Este programa generará 100 números aleatorios del 0 al 20");
    System.out.println("Luego pedirá por teclado 2 valores, y a continuación cambiará todas las");
    System.out.println("ocurencias del primer valor por el segundo en la lista generada anteriormente");
    System.out.println("Los números cambiados aparecerán entre comillas");
    
    System.out.println("-------------------------------------------------");
    
    int[] num = new int[100];
    
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    System.out.print("Numero a cambiar: ");
    int numeroAcambiar = Integer.parseInt(System.console().readLine());
    
    System.out.print("Numero por el que se quiere sustituir: ");
    int numeroSustituido = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    for (int i = 0; i < 100; i++) {
      
      if (num[i] != numeroAcambiar) {
        System.out.print(num[i] + " ");
      } else {
        num[i] = numeroSustituido;
        System.out.print("'" + num[i] + "' ");
      }
        
    } 
    
  }
}
