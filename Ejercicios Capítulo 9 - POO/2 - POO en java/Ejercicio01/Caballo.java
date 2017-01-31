public class Caballo {
  
  //atributos
  int edad;
  String sexo;
  String raza;
  int altura;
  
  //Constructor
  
  Caballo (String s) {
    this.sexo = s;
    
  }
  
  void relinchar() {
    System.out.println("jijijijiji");
  }
  
  void dormir() {
    System.out.println("zZzZZZzZzZzZ");
  }
  
  void comer (String comida) {
    
    if (comida == "pescado") {
      System.out.println("Lo siento, no como pescado");
    } else {
      System.out.println("Si, me gusta comer " + comida);
    }
  }
  
  void asear() {
    System.out.println("Ok, ahora voy");
  }
  
  void saludar (Caballo amigo) {
    
    System.out.println("Hola");
    System.out.println("¡Buenos días!");
  }
}
