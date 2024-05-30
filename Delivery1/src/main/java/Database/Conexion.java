package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/delivery";
    private static final String USER = "root";
    private static final String PASSWORD = "123456789";

    public Connection abrir() {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void CerrarConexion() throws SQLException {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
