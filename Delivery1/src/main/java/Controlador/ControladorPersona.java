package Controlador;

import Clases.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ruben
 */
public class ControladorPersona {
    DBPersona objBDCliente = new DBPersona();

    public void AgregarPersona(Persona objCliente) throws SQLException, ClassNotFoundException {
        objBDCliente.insertarCliente(objCliente);
    }

}
