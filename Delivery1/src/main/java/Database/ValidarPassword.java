package Database;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ValidarPassword {
    public void validarClave() {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        String password;
        
        System.out.println("Ingrese la contraseña de la base de datos: ");
        sc.nextLine();
        password = sc.nextLine();
        
        Conexion BLcon = new Conexion(password);
        while (bandera) {
            if (BLcon.getConnection() != null) {
                System.out.println("Conexion exitosa");
                bandera = false;
            } else {
                System.out.println("Ingrese nuevamente la contraseña de la base de datos");
                password = sc.nextLine();
            }
        }
    }
}
