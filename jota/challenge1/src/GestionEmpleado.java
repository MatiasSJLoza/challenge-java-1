import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleado {


    public void agregarEmpleado(ArrayList<Empleado> listaEmpleados){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Agregar un empleado");
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scannerString.next();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int cantidadHorasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el salario base: ");
        int salarioBase = scanner.nextInt();
        System.out.println("-----------------------------" + '\n' + "Elegir tipo de empleado");
        System.out.println("1. Empleado regular");
        System.out.println("2. Gerente");
        System.out.println("3. Director");
        int tipoEmpleado = scanner.nextInt();
        
        
        switch (tipoEmpleado){
            case 1:
                listaEmpleados.add(new EmpleadoRegular(nombre, cantidadHorasTrabajadas, salarioBase));
                System.out.println("Empleado agregado correctamente." + '\n' );
                break;
            case 2:
                System.out.println("Ingrese la bonificación: ");
                int bonificacionGerente = scanner.nextInt();
                listaEmpleados.add(new Gerente(nombre, cantidadHorasTrabajadas, salarioBase, bonificacionGerente));
                System.out.println("Empleado agregado correctamente." + '\n');
                break;
            case 3:
                System.out.println("Ingrese la bonificación: ");
                int bonificacionDirector = scanner.nextInt();
                listaEmpleados.add(new Director(nombre, cantidadHorasTrabajadas, salarioBase, bonificacionDirector));
                System.out.println("Empleado agregado correctamente." + '\n');
                break;
            case 4:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }

        //cerrando scanner
        //scanner.close();
        
    }

    public void calcularSalario (String nombreEmpleado, ArrayList <Empleado> listaEmpleados){
        // buscar el empleado en la lista de empleados
        // dependiendo del tipo de empleado va a llamar al metodo calcularSalario de cada uno
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().equals(nombreEmpleado)){
                System.out.println("Empleado: " + empleado.getNombre());
                empleado.calcularSalario();
            }
        }
    }

    public void mostrarListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        System.out.println("Lista de empleados");
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            // si el salario esta en 0, es por que no se calculo el salario
            if (empleado.getSalario() == 0) {
                System.out.println("Salario : Sin calcular ");
            }
            else{
                System.out.println("Salario : " + empleado.getSalario());
            }
        }
    }
    
}
