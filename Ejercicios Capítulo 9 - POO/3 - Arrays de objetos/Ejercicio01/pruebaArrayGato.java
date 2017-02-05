/* Ejercicio 1 - Arrays de objetos
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 */

public class pruebaArrayGato {
  public static void main (String[] args) {
    
    Gato[] gato = new Gato[4];
    
    System.out.println("A continuación debe introducir los datos de 4 gatos");
    
    String nombreIntroducido;
    String sexoIntroducido;
    int edadIntroducida;
    String colorIntroducido;
    int pesoIntroducido;
    
    int i;
    
    for (i = 0; i < 4; i++) {
      
      gato[i] = new Gato();
      
      System.out.println("Gato " + i);
      
      System.out.print("Nombre: ");
      nombreIntroducido = System.console().readLine();
      (gato[i]).setNombre(nombreIntroducido);
      
      System.out.print("Sexo: ");
      sexoIntroducido = System.console().readLine();
      (gato[i]).setSexo(sexoIntroducido);
      
      System.out.print("Edad: ");
      edadIntroducida = Integer.parseInt(System.console().readLine());
      (gato[i]).setEdad(edadIntroducida);
      
      System.out.print("Color: ");
      colorIntroducido = System.console().readLine();
      (gato[i]).setColor(colorIntroducido);
      
      System.out.print("Peso: ");
      pesoIntroducido = Integer.parseInt(System.console().readLine());
      (gato[i]).setPeso(pesoIntroducido);
      
      System.out.println();
    }
    
    System.out.println("Ahora se mostrarán los datos de los 4 gatos");
    
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
