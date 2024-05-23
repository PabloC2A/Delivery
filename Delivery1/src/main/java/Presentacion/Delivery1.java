/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Presentacion;

import Clases.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Delivery1 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Entrega> listaEntregas = new ArrayList<>();
        ArrayList<Paquete> listaPaquetes = new ArrayList<>();
        Estado[] estados = new Estado[4];

        estados[0] = new Estado(1, "Pendiente", new Date(), "observación");
        estados[1] = new Estado(2, "Creado", new Date(), "observación");
        estados[2] = new Estado(3, "Despachado", new Date(), "observación");
        estados[3] = new Estado(4, "Entregado", new Date(), "observación");

        int op;
        String aux;

        do {
            System.out.println("Ingresar Cliente   [1]");
            System.out.println("Ingresar Dirección [2]");
            System.out.println("Crear Paquete     [3]");
            System.out.println("Presentar Datos   [4]");
            System.out.println("Salir             [5]");

            aux = entrada.nextLine();
            op = Integer.parseInt(aux);

            switch (op) {
                case 1:
                    // listaClientes.add(ingresarCliente());
                    break;
                case 2:
                    // listaDirecciones.add(ingresarDireccion());
                    break;
                case 3:
                    // listaPaquetes.add(crearPaquete(listaClientes, listaDirecciones, estados[0]));
                    break;
                case 4:
                    // presentarDatos(listaPaquetes);
                    break;
                case 5:
                    System.out.println("Chao");
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }

        } while (op != 5);
    }
}
