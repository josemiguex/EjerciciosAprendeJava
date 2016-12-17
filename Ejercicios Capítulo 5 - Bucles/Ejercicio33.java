/* Ejercicio 33 - Capítulo 5
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio33 {
  public static void main(String[] args) {
    System.out.println("Este programa pintará una U por pantalla de asteriscos");
    System.out.println("Debe introducir la altura y el palo horizontal tendrá una longitud");
    System.out.println("de dos asteriscos menos insertando un espacio para simular la curvatura de las esquinas inferiores");
    System.out.println("------------------------------------------------------------------");
    
    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    int contadorEspacio = 1;
    
    while (contador < altura) {
      System.out.print("*");
      
      for (int espacio = (altura - 2); contadorEspacio <= espacio; contadorEspacio++) { //Calcula el espacio dependiendo de la altura
        System.out.print(" ");
      }
      
      System.out.print("*");
      System.out.println();
      
      contador++;
      contadorEspacio = 1;
    }
    
    System.out.print(" ");
    
    int contadorRellenoHr = 1;
    for (int rellenoHr = (altura - 2); contadorRellenoHr <= rellenoHr; contadorRellenoHr++) { //Calcula el relleno horizontal, teniendo en cuenta que es la altura - 2
      System.out.print("*");
    }
   
    
  }
}

