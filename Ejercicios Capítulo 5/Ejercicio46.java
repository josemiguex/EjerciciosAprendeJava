/* Ejercicio 46 - Capítulo 5
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio46 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará un rectángulo hueco hecho con asteriscos.");
    System.out.println("Debe introducir la anchura y la altura, la anchura y la altura");
    System.out.println("debe ser mayor o igual que 2");
    System.out.println("--------------------------------------------------------------");
    
    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    
    //Comprueba si la altura y la anchura es mayor que 2
    
    boolean alturaMayoroIgualque2 = false;
    boolean anchuraMayoroIgualque2 = false;
    
    if (anchura >= 2) {
      alturaMayoroIgualque2 = true;
    }
    
    if (altura >= 2) {
      anchuraMayoroIgualque2 = true;
    }

    if (alturaMayoroIgualque2 && anchuraMayoroIgualque2) {
    //Pinto el palo horizontal de arriba
    
    int contadorAnchura = 0;
    
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
        System.out.print("  ");
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
    
  if (alturaMayoroIgualque2 == false || anchuraMayoroIgualque2 == false) {
    System.out.print("La altura y la anchura introducida debe ser mayor o igual que 2");
  }
    
  }
}
