/* Ejercicio 16 - Capítulo 4
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
 * za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
 * del programa.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio16 {
  public static void main (String[] args) {
    
    int puntuacion;
    puntuacion = 0;
    System.out.println("Test de infidelidad (contesta verdadero o falso)");
    System.out.println("-------------------");
    System.out.println("Primera pregunta: ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
    String respuesta = System.console().readLine().toLowerCase();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Segunda pregunta: ¿Ha aumentado sus gastos de vestuario?");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Tercera pregunta: ¿Ha perdido el interés que mostraba anteriormente por ti?");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Cuarta pregunta: ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Quinta pregunta: ¿No te deja que mires la agenda de su teléfono móvil?");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Sexta pregunta: ¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Séptima pregunta: ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Octava pregunta: ¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Novena pregunta: ¿Has notado que últimamente se perfuma más");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    System.out.println("Decima pregunta: ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("verdadero")) {
      puntuacion++;
      puntuacion++;
      puntuacion++;
      
    } else if (respuesta.equals("falso")) {
    } else {
      System.out.println("No has puesto ni verdadero ni falso");
    }
    
    if (puntuacion <= 10) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (puntuacion > 10 && puntuacion <= 22) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if (puntuacion > 22 && puntuacion <= 30) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    
    
    
  }
}
