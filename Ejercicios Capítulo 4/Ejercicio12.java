/* Ejercicio 12 - Capítulo 4
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio12 {
  public static void main (String[] args) {
    
    int nota;
    nota = 0;
    System.out.println("Test DAW");
    System.out.println("--------");
    System.out.println("Escribe 1, 2 o 3");
    System.out.println("1ª - ¿Qué se debe mostrar por pantalla en el primer programa que creas?");
    System.out.println("1) Buenas");
    System.out.println("2) Hola Mundo");
    System.out.println("3) ¿Qué tal?");
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Correcto, +1");
        nota++;
        break;
      case 3:
        System.out.print("Incorrecto");
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n2ª - ¿Que lenguaje define el formato de HTML?");
    System.out.println("1) XML");
    System.out.println("2) c++");
    System.out.println("3) SGML");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Correcto, +1");
        nota++;
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
    
    System.out.println("\n3ª - ¿En qué carpeta están guardados los archivos de configuración del sistema?");
    System.out.println("1) /etc");
    System.out.println("2) /usr/bin");
    System.out.println("3) /media");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Correcto, +1");
        nota++;
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Incorrecto");
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
    
    System.out.println("\n4ª - ¿Cuál fué la primera calculadora?");
    System.out.println("1) el UNIVAC");
    System.out.println("2) el ENIAC");
    System.out.println("3) el ábaco");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Correcto, +1");
        nota++;
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n5 - ¿Qué permite la realización del empleo?");
    System.out.println("1) el desarrollo personal");
    System.out.println("2) el poder satisfacer nuestras propias necesidades, y los de nuestra familia");
    System.out.println("3) las dos anteriores son correctas");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Correcto, +1");
        nota++;
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n6 - ¿Qué casilla se usa para mostrar en pantalla un número decimal?");
    System.out.println("1) %f");
    System.out.println("2) %s");
    System.out.println("3) %d");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Correcto, +1");
        nota++;
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Incorrecto");
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n7 - Comando usado para mostrar las primeras líneas de un archivo");
    System.out.println("1) tail");
    System.out.println("2) head");
    System.out.println("3) cat");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Correcto, +1");
        nota++;
        break;
      case 3:
        System.out.print("Incorrecto");
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n8 - ¿Cuál era la máxima velocidad del reloj del intel 4004?");
    System.out.println("1) 740hz");
    System.out.println("2) 200hz");
    System.out.println("3) 350hz");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Correcto, +1");
        nota++;
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Incorrecto");
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n9 - ¿Qué son las enfermedades agravadas?");
    System.out.println("1) Enfermedades surgidas a consecuencia de un accidente de trabajo");
    System.out.println("2) Enfermedades que no están en el Cuadro de Enfermedades pero que el juez lo reconoce como un A.T");
    System.out.println("3) Enfermedades que empeoran en la ejecución el trabajo");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Incorrecto");
        break;
      case 3:
        System.out.print("Correcto, +1");
        nota++;
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
    System.out.println("\n10 - ¿Qué es una concurrencia?");
    System.out.println("1) Datos procesados e interpretables.");
    System.out.println("2) Dos procesos que se ejecutan al mismo tiempo");
    System.out.println("3) Arreglo bidimensional de datos");
    opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.print("Incorrecto");
        break;
      case 2:
        System.out.print("Correcto, +1");
        nota++;
        break;
      case 3:
        System.out.print("Incorrecto");
      break;
      default:
        System.out.print("No has elegido ninguna de las 3 opciones");
      }
      
      System.out.print("\nResultado del test: " + nota);
      
  }
}
