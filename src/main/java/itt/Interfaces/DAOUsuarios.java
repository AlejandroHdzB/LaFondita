
package itt.Interfaces;

import itt.Modelos.Usuario;

public interface DAOUsuarios {
    
    public int buscar(String usuario, String contraseña) throws Exception;
    public Usuario buscar(String id) throws Exception;
}
        
    
