public class Articulo {
  
  private String codigo = "LIBRE";
  private String descripcion;
  private int precioCompra;
  private int precioVenta;
  private int stock;
  private boolean vacio = true;

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }
    
    public boolean isVacio() {
        return vacio;
    }

    public void subirStock(int m) {
      this.stock += m;
    }
    
    public void bajarStock(int m) {
      this.stock -= m;
    }
    
    public String toString() {
      String datosArticulo = "";
      
      datosArticulo += "Código: " + this.codigo + "\n";
      datosArticulo += "Descripción: " + this.descripcion + "\n";
      datosArticulo += "Precio de compra: " + this.precioCompra + "\n";
      datosArticulo += "Precio de venta: " + this.precioVenta + "\n";
      datosArticulo += "Stock: " + this.stock + "\n";
      return datosArticulo;
    }
  
  
}
