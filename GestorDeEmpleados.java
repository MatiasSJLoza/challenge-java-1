import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeEmpleados {
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>() ;

    public void menu (){
        int seleccion = 0;
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        initDatos();
        while (continuar){
            System.out.println("#########################");
            System.out.println("1. Agregar nuevo empleado");
            System.out.println("2. mostrar todos los datos");
            System.out.println("3. Calcular salario de un empleado");
            System.out.println("4. Salir");
            System.out.println("#########################");
            seleccion = teclado.nextInt();
            switch (seleccion){
                case 1: int tipo = tipoEmpleado();
                    ingresoDatos(tipo);
                    break;
                case 2:  mostrarDatos();
                    break;
                case 3: mostrarDatoEmpleado();
                    break;
                case 4:  System.out.println("Salir!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Debe elegir una opcion");
                    break;
            }
        }
    }
    private  void initDatos(){
        empleados.add(new EmpleadoRegular("mario", 54, 10, 500));
        empleados.add(new Gerente("mati", 25, 20, 500));
        empleados.add(new Director("ceci", 28, 30, 500));
    }
    private int tipoEmpleado( ){
        System.out.println("##########################");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tipo de trabajador");
        System.out.println(" 1 - Empleado regular");
        System.out.println(" 2 - Gerente");
        System.out.println(" 3 - Director");
        int tipo = teclado.nextInt();
        return tipo;
    }
    private void ingresoDatos(int tipo) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = teclado.next();
        System.out.println("Introduce edad");
        int edad = teclado.nextInt();
        System.out.println("Introduce salario base");
        int salario = teclado.nextInt();
        System.out.println("Introduce horas trabajo");
        int horas = teclado.nextInt();

        if (tipo == 1) {
            empleados.add(new EmpleadoRegular(nombre, edad, salario, horas));
        } else if (tipo == 2) {
            empleados.add(new Gerente(nombre, edad, salario, horas));
        } else if (tipo == 3) {
            empleados.add(new Director(nombre, edad, salario, horas));
        } else
            System.out.println("Se eligio una opcion incorrecta");

    }
    private static void mostrarDatos() {
        for (int i =0;i<empleados.size();i++){
            System.out.println(empleados.get(i).mostrarempleado() + " "+empleados.get(i).calcularSalario());
        }
    }
    private void mostrarDatoEmpleado() {

        System.out.println("Ingrese el nombre del empleado que desea calcular el salario final");
        Scanner tecladoNombre = new Scanner(System.in);
        String nombre = tecladoNombre.next();

        boolean existe = false;
        for (int i=0; i<empleados.size();i++) {
            if (empleados.get(i).mostrarNombre().equals(nombre)) {
                existe = true;
                System.out.println(empleados.get(i).mostrarempleado() + " " + empleados.get(i).calcularSalario());
                break;
            }
        }
        if (!existe){
            System.out.println("no existe");
        }
    }
}
