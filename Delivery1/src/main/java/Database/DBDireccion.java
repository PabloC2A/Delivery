/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Cliente;
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

    public ResultSet agregarDireccion(Direccion objDireccion) throws SQLException {
        String consulta
                = """
                    INSERT INTO delivery.direccion (calle1, calle2, referencia, actual, cliente_idCli, cedulaClienteDir)
                    VALUES ('?', '?', '?', ?, '?');""";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setString(1, objDireccion.getCalle1());
        ps.setString(2, objDireccion.getCalle2());
        ps.setString(3, objDireccion.getReferencia());
        ps.setInt(4, objDireccion.getActual());
        ps.setString(5, objDireccion.getIdCliente());
        return ps.executeQuery();
    }

    public ResultSet modifcarEstadoActualPorCliente(Direccion objDireccion, Cliente objCliente) throws SQLException {
        String consulta
                = """
                   UPDATE delivery.direccion SET actual = ? WHERE cliente_idCli = ?""";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setInt(1, objDireccion.getActual());
        ps.setString(2, objCliente.getCedula());
        return ps.executeQuery();
    }
}
