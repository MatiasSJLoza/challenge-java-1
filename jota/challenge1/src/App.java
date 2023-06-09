import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Challenge Java" + '\n' + "---------------------");

        Empleado jotaPerez = new Empleado();
        
        //setter for class Empleado
        jotaPerez.setNombre("Jota Perez");
        jotaPerez.setCantidadHorasTrabajadas(160);
        jotaPerez.setSalarioBase(100);

        Empleado matiasLoza = new Empleado("Matias Loza", 200, 100);

        // //use getter for class Empleado
        // System.out.println("Nombre: " + jotaPerez.getNombre());
        // System.out.println("Horas trabajadas: " + jotaPerez.getCantidadHorasTrabajadas());

        // System.out.println("---------------------");

        // System.out.println("Nombre: " + matiasLoza.getNombre());
        // System.out.println("Horas trabajadas: " + matiasLoza.getCantidadHorasTrabajadas());

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
                    System.out.println("Agregar un empleado");
                    // (?) preguntar si es la mejor forma de hacerlo
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la cantidad de horas trabajadas: ");
                    int cantidadHorasTrabajadas = scanner.nextInt();
                    System.out.print("Ingrese el salario base: ");
                    int salarioBase = scanner.nextInt();

                    // resolver elegir tipo de empleado
                    Empleado empleado = new EmpleadoRegular(nombre, cantidadHorasTrabajadas, salarioBase);
                    break;
                case 2:
                    System.out.println("Calcular el salario final de un empleado");
                    // dependiendo del tipo de empleado va a llamar al metodo calcularSalario de cada uno
                    System.out.println("Ingrese Nombre del empleado: ");
                    String nombreEmpleado = scanner.next();
                    // donde busco el empleado, tengo que tener una lista de los empleados
                    // se puede tener una lista de empleados de la clase abstracta?
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
