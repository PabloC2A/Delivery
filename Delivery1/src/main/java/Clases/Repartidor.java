package Clases;

/**
 *
 * @author ruben
 */
public class Repartidor extends Empleado{
    private int zona;

    public Repartidor() {
    }

    public Repartidor(int zona) {
        this.zona = zona;
    }

    public Repartidor(int zona, String ciudad) {
        super(ciudad);
        this.zona = zona;
    }

    public Repartidor(int zona, String ciudad,String cedula, String apellidos, String nombres, String mail) {
        super(ciudad, cedula, apellidos, nombres, mail);
        this.zona = zona;
    }
    
    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "zona=" + zona + '}';
    }
    
}
