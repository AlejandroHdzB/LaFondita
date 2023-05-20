package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Modelos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import itt.Interfaces.DAOUsuarios;

public class DAOUsuariosImpl extends Conexion implements DAOUsuarios {

    @Override
    public int buscar(String usuario, String contraseña) throws Exception {
        String consulta1 = "SELECT idusuario "
                + "FROM usuarios "
                + "WHERE idusuario = ? ";

        String consulta2 = "SELECT idusuario "
                + "FROM usuarios "
                + "WHERE idusuario = ? "
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
    public Usuario buscar(String id) throws Exception {
        Usuario usuario = null;
        String consulta = "SELECT idusuario,nombre,apellido,roll "
                + "FROM usuarios "
                + "WHERE idusuario = ? ";
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    st.setString(1, id);
                    rs = st.executeQuery();
                    if (rs.next()) {
                        usuario = new Usuario();
                        
                        usuario.setIdUsuario(rs.getString(1));
                        usuario.setNombre(rs.getString(2));
                        usuario.setApellido(rs.getString(3));
                        usuario.setRoll(rs.getString(4));
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
        return usuario;
    }

}
