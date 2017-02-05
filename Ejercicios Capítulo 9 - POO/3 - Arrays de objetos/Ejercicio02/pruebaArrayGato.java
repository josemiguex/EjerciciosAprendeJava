/* Ejercicio 1 - Arrays de objetos
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 */

public class pruebaArrayGato {
  public static void main (String[] args) {
    
    int i;
    
    Gato[] gato = new Gato[4];
    
    gato[0] = new Gato("Garfield", "Macho", 10, "Naranja", 34);
    gato[1] = new Gato("Tom", "Hembra", 12, "gris", 23);
    gato[2] = new Gato("Pepito", "Macho", 10, "Naranja", 41);
    gato[3] = new Gato("Gumball", "Macho", 11, "azul", 32);

    
    System.out.println("Ahora se mostrarán los datos de 4 gatos");
    
    for (i = 0; i < 4; i++) {
      System.out.println("Gato " + i);
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Sexo: " + gato[i].getSexo());
      System.out.println("Edad: " + gato[i].getEdad());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Peso: " + gato[i].getPeso());
      
      System.out.println();
      
    }
    
    
  }
}
