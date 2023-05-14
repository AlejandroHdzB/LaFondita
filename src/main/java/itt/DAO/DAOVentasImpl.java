package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOVentas;
import itt.Modelos.Mesero;
import itt.Modelos.Pedido;
import itt.Modelos.Venta;
import itt.Vista.Principal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.List;

public class DAOVentasImpl extends Conexion implements DAOVentas {

    private final DAOPedidosImpl daoPedidos = new DAOPedidosImpl();

    @Override
    public int agregar() throws Exception {
        String consultaIns = "INSERT INTO ventas (fecha,hora,total,idmesero) "
                + "VALUES (DEFAULT,DEFAULT,DEFAULT,?)";
        int idVenta = 0;
        int filas = 0;

        try {
            this.conectar();
            PreparedStatement st = conexion.prepareStatement(consultaIns, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, Principal.usuario);

            filas = st.executeUpdate();

            if (filas == 0) {
                throw new SQLException("No se pudo guardar");
            }

            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                idVenta = rs.getInt(1);
            } else {
                return idVenta;
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return idVenta;
    }

    @Override
    public int actualizar(int idVenta) throws Exception {
        String consultaIns = "UPDATE ventas "
                + "SET fecha = ?, hora = ?, total = ? "
                + "WHERE idventa = ?";
        int filas = 0;
        double total = this.calculoTotal(idVenta);
        try {
            this.conectar();
            PreparedStatement st = conexion.prepareStatement(consultaIns);
            st.setDate(1, Date.valueOf(Principal.fechaSistema));
            st.setTime(2, Time.valueOf(Principal.horaSistema));
            st.setDouble(3, total);
            st.setInt(4, idVenta);

            filas = st.executeUpdate();

            if (filas == 0) {
                throw new SQLException("No se pudo guardar");
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return filas;
    }

    private double calculoTotal(int idVenta) throws Exception {
        List<Pedido> pedidos = daoPedidos.listar(idVenta,"2");
        double total = 0;
        for (Pedido p : pedidos) {
            total += (double) p.getSubtotal();
        }
        return total;
    }

    @Override
    public Venta getDatosCuenta(int idVenta) throws Exception {
        Venta venta = null;
        String consulta = "SELECT nombre,apellido,fecha,hora,total "
                + "FROM ventas JOIN meseros "
                + "USING(idmesero) "
                + "WHERE idventa = ?";
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setInt(1, idVenta);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    venta = new Venta();
                    Mesero m = new Mesero();

                    m.setNombre(rs.getString(1));
                    m.setApellido(rs.getString(2));

                    venta.setFecha(rs.getString(3));
                    venta.setHora(rs.getString(4));
                    venta.setTotal(rs.getDouble(5));
                    venta.setMesero(m);
                }
                rs.close();
                st.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return venta;
    }
}
