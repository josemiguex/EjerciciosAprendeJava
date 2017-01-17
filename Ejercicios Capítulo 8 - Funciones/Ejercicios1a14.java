/* Empleo de las funciones que están en la carpeta "funcionesMatematicas"
 * Realizado por Jose Miguel Martín Hidalgo
 */

import funcionesMatematicas.f01esCapicua;
import funcionesMatematicas.f02esPrimo;
import funcionesMatematicas.f03siguientePrimo;
import funcionesMatematicas.f04potencia;
import funcionesMatematicas.f05digitos;
import funcionesMatematicas.f06voltea;
import funcionesMatematicas.f07digitoN;
import funcionesMatematicas.f08posicionDeDigito;
import funcionesMatematicas.f09quitaPorDetras;
import funcionesMatematicas.f10quitaPorDelante;
import funcionesMatematicas.f11pegaPorDetras;
import funcionesMatematicas.f12pegaPorDelante;
import funcionesMatematicas.f13trozoDeNumero;
import funcionesMatematicas.f14juntaNumeros;

public class Ejercicios1a14 {
  public static void main (String[] args) {
    
    // Es Capicua ////////////////////////////////
    
    if (funcionesMatematicas.f01esCapicua.esCapicua(26)) {
      System.out.println("El número 26 es capicúa");
    }
    
    if (funcionesMatematicas.f01esCapicua.esCapicua(454)) {
      System.out.println("El número 454 es capicúa");
    }
    
    // Es Primo //////////////////////////////////
    
    if (funcionesMatematicas.f02esPrimo.esPrimo(3)) {
      System.out.println("El número 3 es primo");
    }
    
    if (funcionesMatematicas.f02esPrimo.esPrimo(454)) {
      System.out.println("El número 454 es primo");
    }
    
    // siguientePrimo ////////////////////////////
    
    System.out.println("El siguiente primo mayor a 1 es " + funcionesMatematicas.f03siguientePrimo.siguientePrimo(1));
    System.out.println("El siguiente primo mayor a 9 es " + funcionesMatematicas.f03siguientePrimo.siguientePrimo(9));
    
    // potencia /////////////////////////////////
    
    System.out.println("2^10 = " + funcionesMatematicas.f04potencia.potencia(2, 10));
    System.out.println("5^(-3) = " + funcionesMatematicas.f04potencia.potencia(5, -3));
    System.out.println("10^6 = " + funcionesMatematicas.f04potencia.potencia(10, 6));
    
    // digitos //////////////////////////////////
    
    int contador = 0;
    
    System.out.println("El número 0 tiene " + funcionesMatematicas.f05digitos.digitos(0, contador) + " dígito/s.");
    
    contador = 0;

    System.out.println("El número 7 tiene " + funcionesMatematicas.f05digitos.digitos(7, contador) + " dígito/s.");
    
    contador = 0;
    
    System.out.println("El número 674893123 tiene " + funcionesMatematicas.f05digitos.digitos(674893123, contador) + " dígito/s.");
    
    // voltea ///////////////////////////////////
    
    System.out.println("El 5 volteado es " + funcionesMatematicas.f06voltea.voltea(5));
    System.out.println("El 398004321 volteado es " + funcionesMatematicas.f06voltea.voltea(398004321));
    System.out.println("El -75839 volteado es " + funcionesMatematicas.f06voltea.voltea(-75839));
    
    // digitoN /////////////////////////////////
    int d = 0;
    System.out.println("El dígito que está en la posición 3 del número 55545 es el " + funcionesMatematicas.f07digitoN.digitoN(55545,3,d));
    System.out.println("El dígito que está en la posición 5 del número 4353453 es el " + funcionesMatematicas.f07digitoN.digitoN(4353453,5,d));
    
    // posicionDeDigito ////////////////////////
    
    d = 0;
    System.out.println("El dígito 5 del número 4546 se encuentra en la posición " + funcionesMatematicas.f08posicionDeDigito.posicionDeDigito(4546,5,d));
    System.out.println("El dígito 4 del número 1234 se encuentra en la posición " + funcionesMatematicas.f08posicionDeDigito.posicionDeDigito(1234,4,d));
    
    // quitaPorDetras //////////////////////////
    
    System.out.println("Al número 5665 al quitarle 2 dígitos por detrás valdrá " + funcionesMatematicas.f09quitaPorDetras.quitaPorDetras(5665, 2));
    
    // quitaPorDelante /////////////////////////
    
    System.out.println("Al número 1234 al quitarle 2 dígitos por delante valdrá " + funcionesMatematicas.f10quitaPorDelante.quitaPorDelante(1234, 2));
    
    // pegaPorDetras ///////////////////////////
    
    System.out.println("Al número 232 al pegarle el dígito 4 por detrás valdrá " + funcionesMatematicas.f11pegaPorDetras.pegaPorDetras(232, 4));
    
    // pegaPorDelante //////////////////////////
    
    System.out.println("Al número 7895 al pegarle el dígito 3 por delante valdrá " + funcionesMatematicas.f12pegaPorDelante.pegaPorDelante(7895, 3));
    
    // trozoDeNumero ///////////////////////////
    
    System.out.println("Al número 123456 si lo recortamos de forma que la posición inicial es la 1 y la final es la 2 tendremos " + funcionesMatematicas.f13trozoDeNumero.trozoDeNumero(123456, 1, 2));
    
    // juntaNumeros ////////////////////////////
    
    System.out.println("Si juntamos el número 23 y el 32 tenemos el " + funcionesMatematicas.f14juntaNumeros.juntaNumeros(23, 32));
    
  }
}
