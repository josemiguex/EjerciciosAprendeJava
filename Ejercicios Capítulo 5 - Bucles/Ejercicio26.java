/* Ejercicio 26 - Capítulo 5
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio26 {
  public static void main (String[] args) {
    
    System.out.println("En este programa debes introducir un número por pantalla y luego un dígito y el programa dirá contando de izquierda a derecha a qué posición pertenece");
    System.out.println("---------------------------------------------------------------------");
    
    System.out.print("Escribe un número(n): ");
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe un dígito(d): ");
    int d = Integer.parseInt(System.console().readLine());
    
    int almacenaNumero = n;
    
    int numeroAlReves = 0;
    
    while (n > 0) { //Primero ponemos el número al revés
      
    numeroAlReves *= 10;
    
    numeroAlReves += n % 10;
    
    n = n / 10;
    
    }
    
    int digito = 0;
    int contadorPosicion = 1;
    
  while (numeroAlReves > 0) {
    digito = numeroAlReves % 10;
    
    numeroAlReves /= 10;
    
    if (digito == d) {
      System.out.println("El dígito está en la posición: " + contadorPosicion);
    } 
    contadorPosicion++;
  }
   
  }
}
