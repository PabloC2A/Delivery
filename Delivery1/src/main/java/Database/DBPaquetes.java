/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Clases.Cliente;
import Clases.Entrega;
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

    public ResultSet obtenerPaquetes(Paquete objPaquete) throws SQLException {
        String consulta
                = "SELECT FROM paquete WHERE *";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        return ps.executeQuery();
    }
    
    public void registrarPaquete(Paquete objPaquete) throws SQLException {
        String consulta 
                = "INSERT INTO delivery.paquete (idPaquete, codigoPaq, descripcion, peso, alto) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        ps.setInt(1, objPaquete.getIdPaquete());
        ps.setString(2, objPaquete.getCodigo());
        ps.setString(3, objPaquete.getDescripcion());
        ps.setDouble(4,objPaquete.getPeso());
        ps.setDouble(5, objPaquete.getAlto());
        ps.executeQuery();
    }
}
