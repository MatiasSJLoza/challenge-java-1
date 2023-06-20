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
                    ControleEmpleado.agregarEmpleado(empleados, scanner);
                    break;
                case 2:
                    ControleEmpleado.calcularSalarioFinal(empleados, scanner);
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
        // Método responsável por exibir o menu de opções para o usuário.
        System.out.println("Menú de opciones:");
        System.out.println("1. Agregar empleado");
        System.out.println("2. Calcular salario final");
        System.out.println("3. Salir");
        System.out.println("Ingrese su opción: ");
    }
}
