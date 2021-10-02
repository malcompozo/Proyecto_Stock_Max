package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class Conexion {
    
    public static String bd = "control_stock";
    public static String usuario = "root";
    public static String pass = "";

    public static String url = "jdbc:mysql://localhost:3306/"+bd;
    public static Connection conexion;
    public static Statement sentencia;

    public static boolean buscarProducto;
    public static boolean buscarUsuario;

    public static void conectar() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
            if (conexion != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException e) {
            System.out.println("No fue posible realizar la conexion");
        }
    }

    public static void desconectar() throws SQLException{
        conexion.close();
    }
    
}
