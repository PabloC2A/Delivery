/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Entrega;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class DBEntrega {
        Conexion BLcon = new Conexion();

    public ResultSet obtenerEntregas(Entrega objEntrega) throws SQLException {
        String consulta
                = "SELECT FROM entrega WHERE *";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        return ps.executeQuery();
    }
}
