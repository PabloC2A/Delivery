
package Clases;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String cedula;
    private String apellidos;
    private String nombres;
    private String mail;

    public Persona() {
    }

    public Persona(String cedula, String apellidos, String nombres, String mail) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.mail = mail;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", apellidos=" + apellidos + ", nombres=" + nombres + ", mail=" + mail + '}';
    }
}
