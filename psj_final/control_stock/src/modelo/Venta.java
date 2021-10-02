package modelo;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class Venta {
    
    private String nombre;
    private int cantidadProd;
    private int precioUnitario;
    private int totalVenta;
    private Producto producto;

    public Venta() {
    }

    public Venta(String nombre, int cantidadProd, int precioUnitario, int totalVenta, Producto producto) {
        this.nombre = nombre;
        this.cantidadProd = cantidadProd;
        this.precioUnitario = precioUnitario;
        this.totalVenta = totalVenta;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


}

    
