public abstract class Animal {
  
  private String sexo;
  
  public Animal() {
    sexo = "macho";
  }

  public Animal (String x) {
    sexo = x;
  }
 
 void dormir () {
   System.out.println("zzzzzZZZZZZ");
 } 
 
 void comer() {
   System.out.println("Gracias por la comida");
 }
}
