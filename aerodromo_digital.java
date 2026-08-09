import java.util.Scanner;
public class aerodromo_digital {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] numerosVuelos = new String[10];
        String[] aerolineas = new String[10];
        String[] origenes = new String[10];
        String[] destinos = new String[10];
        String[] horasSalida = new String[10];
        String[] horasLlegada = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_de_aerodromo_digital|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal de aerodromo digital");
            System.out.println("1) Registrar vuelo");
            System.out.println("2) Editar vuelo");
            System.out.println("3) Listar vuelos");
            System.out.println("4) Buscar vuelo");
            System.out.println("5) Eliminar vuelo");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //---------------------//
                //--|registrar_vuelo|--//
                //---------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del vuelo");
                    System.out.println("id del vuelo a registrar: " + id);
                    System.out.print("numero de vuelo: ");
                    numerosVuelos[total] = entrada.nextLine();
                    System.out.print("aerolinea: ");
                    aerolineas[total] = entrada.nextLine();
                    System.out.print("ciudad de origen: ");
                    origenes[total] = entrada.nextLine();
                    System.out.print("ciudad de destino: ");
                    destinos[total] = entrada.nextLine();
                    System.out.print("hora de salida: ");
                    horasSalida[total] = entrada.nextLine();
                    System.out.print("hora de llegada: ");
                    horasLlegada[total] = entrada.nextLine();
                    System.out.print("estado del vuelo: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Vuelo registrado correctamente.");
                    total++;
                    break;
                //------------------//
                //--|editar_vuelo|--//
                //------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen vuelos registrados.");
                        break;
                    }
                    System.out.println("Datos de los vuelos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Vuelo: " + numerosVuelos[i] + " | Aerolinea: " + aerolineas[i] + " | Origen: " + origenes[i] + " | Destino: " + destinos[i] + " | Salida: " + horasSalida[i] + " | Llegada: " + horasLlegada[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del vuelo: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del vuelo");
                        System.out.print("Nuevo numero de vuelo: ");
                        numerosVuelos[posicion] = entrada.nextLine();
                        System.out.print("Nueva aerolinea: ");
                        aerolineas[posicion] = entrada.nextLine();
                        System.out.print("Nueva ciudad de origen: ");
                        origenes[posicion] = entrada.nextLine();
                        System.out.print("Nueva ciudad de destino: ");
                        destinos[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de salida: ");
                        horasSalida[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de llegada: ");
                        horasLlegada[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del vuelo: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Vuelo actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------//
                //--|listar_vuelos|--//
                //-------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen vuelos registrados.");
                    } else {
                        System.out.println("Lista de vuelos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Vuelo: " + numerosVuelos[i] + " | Aerolinea: " + aerolineas[i] + " | Origen: " + origenes[i] + " | Destino: " + destinos[i] + " | Salida: " + horasSalida[i] + " | Llegada: " + horasLlegada[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //------------------//
                //--|buscar_vuelo|--//
                //------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen vuelos registrados.");
                        break;
                    }
                    System.out.println("busqueda de vuelo");
                    System.out.print("ingresa la id para buscar vuelo: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del vuelo encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Vuelo: " + numerosVuelos[posicion] + " | Aerolinea: " + aerolineas[posicion] + " | Origen: " + origenes[posicion] + " | Destino: " + destinos[posicion] + " | Salida: " + horasSalida[posicion] + " | Llegada: " + horasLlegada[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------//
                //--|eliminar_vuelo|--//
                //--------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen vuelos registrados.");
                        break;
                    }
                    System.out.println("Datos de los vuelos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Vuelo: " + numerosVuelos[i] + " | Aerolinea: " + aerolineas[i] + " | Origen: " + origenes[i] + " | Destino: " + destinos[i] + " | Salida: " + horasSalida[i] + " | Llegada: " + horasLlegada[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del vuelo a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            numerosVuelos[i] = numerosVuelos[i + 1];
                            aerolineas[i] = aerolineas[i + 1];
                            origenes[i] = origenes[i + 1];
                            destinos[i] = destinos[i + 1];
                            horasSalida[i] = horasSalida[i + 1];
                            horasLlegada[i] = horasLlegada[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Vuelo eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Aerodromo Digital.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}