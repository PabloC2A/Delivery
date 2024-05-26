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
public class Estado {
    private int tipo;
    private String estado;
    private Date fecha;
    private String observacion;
    private ArrayList<Paquete> idPaquete;

    public Estado() {
        this.idPaquete = new ArrayList<>(4);
    }

    public Estado(int tipo, String estado, Date fecha, String observacion, ArrayList<Paquete> idPaquete) {
        this.tipo = tipo;
        this.estado = estado;
        this.fecha = fecha;
        this.observacion = observacion;
        this.idPaquete =idPaquete;
    }
    
    public Estado(int tipo, String estado, Date fecha, String observacion) {
        this.tipo = tipo;
        this.estado = estado;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public ArrayList<Paquete> getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(ArrayList<Paquete> idPaquete) {
        this.idPaquete = idPaquete;
    }

    @Override
    public String toString() {
        return "Estado{" + "tipo=" + tipo + ", estado=" + estado + ", fecha=" + fecha + ", observacion=" + observacion + ", idPaquete=" + idPaquete + '}';
    }
    
}
