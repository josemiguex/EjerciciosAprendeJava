public class Ejercicio5 { 
   public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String amarillo = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String marino = "\033[36m";

    System.out.println("Lunes | Martes | Miércoles | Jueves | Viernes |");
    System.out.printf(rojo + "SI    " + blanco + "|" + verde + " Prog   " + blanco + "|" + verde + " Prog      "+ blanco + "|" + amarillo + " BD     " + blanco + "|" + azul + " LM      " + blanco + "|\n");
    System.out.printf(rojo + "SI    " + blanco + "|" + verde + " Prog   " + blanco + "|" + verde + " Prog      "+ blanco + "|" + amarillo + " BD     " + blanco + "|" + azul + " LM      " + blanco + "|\n");
    System.out.printf(rojo + "SI    " + blanco + "|" + verde + " Prog   " + blanco + "|" + azul + " LM        "+ blanco + "|" + amarillo + " BD     " + blanco + "|" + morado + " ED      " + blanco + "|\n");
    System.out.printf("RE    " + blanco + "|" +  " C      " + blanco + "|" + " R         "+ blanco + "|" + " E      " + blanco + "|" + " O       " + blanco + "|\n");
    System.out.printf(marino + "FOL   " + blanco + "|" + amarillo + " BD     " + blanco + "|" + azul + " LM        "+ blanco + "|" + verde + " Prog   " + blanco + "|" + rojo + " SI      " + blanco + "|\n");
    System.out.printf(marino + "FOL   " + blanco + "|" + amarillo + " BD     " + blanco + "|" + morado + " ED        "+ blanco + "|" + verde + " Prog   " + blanco + "|" + rojo + " SI      " + blanco + "|\n");
    System.out.printf(marino + "FOL   " + blanco + "|" + amarillo + " BD     " + blanco + "|" + morado + " ED        "+ blanco + "|" + verde + " Prog   " + blanco + "|" + rojo + " SI      " + blanco + "|\n");
  }
}

