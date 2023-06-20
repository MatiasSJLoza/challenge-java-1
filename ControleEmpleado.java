import java.util.List;
import java.util.Scanner;

public class ControleEmpleado {
    public static void agregarEmpleado(List<Empleado> empleados, Scanner scanner) {
        // Método responsável por adicionar um novo funcionário à lista de funcionários.

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
            // Se o tipo de funcionário for 1 (Regular), cria um novo objeto EmpleadoRegular.
            empleado = new EmpleadoRegular(nombre, salarioBase, horasTrabajadas, direccion, telefono, casado, hijos);
        } else if (tipoEmpleado == 2) {
            // Se o tipo de funcionário for 2 (Gerente), pede a bonificação do gerente e cria um novo objeto Gerente.
            System.out.println("Ingrese la bonificacion del gerente: ");
            double bonificacion = scanner.nextDouble();
            empleado = new Gerente(nombre, salarioBase, horasTrabajadas, bonificacion, direccion, telefono, casado, hijos);
        } else if (tipoEmpleado == 3) {
            // Se o tipo de funcionário for 3 (Diretor), pede a bonificação do diretor e cria um novo objeto Director.
            System.out.println("Ingrese la bonificacion del director: ");
            double bonificacion = scanner.nextDouble();
            empleado = new Director(nombre, salarioBase, horasTrabajadas, bonificacion, direccion, telefono, casado, hijos);
        } else {
            System.out.println("Tipo de empleado inválido. No se pudo agregar el empleado.");
            return;
        }

        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");
    }

    public static void calcularSalarioFinal(List<Empleado> empleados, Scanner scanner) {
        // Método responsável por calcular o salário final de um funcionário com base no nome informado.

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();

        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado != null && empleado.getNombre() != null && empleado.getNombre().equalsIgnoreCase(nombre)) {
                // Verifica se o objeto Empleado e seu nome são diferentes de null antes de verificar a igualdade.
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


