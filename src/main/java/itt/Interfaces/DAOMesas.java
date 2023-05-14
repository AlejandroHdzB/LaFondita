
package itt.Interfaces;

import itt.Modelos.Mesa;
import java.util.List;

public interface DAOMesas {
    
    public int verEstado(int idMesa) throws Exception;
    public List<Mesa> listar() throws Exception;
    public boolean actualizarEstado(int id, int estado) throws Exception;
}
