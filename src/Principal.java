import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearEmpleado(scanner);
                    break;
                case 2:
                    listarEmpleados();
                    break;
                case 3:
                    borrarEmpleadoPorDNI(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no existente. Por favor, intentelo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu de opciones:");
        System.out.println("1. Crear empleado");
        System.out.println("2. Lista empleado");
        System.out.println("3. Borrar empleado por DNI");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opcion");
    }
    private static void crearEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el DNI del empleado: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el número de empleado: ");
        int numeroEmpleado = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese la complejidad de los trabajos terminados (0-1): ");
        double complejidadTrabajos = scanner.nextDouble();
        System.out.print("Ingrese la calidad de los trabajos terminados (0-1): ");
        double calidadTrabajos = scanner.nextDouble();
        System.out.print("Ingrese la proactividad (0-1): ");
        double proactividad = scanner.nextDouble();
        System.out.print("Ingrese el compañerismo (0-1): ");
        double companerismo = scanner.nextDouble();
        scanner.nextLine(); 

        Portfolio portfolio = new Portfolio(complejidadTrabajos, calidadTrabajos, proactividad, companerismo);
        Empleado empleado = new Empleado(nombre, dni, numeroEmpleado, portfolio);
        empleados.add(empleado);

        System.out.println("Empleado creado exitosamente.");
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("\nLista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", DNI: " + empleado.getDni() + 
                                   ", Número de Empleado: " + empleado.getNumeroEmpleado() +
                                   ", Media de Evaluaciones: " + empleado.getPortfolio().media());
            }
        }
    }

    private static void borrarEmpleadoPorDNI(Scanner scanner) {
        System.out.print("Ingrese el DNI del empleado a borrar: ");
        String dni = scanner.nextLine();
        Iterator<Empleado> iterator = empleados.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getDni().equals(dni)) {
                iterator.remove();
                encontrado = true;
                System.out.println("Empleado con DNI " + dni + " ha sido borrado.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un empleado con el DNI " + dni);
        }
    }
}
 