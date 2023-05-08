
package itt.Interfaces;

import itt.Modelos.Mesa;

public interface DAOMesas {
    
    public int verEstado(int idMesa) throws Exception;
    public Mesa[] listar() throws Exception;
    public boolean actualizarEstado(int id) throws Exception;
}
