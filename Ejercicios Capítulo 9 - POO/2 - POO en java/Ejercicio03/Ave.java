public abstract class Ave extends Animal {
  
  public Ave(String s) {
    super(s);
  }

  public Ave() {
    super();
  }
  
  public void volar() {
    System.out.println("Estoy volando");
  }
  
  public void aseate() {
    System.out.println("Me estoy limpiando las plumas");
  }
  
  public void andar(int n) {
    System.out.println("He andado " + n + " metros");
  }
}
