/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Entrega;
import Clases.Paquete;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class ControladorRepartidor {
    public void registrarEntrega(ArrayList<Entrega> listaEntregas, ArrayList<Paquete> listaPaquetes, String codigoPaquete, String observaciones) {
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del paquete:");
        String codigoPaquete = entrada.nextLine();

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                Entrega entrega = new Entrega();
                entrega.setCodigoEntrega(codigoPaquete);
                entrega.setFecha(new Date());
                System.out.println("Ingrese observaciones de la entrega:");
                entrega.setObservacion(entrada.nextLine());
                listaEntregas.add(entrega);
                System.out.println("Entrega registrada exitosamente.");
                return;
            }
        }
        System.out.println("Paquete no encontrado.");*/
        for (Paquete paquete : listaPaquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                Entrega entrega = new Entrega();
                entrega.setCodigoEntrega(codigoPaquete);
                entrega.setFecha(new Date());
                entrega.setObservacion(observaciones);
                listaEntregas.add(entrega);
                System.out.println("Entrega registrada exitosamente.");
                return;
            }
        }
        System.out.println("Paquete no encontrado.");
    }
        
}
