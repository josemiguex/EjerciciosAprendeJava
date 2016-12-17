/* Ejercicio 24 - Capítulo 5
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio24 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pintará una pirámide de numeros dependiendo de los datos que introduzca");
    System.out.println("--------------------------------------------------------------------------");
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    int altura = alturaTotal;
    
    int contadorNumero = 1;
    while (altura > 0) {
      
      for (int espacios = (altura - 1); espacios > 0; espacios--) {
        System.out.print(" ");
      }
        
        
      for (int relleno = (alturaTotal - altura) + 1; contadorNumero < relleno; contadorNumero++) { //Relleno por la izquierda (los números van incrementando de 1 a n, dependiendo de la altura)  
        System.out.print(contadorNumero);
     }
     
     for (int relleno = (alturaTotal - altura) ; contadorNumero > 0; contadorNumero--) { //Relleno por la derecha (los números van disminuyendo hasta 1
        System.out.print(contadorNumero);
        
     }
     
    altura--;
    contadorNumero = 1;
    System.out.println();
    }
  }
}
