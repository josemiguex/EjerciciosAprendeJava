public class Disco {
  
  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;
  private boolean vacio = true;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean isVacio() {
        return vacio;
    }
    
    public String toString() {
      String datosDisco = "";
      
      datosDisco += "Código: " + this.codigo + "\n";
      datosDisco += "Autor: " + this.autor + "\n";
      datosDisco += "Título: " + this.titulo + "\n";
      datosDisco += "Genero: " + this.genero + "\n";
      datosDisco += "Duración: " + this.duracion + "\n";
      return datosDisco;
    }
  
  
}
