/* Ejercicio 4 - POO en java
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de
 * los métodos pueden ser invierte , simplifica , multiplica , divide , etc.
 */

public class pruebasFracciones {
  public static void main (String[] args) {
    
    Fraccion fraccion1 = new Fraccion(24, 120);
    Fraccion fraccion2 = new Fraccion(2, 3);

    System.out.println("Muestro la fracción");
    fraccion1.mostrar();
    
    System.out.println("Invierto la fracción y la vuelvo a mostrar");
    (fraccion1.invierte()).mostrar();
    
    System.out.println("Simplifico la fracción y la vuelvo a mostrar");
    (fraccion1.simplificar()).mostrar();
    
    System.out.println("Multiplico esa fraccion por fraccion2");
    (fraccion1.multiplicar(fraccion2)).mostrar();
    
    System.out.println("Divido esa fraccion por fraccion2");
    (fraccion1.dividir(fraccion2)).mostrar();

  }
}
