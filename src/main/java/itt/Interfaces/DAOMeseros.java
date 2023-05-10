
package itt.Interfaces;

import itt.Modelos.Mesero;

public interface DAOMeseros {
    
    public int buscar(String usuario, String contraseña) throws Exception;
    public Mesero buscar(String id) throws Exception;
}
        
    
