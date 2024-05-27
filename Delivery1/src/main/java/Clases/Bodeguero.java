package Clases;

/**
 *
 * @author ruben
 */
public class Bodeguero extends Empleado {
    private String local;

    public Bodeguero() {
    }

    public Bodeguero(String local) {
        this.local = local;
    }

    public Bodeguero(String local, String ciudad) {
        super(ciudad);
        this.local = local;
    }

    public Bodeguero(String local, String ciudad, String cedula, String apellidos, String nombres, String mail) {
        super(ciudad, cedula, apellidos, nombres, mail);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Bodeguero{" + "local=" + local + '}';
    }
    
}
