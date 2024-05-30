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

    public DBCliente() {
        BLcon.abrir();
    }
    
    public ResultSet obtenerClientes(Cliente objCliente) throws SQLException {
        String consulta
                = "SELECT * FROM cliente;";
        PreparedStatement ps = BLcon.abrir().prepareStatement(consulta);
        return ps.executeQuery();
    }

    public void registrarCliente(Cliente objCliente) throws SQLException {
        String consultaPersona
                = "insert into persona (cedula,nombres,apellidos,mail) VALUES (?,?,?,?);";
        String consultaCliente
                = "insert into cliente (celular,Persona_cedula) VALUES (?,?);";
        
        PreparedStatement psPersona = BLcon.abrir().prepareStatement(consultaPersona);
        PreparedStatement psCliente = BLcon.abrir().prepareStatement(consultaCliente);
        // Insertar en la tabla persona
        psPersona.setString(1, objCliente.getCedula());
        psPersona.setString(2, objCliente.getApellidos());
        psPersona.setString(3, objCliente.getNombres());
        psPersona.setString(4, objCliente.getMail());
        psPersona.executeQuery();
        // Insertar en la tabla cliente
        psCliente.setString(1, objCliente.getCelular());
        psCliente.setString(2, objCliente.getCedula());
        psCliente.executeQuery();
    }
}
