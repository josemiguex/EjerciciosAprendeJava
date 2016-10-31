/* Ejercicio 21 - Capítulo 5
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio21 {
  public static void main (String[] args) {
    
    int numeroIntroducido = 0;
    int SumaImpares = 0;
    int mayor = 0;
    
    System.out.println("Este programa calculará la media de los impares y dirá cuál es el mayor de los pares de los números que vaya a introducir");
    System.out.println("-----------------------------------------");
    
    System.out.println("Vaya introduciendo los números uno a uno pulsando ENTER, el programa finalizará cuando introduzca un número negativo:");
    
    int contadorImpares = 0;
    int contadorTotal = 0;
    
    do {
      
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      
      if ((numeroIntroducido % 2) != 0 && numeroIntroducido >= 0) {
        SumaImpares += numeroIntroducido;
        contadorImpares++;
      }
      
      if (((numeroIntroducido % 2) == 0 && mayor < numeroIntroducido)) {
        mayor = numeroIntroducido;
       }
       if (numeroIntroducido >= 0) {
      contadorTotal++;
    }
  } while (numeroIntroducido >= 0);
  
  System.out.println("Números introducidos: " + contadorTotal);
  if (contadorImpares > 0) {
  System.out.println("Media de los impares: " + (SumaImpares / contadorImpares));
} else {
  System.out.println("No has introducido números impares");
}
  System.out.println("El mayor de los pares es: " + mayor);
 }
}
