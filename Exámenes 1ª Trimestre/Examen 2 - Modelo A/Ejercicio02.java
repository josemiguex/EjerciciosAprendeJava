/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15-12-2016
 * Modelo A
 */

public class Ex25jmmh2 {
  public static void main (String[] args) {
    
    System.out.println("Este programa mostrará una secuencia de 10 números aleatorios múltiplos de 11");
    System.out.println("comprendidos entre 330 y 550 (ambos incluidos)");
    System.out.println();
    
    int i = 0; 
    int numero;
    
    //Este bucle no parará hasta que se generen 10 números múltiplos de 11
    do {
      numero = (int)(Math.random() * (551 - 330) + 330); //generamos números entre 330 y 550 (ambos incluidos)
      
      //Comprueba si ese número es múltiplo de 11
      if (numero % 11 == 0) { //Si se cumple, se mostrará el número y se sumará i una unidad
        System.out.print(numero + " ");
        i++;
      }
    } while (i < 10);
   } 
}
