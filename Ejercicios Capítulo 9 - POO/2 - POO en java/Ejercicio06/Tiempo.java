public class Tiempo {
  
  int horas;
  int minutos;
  int segundos;
  
  public Tiempo (int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }
  
  public void resta(int h, int m, int s) {
    this.segundos -= s;
    if (segundos < 0) {
      this.segundos = 60 + this.segundos;
      minutos -= 1;
    }
    
    this.minutos -= m;

    if (minutos < 0) {
      this.minutos = 60 + this.minutos;
      this.horas -= 1;
    }
    
    this.horas -= h;
    
    if (this.horas < 0) {
      this.horas = 24 + this.horas;
    }
    
    
    
  }
  
  public void suma(int h, int m, int s) {
    
    this.segundos += s;
    
    if (this.segundos > 59) {
      this.segundos = this.segundos - 60;
      m += 1;
    }
    
    this.minutos += m;

    if (minutos > 59) {
      this.minutos = this.minutos - 60;
      this.horas += 1;
    }
    
    this.horas += h;

    if (this.horas > 23) {
      this.horas = this.horas - 23;
    }
    
    
  }
  
  public String toString() {
    String intervalo = "";
    
    intervalo += this.horas + "h ";
    intervalo += this.minutos + "m ";
    intervalo += this.segundos + "s";
    
    return intervalo;
  }
  
}
