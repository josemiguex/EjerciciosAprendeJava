/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15-12-2016
 * Modelo A
 */

public class Ex25jmmh4 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará pintará un sendero aleatorio");
    System.out.print("Introduzca la longitud del sendero en metros: ");
    int longitud = Integer.parseInt(System.console().readLine());
        
    int linea = longitud;
    String figura = "";
    
    int posicionSendero = 0;
    
    //Este bucle pintará el sendero
    do {
      
      //Este if generará una posición aleatoria entre 0 y 2 (los espacios antes que se muestre el sendero)
      if (linea == longitud) { //Hago esto para que genere una posición aleatoria en la primera linea
        posicionSendero = (int)(Math.random() * 3);
      } else { 
        //Y en la siguiente linea aumenta o disminuya el espacio una unidad o se mantenga igual
        //para que no parezca que el sendero esté cortado ya que si no pongo esto puede ser que en una linea haya 0 espacios y en la siguiente 2 (mediante la variable posicionSendero)
        int casos = 0; 
        
        switch (posicionSendero) {
          
          case 0:
          casos = (int)(Math.random() * 2);
          switch (casos) {
            case 0:
              posicionSendero++;
              break;
            case 1:
              break;
            }
          break;
        
          case 1:
          casos = (int)(Math.random() * 3);
          
          switch (casos) {
            case 0:
              posicionSendero++;
              break;
            case 1:
              break;
            case 2:
              posicionSendero--;
              break;
            }
            break;
          case 2:
          
          casos = (int)(Math.random() * 2);
          
          switch (casos) {
            case 0:
              break;
            case 1:
            posicionSendero--;
              break;
            }
          break;
        }
      }
      
      //Este bucle pintará los espacios antes de mostrar el sendero
      for (int i = posicionSendero; i >= 0; i--) {
        System.out.print(" ");
      }
      
      //Genera un número aleatorio entre 1 y 8 para que haya un 50% de probabilidades de que salga de 1 a 4 y un 50% del 5 al 8 y así pinte o no la Figura
      int pintaFigura = (int)(Math.random() * 8 + 1); 
      
      System.out.print("#");
      
      for (int espacios = 4; espacios > 0; espacios--) {
        if (espacios == pintaFigura) {
          int piedraOplanta = (int)(Math.random() * 2);
          
          switch (piedraOplanta) {
            case 0:
              System.out.print("*");
              break;
            case 1:
              System.out.print("o");
              break;
            }
          } else {
            System.out.print(" ");
          }
      }
      System.out.println("#");

      linea--;
    } while (linea > 0);

  } 
}
