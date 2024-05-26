/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Clases.Cliente;
import Clases.Direccion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class validarActual {
    public void validarActual(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        boolean dirEncontrada = false;

        ArrayList<Direccion> direcciones = cliente.getDireccion();

        for (Direccion dir : direcciones) {
            System.out.println("¿Esta es su dirección actual? " + dir);
            System.out.println("1 = Sí  |  0 = No");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    dir.setActual(1);
                    dirEncontrada = true;
                    System.out.println(dir + "Se confirmó como su direccion actual.");
                    break;
                case 0:
                    dir.setActual(0);
                    break;
                default:
                    System.out.println("Entrada no válida. Ingrese las opciones disponibles.");
                    break;
            }

            if (dirEncontrada) {
                break;
            }
        }

        if (!dirEncontrada) {
            System.out.println("Ingrese los detalles de su nueva dirección:");
            System.out.print("Código: ");
            String codigo = scanner.next();
            System.out.print("Calle 1: ");
            String calle1 = scanner.next();
            System.out.print("Calle 2: ");
            String calle2 = scanner.next();
            System.out.print("Referencia: ");
            String referencia = scanner.next();

            /*Direccion nuevaDireccion = new Direccion(codigo, calle1, calle2, referencia, 1, );
            direcciones.add(nuevaDireccion);
            System.out.println("Nueva dirección agregada.");*/
        }
    }
}
