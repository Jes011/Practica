package PracticaParcial;

import java.util.Scanner;

/**
 * Started: 12:26 Finished: 1:20
 * Se quiere simular en una lista doblemente enlazada
 * la información de los procesos que se están ejecutando en el sistema. Se debe
 * tener en cuenta que todos los procesos del sistema tienen un PID o
 * identificador de procesos, además de el identificador, los procesos cuentan
 * con un nombre y una prioridad. Las prioridades para un proceso de usuario,
 * tienen que estar entre 0 y 39 Igualmente quiere tener en cuenta el estado del
 * proceso, los cuales pueden estar en estado de espera para ejecutarse, listos,
 * interrumpidos y ejecutándose 1. almacenar en una lista doblemente enlazada la
 * información de los procesos 2. Generar un listado con la información de los
 * procesos con mayor prioridad en el sistema, es decir, los procesos que tengan
 * prioridad cero 3. Ordenar los procesos del sistema según su prioridad 4.
 * Generar un informe de cuántos procesos están en ejecución, cuántos están
 * listos para ejecutar
 */
public class Main {

    private static Scanner escaner = new Scanner(System.in);

    public static void main(String[] args) {

        ListaEnlazadaDoble doble = new ListaEnlazadaDoble();

        while (true) {
            byte opcion = Main.reOption("Menú", "0.AgregarNodo\n1.Generar Listado con procesos con mayor prioridad\n2.Ordenar los procesos del sistema segun su prioridad\n3.Generar un informe de cuántos procesos están en ejecución y \n4.Salir", 4);

            switch (opcion) {
                case 0:

                    Process proceso = new Process();

                    System.out.print("Escriba el nombre del proceso: ");

                    proceso.setNombre(escaner.nextLine());

                    System.out.print("Escriba el id del proceso: ");

                    proceso.setId(Integer.valueOf(escaner.nextLine()));

                    proceso.setPrioridad(Main.reOption("Seleccione la prioridad del proceso", "0 a 39", 39));

                    proceso.setEstado(Main.reOption("Seleccione el estado del proceso", "\n0. Estado de espera para ejecutarse\n1. listo, \n2. interrumpidos\n3. ejecutándose", 3));

                    Nodo nodo = new Nodo(proceso);
                    doble.agregar(nodo);
                    break;
                case 1:
                    doble.mostrarProcesosConMayorPrioridad();
                    break;
                case 2:
                    doble.ordenarSegunPrioridad();
                    doble.mostrarLista();
                    break;
                case 3:
                    doble.mostrarProcesosEnEjecucionYProcesosListosParaEjecutar();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    public static byte reOption(String name, String options, int f) {
        byte option;
        System.out.println("\n" + name + "\n" + options);
        while (true) {
            try {
                System.out.print("\nSelect an option: ");
                option = Byte.valueOf(escaner.nextLine());

                if (option < 0 || option > f) {
                    System.err.println("Error: Select a valid option");
                } else {
                    return option;
                }
            } catch (java.lang.NumberFormatException io) {
                System.err.println("Error: Select a valid option");
            } catch (Exception io) {
                System.err.println("Error : only digits");
            }
        }
    }

}
