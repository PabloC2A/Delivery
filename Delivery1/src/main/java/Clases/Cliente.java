package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String celular;
    private ArrayList<Direccion> direccion;
    private ArrayList<Entrega> entrega;

    public Cliente() {
        this.direccion = new ArrayList<>();
        this.entrega = new ArrayList();
    }

    public Cliente(String celular, ArrayList<Direccion> direccion) {
        this.celular = celular;
        this.direccion = direccion;
        this.direccion = new ArrayList<>();
        this.entrega = new ArrayList();
    }

    public Cliente(String celular, ArrayList<Direccion> direccion, String cedula, String apellidos, String nombres, String mail) {
        super(cedula, apellidos, nombres, mail);
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<Direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(ArrayList<Direccion> direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Entrega> getEntrega() {
        return entrega;
    }

    public void setEntrega(ArrayList<Entrega> entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "Cliente{" + "celular=" + celular + ", direccion=" + direccion + ", entrega=" + entrega + '}';
    }
}
