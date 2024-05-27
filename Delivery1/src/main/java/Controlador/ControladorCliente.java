package Controlador;
import Clases.Cliente;
import Clases.Direccion;
import Logica.validarActual;
import java.util.ArrayList;
/**
 *
 * @author ruben
 */
public class ControladorCliente {
    public void revisarEstadoPaquete(ArrayList<Cliente> listaClientes, String cedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                for (Direccion direccion : cliente.getDireccion()) {
                    System.out.println(direccion);
                }
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public void actualizarDireccion(ArrayList<Cliente> listaClientes, String cedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                new validarActual().validarActual(cliente);
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }
}
