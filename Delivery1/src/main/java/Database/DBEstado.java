/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Estado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class DBEstado {
    Conexion BLcon = new Conexion();
    
    public ResultSet obtenerEstadosPaquete(Estado objEstado) throws SQLException {
        String consulta
                = """
                  SELECT *
                  FROM delivery.estado
                  WHERE paquete_idPaquete = ?;""";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setInt(1, objEstado.getIdPaquete());
        return ps.executeQuery();
    }
}
