public class pruebasAnimales {
  public static void main (String[] args) {
    
    Pinguino pepe = new Pinguino();
    Canario tom = new Canario();
    Gato pepito = new Gato();
    Perro pluto = new Perro();
    
    
    System.out.println("¡Vuela pinguino!");
    pepe.volar();
    System.out.println("Duermete pinguino");
    pepe.dormir();
    System.out.println("¡Vuela canario!");
    tom.volar();
    System.out.println("¿Quieres pescado gatito?");
    pepito.comer("pescado");
    System.out.println("¿Qué quieres comer perro?");
    System.out.println(pluto);
    System.out.println("¡Vuela canario!");
    tom.volar();
    System.out.println("¡Corre perro!");
    pluto.correr();
    System.out.println("Pinguino, anda 5 metros");
    pepe.andar(5);
    System.out.println("Gato, bañate");
    pepito.bañar();
    System.out.println("Perro, ve a dar un paseo");
    pluto.darUnPaseo();
    System.out.println("¿Quieres ensalada gatito?");
    pepito.comer("ensalada");
  }
}
