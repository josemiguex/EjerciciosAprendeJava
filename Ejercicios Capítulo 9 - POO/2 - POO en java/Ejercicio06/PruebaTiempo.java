/* Ejercicio 6 - POO en java
 * Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s . Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s . Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 */

public class PruebaTiempo {
  public static void main (String[] args) {
    
    Tiempo tiempo1 = new Tiempo(0,30,40);
    
    System.out.println("Hora:");
    System.out.print(tiempo1 + "\n");
    
    System.out.println("Si le sumamos 35 minutos y 20 segundos");
    tiempo1.suma(0,35,20);
    
    System.out.print(tiempo1 + "\n");
    
    System.out.println("Si le restamos 1 hora 40 minutos y 20 segundos");
    tiempo1.resta(1,40,20);
    
    System.out.print(tiempo1 + "\n");

  }
}
