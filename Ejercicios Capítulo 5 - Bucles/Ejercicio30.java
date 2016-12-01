/* Ejercicio 30 - Capítulo 5
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio30 {
  public static void main (String[] args) {
    
    int horasTranscurridas = 0;
    
    System.out.println("Este programa calculará las horas transcurridas entre dos horas de dos días de la semana");
    System.out.println("----------------------------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca la primera hora.");
    System.out.print("Día: ");
    String diaSemana1 = System.console().readLine();
    
    int numeroSemana1 = 0;
    boolean diaSemanaCorrecto1 = true;
    
    switch(diaSemana1) {
      case "lunes":
        numeroSemana1 = 1;
        break;
      case "martes":
        numeroSemana1 = 2;
        break;
      case "miércoles":
        numeroSemana1 = 3;
        break;
      case "jueves":
        numeroSemana1 = 4;
        break;
      case "viernes":
        numeroSemana1 = 5;
        break;
      case "sabado":
        numeroSemana1 = 6;
        break;
      case "domingo":
        numeroSemana1 = 7;
        break;
      default:
        System.out.println("No es un día de la semana");
        diaSemanaCorrecto1 = false;
        break;
      }
      
      boolean horaCorrecta = true;
    System.out.print("Hora(1 - 24): ");
    int h1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Por favor, introduzca la segunda hora.");
     System.out.print("Día: ");
    String diaSemana2 = System.console().readLine().toLowerCase();
    
    int numeroSemana2 = 0;
    boolean diaSemanaCorrecto2 = true;
    
    switch(diaSemana2) {
      case "lunes":
        numeroSemana2 = 1;
        break;
      case "martes":
        numeroSemana2 = 2;
        break;
      case "miércoles":
        numeroSemana2 = 3;
        break;
      case "jueves":
        numeroSemana2 = 4;
        break;
      case "viernes":
        numeroSemana2 = 5;
        break;
      case "sabado":
        numeroSemana2 = 6;
        break;
      case "domingo":
        numeroSemana2 = 7;
        break;
      default:
        System.out.println("No es un día de la semana");
        diaSemanaCorrecto2 = false;
        break;
      }
      
      
      
    System.out.print("Hora(1 - 24): ");
    int h2 = Integer.parseInt(System.console().readLine());
    
    
    if (diaSemanaCorrecto1 == false || diaSemanaCorrecto2 == false) { //Avisa si los días introducidos son correctos
      System.out.println("Día de la semana incorrecto");
    }
    
    horasTranscurridas = (24 - h1);
    
    if (h1 < 0 || h1 > 24 || h2 < 0 || h2 > 24) { //Comprueba y avisa si has introducido horas válidad
      System.out.println("Has excedido el límite en las horas");
      horaCorrecta = false;
    }
    
    boolean comprobador1anteriorA2 = true;
    if (numeroSemana1 >= numeroSemana2) {
      System.out.println("El día 2 debe ser posterior al día 1"); //comprueba si el primer día de la semana es anterior al segundo introducido
      comprobador1anteriorA2 = false;
    }
    
 
 if (horaCorrecta && diaSemanaCorrecto1 && diaSemanaCorrecto2 && comprobador1anteriorA2) { //comprueba si los todos los comprobadores dan true
   
    while (numeroSemana1 <= numeroSemana2) {
      
      if (numeroSemana1 == numeroSemana2) {
        horasTranscurridas += h2;
        System.out.print("Entre las " + h1 + ":00h del " + diaSemana1 + " y las " + h2 + ":00h del " + diaSemana2 + " hay " + horasTranscurridas + "hora/s");
      }
      
      if (numeroSemana1 < (numeroSemana2 - 1)) {
      horasTranscurridas += 24;
    }
      numeroSemana1++;
    }
  }
  }
}
