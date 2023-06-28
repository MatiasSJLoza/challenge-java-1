import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Challenge Java" + '\n' + "---------------------");

        //lista de empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        //Gestion de empleados
        GestionEmpleado gestionEmpleado = new GestionEmpleado();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Calcular el salario final de un empleado ");
            System.out.println("3. Mostrar lista de Empleados Actuales ");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    gestionEmpleado.agregarEmpleado( listaEmpleados);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.next();
                    gestionEmpleado.calcularSalario(nombreEmpleado, listaEmpleados);
                    break;
                case 3:
                    gestionEmpleado.mostrarListaEmpleados(listaEmpleados);
                    break;
                case 4:
                    System.out.println("Ha salido del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            
            System.out.println();
        }
        //cierra el scanner
        scanner.close();

    }
}
