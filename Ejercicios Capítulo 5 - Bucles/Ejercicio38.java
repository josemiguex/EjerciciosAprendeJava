/* Ejercicio 38 - Capítulo 5
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 * error.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio38 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pintará un relog de arena, la altura debe ser");
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
    
    int relleno;
    if (alturaTotal % 2 == 0) {
      System.out.println("El número introducido es par");
      esImpar = false;
    }
    
    if (alturaTotal < 3) {
      System.out.println("El número es menor que 3");
      mayorQueTres = false;
    }
    
    if (esImpar && mayorQueTres) {
      
    //parte de arriba del relog de arena
    while (altura < (alturaTotal / 2)) {
      
      for (espacios = 0; espacios <= altura; espacios++) {
        System.out.print(" ");
        
     }
     
     for (relleno = (alturaTotal) - i  ; relleno > 0; relleno--) {
        System.out.print("*");
     }
     

     System.out.println();
     altura++;
     i += 2;
     contadorSaltoLinea++;
   }
   
   
   
   altura = (alturaTotal / 2);
   i = 0;
   
   //parte de abajo de la x
   
   i = 1;
   int r = 1;
   while (altura >= 0) {
      for (espacios = contadorSaltoLinea - i + 1; espacios >= 0; espacios--) {
        System.out.print(" ");
      }
      
      for (relleno = r; relleno > 0; relleno--) { //la variable r la utilizo para que en cada iteración aumente en + 2 el número de carácteres
        System.out.print("*");
  
        
        
      }
      
      System.out.println();
      altura--;
      i++;
      r += 2;
  }
}

  }
}

