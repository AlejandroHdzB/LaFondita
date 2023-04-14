package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Modelos.Mesero;
import itt.Interfaces.DAOCRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOMeserosImpl extends Conexion implements DAOCRUD {

    @Override
    public List<Mesero> listar() throws Exception {
        List<Mesero> lista = null;
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement("SELECT idmesero,nombre,apellido,edad FROM meseros"); ResultSet resultSet = st.executeQuery()) {
                lista = new ArrayList();
                while (resultSet.next()) {
                    Mesero mesero = new Mesero();
                    mesero.setIdMesero(resultSet.getInt(1));
                    mesero.setNombre(resultSet.getString(2));
                    mesero.setApellido(resultSet.getString(3));
                    mesero.setEdad(resultSet.getInt(4));
                    lista.add(mesero);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public void agregar(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Mesero> listar(String complemento) throws Exception {
        List<Mesero> lista = null;
        try {
            this.conectar();
            PreparedStatement st = conexion.prepareStatement("SELECT idmesero,nombre,apellido,edad FROM meseros "
                    + "WHERE nombre = ?");
            st.setString(1, complemento);
            ResultSet resultSet = st.executeQuery();
            lista = new ArrayList();
            while (resultSet.next()) {
                Mesero mesero = new Mesero();
                mesero.setIdMesero(resultSet.getInt(1));
                mesero.setNombre(resultSet.getString(2));
                mesero.setApellido(resultSet.getString(3));
                mesero.setEdad(resultSet.getInt(4));
                lista.add(mesero);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

}
