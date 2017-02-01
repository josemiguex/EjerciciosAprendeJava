public class Fraccion {
  private int numerador;
  private int denominador;
  
  Fraccion(int n, int d) {
    this.numerador = n;
    this.denominador = d;
  }
  
  void mostrar() {
    System.out.println("Numerador: " + this.numerador);
    System.out.println("Denominador: " + this.denominador);
  }
  
  public Fraccion invierte() {
    int auxn = this.numerador;
    int auxd = this.denominador;
    
    return new Fraccion(auxd, auxn);

  }
  
  public Fraccion simplificar() {

    
    int minimo = Math.min(this.numerador, this.denominador);
    
    int mcd = 1;
    
    for (int x = 2; x <= minimo; x++) {
      if (minimo % x == 0) {
        mcd = x;        
      }
      
    }
    
    return new Fraccion(this.numerador / mcd, this.denominador / mcd);
  }
  
  public Fraccion multiplicar(Fraccion f) {
    int numeradorResultado = (this.numerador * f.numerador);
    int denominadorResultado = (this.denominador * f.denominador);

    return new Fraccion(numeradorResultado, denominadorResultado);
  }
  
  public Fraccion dividir(Fraccion f) {
    int numeradorResultado = (this.numerador / f.numerador);
    int denominadorResultado = (this.denominador / f.denominador);

    return new Fraccion(numeradorResultado, denominadorResultado);
  }
}
