package itt.Interfaces;

import itt.Modelos.Pedido;
import java.util.List;

public interface DAOPedidos {

    public List<Pedido> listar(String condicion) throws Exception;
    public List<Pedido> listar(int idVenta, String condicion) throws Exception;
    public boolean agregar(int idVenta, String platillo, int cantidad, int mesa) throws Exception;
    public int eliminar(int idVenta, String idProducto, String fecha, String hora) throws Exception;
    public int actualizar(int idVenta, String idProducto, String fecha, String hora, String estado) throws Exception;
}
