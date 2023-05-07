package itt.Interfaces;

import itt.Modelos.Pedido;
import java.util.List;

public interface DAOPedidos {
    
    public List<Pedido> listar() throws Exception;
   
}
