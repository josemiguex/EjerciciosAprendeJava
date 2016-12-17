/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15-12-2016
 * Modelo A
 */

public class Ex25jmmh1 {
  public static void main (String[] args) {
    
    System.out.println("Escribe 10 números por teclado, uno a uno pulsando ENTER");
    System.out.println("A continuación, el programa dirá qué número");
    
    int i = 0;
    int[] num = new int[10];
    
    //Este array contará el número de veces que se repite cada número del array anterior
    int[] numRepetido = new int[10];
    
    int MasRepeticiones = 0;
    
    int numeroRepetido = 0;
    
    //Pide los 10 números por teclado y los introduce en el array
    do {
      num[i] = Integer.parseInt(System.console().readLine());
      i++;
    } while (i < 10);
    
    //Ahora este bucle mira los números uno a uno y cuenta cuantas veces se repite cada número del array anterior
    //Y los guarda en otro array (numRepetido)
    
    for (i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (num[i] == num[j]) {
        numRepetido[i]++;
      }
      }
    }
    
    //Este otro bucle mirará del bucle numRepetido cuál es el número más grande y lo guardará en una variable
    //El número más grande indicará la posición del array "num" del número con más repeticiones
    
    for (i = 0; i < 10; i++) {
      if (numRepetido[i] >= MasRepeticiones) {
        MasRepeticiones = i;
      }
    }
    
    System.out.println();
    
    //Ahora el programa mostrará el número del array que se repite más veces y las veces que se repite ese número
    System.out.println("El número que más se repite es el " + num[MasRepeticiones] + " y se repite " + numRepetido[MasRepeticiones] + " veces");
      
      
   }   
}
