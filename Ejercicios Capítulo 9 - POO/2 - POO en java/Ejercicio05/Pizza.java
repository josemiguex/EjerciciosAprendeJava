public class Pizza {
  
  private String tamaño;
  private String tipo;
  private String estado;
  
  private static int pedidas;
  private static int servidas;
  
  Pizza(String ti, String ta) {
    this.tipo = ti;
    this.tamaño = ta;
    this.estado = "pedida";
    Pizza.pedidas += 1;
  }
  
  public void sirve() {
    
    if (this.estado != "servida") {
      Pizza.servidas += 1;
      this.estado = "servida";
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }
  
  public static int getTotalPedidas() {
    return Pizza.pedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.servidas;
  }
  
  public String toString() {
    String pizza = "pizza ";
    
    pizza += this.tipo;
    pizza += ", ";
    pizza += this.tamaño;
    pizza += ", ";
    pizza += this.estado;
    
    return pizza;
  }
  
  
}
