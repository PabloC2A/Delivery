/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Direccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class DBDireccion {

    Conexion BLcon = new Conexion();

    public ResultSet obtenerDirecciones(Direccion objDireccion) throws SQLException {
        String consulta
                = "SELECT FROM direccion WHERE *";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        return ps.executeQuery();
    }
    
    public ResultSet obtenerDireccionPorCliente(Direccion objDireccion) throws SQLException {
        String consulta
                = """
                  SELECT *
                  FROM delivery.direccion d
                  INNER JOIN delivery.cliente c ON d.cedulaClienteDir = c.cedulaCliente
                  WHERE c.cedulaCliente = '?';""";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setString(1, objDireccion.getIdCliente());
        return ps.executeQuery();
    }
}
