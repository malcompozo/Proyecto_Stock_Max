
package modelo;

/**
 *
 * @author Francisca Aranda Aranda
 * @author Nicolas Cañete Berna
 * @author Malcom Pozo Espinoza
 * @author Nicolas Segovia Atalah
 * @version 05/12/2020
 */
public class UsuarioAdmin extends Usuario{
    
    boolean privilegio;

    public UsuarioAdmin() {
    }

    public UsuarioAdmin(boolean privilegio, String nombreUsuario, String pass, String correo) {
        super(nombreUsuario, pass, correo);
        this.privilegio = privilegio;
    }

    public boolean isPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(boolean privilegio) {
        this.privilegio = privilegio;
    }
    
}
