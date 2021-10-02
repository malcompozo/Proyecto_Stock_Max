package controlador;

import bd.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Venta;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class VentaControlador implements controladorInterface.venta {
    
    DefaultTableModel modelo = new DefaultTableModel();

    @Override
    public void agregarDetalle(Venta venta) {
        try {
            String sentenciaSQL = "insert into venta values "
                    + "('" + venta.getNombre() + "','" + venta.getCantidadProd() + "','" + venta.getPrecioUnitario() + "','" + venta.getTotalVenta() + "','"+venta.getProducto().getCodigo_producto()+"')";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(sentenciaSQL);
            Conexion.sentencia.execute(sentenciaSQL);
            JOptionPane.showMessageDialog(null, "Producto agregado satisfactoriamente.");
            Conexion.desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar producto.");
        }
    }

    @Override
    public DefaultTableModel listarVenta() {
        try {
            Conexion.buscarProducto = false;
            String strSQL = "select * from venta";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(strSQL);
            ResultSet rs = Conexion.sentencia.executeQuery(strSQL);
            modelo.setColumnCount(0);
            modelo.setRowCount(0);
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio Unitario");
            modelo.addColumn("Total");
            Object[] fila = new Object[4];
            while  (rs.next()){
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i+1);               
                }
                modelo.addRow(fila);
            }
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al listar venta");
        }
        return modelo;
    }

    @Override
    public void cancelarVenta() {
        try {
            String sentenciaSQL = "delete from venta";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(sentenciaSQL);
            Conexion.sentencia.execute(sentenciaSQL);
            System.out.println("Se ha limpiado la tabla venta de la base de datos");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al cancelar venta");
            JOptionPane.showMessageDialog(null,"Error al cancelar venta.");
        } 
    }
}
