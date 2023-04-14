package itt.Interfaces;

import itt.Modelos.Mesero;
import java.util.List;

public interface DAOCRUD {

    public void agregar(Object object) throws Exception;

    public void eliminar(Object object) throws Exception;

    public void actualizar(Object object) throws Exception;

    public List<Mesero> listar() throws Exception;
    
    public List<Mesero> listar(String complemento) throws Exception;
}
