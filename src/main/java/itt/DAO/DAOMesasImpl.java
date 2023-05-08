package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOMesas;
import itt.Modelos.Mesa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public Mesa[] listar() throws Exception {
        String consulta = "SELECT * FROM mesas";
        Mesa mesas[] = null;
        int i = 0;
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    rs = st.executeQuery();
                    mesas = new Mesa[8];
                    while (rs.next()) {
                        Mesa m = new Mesa();
                        m.setIdMesa(rs.getInt(1));
                        m.setAsientos(rs.getInt(2));
                        m.setEstado(rs.getInt(3));

                        mesas[i] = m;
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
    public boolean actualizarEstado(int id) throws Exception {
        String consulta = "UPDATE mesas SET estado = 0 "
                + "WHERE idmesa = ?";

        try {
            this.conectar();
            int rs;
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setInt(1, id);
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
