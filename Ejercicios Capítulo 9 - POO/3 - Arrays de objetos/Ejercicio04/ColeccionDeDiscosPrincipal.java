/* Ejercicio 4 - Arrays de objetos
 * Modifica el programa “Colección de discos” como se indica a continuación:
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 * introducido por el usuario existe.
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir
 * que no se pueda repetir.
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 * listado completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género de-
 * terminado) y un listado de discos cuya duración esté en un rango determinado
 * por el usuario.
 */

public class ColeccionDeDiscosPrincipal {

    public static void main(String[] args) {

        int i = 0;
        int n;
        int m;
        boolean repetido;
        
        System.out.println("Programa de colección de discos");

        //Creamos array
        Disco[] disc = new Disco[100];

        //Creamos los discos de dentro del array
        for (i = 0; i < disc.length; i++) {
            disc[i] = new Disco();
        }

        int opcion;
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;

        do {
          
          repetido = false;
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Listar discos");
            System.out.println("2. Añadir disco");
            System.out.println("3. Modificar disco");
            System.out.println("4. Borrar disco");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(System.console().readLine());

            if (opcion == 1) {
                clearScreen();
                
                System.out.println("¿Qué quiere mostrar?");
                System.out.println("1 - Todos los discos");
                System.out.println("2 - Discos de un determinado autor");
                System.out.println("3 - Discos de un determinado género");
                System.out.println("4 - Discos de una determinada duración");
                System.out.print("Seleccione una opción: ");

                m = Integer.parseInt(System.console().readLine());
                
                if (m == 1) {
                  System.out.println("Lista de discos:");
                  for (i = 0; i < disc.length; i++) {

                      if (!disc[i].isVacio()) {
                          System.out.println("----------------------------");
                          System.out.println("Disco " + i);
                          System.out.print(disc[i]);
                      }
                  }
                } else if (m == 2) {
                  
                  System.out.print("Introduzca nombre del autor: ");
                  autorIntroducido = System.console().readLine();
                  
                  System.out.println("Lista de discos:");
                    for (i = 0; i < disc.length; i++) {

                        if (!disc[i].isVacio() && disc[i].getAutor().equals(autorIntroducido)) { 
                            System.out.println("----------------------------");
                            System.out.println("Disco " + i);
                            System.out.print(disc[i]);
                        }
                    }
                } else if (m == 3) {
                  System.out.print("Introduzca género: ");
                  generoIntroducido = System.console().readLine();
                  
                  System.out.println("Lista de discos:");
                    for (i = 0; i < disc.length; i++) {

                        if (!disc[i].isVacio() && disc[i].getGenero().equals(generoIntroducido)) { 
                            System.out.println("----------------------------");
                            System.out.println("Disco " + i);
                            System.out.print(disc[i]);
                        }
                    }
                } else if (m == 4) {
                  int max;
                  int min;
                  
                  System.out.print("Introduzca duración mínima: ");
                  min = Integer.parseInt(System.console().readLine());
                  
                  System.out.print("Introduzca duración máxima: ");
                  max = Integer.parseInt(System.console().readLine());
                  
                  System.out.println("Lista de discos:");
                    for (i = 0; i < disc.length; i++) {

                        if (!disc[i].isVacio() && (disc[i].getDuracion() >= min && disc[i].getDuracion() <= max)) { 
                            System.out.println("----------------------------");
                            System.out.println("Disco " + i);
                            System.out.print(disc[i]);
                        }
                    }
                }
                System.out.print("Pulse enter para continuar");
                String e = System.console().readLine();
            } else if (opcion == 2) {

                i = 0;

                while (!disc[i].isVacio()) {
                    i++;
                    
                    if (i == disc.length - 1) {
                      break;
                    }
                }
                
                if (i == disc.length - 1 && !disc[i].isVacio()) {
                  System.out.print("Colección de discos llena, pulse enter para continuar");
                } else {
                  System.out.println("Introduzca los datos del nuevo disco");
                  System.out.print("Código: ");
                  codigoIntroducido = System.console().readLine();
                  disc[i].setCodigo(codigoIntroducido);
                  
                  for (n = 0; n < i; n++) {
                    
                    if (disc[n].getCodigo().equals(disc[i].getCodigo()) && !disc[n].isVacio()) {
                      repetido = true;
                      break;
                      
                    }
                  }
                  
                  if (!repetido) {
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
                  } else {
                    System.out.print("Este disco ya existe, pulse enter para continuar");
                  }
                }
                
                String e = System.console().readLine();
            } else if (opcion == 3) {

                for (i = 0; i < disc.length; i++) {

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
                        
                        for (n = 0; n < i; n++) {
                    
                          if (disc[n].getCodigo().equals(codigoIntroducido) && !disc[n].isVacio()) {
                            repetido = true;
                            break;
                            
                          }
                        }
                        
                        if (!repetido) {
                          disc[n].setCodigo(codigoIntroducido);
                        } else {
                          System.out.print("Este código ya existe");
                        }
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
                for (i = 0; i < disc.length; i++) {

                    if (!disc[i].isVacio()) {
                        System.out.println("----------------------------");
                        System.out.println("Disco " + i);
                        System.out.print(disc[i]);
                    }
                }

                System.out.print("¿Qué disco quiere eliminar?: ");
                n = Integer.parseInt(System.console().readLine());
                if (disc[n].isVacio()) {
                  System.out.print("Código incorrecto, pulse enter para continuar");
                } else {
                  disc[n].setVacio(true);

                  System.out.print("Disco eliminado correctamente, pulse enter para continuar");
                  
                }
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
