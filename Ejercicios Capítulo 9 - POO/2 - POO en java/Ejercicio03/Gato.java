public class Gato extends Mamifero {
  
  public Gato(String s) {
    super(s);
  }

  public Gato() {
    super();
  }
  
void comer(String s) {
  
  if (s == "pescado") {
    System.out.println("Si, gracias");
  } else {
    System.out.println("Lo siento, yo sólo como pescado");
  }
}
  
}
