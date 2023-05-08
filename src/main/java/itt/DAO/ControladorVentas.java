package itt.DAO;

import itt.Modelos.Mesa;
import itt.Modelos.Venta;

public class ControladorVentas {
    private Mesa mesas[];
    private Venta ventasActivas[];
    
    public ControladorVentas(){
        this.mesas = new Mesa[8];
        this.ventasActivas = new Venta[8];
    }
}
