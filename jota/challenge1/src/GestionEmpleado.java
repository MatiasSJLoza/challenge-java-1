import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleado {


    public void agregarEmpleado(ArrayList<Empleado> listaEmpleados){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Agregar un empleado");
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int cantidadHorasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el salario base: ");
        int salarioBase = scanner.nextInt();
        // resolver elegir tipo de empleado
        System.out.println("-----------------------------");
        System.out.print("Ingrese el tipo de empleado: ");
        System.out.println("1. Empleado regular");
        System.out.println("2. Gerente");
        System.out.println("3. Director");
        int tipoEmpleado = scanner.nextInt();
        
        
        switch (tipoEmpleado){
            case 1:
                Empleado empleadoRegular = new EmpleadoRegular(nombre, cantidadHorasTrabajadas, salarioBase);
                listaEmpleados.add(empleadoRegular);
                System.out.println("Empleado agregado correctamente.");
                break;
            case 2:
                Empleado empleadoGerente = new Gerente(nombre, cantidadHorasTrabajadas, salarioBase);
                listaEmpleados.add(empleadoGerente);
                System.out.println("Empleado agregado correctamente.");
                break;
            case 3:
                Empleado empleadoDirector = new Director(nombre, cantidadHorasTrabajadas, salarioBase);
                listaEmpleados.add(empleadoDirector);
                System.out.println("Empleado agregado correctamente.");
                break;
            case 4:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }

        // agregar empleado nuevo a la lista de empleados
        
        scanner.close();
    }

    public void calcularSalario (String nombreEmpleado, ArrayList <Empleado> listaEmpleados){
        // buscar el empleado en la lista de empleados
        // dependiendo del tipo de empleado va a llamar al metodo calcularSalario de cada uno
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().equals(nombreEmpleado)){
                System.out.println("Empleado: " + empleado.getNombre());
            }
        }
    }
    
}
