package itt.Interfaces;

import itt.Modelos.Platillo;
import java.util.List;

public interface DAOPlatillos {
 
    public List<Platillo> listarTodos() throws Exception;
    public List<Platillo> listar(String tipo) throws Exception;
    public Platillo buscarID(String id) throws Exception;
    public Platillo buscarNombre(String nombre) throws Exception;
    public List<Platillo> buscarLikeNombre(String nombre) throws Exception;
    public List<Platillo> buscarPrecio(double precio) throws Exception;
    public boolean agregar(String nombre, String tipo, double precio) throws Exception;
    public boolean actualizar(String id, String nombre, String tipo, double precio) throws Exception;
    public boolean eliminar(String id) throws Exception;
    
}
