/* Ejercicio 17 - Capítulo 6
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio17 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará una pecera con un pececito dentro.");
    System.out.println("Debe introducir la anchura y la altura");
    System.out.println("debe ser mayor o igual que 4");
    System.out.println("--------------------------------------------------------------");
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    String pececito = "&";
    
    int contadorAnchura = 0;
    
    int area = (anchura - 2) * (altura - 2);
    int posicionP = (int)(Math.random()* area + 1);
    
    int contadorPosicion = 1;
    
    while (contadorAnchura < anchura) {
      System.out.print("* ");
      contadorAnchura++;
    }
    System.out.println();
    //Pinto los dos palos verticales
    
    int contadorAltura = 0;
    
    while (contadorAltura < (altura - 2)) { //Pongo - 2 para que cuente el palo de arriba y el de abajo
      
      System.out.print("*");
      
      //Añado espacios
            
      for (int contadorEspacios = 0; contadorEspacios < (anchura - 2); contadorEspacios++) { //El número de espacios es igual a la anchura - 2
        
        if (posicionP == contadorPosicion) {
        System.out.print(pececito + " ");
      } else {
        System.out.print("  ");
      }
       
       contadorPosicion++; 
      }
      
      System.out.print(" *");

      System.out.println();
      contadorAltura++;
    }
    
     //Pinto el palo horizontal de abajo
    
    contadorAnchura = 0;
    
    while (contadorAnchura < anchura) {
      System.out.print("* ");
      contadorAnchura++;
    }
  }
}
