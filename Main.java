import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        EmpleadoRegular empleadoRegular = new EmpleadoRegular("Juan", 2000.0, 40,
                "Calle A #123", "123456789", false, 0);
        empleados.add(empleadoRegular);

        Gerente gerente = new Gerente("Ana", 3000.0, 45, 500.0,
                "Calle B #456", "987654321", true, 2);
        empleados.add(gerente);

        Director director = new Director("Carlos", 5000.0, 50, 1000.0,
                "Calle C #789", "555555555", true, 3);
        empleados.add(director);

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            mostrarMenu();

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEmpleado(empleados, scanner);
                    break;
                case 2:
                    calcularSalarioFinal(empleados, scanner);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Agregar empleado");
        System.out.println("2. Calcular salario final");
        System.out.println("3. Salir");
        System.out.println("Ingrese su opción: ");
    }

    private static void agregarEmpleado(List<Empleado> empleados, Scanner scanner) {
        System.out.println("Ingrese el nombre del empleado");
        String nombre = scanner.next();
        System.out.println("Ingrese el salario del empleado");
        double salarioBase = scanner.nextDouble();
        System.out.println("Ingrese las horas trabajadas del empleado");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el tipo de empleado (1 - Regular, 2 - Gerente, 3 - Director):");
        int tipoEmpleado = scanner.nextInt();

        System.out.print("Ingrese la dirección del empleado: ");
        String direccion = scanner.next();
        System.out.print("Ingrese el teléfono del empleado: ");
        String telefono = scanner.next();
        boolean casado;
        try {
            System.out.print("¿Está casado/a? (true/false): ");
            casado = scanner.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Valor incorrecto para el estado civil. Intente nuevamente.");
            scanner.nextLine();
            return;
        }
        System.out.print("Ingrese la cantidad de hijos del empleado: ");
        int hijos = scanner.nextInt();


        Empleado empleado;
        if (tipoEmpleado == 1) {
            empleado = new EmpleadoRegular(nombre, salarioBase, horasTrabajadas, direccion, telefono, casado, hijos);

        } else if (tipoEmpleado == 2) {
            System.out.println("Ingrese la bonificacion del gerente: ");
            double bonificacion = scanner.nextDouble();
            empleado = new Gerente(nombre, salarioBase, horasTrabajadas, bonificacion, direccion, telefono, casado,
                    hijos);

        } else if (tipoEmpleado == 3) {
            System.out.println("Ingrese la bonificacion del director: ");
            double bonificacion = scanner.nextDouble();
            empleado = new Director(nombre, salarioBase, horasTrabajadas, bonificacion, direccion, telefono, casado,
                    hijos);
        } else {
            System.out.println("Tipo de empleado inválido. No se pudo agregar el empleado.");
            return;
        }

        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");

    }

    private static void calcularSalarioFinal(List<Empleado> empleados, Scanner scanner) {
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();

        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                double salarioFinal = empleado.calcularSalarioFinal();
                System.out.println("El salario final de " + nombre + " es: " + salarioFinal);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Empleado no encontrado.");
        }
    }

}