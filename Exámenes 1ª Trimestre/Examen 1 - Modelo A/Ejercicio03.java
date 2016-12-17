/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15 de Noviembre de 2016
 * Modelo A
 */

public class Ex25jmmh3 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará una escalera con asteriscos que irá descendiendo de izquierda a derecha");
    System.out.println("------------------------------------------------------------------------------");
    
    System.out.print("Introduzca el número de escalones: ");
    int nEscalones = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalon = Integer.parseInt(System.console().readLine());
    
    int contadorAlturaEscalon = 0; //Cuenta a que altura estamos en cada escalón
    int contadorEscalon = 0; //Cuenta en qué Escalón estamos
    
    int anchura = 4; //La anchura del primer escalón es 4
  
    //Este bucle se repetirá hasta que el contador de escalones llegue al numero de escalones 
    //que hemos introducido anteriormente, cuando esto se cumpla, se terminará de pintar la escalera
    while (contadorEscalon < nEscalones) { 
      
    //Este bucle se repetirá hasta que el contador de altura por escalon valga igual que la altura introducida 
    //anteriormente, cuando esto se cumpla, se irá al siguiente escalón
    while (contadorAlturaEscalon < alturaEscalon) { 
      
    for (int contadorAnchura = anchura; contadorAnchura > 0; contadorAnchura--) {  //Pinta la anchura del escalón
      System.out.print("*");
    }
      System.out.println();
      contadorAlturaEscalon++;
  }
    contadorEscalon++;
    contadorAlturaEscalon = 0; //Ponemos el contador de altura por escalón a 0 (ya que el programa irá al siguiente escalón)
    anchura += 4; //Aumenta la anchura + 4 ya que cada escalón debe ser más ancho que el anterior
  }
      
  }
}
