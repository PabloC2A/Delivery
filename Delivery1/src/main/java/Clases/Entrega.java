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
    private ArrayList<Entrega> entrega;
    private ArrayList<Cliente> cliente;

    public Entrega() {
    }

    public Entrega(String codigo, Date fecha, String observacion, ArrayList<Entrega> entrega, ArrayList<Cliente> cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.entrega = entrega;
        this.cliente = cliente;
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

    public ArrayList<Entrega> getEntrega() {
        return entrega;
    }

    public void setEntrega(ArrayList<Entrega> entrega) {
        this.entrega = entrega;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Entrega{" + "codigo=" + codigo + ", fecha=" + fecha + ", observacion=" + observacion + ", entrega=" + entrega + ", cliente=" + cliente + '}';
    }
}
