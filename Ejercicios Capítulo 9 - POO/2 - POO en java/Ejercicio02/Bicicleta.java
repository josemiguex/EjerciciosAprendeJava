public class Bicicleta extends Vehiculo {
  
  private int kilometrosRecorridos;
  
  public Bicicleta() {
    kilometrosRecorridos = 0;
  }
  
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public void andaBici(int n) {
    System.out.println("Te has desplazado " + n + " kilómetros");
    this.kilometrosRecorridos += n;
    super.setKilometrosTotales(n);
  }
  
  public void hacerElCaballito(int n) {
    System.out.println("Vamos a hacer el caballito " + n + "km sin caerse");
    this.kilometrosRecorridos += n;
    super.setKilometrosTotales(n);
  }
}
