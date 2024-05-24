/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Presentacion;

import Clases.*;
import Logica.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Delivery1 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Direccion> listaDirecciones = new ArrayList<>();
        // ArrayList<Entrega> listaEntregas = new ArrayList<>();
        // ArrayList<Paquete> listaPaquetes = new ArrayList<>();
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
                            listaClientes.add(ingresarCliente());
                        break;
                        }
                        case 2 -> {
                            listaDirecciones.add(ingresarDireccion());
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
    
    public static Cliente ingresarCliente() {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el nombre del cliente:");
        entrada.nextLine();
        cliente.setNombres(entrada.nextLine());
        System.out.println("Ingrese el apellido del cliente:");
        cliente.setApellidos(entrada.nextLine());
        System.out.println("Ingrese la cédula del cliente:");
        cliente.setCedula(entrada.nextLine());
        System.out.println("Ingrese su número celular:");
        cliente.setCelular(entrada.nextLine());
        System.out.println("Ingrese el correo electrónico del cliente:");
        cliente.setMail(entrada.nextLine());

        // Validar la cédula y el correo electrónico
        if (!validarCedula.ValidaCedula(cliente)) {
            System.out.println("La cédula ingresada no es válida.");
            return null;
        }
        if (!validarEmail.validarCorreo(cliente)) {
            System.out.println("El correo electrónico ingresado no es válido.");
            return null;
        }

        // Agregar el cliente a la lista
        System.out.println("Cliente agregado exitosamente.");
        return cliente;
    }

    public static Direccion ingresarDireccion() {
        Scanner entrada = new Scanner(System.in);
        Direccion direccion = new Direccion();

        System.out.printf("Ingresar código de casa");
        direccion.setCodigo(entrada.nextLine());
        System.out.println("Ingrese la calle principal:");
        entrada.nextLine();
        direccion.setCalle1(entrada.nextLine());
        System.out.println("Ingrese la calle secundaria:");
        direccion.setCalle2(entrada.nextLine());
        System.out.println("Ingrese una referencia:");
        direccion.setReferencia(entrada.nextLine());

        // Validar que las calles no sean iguales
        if (!validarDireccion.validarCalles(direccion)) {
            System.out.println("Las calles ingresadas son iguales. Deben ser diferentes.");
            return null;
        }

        // Agregar la dirección a la lista
        System.out.println("Dirección agregada exitosamente.");
        return direccion;
    }
    
    /*public static Paquete crearPaquete(List<Cliente> listaClientes, List<DireccionEntrega> listaDireccion, Estado estado) {
        Scanner entrada = new Scanner(System.in);
        Paquete paquete = new Paquete();

        System.out.println("Ingrese el id del paquete:");
        paquete.setIdPaquete(entrada.nextInt());
        System.out.println("Ingrese el código del paquete:");
        entrada.nextLine();
        paquete.setCodigo(entrada.nextLine());
        System.out.println("Ingrese una descripción del paquete:");
        paquete.setDescripcion(entrada.nextLine());
        System.out.println("Ingrese el peso del paquete:");
        paquete.setPeso(entrada.nextDouble());
        System.out.println("Ingrese el largo del paquete:");
        paquete.setLargo(entrada.nextInt());
        System.out.println("Ingrese el ancho del paquete:");
        paquete.setAncho(entrada.nextInt());

        paquete.setCliente(encontrarClienteID(listaClientes));
        paquete.setEstado(estado);
        //paquete.setDireccionEntrega(encontrarDireccion(listaDireccion, paquete.getCliente()));

        // Agregar el paquete a la lista
        System.out.println("Paquete creado exitosamente.");
        return paquete;
    }

    public static void presentarDatos(List<Paquete> listaPaquetes) {
        System.out.println("------ DATOS DE PAQUETES ------");
        for (Paquete paquete : listaPaquetes) {
            // Aquí se debe imprimir la información relevante de cada paquete
            System.out.println(listaPaquetes);
        }
    }*/
}
