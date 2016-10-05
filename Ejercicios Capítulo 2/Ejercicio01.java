/* Ejercicio 1 - Capítulo 2
*Escribe un programa en el que se declaren las variables enteras x e y . Asignales
*los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
*el valor de cada variable, la suma, la resta, la división y la multiplicación.
*Hecho por Jose Miguel Martín Hidalgo
*/

public class Ejercicio01 {
  public static void main (String[] args) {
  
  int x;
  int y;
  
  x = 144;
  y = 999;
  
  double division;
  
  division = (double)x/(double)y;
  
  System.out.println("x = " + x + " y = " + y);
  System.out.println("Suma = " + (x + y));
  System.out.println("Resta = " + (x - y));
  System.out.println("Multiplicación = " + (x * y));
  System.out.println("División = " + division);
  }
}   