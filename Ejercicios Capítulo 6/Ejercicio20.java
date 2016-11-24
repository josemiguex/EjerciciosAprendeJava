/* Ejercicio 20 - Capítulo 6
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio20 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará una cuba con cierta cantidad de agua.");
    System.out.println("Se llenará con una cantidad aleatoria que puede ir entre 0 y la capacidad máxima que pueda admitir");
    System.out.println("--------------------------------------------------------------");
    
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int altura = Integer.parseInt(System.console().readLine());

    int alturaP = (int)(Math.random() * (altura + 2)); //pongo mas 2 para que a veces supere la altura de la cuba y no pinte el agua
    //Pinto los dos palos verticales
    
    int contadorAltura = 1;
  
    while (contadorAltura <= altura) { 
      
      System.out.print("*");
      
      //Añado espacios
      
      if (contadorAltura < alturaP) {
      for (int contadorEspacios = 0; contadorEspacios < 4; contadorEspacios++) { //El número de espacios es igual a la anchura - 2
        
        System.out.print(" ");
       
      }
    }
    
    if (contadorAltura >= alturaP) {
      for (int contadorAgua = 0; contadorAgua < 4; contadorAgua++) { //El número de espacios es igual a la anchura - 2
        
        System.out.print("=");
       
      }
    }
      
      System.out.print("*");

      System.out.println();
      contadorAltura++;
    }
    
    
     //Pinto el palo horizontal de abajo
    System.out.print("******");
  }
}
