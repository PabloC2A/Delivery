
package Logica;

import Clases.Cliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validarEmail {
    public static boolean validarCorreo(Cliente cliente) {
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cliente.getMail());
        return matcher.matches();
    }
}
