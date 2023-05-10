package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOMeseros;
import itt.Modelos.Mesero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMeserosImpl extends Conexion implements DAOMeseros {

    @Override
    public int buscar(String usuario, String contraseña) throws Exception {
        String consulta1 = "SELECT idmesero "
                + "FROM meseros "
                + "WHERE idmesero = ? ";

        String consulta2 = "SELECT idmesero "
                + "FROM meseros "
                + "WHERE idmesero = ? "
                + "AND contraseña = ?";
        try {
            this.conectar();
            PreparedStatement st = conexion.prepareStatement(consulta1);
            st.setString(1, usuario);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                st = conexion.prepareStatement(consulta2);
                st.setString(1, usuario);
                st.setString(2, contraseña);
                rs = st.executeQuery();
                if (!rs.next()) {
                    return 2;
                }
            } else {
                return 1;
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return 0;
    }

    @Override
    public Mesero buscar(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
