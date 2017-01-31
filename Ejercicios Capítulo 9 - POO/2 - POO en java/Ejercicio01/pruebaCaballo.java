public class pruebaCaballo {
  public static void main (String[] args) {
    
    Caballo Pepe = new Caballo("macho");
    Caballo Lucia = new Caballo("hembra");
    System.out.println("¡Relincha!");
    Pepe.relinchar();
    System.out.println("Duérmete");
    Pepe.dormir();
    System.out.println("¿Quieres una manzana?");
    Pepe.comer("manzana");
    System.out.println("¿Y un pescado?");
    Pepe.comer("pescado");
    System.out.println("Aseate");
    Pepe.asear();
    System.out.println("Pepe, saluda a Lucia");
    Pepe.saludar(Lucia);
  }
}
