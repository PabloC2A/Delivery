/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String celular;

    public Cliente(String celular) {
        this.celular = celular;
    }

    public Cliente(String celular, String cedula, String apellidos, String nombres, String mail) {
        super(cedula, apellidos, nombres, mail);
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "celular=" + celular + '}';
    }
}
