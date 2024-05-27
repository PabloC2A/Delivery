package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/delivery";
    private static final String USER = "root";
    private static String PASSWORD;

    public Conexion() {
    }

    public Conexion(String passwordAux) {
        Conexion.PASSWORD = passwordAux;
    }

    public Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(URL, USER, PASSWORD);
                return con;
            } catch (SQLException e) {
                System.out.println("Error al conectar: ");
                return null;
            }
        } else {
            return con;
        }
    }

    public void CerrarConexion() throws SQLException {
        con.close();
    }
}