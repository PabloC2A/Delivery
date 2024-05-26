/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pablo
 */
public class Entrega {
    private String codigo;
    private Date fecha;
    private String observacion;
    private ArrayList<Cliente> cliente;
    private int idPaquete;
    private int idEmpleado;

    public Entrega() {
    }

    public Entrega(String codigo, Date fecha, String observacion, ArrayList<Cliente> cliente, int idPaquete, int idEmpleado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.cliente = cliente;
        this.idPaquete = idPaquete;
        this.idEmpleado = idEmpleado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Entrega{" + "codigo=" + codigo + ", fecha=" + fecha + ", observacion=" + observacion + ", cliente=" + cliente + ", idPaquete=" + idPaquete + ", idEmpleado=" + idEmpleado + '}';
    }
    
}
