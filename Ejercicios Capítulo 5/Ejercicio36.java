/* Ejercicio 36 - Capítulo 5
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio36 {
  public static void main(String[] args) {
    
    System.out.println("Este programa dirá si un numero introducido es capicúa o no");
    System.out.println("-----------------------------------------------------------");
    
    System.out.print("Introduzca un número: ");
    long n = Integer.parseInt(System.console().readLine());
    
    
    //El programa mirará los digitos de derecha a izquierda y de izquierda a derecha, para que mire de izquierda a derecha 
    //el número tiene que estar al revés
    
    long numeroAlreves = 0;
    long aux = n; //Almacenamos el número para restaurarlo posteriormente
    while (n > 0) {
      
    numeroAlreves *= 10;
    
    numeroAlreves += n % 10;
    
    n = n / 10;
    }
    
    n = aux; 
    
    long ultimoDigito1 = 0;
    long ultimoDigito2 = 0;
    
    boolean esCapicua = true;
    while (n > 0 || numeroAlreves > 0) {
      
      //Mira el digito del número
      ultimoDigito1 = n % 10;
      n = n / 10;
      
      //Mira el dígito de ese mismo número pero al revés
      ultimoDigito2 = numeroAlreves % 10;
      numeroAlreves = numeroAlreves / 10;
      
      //El número será capicúa si coinciden los dígitos, si no, esCapicua = false
      if (ultimoDigito1 != ultimoDigito2) {
        esCapicua = false;
      }
    }
    
    if (esCapicua) {
      System.out.println("El número introducido es capicúa");
    } else {
      System.out.println("El número introducido no es capicúa");
    }
    
  }
}
