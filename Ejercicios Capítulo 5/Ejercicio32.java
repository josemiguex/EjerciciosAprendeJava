/* Ejercicio 32 - Capítulo 5
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 * suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio32 {
  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará los dígitos pares y los sumará a partir de un número introducido por teclado");
    System.out.println("----------------------------------------------------------------------");
    
    System.out.print("Introduce un número: ");
    long numero = Integer.parseInt(System.console().readLine());
    
    long numeroAlReves = 0;
    
    while (numero > 0) { //primero ponemos el número al revés
      
    numeroAlReves *= 10;
    
    numeroAlReves += numero % 10;
    
    numero = numero / 10;
    
    }
    
    long digitoPar = 0;
    
    long sumaDigitosPares = 0;
    while (numeroAlReves > 0) {
    
    digitoPar = numeroAlReves % 10;
        
    if ((digitoPar % 2) == 0) {
    System.out.print(digitoPar + " ");
    sumaDigitosPares += digitoPar;
  }
    numeroAlReves = numeroAlReves / 10;    
    }
    
    System.out.println();
    System.out.print("Suma de los digitos pares: " + sumaDigitosPares);
     
  }
}
