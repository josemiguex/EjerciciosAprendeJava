/* Ejercicio 43 - Capítulo 5
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio43 {
  public static void main(String[] args) {
    
    System.out.println("Este programa partirá en 2 un número introducido por teclado");
    System.out.println("El número debe tener más de dos dígitos y la posición en la que se parte");
    System.out.println("está entre 2 y la longitud del número");
    System.out.println("------------------------------------------------------------------------");
    
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    int posicion = Integer.parseInt(System.console().readLine());
    
    //Ponemos el número al revés para que cuente de izquierda a derecha
    
    int numeroAlreves = 0;
    
    while (n > 0) {
      
    numeroAlreves *= 10;
    
    numeroAlreves += n % 10;
    
    n = n / 10;
    
    }
    //Contamos el número de dígitos del número
    
    int aux = numeroAlreves; //Almacenamos el número en una variable
    int contadorDigitos = 0;
    
    while (numeroAlreves > 0) {
    numeroAlreves = numeroAlreves / 10;
    contadorDigitos++;
    }
    
    numeroAlreves = aux; //Restauramos el número
    
    
    //Comprueba si la posición introducida es menor que el número de dígitos y mayor o igual que 2
    
    ///////////////////
    boolean posicionCorrecta = false;
    
    if (posicion >= 2 && posicion < contadorDigitos) {
      posicionCorrecta = true;
    }
    //////////////////
    
    int numeroParte1 = 0;
    int numeroParte2 = 0;
    int contadorPosicion = 0;
    int resto;
    
     if (posicionCorrecta) {
      while (contadorPosicion < (posicion - 1)) { //Parte 1 del número
        
        numeroParte1 *= 10;
        resto = numeroAlreves % 10;
        numeroParte1 += resto;
        numeroAlreves /= 10;
        contadorPosicion++;
      }
      
      while (contadorPosicion < contadorDigitos) { //Parte 2 del número
        
        numeroParte2 *= 10;
        resto = numeroAlreves % 10;
        numeroParte2 += resto;
        numeroAlreves /= 10;
        contadorPosicion++;
      }
      System.out.println("Los números partidos son el " + numeroParte1 + " y " + numeroParte2);
    }
    
    if (posicionCorrecta == false) {
      System.out.print("La posición introducida es menor que 2 o mayor que el número de dígitos del número");
    }
    
  }
}
