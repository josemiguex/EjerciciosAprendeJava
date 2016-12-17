/* Ejercicio 34 - Capítulo 5
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo
 * dígito del segundo número, tercer dígito del primer número... Para facilitar
 * el ejercicio, podemos suponer que el usuario introducirá dos números de la
 * misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
 * long en lugar de int donde sea necesario para admitir números largos.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio34 {
  public static void main (String[] args) {
    
    System.out.println("Descripción del programa:");
    System.out.println("En este programa debes introducir dos números por teclado y luego se mezclará en dos números");
    System.out.println("diferentes los dígitos pares y los impares. Se van comprobando");
    System.out.println("los dígitos de la siguiente manera: primer dígito del primer número, primer");
    System.out.println("dígito del segundo número, segundo dígito del primer número, segundo");
    System.out.println("dígito del segundo número, tercer dígito del primer número... Suponemos que introducirá dos números de la");
    System.out.println("misma longitud y que siempre habrá al menos un dígito par y uno impar.");
    System.out.println("-------------------------------------------------------------");
    
    System.out.print("Introduzca el primer número: ");
    long n1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    long n2 = Integer.parseInt(System.console().readLine());
    
    //Calculamos los dígitos de cada número
    
    long aux = n1;
    long aux2 = n2;
    
    int contadorDigitos1 = 0;
    int contadorDigitos2 = 0;
    
    while (n1 > 0) {
      n1 = n1 / 10;
      contadorDigitos1++;
    }
    
    while (n2 > 0) {
      n2 = n2 / 10;
      contadorDigitos2++;
    }
    
    n1 = aux;
    n2 = aux2;
    
    //Comprueba si el número de digitos es igual
    boolean mismoNumeroDigitos = true;
    if (contadorDigitos1 != contadorDigitos2) {
      mismoNumeroDigitos = false;
      System.out.print("Los dos números no tienen el mismo número de dígitos");
    }
    
    if (mismoNumeroDigitos) {
    //Ponemos los números al revés (para que vaya de izquierda a derecha)
    
    long numeroAlReves1 = 0;
    long numeroAlReves2 = 0;
    
    while (n1 > 0) {
      
    numeroAlReves1 *= 10;
    
    numeroAlReves1 += n1 % 10;
    
    n1 = n1 / 10;
    
    }
    
    while (n2 > 0) {
      
    numeroAlReves2 *= 10;
    
    numeroAlReves2 += n2 % 10;
    
    n2 = n2 / 10;
    
    }
    
  
    long numeroDigitosPares = 0;
    long numeroDigitosImpares = 0;
    long ultimoDigito = 0;
    
    while (numeroAlReves1 > 0) {
      
      if (numeroAlReves1 > 0) {
        
        ultimoDigito = numeroAlReves1 % 10;
        
        if (ultimoDigito % 2 == 0) {
          numeroDigitosPares *= 10;
          numeroDigitosPares += ultimoDigito;
        }
        
        if (ultimoDigito % 2 != 0) {
          numeroDigitosImpares *= 10;
          numeroDigitosImpares += ultimoDigito;
        }
        numeroAlReves1 = numeroAlReves1 / 10;
      }
    
    
    if (numeroAlReves2 > 0) {
        
        ultimoDigito = numeroAlReves2 % 10;
        
        if (ultimoDigito % 2 == 0) {
          numeroDigitosPares *= 10;
          numeroDigitosPares += ultimoDigito;
        }
        
        if (ultimoDigito % 2 != 0) {
          numeroDigitosImpares *= 10;
          numeroDigitosImpares += ultimoDigito;
        }
  
        numeroAlReves2 = numeroAlReves2 / 10;
      }
    
    }
  
    
    System.out.println("El número formado por los dígitos pares es: " + numeroDigitosPares);
    System.out.println("El número formado por los dígitos impares es: " + numeroDigitosImpares);
  }
        
  }
}
