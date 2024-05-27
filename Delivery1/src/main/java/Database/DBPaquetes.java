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
    
    public ResultSet RecuperarUsuarios(Paquete objPaquete) throws ClassNotFoundException, SQLException{
        String Sentencia = "SELECT * FROM programacion_avanzada.clientes where cedula = ?;";
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPaquete.getCedula());
        return ps.executeQuery();
    }
}
