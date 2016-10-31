/* Ejercicio 19 - Capítulo 5
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio19 {
  public static void main (String[] args) {
    System.out.println("Este programa pintará una pirámide dependiendo de los datos que introduzca");
    System.out.println("--------------------------------------------------------------------------");
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    int altura = alturaTotal;
    
    int i = 0;
    
    System.out.print("¿Con qué caracter quieres rellenar la pirámide?: ");
    String relleno = System.console().readLine();
    
    while (altura > 0) {
      
      for (int espacios = (altura - 1); espacios > 0; espacios--) {
        System.out.print(" ");
        
     }
     
      for (int nRelleno = (alturaTotal - (altura - 1) + i); nRelleno > 0; nRelleno--) { 
        //La variable i la utilizo para que en cada iteración aumente el número de caracteres que se va a mostrar por pantalla
        
        System.out.print(relleno);
      }
      
    altura--;
    i++;
    System.out.println();
    }
  }
}
