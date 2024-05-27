package Controlador;
import Clases.Cliente;
import Clases.Direccion;
import Database.DBCliente;
import Database.DBDireccion;
import Logica.validarActual;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author ruben
 */
public class ControladorCliente {
    
    DBCliente objBDCliente = new DBCliente();
    DBDireccion objDBDireccion = new DBDireccion();

    public void AgregarCliente(Cliente objCliente) throws SQLException, ClassNotFoundException {
        objBDCliente.registrarCliente(objCliente);
    }

    public void crearDireccion(Direccion direccion) throws SQLException {
        objDBDireccion.agregarDireccion(direccion);
        System.out.println("Creado.");
    }

    public void actualizarDireccion(Cliente cliente, Direccion direccion) throws SQLException {
        objDBDireccion.modifcarEstadoActualPorCliente(direccion, cliente);
        System.out.println("Actualizado.");
    }
}
