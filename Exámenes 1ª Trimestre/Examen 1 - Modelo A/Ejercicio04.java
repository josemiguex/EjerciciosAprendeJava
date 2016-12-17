/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15 de Noviembre de 2016
 * Modelo A
 */

public class Ex25jmmh4 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pedirá un número y se mostrará por pantalla la versión complementaria (9 menos dígito)");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.print("Por favor, introduzca un número: ");
    long n = Long.parseLong(System.console().readLine());
    
    //Damos la vuelta al número (para que después vaya sacando los dígitos de izquierda a derecha
    
    long numeroAlreves = 0;
    
    while (n > 0) {
      
    numeroAlreves *= 10;
    
    numeroAlreves += n % 10;
    
    n = n / 10;
    
    }
    
    //Ya que tenemos el número al revés, sacamos cada digito de ese número y restamos 9 menos ese dígito
    
    int ultimoDigito = 0;
    
    long numeroComplementario = 0;
    
    while (numeroAlreves > 0) {
      ultimoDigito = (int)(numeroAlreves % 10);
      
      int digitoComplementario = 9 - ultimoDigito;
      
      numeroComplementario *= 10;
      numeroComplementario += digitoComplementario;
      numeroAlreves /= 10;
    }
    
    System.out.print("El complementario es el " + numeroComplementario);
    
  }
}
