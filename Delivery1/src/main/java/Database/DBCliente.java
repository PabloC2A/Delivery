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

    public ResultSet obtenerClientes(Cliente objCliente) throws SQLException {
        String consulta
                = "SELECT FROM cliente WHERE *";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(consulta);
        return ps.executeQuery();
    }

    public void registrarCliente(Cliente objCliente) throws SQLException {
        String consultaPersona
                = "INSERT INTO delivery.persona (cedula, apellidos, nombres, mail) VALUES (?, ?, ?, ?)";
        String consultaCliente
                = "INSERT INTO delivery.cliente (cedulaCliente, celular) VALUES (?, ?)";
        
        PreparedStatement psPersona = BLcon.getConnection().prepareStatement(consultaPersona);
        PreparedStatement psCliente = BLcon.getConnection().prepareStatement(consultaCliente);
        // Insertar en la tabla persona
        psPersona.setString(1, objCliente.getCedula());
        psPersona.setString(2, objCliente.getApellidos());
        psPersona.setString(3, objCliente.getNombres());
        psPersona.setString(4, objCliente.getMail());
        psPersona.executeQuery();
        // Insertar en la tabla cliente
        psCliente.setString(1, objCliente.getCedula());
        psCliente.setString(2, objCliente.getCelular());
        psCliente.executeQuery();
    }
}
