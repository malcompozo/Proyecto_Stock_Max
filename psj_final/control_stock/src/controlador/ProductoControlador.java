package controlador;

import bd.Conexion;
import modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class ProductoControlador implements controladorInterface.producto {
    
    DefaultTableModel modelo = new DefaultTableModel();

    @Override
    public void agregarProducto(Producto prod) {
        try {
            String sentenciaSQL = "insert into producto values "
                    + "('"+prod.getCodigo_producto()+"','"+prod.getNombre_producto()+"','"+prod.getPrecio_producto()+"','"+prod.getStock()+"')";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(sentenciaSQL);
            Conexion.sentencia.execute(sentenciaSQL);
            JOptionPane.showMessageDialog(null,"Producto guardado satisfactoriamente.");
            Conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al ingresar producto.");
        }  
    }

    @Override
    public DefaultTableModel listarProducto() {
        try {
            Conexion.buscarProducto = false;
            String strSQL = "select * from producto";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(strSQL);
            ResultSet rs = Conexion.sentencia.executeQuery(strSQL);
            modelo.setColumnCount(0);
            modelo.setRowCount(0);
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
            Object[] fila = new Object[4];
            while  (rs.next()){
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i+1);                 
                }
                modelo.addRow(fila);
            }
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return modelo;
    }
  

    @Override
    public void buscarProducto(Producto prod) {
        try {
            Conexion.buscarProducto = false;
            String strSQL = "select * from producto where codigo_producto = '" + prod.getCodigo_producto()+ "'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(strSQL);
            ResultSet rs = Conexion.sentencia.executeQuery(strSQL);

            if (rs.next()) {
                Conexion.buscarProducto = true;
                prod.setCodigo_producto(Integer.parseInt(rs.getString(1)));
                prod.setNombre_producto(rs.getString(2));
                prod.setPrecio_producto(Integer.parseInt(rs.getString(3)));
                prod.setStock(Integer.parseInt(rs.getString(4)));
                
                System.out.println("Exito al buscar");
            }
            Conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al consultar");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void actualizarProducto(int codigo, int stock, int cantidad) {
        int nuevoStock = stock - cantidad;
        try {
            String sentenciaSQL = "update producto set stock = "+nuevoStock+" where codigo_producto = "+codigo+";";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(sentenciaSQL);
            Conexion.sentencia.execute(sentenciaSQL);
            System.out.println("Producto actualizado satisfactoriamente");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al actualizar producto");
            JOptionPane.showMessageDialog(null,"Error al actualizar producto.");
        } 
    }
        
     @Override
    public boolean validarCampos(String codigo,String nombre,String precio,String stock) {
        return !(codigo.isEmpty()||nombre.isEmpty()||precio.isEmpty()||stock.isEmpty());
    }  

    @Override
    public boolean validarStock(Producto prod) {
        return prod.getStock() != 0;
    }
    
}
