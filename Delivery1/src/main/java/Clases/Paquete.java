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
public class Paquete {
    private int idPaquete;
    private String codigo;
    private String descripcion;
    private double peso;
    private double alto;
    private Estado[] estado;

    public Paquete() {
        this.estado = new Estado[] {
            new Estado(1, "Creado", new Date(), ""),
            new Estado(2, "Pendiente", null, ""),
            new Estado(3, "Despachado", null, ""),
            new Estado(4, "Entregado", null, "")
        };
    }

    public Paquete(int idPaquete, String codigo, String descripcion, double peso, double alto) {
        this.idPaquete = idPaquete;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.alto = alto;
        this.estado = new Estado[] {
            new Estado(1, "Creado", new Date(), ""),
            new Estado(2, "Pendiente", null, ""),
            new Estado(3, "Despachado", null, ""),
            new Estado(4, "Entregado", null, "")
        };
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setEstado(Estado[] estado) {
        this.estado = estado;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public double getAlto() {
        return alto;
    }

    public Estado[] getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", codigo=" + codigo + ", descripcion=" + descripcion + ", peso=" + peso + ", alto=" + alto + '}';
    }
}
