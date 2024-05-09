package Logica;

import Clases.Cliente;
import java.util.regex.Pattern;

public class validarCedula {
    public static boolean ValidaCedula(Cliente objCliente) {
        String regex = "[0-9]{10}+";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(objCliente.getCedula()).matches();
    }
}
