/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Pablo
 */
public class Entrega {
    private String codigoEntrega;
    private Date fecha;
    private String observacion;
    private String idCliente;
    private String idEmpleado;
    private int idPaquete;


    public Entrega() {
    }

    public Entrega(String codigoEntrega, Date fecha, String observacion, String idCliente, String idEmpleado, int idPaquete) {
        this.codigoEntrega = codigoEntrega;
        this.fecha = fecha;
        this.observacion = observacion;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idPaquete = idPaquete;
    }

    public String getCodigoEntrega() {
        return codigoEntrega;
    }

    public void setCodigoEntrega(String codigoEntrega) {
        this.codigoEntrega = codigoEntrega;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    @Override
    public String toString() {
        return "Entrega{" + "codigoEntrega=" + codigoEntrega + ", fecha=" + fecha + ", observacion=" + observacion + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado + ", idPaquete=" + idPaquete + '}';
    }
}
