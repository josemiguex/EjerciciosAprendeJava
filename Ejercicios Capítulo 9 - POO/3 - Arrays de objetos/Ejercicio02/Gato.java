public class Gato {
  
  private String nombre;
  private String sexo;
  private int edad;
  private String color;
  private int peso;
  
  public Gato (String n, String s, int e, String c, int p) {
    this.nombre = n;
    this.sexo = s;
    this.edad = e;
    this.color = c;
    this.peso = p;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public String getSexo() {
    return this.sexo;
  }
  
  public int getEdad() {
    return this.edad;
  }
  
  public String getColor() {
    return this.color;
  }
  
  public int getPeso() {
    return this.peso;
  }
}
