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
            System.out.println("-----------------------");
            System.out.println("|Cliente         [1]  |");
            System.out.println("|Repartidor      [2]  |");
            System.out.println("|Bodeguero       [3]  |");
            System.out.println("|Salir           [4]  |");
            System.out.println("-----------------------");

            aux = entrada.nextLine();
            op = Integer.parseInt(aux);

            switch (op) {
                case 1:
                    do {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("|Revisar estado Paquete                           [1]  |");
                        System.out.println("|Agregar nueva dirección o actualizar dirección   [2]  |");
                        System.out.println("|Salir                                            [3]  |");
                        System.out.println("--------------------------------------------------------");
                        aux = entrada.nextLine();
                        op = Integer.parseInt(aux);
                        switch (op) {
                            case 1 -> {
                            // metodo para revisar
                            break;
                        }
                        case 2 -> {
                            // metodo para ingresar actual
                        }
                        default -> System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n"); 
                        }
                        
                    } while (op != 3);
                
                    break;

                case 2:
                    do {
                        System.out.println("--------------------------------------------");
                        System.out.println("Registrar la entrega de una paquete   [1]  |");
                        System.out.println("Salir                                 [2]  |");
                        System.out.println("--------------------------------------------");
                        aux = entrada.nextLine();
                        op = Integer.parseInt(aux);
                        switch (op) {
                            case 1 -> {
                                // metodo para agregar
                                break;
                            }
                            default -> System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n");
                        }
                    } while (op != 2);
                    
                    break;
                case 3:
                    do {
                        System.out.println("------------------------------------------");
                        System.out.println("|Agregar un nuevo Cliente            [1]  |");
                        System.out.println("|Ingresar direcciones del Cliente    [2]  |");
                        System.out.println("|Registrar un nuevo paquete          [3]  |");
                        System.out.println("|Despachar un paquete                [4]  |");
                        System.out.println("|Salir                               [5]  |");
                        System.out.println("------------------------------------------");
                        aux = entrada.nextLine();
                        op = Integer.parseInt(aux);
                        switch (op) {
                            case 1 -> {
                            // metodo para registrar un nuevo cliente
                        break;
                        }
                        case 2 -> {
                            // metodo para registrar un nuevo cliente y sus direcciones
                        break;
                        }
                        case 3 -> {
                            // metodo para agregar
                        break;
                        }
                        case 4 -> {
                            // metodo para agregar
                        }
                        default -> 
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n");
                        }
                    } while (op != 5);
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n");
            }

        } while (op != 4);
    }
}
