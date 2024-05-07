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
    private String codigo;
    private Date fecha;
    private String observacion;

    public Entrega() {
    }

    public Entrega(String codigo, Date fecha, String observacion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    @Override
    public String toString() {
        return "Entrega{" + "codigo=" + codigo + ", fecha=" + fecha + ", observacion=" + observacion + '}';
    }       
}
