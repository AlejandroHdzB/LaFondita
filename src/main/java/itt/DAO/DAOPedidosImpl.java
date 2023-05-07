package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Modelos.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import itt.Interfaces.DAOPedidos;
import itt.Modelos.Platillo;

public class DAOPedidosImpl extends Conexion implements DAOPedidos {

    @Override
    public List<Pedido> listar() throws Exception {
        List<Pedido> lista = null;
        String consulta = "SELECT pl.idplatillo,pl.nombre,pl.precio,pe.idventa,pe.cantidad "
                        + "FROM pedidos pe JOIN platillos pl "
                        + "ON pe.idplatillo = pl.idplatillo "
                        + "WHERE pe.estado = 'PENDIENTE'";
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta); ResultSet rs = st.executeQuery()) {
                lista = new ArrayList();
                while (rs.next()) {
                    Pedido pedido = new Pedido();
                    Platillo platillo = new Platillo();
                    
                    platillo.setIdPlatillo(rs.getString(1));
                    platillo.setNombre(rs.getString(2));
                    platillo.setPrecio(rs.getDouble(3));
                    
                    pedido.setIdVenta(rs.getInt(4));
                    pedido.setCantidad(rs.getInt(5));
                    pedido.setIdPlatillo(platillo);

                    lista.add(pedido);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

}
