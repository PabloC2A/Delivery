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

    public ResultSet obtenerEntregasPorCliente(Entrega objEntrega) throws SQLException {
        String consulta
                = """
                  SELECT *
                  FROM delivery.entrega e
                  INNER JOIN delivery.cliente c ON e.clienteCedula = c.cedulaCliente
                  WHERE c.cedulaCliente = '?';""";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setString(1, objEntrega.getIdCliente());
        return ps.executeQuery();
    }
    
    public ResultSet obtenerEntregasPorCodPaquete(Entrega objEntrega) throws SQLException {
        String consulta
                = """
                  SELECT *
                  FROM delivery.entrega
                  WHERE idPaquete = ?;""";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setInt(1, objEntrega.getIdPaquete());
        return ps.executeQuery();
    }
}
