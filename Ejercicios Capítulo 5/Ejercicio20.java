/* Ejercicio 20 - Capítulo 5
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio20 {
  public static void main (String[] args) {
    System.out.println("Este programa pintará una pirámide huecadependiendo de los datos que introduzca");
    System.out.println("--------------------------------------------------------------------------");
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    int altura = alturaTotal;
    
    int i = 0;
    
    System.out.print("¿Con qué caracter quieres rellenar la pirámide?: ");
    String caracter = System.console().readLine();
    
    while (altura > 0) {
      
      for (int espacios = (altura - 1); espacios > 0; espacios--) {
        System.out.print(" ");
        
     }
     System.out.print(caracter);
      
      if (altura < alturaTotal && altura > 1) {
        
        for (int contadorEspacios = ((alturaTotal - (altura - 1) + i) - 2); contadorEspacios > 0; contadorEspacios--) {
          //La variable i la utilizo para que en cada iteración aumente el número de espacios que se va a mostrar por pantalla
          System.out.print(" ");
         
        }
        System.out.print(caracter);
      } else if (altura == 1) //Cuando la altura valga 1, esa linea se rellenará del caracter introducido, formando la base
      for (int contadorEspacios = ((alturaTotal - (altura - 1) + i) - 1); contadorEspacios > 0; contadorEspacios--) {
          System.out.print(caracter);
         
        }
      
      
      
    altura--;
    i++;
    System.out.println();
    }
  }
}
