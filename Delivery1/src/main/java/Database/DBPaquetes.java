/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Paquete;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class DBPaquetes {

    Conexion BLcon = new Conexion();

    public ResultSet obtenerPaquetePorCodigo(Paquete objPaquete) throws SQLException {
        String consulta
                = "SELECT idPaquete, codigoPaq, descripcion, peso, alto FROM paquete WHERE codigoPaq = ?;";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setString(1, objPaquete.getCodigo());
        return ps.executeQuery();
    }
}
