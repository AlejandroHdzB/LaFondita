package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOMesas;
import itt.Modelos.Mesa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOMesasImpl extends Conexion implements DAOMesas {

    @Override
    public int verEstado(int idMesa) throws Exception {
        String consulta = "SELECT estado FROM mesas "
                + "WHERE idmesa = ?";
        int estado = -1;
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    st.setInt(1, idMesa);
                    rs = st.executeQuery();
                    if (rs.next()) {
                        estado = rs.getInt(1);
                    }
                }
                rs.close();
            } catch (SQLException e) {
                throw e;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return estado;
    }

    @Override
    public List<Mesa> listar() throws Exception {
        String consulta = "SELECT idmesa,asientos,estado FROM mesas";
        List<Mesa> mesas;
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    rs = st.executeQuery();
                    mesas = new ArrayList<>();
                    while (rs.next()) {
                        Mesa m = new Mesa();
                        m.setIdMesa(rs.getInt(1));
                        m.setAsientos(rs.getInt(2));
                        m.setEstado(rs.getInt(3));
                        
                        mesas.add(m);
                    }
                }
                rs.close();
            } catch (SQLException e) {
                throw e;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return mesas;
    }

    @Override
    public boolean actualizarEstado(int id, int estado) throws Exception {
        String consulta = "UPDATE mesas SET estado = ? "
                + "WHERE idmesa = ?";

        try {
            this.conectar();
            int rs;
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setInt(1, estado);
                st.setInt(2, id);
                rs = st.executeUpdate();
                if(rs == 0){
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

}
