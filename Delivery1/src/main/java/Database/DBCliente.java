/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class DBCliente {
        Conexion BLcon = new Conexion();

    public ResultSet obtenerPaquetes(Cliente objCliente) throws SQLException {
        String consulta
                = "SELECT FROM cliente WHERE *";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        return ps.executeQuery();
    }
}
