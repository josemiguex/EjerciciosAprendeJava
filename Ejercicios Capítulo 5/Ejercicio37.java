/* Ejercicio 37 - Capítulo 5
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio37 {
  public static void main(String[] args) {
    
    System.out.println("Este programá convertirá un número del sistema decimal al sistema de palotes");
    System.out.println("----------------------------------------------------------------------------");
    
    System.out.print("Introduzca un número: ");
    long n = Integer.parseInt(System.console().readLine());
    
    //Ponemos el número al reves para que el sistema de palotes vaya de izquierda a derecha
    
    long numeroAlreves = 0;
     while (n > 0) {
      
    numeroAlreves *= 10;
    
    numeroAlreves += n % 10;
    
    n = n / 10;
    }
    
    n = numeroAlreves;
    
    long contador = 0;
    long digito = 0;
    while (n > 0) {
    
      digito = n % 10;
      
      while (contador < digito) {
        System.out.print("|");
        contador++;
      }
      n = n / 10;
      contador = 0; //Reseteo el contador
      
      if (n > 0) { //Esto sirve para que no se muestre la barrita cuando sólo quede un dígito
      System.out.print("-");
    }
    }

  }
}
