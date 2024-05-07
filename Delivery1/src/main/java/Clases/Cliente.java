package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String celular;
    private ArrayList<Direccion> direccion;

    public Cliente() {
    }

    public Cliente(String celular, ArrayList<Direccion> direccion) {
        this.celular = celular;
        this.direccion = direccion;
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
    
}
