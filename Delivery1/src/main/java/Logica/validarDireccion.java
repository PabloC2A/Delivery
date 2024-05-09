package Logica;

import Clases.Direccion;

public class validarDireccion {
    public static boolean validarCalles(Direccion direccion) {
        return !direccion.getCalle1().equalsIgnoreCase(direccion.getCalle2());
    }
}
