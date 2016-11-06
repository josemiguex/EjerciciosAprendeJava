/* Ejercicio 35 - Capítulo 5
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor
 * o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio35 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará una x hecha de asteriscos, la altura debe ser");
    System.out.println("un numero impar mayor o igual a 3");
    System.out.println("-------------------------------------------------------------------------------");
    
    System.out.print("Introduce la altura de la x: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    int altura = 0;
    int espacios;
    
    int i = 0;
    
    int contadorSaltoLinea = 0;
    
    //Comprueba si el número es impar y/o mayor o igual que 3

    boolean esImpar = true;
    boolean mayorQueTres = true;
    
    if (alturaTotal % 2 == 0) {
      System.out.println("El número introducido es par");
      esImpar = false;
    }
    
    if (alturaTotal < 3) {
      System.out.println("El número es menor que 3");
      mayorQueTres = false;
    }
    
    if (esImpar && mayorQueTres) {
    //parte de arriba de la x
    while (altura < (alturaTotal / 2)) {
      
      for (espacios = 0; espacios <= altura; espacios++) {
        System.out.print(" ");
        
     }
     
     System.out.print("*");
     
     for (int espaciosInternos = (alturaTotal - 2) - i  ; espaciosInternos > 0; espaciosInternos--) {
        System.out.print(" ");
     }
     
    System.out.print("*");

     System.out.println();
     altura++;
     i += 2;
     contadorSaltoLinea++;
   }
   
   
   
   altura = (alturaTotal / 2);
   i = 0;
   
   //parte de abajo de la x
   
   while (altura >= 0) {
      for (espacios = contadorSaltoLinea - i; espacios >= 0; espacios--) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      for (espacios = (((alturaTotal / 2) - (altura) + i) - 2); espacios >=0; espacios--) {
        System.out.print(" ");
        if (espacios == 0) {
          System.out.print("*");
        }
        
      }
      
    

     

      
      System.out.println();
      altura--;
      i++;
  }
}

  }
}
