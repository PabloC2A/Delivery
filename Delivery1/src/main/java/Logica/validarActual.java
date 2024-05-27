/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Clases.Cliente;
import Clases.Direccion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class validarActual {
    public static void comprobarDireccionActual(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);

        for (Direccion dir : cliente.getDireccion()) {
            System.out.println("¿Es esta su dirección actual? " + dir);
            System.out.println("Ingrese Sí = 1  |  No = 0");
            int respuesta = scanner.nextInt();

            if (respuesta == 1) {
                dir.setActual(1);
            } else if (respuesta == 0) {
                dir.setActual(0);
                
                System.out.println("Ingrese los nuevos datos de su dirección:");
                System.out.print("Código: ");
                String codigo = scanner.next();

                System.out.print("Calle principal: ");
                String calle1 = scanner.next();

                System.out.print("Calle secundaria: ");
                String calle2 = scanner.next();

                System.out.print("Referencia: ");
                String referencia = scanner.next();

                // Crear la nueva dirección
                Direccion nuevaDireccion = new Direccion(codigo, calle1, calle2, referencia, 1, cliente.getCedula());

                // Añadir la nueva dirección a la lista de direcciones
                cliente.getDireccion().add(nuevaDireccion);
            } else {
                System.out.println("Opción inválida. Por favor, ingrese 1 para SÍ o 0 para NO.");
            }
        }
    }
}
