
package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.UsuarioAdmin;
import modelo.Venta;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */

public interface controladorInterface {

    public interface producto {

        public abstract void agregarProducto(Producto prod);
        public abstract void buscarProducto(Producto prod);
        public abstract void actualizarProducto(int codigo, int stock, int cantidad);
        public abstract DefaultTableModel listarProducto();
        public abstract boolean validarCampos(String codigo, String nombre, String precio, String stock);
        public abstract boolean validarStock(Producto prod);
    }

    public interface usuario {

        public abstract void agregarUsuario(UsuarioAdmin user);
        public abstract void buscarUsuario(UsuarioAdmin user);
        public abstract boolean validarSesion(String user, String pass);
        public abstract boolean validarCreacion(String user, String pass, String correo);
    }

    public interface venta {

        public abstract void agregarDetalle(Venta venta);
        public abstract DefaultTableModel listarVenta();
        public abstract void cancelarVenta();
    }

}
