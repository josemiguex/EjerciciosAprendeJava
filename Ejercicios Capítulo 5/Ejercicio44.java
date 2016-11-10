/* Ejercicio 44 - Capítulo 5
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio44 {
  public static void main (String[] args) {
    
    System.out.println("Este programa insertará un dígito dentro de un número indicando la posición");
    System.out.println("El nuevo dígito se colocará en la posición indicada y el resto de digitos se desplazara");
    System.out.println("hacia la derecha");
    System.out.println("---------------------------------------------------------------------------------------");
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long n = Long.parseLong(System.console().readLine());
    
    System.out.print("Introduzca la posición donde quiere insertar: ");
    int posicion = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el dígito que quiere insertar: ");
    int digitoAinsertar = Integer.parseInt(System.console().readLine());
    
    //Ponemos el número al revés para que cuente de izquierda a derecha
    
    long numeroAlreves = 0;
    
    while (n > 0) {
      
    numeroAlreves *= 10;
    
    numeroAlreves += n % 10;
    
    n = n / 10;
    
    }
    //Contamos el número de dígitos del número
    
    long aux = numeroAlreves; //Almacenamos el número en una variable
    int contadorDigitos = 0;
    
    while (numeroAlreves > 0) {
    numeroAlreves = numeroAlreves / 10;
    contadorDigitos++;
    }
    
    numeroAlreves = aux; //Restauramos el número
    
    //Comprueba si la posición introducida es correcta
    
    ///////////////////
    boolean posicionCorrecta = false;
    
    if (posicion < contadorDigitos) {
      posicionCorrecta = true;
    }
    //////////////////
    
    int contadorPosicion = 0;
    int resto = 0;
    
    long n2 = 0;
    
    if (posicionCorrecta) {
    while (contadorPosicion < (posicion - 1)) { 
        n2 *= 10;
        resto = (int)(numeroAlreves % 10);
        n2 += resto;
        numeroAlreves /= 10;
        contadorPosicion++;
      }
    
    //Añadimos el dígito introducido
    n2 *= 10; 
    n2 += digitoAinsertar;
    
    while (contadorPosicion < contadorDigitos) {
        n2 *= 10;
        resto = (int)(numeroAlreves % 10);
        n2 += resto;
        numeroAlreves /= 10;
        contadorPosicion++;
      }
      
      System.out.print("El número resultante es: " + n2);
}

    if (posicionCorrecta == false) {
      System.out.print("La posición introducida es mayor que el número de dígitos del número");
    }
    
  }
}
