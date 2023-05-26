package itt.DAO;

import itt.AccesoDatos.Conexion;
import itt.Interfaces.DAOPlatillos;
import itt.Modelos.Platillo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPlatillosImpl extends Conexion implements DAOPlatillos {

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
    public List<Platillo> listar(String tipo) throws Exception {
        List<Platillo> lista = null;
        String consulta = "SELECT * FROM platillos "
                + "WHERE tipo = ?";
        try {
            this.conectar();
            try {
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
                st.close();
                rs.close();
            } catch (SQLException e) {
                throw e;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public Platillo buscarID(String id) throws Exception {
        Platillo platillo = null;
        String consulta = "SELECT * FROM platillos "
                + "WHERE idplatillo = ?";
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    st.setString(1, id);
                    rs = st.executeQuery();
                    if (rs.next()) {
                        platillo = new Platillo();

                        platillo.setIdPlatillo(rs.getString(1));
                        platillo.setNombre(rs.getString(2));
                        platillo.setTipo(rs.getString(3));
                        platillo.setPrecio(rs.getDouble(4));
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
        return platillo;
    }

    @Override
    public Platillo buscarNombre(String nombre) throws Exception {
        Platillo platillo = null;
        String consulta = "SELECT * FROM platillos "
                + "WHERE nombre = ?";
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    st.setString(1, nombre);
                    rs = st.executeQuery();
                    if (rs.next()) {
                        platillo = new Platillo();

                        platillo.setIdPlatillo(rs.getString(1));
                        platillo.setNombre(rs.getString(2));
                        platillo.setTipo(rs.getString(3));
                        platillo.setPrecio(rs.getDouble(4));
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
        return platillo;
    }

    @Override
    public List<Platillo> buscarPrecio(double precio) throws Exception {
        List<Platillo> lista = null;
        String consulta = "SELECT * FROM platillos "
                + "WHERE precio = ?";
        try {
            this.conectar();
            try {
                PreparedStatement st = conexion.prepareStatement(consulta);
                st.setDouble(1, precio);
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
                st.close();
                rs.close();
            } catch (SQLException e) {
                throw e;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public List<Platillo> buscarLikeNombre(String nombre) throws Exception {
        List<Platillo> lista = null;
        String consulta = "SELECT * FROM platillos "
                + "WHERE nombre LIKE CONCAT('%',?,'%')";
        try {
            this.conectar();
            try {
                ResultSet rs;
                try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                    st.setString(1, nombre);
                    rs = st.executeQuery();
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
                rs.close();
            } catch (SQLException e) {
                throw e;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public boolean agregar(String nombre, String tipo, double precio) throws Exception {
        String consulta = "INSERT INTO platillos (idplatillo,nombre,tipo,precio) "
                + "VALUES (?,?,?,?)";
        try {
            this.conectar();
            int rs;
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setString(1, generarIDPlatillo(nombre, tipo));
                st.setString(2, nombre);
                st.setString(3, tipo);
                st.setDouble(4, precio);
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

    private String generarIDPlatillo(String nombre, String tipo) {
        String p = "";
        nombre = nombre.toUpperCase();
        if (tipo.equals("entrada") || tipo.equals("fuerte") || tipo.equals("postre")) {
            p += "P" + nombre.substring(0, 1) + nombre.substring(nombre.length() - 2, nombre.length());
        } else {
            p += "B" + nombre.substring(0, 1) + nombre.substring(nombre.length() - 2, nombre.length());
        }
        int n = (int) (Math.random() * 10);
        p += String.valueOf(n);

        return p;
    }

    @Override
    public boolean actualizar(String id, String nombre, String tipo, double precio) throws Exception {
        String consulta = "UPDATE platillos  "
                + "SET nombre = ?, "
                + "tipo = ?, "
                + "precio = ? "
                + "WHERE idplatillo = ?";

        try {
            this.conectar();
            int rs;
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setString(1, nombre);
                st.setString(2, tipo);
                st.setDouble(3, precio);
                st.setString(4, id);
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
    public boolean eliminar(String id) throws Exception {
        String consulta = "DELETE FROM platillos  "
                + "WHERE idplatillo = ?";

        try {
            this.conectar();
            int rs;
            try (PreparedStatement st = conexion.prepareStatement(consulta)) {
                st.setString(1, id);
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
}
