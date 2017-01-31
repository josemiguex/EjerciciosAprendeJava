public abstract class Vehiculo {
  
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
  public static int setKilometrosTotales(int n) {
    return Vehiculo.kilometrosTotales += n;
  }
  
  
  
}
