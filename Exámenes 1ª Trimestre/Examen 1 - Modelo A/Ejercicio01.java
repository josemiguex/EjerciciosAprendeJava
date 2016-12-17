/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15 de Noviembre de 2016
 * Modelo A
 */

public class Ex25jmmh1 {
  public static void main (String[] args) {
    
    System.out.println("Este programa contará los números capicúa que haya introducido por teclado");
    System.out.println("El programa terminará cuando introduzca un número negativo");
    System.out.println("----------------------------------------------------------");
    
    long n;
    long aux;
    
    int contadorNumerosCapicua = 0;
    System.out.println("Por favor, vaya introduciendo los números uno a uno pulsando enter");
    do {
      n = Long.parseLong(System.console().readLine());
      
      //Ponemos el número al revés
      
      aux = n; //almacenamos el número en una variable (ya que se va a ir diviendo por 10 para obtener el número al revés)
      
      long numeroAlreves = 0;
      
    while (n > 0) {
      
    numeroAlreves *= 10;
    
    numeroAlreves += n % 10;
    
    n = n / 10;
    }
    
      if (aux == numeroAlreves && aux > 0) { //Si el numero almacenado y el invertido son iguales, el contador de numeros capicua se sumará una unidad
        contadorNumerosCapicua++;
      }
    
    } while (aux > 0);
    System.out.print("Has introducido " + contadorNumerosCapicua + " número/s capicúa");
  }
}
