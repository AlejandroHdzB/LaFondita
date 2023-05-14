package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Modelos.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import itt.Interfaces.DAOPedidos;
import itt.Interfaces.DAOPlatillos;
import itt.Modelos.Platillo;
import java.sql.Date;
import java.sql.Time;

public class DAOPedidosImpl extends Conexion implements DAOPedidos {

    DAOPlatillos dao = new DAOPlatillosImpl();

    @Override
    public List<Pedido> listar(String condicion) throws Exception {
        List<Pedido> lista = null;
        String consulta;
        if (condicion.equals("PENDIENTE")) {
            consulta = "SELECT pl.idplatillo,pl.nombre,pe.idventa,pe.cantidad,pe.idmesa,pe.hora,pe.subtotal "
                    + "FROM pedidos pe JOIN platillos pl "
                    + "ON pe.idplatillo = pl.idplatillo "
                    + "WHERE pe.estado = 'PENDIENTE'";
        } else if (condicion.equals("2")) {
            consulta = "SELECT pl.idplatillo,pl.nombre,pe.idventa,pe.cantidad,pe.idmesa,pe.hora,pe.subtotal "
                    + "FROM pedidos pe JOIN platillos pl "
                    + "ON pe.idplatillo = pl.idplatillo "
                    + "WHERE pe.estado IN ('PENDIENTE','ENTREGADO')";
        } else {
            consulta = "SELECT pl.idplatillo,pl.nombre,pe.idventa,pe.cantidad,pe.idmesa,pe.hora,pe.subtotal "
                    + "FROM pedidos pe JOIN platillos pl "
                    + "ON pe.idplatillo = pl.idplatillo "
                    + "WHERE pe.estado = 'ENTREGADO'";
        }

        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta); ResultSet rs = st.executeQuery()) {
                lista = new ArrayList();
                while (rs.next()) {
                    Pedido pedido = new Pedido();
                    Platillo platillo = new Platillo();

                    platillo.setIdPlatillo(rs.getString(1));
                    platillo.setNombre(rs.getString(2));

                    pedido.setIdVenta(rs.getInt(3));
                    pedido.setCantidad(rs.getInt(4));
                    pedido.setIdMesa(rs.getInt(5));
                    pedido.setHora(rs.getString(6));
                    pedido.setSubtotal(rs.getDouble(7));
                    pedido.setIdPlatillo(platillo);

                    lista.add(pedido);
                }
                st.close();
                rs.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public boolean agregar(int idVenta, String platillo, int cantidad, int mesa) throws Exception {
        String consulta = "INSERT INTO pedidos (idplatillo,idventa,idmesa,cantidad,subtotal,estado) "
                + "VALUES (?,?,?,?,?,DEFAULT)";
        Platillo plat = dao.buscarID(platillo);
        try {
            this.conectar();
            int rs;
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setString(1, platillo);
                st.setInt(2, idVenta);
                st.setInt(3, mesa);
                st.setInt(4, cantidad);
                st.setDouble(5, (double) (cantidad * plat.getPrecio()));
                rs = st.executeUpdate();
                if (rs == 0) {
                    return false;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return true;
    }

    @Override
    public List<Pedido> listar(int idVenta, String condicion) throws Exception {
        List<Pedido> lista = null;

        String consulta;
        if (condicion.equals("PENDIENTE")) {
            consulta = "SELECT pl.idplatillo,pl.nombre,pl.precio,pe.idventa,pe.cantidad,pe.idmesa,pe.subtotal "
                    + "FROM pedidos pe JOIN platillos pl "
                    + "ON pe.idplatillo = pl.idplatillo "
                    + "WHERE pe.estado = 'PENDIENTE' "
                    + "AND pe.idventa = ?";
        } else if (condicion.equals("2")) {
            consulta = "SELECT pl.idplatillo,pl.nombre,pl.precio,pe.idventa,pe.cantidad,pe.idmesa,pe.subtotal "
                    + "FROM pedidos pe JOIN platillos pl "
                    + "ON pe.idplatillo = pl.idplatillo "
                    + "WHERE pe.estado IN ('PENDIENTE','ENTREGADO') "
                    + "AND pe.idventa = ?";
        } else {
            consulta = "SELECT pl.idplatillo,pl.nombre,pl.precio,pe.idventa,pe.cantidad,pe.idmesa,pe.subtotal "
                    + "FROM pedidos pe JOIN platillos pl "
                    + "ON pe.idplatillo = pl.idplatillo "
                    + "WHERE pe.estado = 'ENTREGADO' "
                    + "AND pe.idventa = ?";
        }

        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setInt(1, idVenta);
                ResultSet rs = st.executeQuery();
                lista = new ArrayList();
                while (rs.next()) {
                    Pedido pedido = new Pedido();
                    Platillo platillo = new Platillo();

                    platillo.setIdPlatillo(rs.getString(1));
                    platillo.setNombre(rs.getString(2));
                    platillo.setPrecio(rs.getDouble(3));

                    pedido.setIdVenta(rs.getInt(4));
                    pedido.setCantidad(rs.getInt(5));
                    pedido.setIdMesa(rs.getInt(6));
                    pedido.setSubtotal(rs.getDouble(7));
                    pedido.setIdPlatillo(platillo);

                    lista.add(pedido);
                }
                rs.close();
                st.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public int eliminar(int idVenta, String idProducto, String fecha, String hora) throws Exception {
        String consulta = "DELETE FROM pedidos "
                + "WHERE idventa = ? "
                + "AND idplatillo = ? "
                + "AND fecha = ? "
                + "AND hora = ? "
                + "AND estado = 'PENDIENTE'";
        int bnd = 0;
        Platillo plat = dao.buscarNombre(idProducto);
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setInt(1, idVenta);
                st.setString(2, plat.getIdPlatillo());
                st.setDate(3, Date.valueOf(fecha));
                st.setTime(4, Time.valueOf(hora));
                bnd = st.executeUpdate();
                st.close();
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return bnd;
    }

    @Override
    public int actualizar(int idVenta, String idProducto, String fecha, String hora, String estado) throws Exception {
        String consulta = "UPDATE pedidos "
                + "SET estado = ? "
                + "WHERE idventa = ? "
                + "AND idplatillo = ? "
                + "AND fecha = ? "
                + "AND hora = ? "
                + "AND estado = 'PENDIENTE'";
        int bnd = 0;
        Platillo plat = dao.buscarNombre(idProducto);
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setString(1, estado);
                st.setInt(2, idVenta);
                st.setString(3, plat.getIdPlatillo());
                st.setDate(4, Date.valueOf(fecha));
                st.setTime(5, Time.valueOf(hora));
                bnd = st.executeUpdate();
                st.close();
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return bnd;
    }

}
