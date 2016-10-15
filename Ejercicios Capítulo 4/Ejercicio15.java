/* Ejercicio 15 - Capítulo 4
 * Escribe un programa que pinte una pirámide rellena con un carácter introdu-
 * cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 * Hecho por Jose Miguel Martín Hidalgo
 */

public class Ejercicio15 {
  public static void main (String[] args) {
    
    System.out.println("Programa dibujador de carácteres");
    System.out.println("--------------------------------");
    System.out.print("¿Con qué carácter quieres que esté pintada la pirámide?: ");
    String a = System.console().readLine();
    
    System.out.println("¿Cómo quieres que sea la pirámide? (escribe el número)");
    System.out.println("1 - Apuntando hacia arriba");
    System.out.println("2 - Apuntando hacia abajo");
    System.out.println("3 - Apuntando hacia la izquierda");
    System.out.println("4 - Apuntando hacia la derecha");
    int lado = Integer.parseInt(System.console().readLine());
    
    switch(lado) {
      case 1:
        System.out.println("   " + a);
        System.out.println("  " + a + a + a);
        System.out.println(" " + a + a + a + a + a);
        System.out.println(a + a + a + a + a + a + a);
        break;
      case 2:
        System.out.println(a + a + a + a + a + a + a);
        System.out.println(" " + a + a + a + a + a);
        System.out.println("  " + a + a + a);
        System.out.println("   " + a);
        break;
      case 3:
        System.out.println("    " + a);
        System.out.println("   " + a + a);
        System.out.println("  " + a + a + a);
        System.out.println(" " + a + a + a + a);
        System.out.println(a + a + a + a + a);
        System.out.println(" " + a + a + a + a);
        System.out.println("  " + a + a + a);
        System.out.println("   " + a + a);
        System.out.println("    " + a);
        break;
      case 4:
        System.out.println(a + "    ");
        System.out.println(a + a + "   ");
        System.out.println(a + a + a + "  ");
        System.out.println(a + a + a + a + " ");
        System.out.println(a + a + a + a + a);
        System.out.println(a + a + a + a + " ");
        System.out.println(a + a + a + "  ");
        System.out.println(a + a + "   ");
        System.out.println(a + "    ");
        break;
      
    }
  }
}
