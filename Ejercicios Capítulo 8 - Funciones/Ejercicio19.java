/* Ejercicio 19 - Funciones
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 */

public class Ejercicio19 {
  public static void main (String[] args) {
    
    System.out.println("Este programa convertirá un número a decimal, binario, hexadecimal o octal");
    System.out.println("----------------------------------------------------");
    
    System.out.println("¿Qué tipo de conversión quiere realizar?");
    System.out.println("1 - binario -> decimal");
    System.out.println("2 - binario -> octal");
    System.out.println("3 - binario -> hexadecimal");
    System.out.println("4 - decimal -> binario");
    System.out.println("5 - decimal -> octal");
    System.out.println("6 - decimal -> hexadecimal");
    System.out.println("7 - hexadecimal -> decimal");
    System.out.println("8 - hexadecimal -> octal");
    System.out.println("9 - hexadecimal -> binario");
    System.out.println("10 - octal -> binario");
    System.out.println("11 - octal -> decimal");
    System.out.println("12 - octal -> hexadecimal");
    
    int respuesta = Integer.parseInt(System.console().readLine());
    
    switch (respuesta) {
      case 1:
        System.out.print("Escriba un número: ");
        long b = Integer.parseInt(System.console().readLine());
        System.out.print("En decimal valdrá " + binarioAdecimal(b));
        break;
      case 2:
        System.out.print("Escriba un número: ");
        long b2 = Integer.parseInt(System.console().readLine());
        System.out.print("En octal valdrá " + Long.toString(binarioAOctal(b2)));
        break;
      case 3:
        System.out.print("Escriba un número: ");
        long b3 = Integer.parseInt(System.console().readLine());
        System.out.print("En hexadecimal valdrá " + binarioAHexadecimal(b3));
        break;
      case 4:
        System.out.print("Escriba un número: ");
        long d = Integer.parseInt(System.console().readLine());
        System.out.print("En binario valdrá " + decimalAbinario(d));
        break;
      case 5:
        System.out.print("Escriba un número: ");
        long d2 = Integer.parseInt(System.console().readLine());
        System.out.print("En octal valdrá " + Long.toString(binarioAOctal(decimalAbinario(d2))));
        break;
      case 6:
        System.out.print("Escriba un número: ");
        long d3 = Integer.parseInt(System.console().readLine());
        System.out.print("En octal valdrá " + binarioAHexadecimal(decimalAbinario(d3)));
        break;
      case 7:
        System.out.print("Escriba un número: ");
        String h = System.console().readLine();
        System.out.print("En decimal valdrá " + Long.toString(binarioAdecimal(hexadecimalABinario(h))));
        break;
      case 8:
        System.out.print("Escriba un número: ");
        String h2 = System.console().readLine();
        System.out.print("En octal valdrá " + Long.toString(binarioAOctal(hexadecimalABinario(h2))));
        break;
      case 9:
        System.out.print("Escriba un número: ");
        String h3 = System.console().readLine();
        System.out.print("En binario valdrá " + Long.toString(hexadecimalABinario(h3)));
        break;
      case 10:
        System.out.print("Escriba un número: ");
        String o = System.console().readLine();
        System.out.print("En binario valdrá " + Long.toString(octalABinario(o)));
        break;
      case 11:
        System.out.print("Escriba un número: ");
        String o2 = System.console().readLine();
        System.out.print("En decimal valdrá " + Long.toString(binarioADecimal(octalABinario(o2))));
        break;
      case 12:
        System.out.print("Escriba un número: ");
        String o3 = System.console().readLine();
        System.out.print("En hexadecimal valdrá " + binarioAHexadecimal(octalABinario(numeroIntroducido)));
        break;
      }
  }
  
  public static long decimalAbinario(long b) {
    
    int exp = 0;
    long binario = 0;
    
    do {
      
      int resto = (int)(b % 2);
      
      binario = (long)(binario + resto * Math.pow(10,exp));
      exp++;
      b /= 2;
      
    } while (b != 0);
    
    return binario;
  }
  
  public static long binarioAdecimal(long b) {
    
    int i = 1;
    
    int d = 0;
    
    do {
      int resto = (int)(b % 10);
      
      if (resto == 1) {
        d += i;
      }
      b /= 10;
      
      i *= 2;
    } while (b > 0);
    
    return d;
  }
  
  public static String binarioAHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
  
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioAdecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    };
      
    return hexadecimal;
  }
  
  public static long binarioAOctal(long binario) {
    long octal = 1;
  
    while (binario > 0) {
      octal = octal * 10 + (binarioAdecimal(binario % 1000));
      binario = binario / 1000;
    };
  
    octal = funcionesMatematicas.f11pegaPorDetras.pegaPorDetras(octal, 1);
    octal = funcionesMatematicas.f06voltea.voltea(octal);
    octal = funcionesMatematicas.f09quitaPorDetras.quitaPorDetras(octal, 1);
    octal = funcionesMatematicas.f10quitaPorDelante.quitaPorDelante(octal, 1);
    
    return octal;
  }
  
  public static long hexadecimalABinario(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
  
    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + decimalAbinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }

    return binario;
  }
  
  public static long octalABinario(long octal) {
    long binario = 0;
  
    for (int i = 0; i < funcionesMatematicas.f05digitos.digitos(octal); i++) {
      binario = binario * 1000 + decimalAbinario(funcionesMatematicas.f07digitoN.digitoN(octal, i));
    }
    
    return binario;
  }
  
  
}
