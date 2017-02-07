/* Ejercicio 4 - Arrays de objetos
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 */

public class ColeccionDeDiscosPrincipal {
  public static void main (String[] args) {
    
    int i = 0;
    int n;
    int m;
    System.out.println("Programa de colección de discos");
    
    //Creamos array
    Disco[] disc = new Disco[100];
    
    //Creamos los discos de dentro del array
    for (i = 0; i < 100; i++) {
      disc[i] = new Disco();
    }
    
    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;
     
    do {
      System.out.println("1. Listar discos");
      System.out.println("2. Añadir disco");
      System.out.println("3. Modificar disco");
      System.out.println("4. Borrar disco");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      if (opcion == 1) {
        clearScreen();
        System.out.println("Lista de discos:");
        for (i = 0; i < 100; i++) {
          
          if (!disc[i].isVacio()) {
            System.out.println("----------------------------");
            System.out.println("Disco " + i);
            System.out.print(disc[i]);
          }
        }
        
        System.out.print("Pulse enter para continuar");
        String e = System.console().readLine();
      } else if (opcion == 2) {
        
        i = 0;
        
        while (!disc[i].isVacio()) {
          i++;
        }
        System.out.println("Introduzca los datos del nuevo disco");
        System.out.print("Código: ");
        codigoIntroducido = System.console().readLine();
        disc[i].setCodigo(codigoIntroducido);
        
        System.out.print("Autor: ");
        autorIntroducido = System.console().readLine();
        disc[i].setAutor(autorIntroducido);
        
        System.out.print("Título: ");
        tituloIntroducido = System.console().readLine();
        disc[i].setTitulo(tituloIntroducido);
        
        System.out.print("Género: ");
        generoIntroducido = System.console().readLine();
        disc[i].setGenero(generoIntroducido);
        
        System.out.print("Duración: ");
        duracionIntroducida = Integer.parseInt(System.console().readLine());
        disc[i].setDuracion(duracionIntroducida);
        
        disc[i].setVacio(false);
        
        System.out.print("Disco añadido, pulsa enter para continuar");
        String e = System.console().readLine();
      } else if (opcion == 3) {
        
        for (i = 0; i < 100; i++) {
          
          if (!disc[i].isVacio()) {
            System.out.println("----------------------------");
            System.out.println("Disco " + i);
            System.out.print(disc[i]);
          }
        }
        
        System.out.print("¿Qué disco quiere modificar?: ");
        n = Integer.parseInt(System.console().readLine());
        System.out.println("Disco seleccionado: " + n);
        System.out.println(disc[n]);
        System.out.println("¿Qué quiere modificar?");
        System.out.println("1 - Código");
        System.out.println("2 - Autor");
        System.out.println("3 - Título");
        System.out.println("4 - Género");
        System.out.println("5 - Duración");
        System.out.print("Seleccione una opción: ");
        m = Integer.parseInt(System.console().readLine());
        
        switch (m) {
          case 1:
            System.out.print("Introduzca nuevo dato: ");
            codigoIntroducido = System.console().readLine();
            disc[n].setCodigo(codigoIntroducido);
            break;
          case 2:
            System.out.print("Introduzca nuevo dato: ");
            autorIntroducido = System.console().readLine();
            disc[n].setAutor(autorIntroducido);
            break;
          case 3:
            System.out.print("Introduzca nuevo dato: ");
            tituloIntroducido = System.console().readLine();
            disc[n].setTitulo(tituloIntroducido);
            break;
          case 4:
            System.out.print("Introduzca nuevo dato: ");
            generoIntroducido = System.console().readLine();
            disc[n].setGenero(generoIntroducido);
            break;
          case 5:
            System.out.print("Introduzca nuevo dato: ");
            duracionIntroducida = Integer.parseInt(System.console().readLine());
            disc[n].setDuracion(duracionIntroducida);
            break;
        }
        System.out.print("Dato modificado, pulse enter para continuar");
        String e = System.console().readLine();
        
        
      } else if (opcion == 4) {
        clearScreen();
        System.out.println("Lista de discos:");
        for (i = 0; i < 100; i++) {
          
          if (!disc[i].isVacio()) {
            System.out.println("----------------------------");
            System.out.println("Disco " + i);
            System.out.print(disc[i]);
          }
        }
        
        System.out.print("¿Qué disco quiere eliminar?: ");
        n = Integer.parseInt(System.console().readLine());
        
        disc[n].setVacio(true);
        
        System.out.print("Disco eliminado correctamente, pulse enter para continuar");
        String e = System.console().readLine();
        
      }
      clearScreen();
    } while (opcion != 5);
  }
  
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
   } 
}
