
package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOVentas;
import itt.Vista.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOVentasImpl extends Conexion implements DAOVentas{

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
            
            if(filas == 0){
                throw new SQLException("No se pudo guardar");
            }
            
            ResultSet rs = st.getGeneratedKeys();
            
            if(rs.next()){
                idVenta = rs.getInt(1);
            }else{
                return idVenta;
            }
            
        } catch (SQLException e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return idVenta;
    }
    
}
