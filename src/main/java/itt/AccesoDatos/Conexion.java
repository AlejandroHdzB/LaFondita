package itt.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    protected Connection conexion;
    private final String URL= "jdbc:mysql://localhost:3306/lafondita";
    private final String DIRVER_JDBC = "com.mysql.jdbc.Driver";
    
    private final String USER = "alex";
    private final String PASSWORD = "123";
    
    public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName(DIRVER_JDBC);
        this.conexion = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public void desconectar() throws SQLException{
        if(this.conexion != null){
            if(!this.conexion.isClosed()){
                this.conexion.close();
            }
        }
    }
    
}
