package Controlador;

import Clases.Cliente;
import Database.DBCliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ruben
 */
public class ControladorPersona {
    DBCliente objBDCliente = new DBCliente();

    /*public void AgregarCliente(Cliente objCliente) throws SQLException, ClassNotFoundException {
        objBDCliente.insertarCliente(objCliente);
    }

    public void RecuperarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        try (ResultSet rs = objBDCliente.RecuperarUsuarios(objCliente)) {
            while (rs.next()) {
                objCliente.setIdCliente(rs.getInt(1));
                objCliente.setCedula(rs.getString(2));
                objCliente.setNombres(rs.getString(3));
                objCliente.setApellidos(rs.getString(4));
            }
        }
    }*/

    
}
