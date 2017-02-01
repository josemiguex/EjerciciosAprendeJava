public abstract class Mamifero extends Animal {
  
  public Mamifero(String s) {
    super(s);
  }

  public Mamifero() {
    super();
  }
  
  void correr() {
    System.out.println("Estoy corriendo");
  }
  
  void bañar() {
    System.out.println("Me estoy bañando");
  }
  
  void darUnPaseo() {
    System.out.println("Estoy dando un paseo por la calle");
  }
}
