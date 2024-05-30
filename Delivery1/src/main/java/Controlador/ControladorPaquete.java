/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Cliente;
import Clases.Paquete;
import Database.DBPaquetes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class ControladorPaquete {

    DBPaquetes con = new DBPaquetes();

    public ArrayList<Paquete> obtenerPaquetes(Cliente objCliente) throws SQLException {
        ArrayList paquetesProcesados = new ArrayList();
        ResultSet paquetesObtenidos = con.obtenerPaquetesPorCliente(objCliente);
        
        while(paquetesObtenidos.next()) {
            Paquete paquete = new Paquete();
            paquete.setIdPaquete(paquetesObtenidos.getInt("idPaquete"));
            paquete.setCodigo(paquetesObtenidos.getString("codigo"));
            paquete.setDescripcion(paquetesObtenidos.getString("descripcion"));
            paquete.setPeso(paquetesObtenidos.getDouble("peso"));
            paquete.setAlto(paquetesObtenidos.getDouble("alto"));
            paquetesProcesados.add(paquete);
        }
        return paquetesProcesados;
    }
}
