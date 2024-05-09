/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    private String ciudad;
    private ArrayList<Entrega> entrega;

    public Empleado() {
        this.entrega = new ArrayList();
    }

    public Empleado(String ciudad) {
        this.ciudad = ciudad;
        this.entrega = new ArrayList();
    }

    public Empleado(String ciudad, ArrayList<Entrega> entrega, String cedula, String apellidos, String nombres, String mail) {
        super(cedula, apellidos, nombres, mail);
        this.ciudad = ciudad;
        this.entrega = entrega;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Entrega> getEntrega() {
        return entrega;
    }

    public void setEntrega(ArrayList<Entrega> entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ciudad=" + ciudad + '}';
    }
}
