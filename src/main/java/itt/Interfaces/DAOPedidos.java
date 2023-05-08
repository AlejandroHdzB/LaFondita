package itt.Interfaces;

import itt.Modelos.Pedido;
import java.util.List;

public interface DAOPedidos {
    
    public List<Pedido> listar() throws Exception;
    public boolean agregar(int idVenta, String platillo, int cantidad, int mesa) throws Exception;
    public void eliminar() throws Exception;
}
