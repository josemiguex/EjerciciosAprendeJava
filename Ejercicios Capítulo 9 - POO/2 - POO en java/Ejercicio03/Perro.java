public class Perro extends Mamifero {
  
  public Perro(String s) {
    super(s);
  }

  public Perro() {
    super();
  }
    
  public String toString() {
    
    String comida = "";
    int x = (int)(Math.random() * 3);
    
    switch (x) {
      case 0:
        comida = "un filete de pollo";
        break;
      case 1:
        comida = "una manzana";
        break;
      case 2:
        comida = "cereales";
        break;
        
    }
    
    return comida;
  }

}
