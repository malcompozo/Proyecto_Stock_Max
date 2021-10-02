package controlador;

import bd.Conexion;
import java.sql.ResultSet;
import modelo.Usuario;
import modelo.UsuarioAdmin;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class UsuarioControlador implements controladorInterface.usuario {

    @Override
    public void agregarUsuario(UsuarioAdmin user) {
        try {
            String sentenciaSQL = "insert into usuario values "
                    + "('"+user.getNombreUsuario()+"','"+user.getPass()+"','"+user.getCorreo()+"')";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(sentenciaSQL);
            Conexion.sentencia.execute(sentenciaSQL);
            System.out.println("");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al crear usuario");
        } 
    }

    @Override
    public void buscarUsuario(UsuarioAdmin user) {
        try {
            Conexion.buscarUsuario = false;
            String sentenciaSQL = "select * from usuario where nombre_usuario = '"+user.getNombreUsuario()+"' "
                    + "and pass ='"+user.getPass()+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conexion.prepareStatement(sentenciaSQL);
            ResultSet resultado = Conexion.sentencia.executeQuery(sentenciaSQL);
            if (resultado.next()) {
                Conexion.buscarUsuario = true;
                user.setNombreUsuario(resultado.getString(1));
                user.setPass(resultado.getString(2));
                user.setCorreo(resultado.getString(3));
            }
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar usuario");
        }
    }

    @Override
    public boolean validarSesion(String user, String pass) {
        return !(user.isEmpty() || pass.isEmpty());
    }

    @Override
    public boolean validarCreacion(String user, String pass, String correo) {
        return !(user.isEmpty() || pass.isEmpty() || correo.isEmpty());
    }
    
    
}
