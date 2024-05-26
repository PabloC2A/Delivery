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
        ArrayList<Entrega> listaEntregas = new ArrayList<>();
        ArrayList<Paquete> listaPaquetes = new ArrayList<>();
        Estado[] estados = new Estado[4];
        
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
                                // revisarEstadoPaquete(listaClientes);
                            }
                            case 2 -> {
                                actualizarDireccion(listaClientes);
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
                                registrarEntrega(listaEntregas, listaPaquetes);
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
                        System.out.println("|Modificar estado de paquete         [4]  |");
                        System.out.println("|Salir                               [5]  |");
                        System.out.println("------------------------------------------");
                        aux = entrada.nextLine();
                        op = Integer.parseInt(aux);
                        switch (op) {
                            case 1 -> {
                                listaClientes.add(ingresarCliente());
                            }
                            case 2 -> {
                                listaDirecciones.add(ingresarDireccion());
                            }
                            case 3 -> {
                                registrarPaquete(listaPaquetes);
                            }
                            case 4 -> {
                                //despacharPaquete(listaPaquetes);
                                do {
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Paquete en estado pendiente    [1]  |");
                                    System.out.println("Paquete en estado despachado   [2]  |");
                                    System.out.println("Salir                          [3]  |");
                                    System.out.println("--------------------------------------------");
                                    aux = entrada.nextLine();
                                    op = Integer.parseInt(aux);
                                    switch (op) {
                                        case 1 -> {
                                            cambiarEstadoAPendiente(listaPaquetes);
                                        }
                                        case 2 -> {
                                            despacharPaquete(listaPaquetes);
                                        }
                                        default -> System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n");
                                    }
                                } while (op != 3);
                            }
                            default -> System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n");
                        }
                    } while (op != 5);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.\n");
            }

        } while (op != 4);
    }

    public static Direccion ingresarDireccion() {
        Scanner entrada = new Scanner(System.in);
        Direccion direccion = new Direccion();

        System.out.printf("Ingresar código de casa: ");
        direccion.setCodigo(entrada.nextLine());
        System.out.println("Ingrese la calle principal:");
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

    public static Cliente ingresarCliente() {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Ingrese la cédula del cliente:");
        cliente.setCedula(entrada.nextLine());
        if (!validarCedula.ValidaCedula(cliente)) {
            System.out.println("Cédula no válida. Debe contener 10 dígitos.");
            return null;
        }

        System.out.println("Ingrese los apellidos del cliente:");
        cliente.setApellidos(entrada.nextLine());

        System.out.println("Ingrese los nombres del cliente:");
        cliente.setNombres(entrada.nextLine());

        System.out.println("Ingrese el correo del cliente:");
        cliente.setMail(entrada.nextLine());
        if (!validarEmail.validarCorreo(cliente)) {
            System.out.println("Correo no válido.");
            return null;
        }

        System.out.println("Ingrese el celular del cliente:");
        cliente.setCelular(entrada.nextLine());

        cliente.setDireccion(new ArrayList<>());
        System.out.println("Cliente agregado exitosamente.");
        return cliente;
    }

    /*public static void revisarEstadoPaquete(ArrayList<Cliente> listaClientes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cédula del cliente:");
        String cedula = entrada.nextLine();

        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                for (Direccion direccion : cliente.getDireccion()) {
                    System.out.println(direccion);
                }
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }*/
    
    /*public static void revisarEstadoPaquete(ArrayList<Cliente> listaClientes, ArrayList<Paquete> listaPaquetes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cédula del cliente:");
        String cedula = entrada.nextLine();

        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                for (Direccion direccion : cliente.getDireccion()) {
                    System.out.println("Dirección: " + direccion);
                }
                System.out.println("Paquetes:");
                for (Paquete paquete : listaPaquetes) {
                    if (paquete.getCodigo().equals(cedula)) {
                        System.out.println("ID: " + paquete.getIdPaquete() + " | Código: " + paquete.getCodigo() + " | Descripción: " + paquete.getDescripcion() + " | Estado: " + paquete.getEstadoActual());
                    }
                }
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }*/

    public static void actualizarDireccion(ArrayList<Cliente> listaClientes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cédula del cliente:");
        String cedula = entrada.nextLine();

        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                new validarActual().validarActual(cliente);
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public static void registrarEntrega(ArrayList<Entrega> listaEntregas, ArrayList<Paquete> listaPaquetes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del paquete:");
        String codigoPaquete = entrada.nextLine();

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                Entrega entrega = new Entrega();
                entrega.setCodigo(codigoPaquete);
                entrega.setFecha(new Date());
                System.out.println("Ingrese observaciones de la entrega:");
                entrega.setObservacion(entrada.nextLine());
                listaEntregas.add(entrega);
                System.out.println("Entrega registrada exitosamente.");
                return;
            }
        }
        System.out.println("Paquete no encontrado.");
    }

    public static void registrarPaquete(ArrayList<Paquete> listaPaquetes) {
        Scanner entrada = new Scanner(System.in);
        Paquete paquete = new Paquete();

        System.out.println("Ingrese el ID del paquete:");
        paquete.setIdPaquete(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese el código del paquete:");
        paquete.setCodigo(entrada.nextLine());
        System.out.println("Ingrese la descripción del paquete:");
        paquete.setDescripcion(entrada.nextLine());
        System.out.println("Ingrese el peso del paquete:");
        paquete.setPeso(Double.parseDouble(entrada.nextLine()));
        System.out.println("Ingrese el alto del paquete:");
        paquete.setAlto(Double.parseDouble(entrada.nextLine()));

        listaPaquetes.add(paquete);
        System.out.println("Paquete registrado exitosamente.");
    }

    public static void despacharPaquete(ArrayList<Paquete> listaPaquetes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del paquete a despachar:");
        String codigoPaquete = entrada.nextLine();

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                for (Estado estado : paquete.getEstado()) {
                    if (estado.getEstado().equals("Despachado")) {
                        estado.setFecha(new Date());
                        System.out.println("Paquete despachado exitosamente.");
                        return;
                    }
                }
            }
        }
        System.out.println("Paquete no encontrado.");
    }
    
    public static void cambiarEstadoAPendiente(ArrayList<Paquete> listaPaquetes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del paquete a cambiar a estado pendiente:");
        String codigoPaquete = entrada.nextLine();

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                for (Estado estado : paquete.getEstado()) {
                    if (estado.getEstado().equals("Pendiente")) {
                        estado.setFecha(new Date());
                        System.out.println("El paquete ya está en estado pendiente.");
                        return;
                    }
                }
            }
        }
        System.out.println("Paquete no encontrado.");
    }
}
        
