/* Ejercicio 22 - Capítulo 6
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio22 {
  public static void main (String[] args) {
    System.out.println("Este programa pintará una serpiente por pantalla");
    System.out.println("------------------------------------------------");
    
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    int contadorLongitud = longitud;
    
    String cabeza = "@";
    
    System.out.printf("%13s", cabeza);
    contadorLongitud--;
    
    System.out.println();
  
    int posicion = 0;
    
    String cuerpo = "";
    
    while (contadorLongitud > 0) {
      
      if (contadorLongitud == (longitud - 1)) {
        posicion = (int)(Math.random() * 3);
      } else {
        int casos = 0; //Dependiendo del valor de la variable posicion, se sumará o se restará la unidad o no se cambiará
        
        switch (posicion) {
          
          case 0:
          casos = (int)(Math.random() * 2);
          switch (casos) {
            case 0:
              posicion++;
              break;
            case 1:
              break;
            }
          break;
        
          case 1:
          casos = (int)(Math.random() * 3);
          
          switch (casos) {
            case 0:
              posicion++;
              break;
            case 1:
              break;
            case 2:
              posicion--;
              break;
            }
            break;
          case 2:
          
          casos = (int)(Math.random() * 2);
          
          switch (casos) {
            case 0:
              break;
            case 1:
            posicion--;
              break;
            }
          break;
        }
            
      
    }
      
  
      switch (posicion) {
      case 0:
        cuerpo = "*  ";
        break;
      case 1:
        cuerpo = " * ";
        break;
      case 2:
        cuerpo = "  *";
        break;
      }

      System.out.printf("%14s", cuerpo);
      System.out.println();
      contadorLongitud--;
    }
  }
}
