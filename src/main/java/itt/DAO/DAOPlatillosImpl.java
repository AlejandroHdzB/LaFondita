package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOPlatillos;
import itt.Modelos.Platillo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPlatillosImpl extends Conexion implements DAOPlatillos{

    @Override
    public List<Platillo> listarTodos() throws Exception {
        List<Platillo> lista = null;
        String consulta = "SELECT * FROM platillos";
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement(consulta); ResultSet rs = st.executeQuery()) {
                lista = new ArrayList();
                while (rs.next()) {
                    Platillo platillo = new Platillo();
                    
                    platillo.setIdPlatillo(rs.getString(1));
                    platillo.setNombre(rs.getString(2));
                    platillo.setTipo(rs.getString(3));
                    platillo.setPrecio(rs.getDouble(4)); 

                    lista.add(platillo);
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
    public List<Platillo> listar(String tipo) throws Exception {
        List<Platillo> lista = null;
        String consulta = "SELECT * FROM platillos "
                        + "WHERE tipo = ?";
        try {
            this.conectar();
            try{
                PreparedStatement st = conexion.prepareStatement(consulta); 
                st.setString(1, tipo);
                ResultSet rs = st.executeQuery();
                lista = new ArrayList();
                while (rs.next()) {
                    Platillo platillo = new Platillo();
                    
                    platillo.setIdPlatillo(rs.getString(1));
                    platillo.setNombre(rs.getString(2));
                    platillo.setTipo(rs.getString(3));
                    platillo.setPrecio(rs.getDouble(4)); 

                    lista.add(platillo);
                }
            }catch(SQLException e){
                throw e;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }
    
}
