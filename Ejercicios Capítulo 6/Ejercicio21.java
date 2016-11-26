/* Ejercicio 21 - Capítulo 6
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio21 {
  public static void main (String[] args) {
    
    System.out.println("Este programa generará una secuencia de cinco monedas de 1 centimo hasta 2 euros");
    System.out.println("Las dos posiciones posibles son cara y cruz");
    System.out.println("-------------------------------------------------");
    
    int tiros = 5;
    
    int numMoneda;
    String moneda = "";
    
    int numOpcion;
    String opcion = "";
    
    while (tiros > 0) {
      numMoneda = (int)(Math.random() * 8);
      
      switch (numMoneda) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        }
        
        numOpcion = (int)(Math.random() * 2);
        
        switch (numOpcion) {
          case 0:
            opcion = "cara";
            break;
          case 1:
            opcion = "cruz";
            break;
          }
          
          System.out.println(moneda + " - " + opcion);
          tiros--;
        }

  }
}
