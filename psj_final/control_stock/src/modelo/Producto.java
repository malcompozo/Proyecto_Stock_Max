
package modelo;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class Producto {
    
    private int codigo_producto;
    private String nombre_producto;
    private int precio_producto;
    private int Stock; 

    public Producto() {
    }

    public Producto(int codigo_producto, String nombre_producto, int precio_producto, int Stock) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.Stock = Stock;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
   
 
  }
    