/* Ejercicio 22 - Capítulo 4
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
 * gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio23 {
  public static void main(String[] args) {
    
    System.out.println("Calculador del precio final de un producto");
    System.out.println("------------------------------------------");
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    double IVA;
    switch(tipoIVA) {
      case "general":
      IVA = 0.21;
      break;
      case "reducido":
      IVA = 0.10;
      break;
      case "superreducido":
      IVA = 0.04;
      break;
      default:
      System.out.println("Opción no válida");
      IVA = 2;
      break;
      }
      
      System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
      String codigoPromocional = System.console().readLine();
      
      double valorCodigo;
      
      switch(codigoPromocional) {
        case "nopro":
        valorCodigo = 1;
        break;
        case "mitad":
        valorCodigo = 0.50;
        break;
        case "meno5":
        valorCodigo =  -5;
        break;
        case "5porc":
        valorCodigo = 0.95;
        break;
        default:
        System.out.println("Opción no válida");
        valorCodigo = 2;
        break;
      }
      
      if (IVA == 2 || valorCodigo == 2) {
        System.out.print("Antes has elegido una opción no valida, por lo que no podemos calcular el valor del producto");
      } else {
      
      System.out.println("Base imponible: " + baseImponible);
      System.out.println("IVA (" + tipoIVA + "): " + baseImponible * IVA);
      System.out.println("Precio con IVA: " + (baseImponible + (baseImponible * IVA)));
    }
    
    double total;
      
      if (valorCodigo == -5) {
        System.out.println("Cód.promo (" + codigoPromocional + "): " + "-5");
        total = (baseImponible + (baseImponible * IVA)) - 5;
      } else if (valorCodigo == 1) {
        System.out.println("Cód.promo (" + codigoPromocional + "): " + "nada");
        total = (baseImponible + (baseImponible * IVA)) * valorCodigo;
      } else {
        System.out.println("Cód.promo (" + codigoPromocional + "): " + ((baseImponible + (baseImponible * IVA)) * valorCodigo));
        total = (baseImponible + (baseImponible * IVA)) * valorCodigo;
      }
      
      System.out.print("TOTAL: " + total);
      
  }
}
