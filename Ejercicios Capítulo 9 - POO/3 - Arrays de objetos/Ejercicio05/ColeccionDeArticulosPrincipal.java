/* Ejercicio 5 - Arrays de objetos
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
 * el control de los artículos de un almacén. De cada artículo se debe saber
 * el código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades).
 */

public class ColeccionDeArticulosPrincipal {

    public static void main(String[] args) {

        int i = 0;
        int n;
        int m;
        boolean repetido;
        
        System.out.println("GESTISIMAL (GESTIón SIMplificada de Almacén)");

        //Creamos array
        Articulo[] art = new Articulo[100];

        //Creamos los discos de dentro del array
        for (i = 0; i < art.length; i++) {
            art[i] = new Articulo();
        }

        int opcion;
        String codigoIntroducido;
        String descripcionIntroducida;
        int precioCompraIntroducido;
        int precioVentaIntroducido;
        int stockIntroducido;

        do {
          
          repetido = false;
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Listar artículos");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificar artículo");
            System.out.println("5. Entrada de mercancia");
            System.out.println("6. Salida de mercancia");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(System.console().readLine());

            if (opcion == 1) {
                clearScreen();

                
                  System.out.println("Lista de artículos:");
                  for (i = 0; i < art.length; i++) {

                      if (!art[i].isVacio()) {
                          System.out.println("----------------------------");
                          System.out.println("Artículo " + i);
                          System.out.print(art[i]);
                      }
                  }
                
            
                System.out.print("Pulse enter para continuar");
                String e = System.console().readLine();
            } else if (opcion == 2) {

                i = 0;

                while (!art[i].isVacio()) {
                    i++;
                    
                    if (i == art.length - 1) {
                      break;
                    }
                }
                
                if (i == art.length - 1 && !art[i].isVacio()) {
                  System.out.print("Colección de artículos lleno, pulse enter para continuar");
                } else {
                  System.out.println("Introduzca los datos del nuevo artículo");
                  System.out.print("Código: ");
                  codigoIntroducido = System.console().readLine();
                  art[i].setCodigo(codigoIntroducido);
                  
                  for (n = 0; n < i; n++) {
                    
                    if (art[n].getCodigo().equals(art[i].getCodigo()) && !art[n].isVacio()) {
                      repetido = true;
                      break;
                      
                    }
                  }
                  
                  if (!repetido) {
                    System.out.print("Descripción: ");
                    descripcionIntroducida = System.console().readLine();
                    art[i].setDescripcion(descripcionIntroducida);

                    System.out.print("Precio de compra: ");
                    precioCompraIntroducido = Integer.parseInt(System.console().readLine());
                    art[i].setPrecioCompra(precioCompraIntroducido);

                    System.out.print("Precio de venta: ");
                    precioVentaIntroducido = Integer.parseInt(System.console().readLine());
                    art[i].setPrecioVenta(precioVentaIntroducido);

                    System.out.print("Stock: ");
                    stockIntroducido = Integer.parseInt(System.console().readLine());
                    art[i].setStock(stockIntroducido);
                    art[i].setVacio(false);

                    System.out.print("Artículo añadido, pulsa enter para continuar");
                  } else {
                    System.out.print("Este artículo ya existe, pulse enter para continuar");
                  }
                }
                
                String e = System.console().readLine();
            } else if (opcion == 4) {

                for (i = 0; i < art.length; i++) {

                    if (!art[i].isVacio()) {
                        System.out.println("----------------------------");
                        System.out.println("Artículo " + i);
                        System.out.print(art[i]);
                    }
                }

                System.out.print("¿Qué artículo quiere modificar?: ");
                n = Integer.parseInt(System.console().readLine());
                System.out.println("Artículo seleccionado: " + n);
                System.out.println(art[n]);
                System.out.println("¿Qué quiere modificar?");
                System.out.println("1 - Código");
                System.out.println("2 - Descripción");
                System.out.println("3 - Precio Compra");
                System.out.println("4 - Precio Venta");
                System.out.print("Seleccione una opción: ");
                m = Integer.parseInt(System.console().readLine());

                switch (m) {
                    case 1:
                        System.out.print("Introduzca nuevo dato: ");
                        codigoIntroducido = System.console().readLine();
                        art[n].setCodigo(codigoIntroducido);
                        break;
                    case 2:
                        System.out.print("Introduzca nuevo dato: ");
                        descripcionIntroducida = System.console().readLine();
                        art[n].setDescripcion(descripcionIntroducida);
                        break;
                    case 3:
                        System.out.print("Introduzca nuevo dato: ");
                        precioCompraIntroducido = Integer.parseInt(System.console().readLine());
                        art[n].setPrecioCompra(precioCompraIntroducido);
                        break;
                    case 4:
                        System.out.print("Introduzca nuevo dato: ");
                        precioVentaIntroducido = Integer.parseInt(System.console().readLine());
                        art[n].setPrecioVenta(precioVentaIntroducido);
                        break;
                    case 5:
                        System.out.print("Introduzca nuevo dato: ");
                        stockIntroducido = Integer.parseInt(System.console().readLine());
                        art[n].setStock(stockIntroducido);
                        break;
                }
                System.out.print("Artículo modificado, pulse enter para continuar");
                String e = System.console().readLine();

            } else if (opcion == 3) {
                clearScreen();
                System.out.println("Lista de artículos:");
                for (i = 0; i < art.length; i++) {

                    if (!art[i].isVacio()) {
                        System.out.println("----------------------------");
                        System.out.println("Artículo " + i);
                        System.out.print(art[i]);
                    }
                }

                System.out.print("¿Qué artículo quiere dar de baja?: ");
                n = Integer.parseInt(System.console().readLine());
                if (art[n].isVacio()) {
                  System.out.print("Código incorrecto, pulse enter para continuar");
                } else {
                  art[n].setVacio(true);

                  System.out.print("Artículo eliminado correctamente, pulse enter para continuar");
                  
                }
                String e = System.console().readLine();
            } else if (opcion == 5) {
              System.out.println("Lista de artículos:");
                for (i = 0; i < art.length; i++) {

                    if (!art[i].isVacio()) {
                        System.out.println("----------------------------");
                        System.out.println("Artículo " + i);
                        System.out.print(art[i]);
                    }
                }
                System.out.print("¿Qué artículo va a entrar en el almacén?: ");
                n = Integer.parseInt(System.console().readLine());
                
                System.out.print("¿Y cantidad?: ");
                m = Integer.parseInt(System.console().readLine());
                
                art[n].subirStock(m);
                System.out.print("Se ha introducido la mercancía correctamente, pulse enter para continuar");

                String e = System.console().readLine();
            } else if (opcion == 6) {
              System.out.println("Lista de artículos:");
                for (i = 0; i < art.length; i++) {

                    if (!art[i].isVacio()) {
                        System.out.println("----------------------------");
                        System.out.println("Artículo " + i);
                        System.out.print(art[i]);
                    }
                }
                System.out.print("¿Qué artículo va a salir del almacén?: ");
                n = Integer.parseInt(System.console().readLine());
                if (art[n].getStock() == 0) {
                  System.out.print("No hay stock disponible para este artículo, pulse enter para continuar");
                } else {
                  System.out.print("¿Y cantidad?: ");
                  m = Integer.parseInt(System.console().readLine());
                  
                  if (m <= art[n].getStock()) {
                    art[n].bajarStock(m);
                    System.out.print("Se ha sacado la mercancía correctamente, pulse enter para continuar");
                  } else {
                    System.out.print("La cantidad que has introducido es mayor que el stock disponible, pulse enter para continuar");
                  }
                }
                String e = System.console().readLine();
            }
            
            clearScreen();
        } while (opcion != 7);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
