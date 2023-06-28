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
        
        while (opcion != 3) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Calcular el salario final de un empleado ");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    gestionEmpleado.agregarEmpleado( listaEmpleados);
                    break;
                case 2:
                    System.out.println("Calcular el salario final de un empleado");
                    // dependiendo del tipo de empleado va a llamar al metodo calcularSalario de cada uno
                    System.out.println("Ingrese Nombre del empleado: ");
                    String nombreEmpleado = scanner.next();
                    // donde busco el empleado, tengo que tener una lista de los empleados
                    // se puede tener una lista de empleados de la clase abstracta?
                    // si se puede claro
                    break;
                case 3:
                    System.out.println("Ha salido del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            
            System.out.println();
        }
        scanner.close();

    }
}
