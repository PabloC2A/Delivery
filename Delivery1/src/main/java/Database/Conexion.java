package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/delivery";
    private static final String USER = "root";
    private static final String PASSWORD = "CgXPqrFYAdaMLAP8dJiV";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

    public Connection AbrirConexion() throws ClassNotFoundException, SQLException {
        con = getConnection();
        return con;
    }

    public void CerrarConexion() throws SQLException {
        con.close();
    }
}
