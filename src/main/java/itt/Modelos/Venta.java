
package itt.Modelos;

import java.util.List;

public class Venta {
    private int idVenta;
    private double total;
    private String fecha;
    private String hora;
    private Usuario mesero;
    private List<FormaPago> formaPago;
    private List<Pedido> pedidos;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    

    public Usuario getMesero() {
        return mesero;
    }

    public void setMesero(Usuario mesero) {
        this.mesero = mesero;
    }

    public List<FormaPago> getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(List<FormaPago> formaPago) {
        this.formaPago = formaPago;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
 
    
}
