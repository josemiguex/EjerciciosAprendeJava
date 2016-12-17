/* Nombre: Jose Miguel Martín Hidalgo
 * Fecha: 15 de Noviembre de 2016
 * Modelo A
 */

public class Ex25jmmh2 {
  public static void main (String[] args) {
    
    System.out.println("Este programa calculará el precio de un desayuno");
    System.out.println("El precio varía dependiendo de la comida que haya tomado");
    System.out.println("--------------------------------------------------------");
    
    System.out.print("¿Qué ha tomado de comer? palmera, donut o pitufo: ");
    String comida = System.console().readLine();
    
    boolean datosCorrectos = true; //comprueba si los datos introducidos son correctos
    double precioComida = 0;
    
    String tipoPitufo = "ninguno";
    
    //Tipo de comida
    switch (comida) {
      case "palmera":
        precioComida = 1.40;
        break;
      case "donut":
        precioComida = 1;
        break;
      case "pitufo":
        System.out.print("¿Con qué se ha tomado el pitufo? aceite o tortilla: ");
        tipoPitufo = System.console().readLine();
        
        switch (tipoPitufo) { //Tipo de pitufo
          case "aceite":
            precioComida = 1.20;
            break;
          case "tortilla":
            precioComida = 1.80;
            break;
          default:
            System.out.println("Dato introducido incorrecto");
            datosCorrectos = false;
            break;
          }
        break;
      default:
        System.out.println("Dato introducido incorrecto");
        datosCorrectos = false;
        break;
        
      
    }
      
      //Tipo de bebida
      System.out.print("¿Qué ha tomado de beber? zumo o cafe: ");
      String bebida = System.console().readLine();
      
      double precioBebida = 0;
      
      switch(bebida) {
        case "zumo":
          precioBebida = 1.50;
          break;
        case "cafe":
          precioBebida = 1.25;
          break;
        case "café":
          precioBebida = 1.25;
          break;
        default:
          System.out.println("Dato introducido incorrecto");
          datosCorrectos = false;
          break;
        }
        
          
      
      
      if (datosCorrectos) { //Sólo se puede calcular el precio si has introducido los datos correctos
        
        if (comida.equals("pitufo")) { //En el caso de que se haya elegido pitufo
          double sumaPrecio = precioComida + precioBebida;
          System.out.println("Pitufo con " + tipoPitufo + " = " + precioComida + "€");
          System.out.println(bebida + " = " + precioBebida + "€");
          System.out.println("Total desayuno = " + sumaPrecio + "€");
        }
        
        if (comida.equals("palmera") || comida.equals("donut")) { //En el caso de que se haya elegido palmera o donut
          double sumaPrecio = precioComida + precioBebida;
          System.out.println(comida +  " = " + precioComida + "€");
          System.out.println(bebida + " = " + precioBebida + "€");
          System.out.println("Total desayuno = " + sumaPrecio + "€");
        }
      }
        
  }
}
