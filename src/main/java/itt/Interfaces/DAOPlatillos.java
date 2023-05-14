package itt.Interfaces;

import itt.Modelos.Platillo;
import java.util.List;

public interface DAOPlatillos {
 
    public List<Platillo> listarTodos() throws Exception;
    public List<Platillo> listar(String tipo) throws Exception;
    public Platillo buscarID(String id) throws Exception;
    public Platillo buscarNombre(String nombre) throws Exception;
}
