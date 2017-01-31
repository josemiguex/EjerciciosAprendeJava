public class Coche extends Vehiculo {
  
  private int kilometrosRecorridos;
  
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public void andaCoche(int n) {
    System.out.println("Te has desplazado " + n + " kilómetros");
    this.kilometrosRecorridos += n;
    super.setKilometrosTotales(n);
  }
  
  public void quemaRueda(int n) {
    System.out.println("Vamos a quemar rueda por " + n + "km");
    this.kilometrosRecorridos += n;
    super.setKilometrosTotales(n);
  }
}
