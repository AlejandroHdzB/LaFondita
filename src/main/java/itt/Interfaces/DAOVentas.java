
package itt.Interfaces;

import itt.Modelos.Venta;

public interface DAOVentas {
    
    public int agregar() throws Exception;
    public int actualizar(int idVenta) throws Exception;
    public Venta getDatosCuenta(int idVenta) throws Exception;
}
