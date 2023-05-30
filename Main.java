import java.util.Scanner;

public class Main {
    private static Empleado misEmpleados[];

    public static void main(String[] args) {
        initDatos();
        boolean continuar = true;
        while (continuar){
            int seleccion =  menu();
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
    private static void initDatos(){
        misEmpleados = new Empleado[3];
        misEmpleados[0] = new EmpleadoRegular("mario", 54, 10, 500);
        misEmpleados[1] = new Gerente("mati", 25, 20, 500);
        misEmpleados[2] = new Director("ceci", 28, 30, 500);
    }
    private static int menu(){
        System.out.println("#########################");
        System.out.println("1. Agregar nuevo empleado");
        System.out.println("2. mostrar todos los datos");
        System.out.println("3. Calcular salario de un empleado");
        System.out.println("4. Salir");
        System.out.println("#########################");

        Scanner teclado2 = new Scanner(System.in);
        int seleccion = teclado2.nextInt();
        return seleccion;
    }
    private static int tipoEmpleado(){
        System.out.println("##########################");
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce tipo de trabajador");
        System.out.println(" 1 - Empleado regular");
        System.out.println(" 2 - Gerente");
        System.out.println(" 3 - Director");
        int tipo = teclado2.nextInt();
        return tipo;
    }
    private static void ingresoDatos(int tipo) {

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = teclado2.next();
        System.out.println("Introduce edad");
        int edad = teclado2.nextInt();

        System.out.println("Introduce salario base");
        int salario = teclado2.nextInt();

        System.out.println("Introduce horas trabajo");
        int horas = teclado2.nextInt();

        if (tipo == 1) {
            misEmpleados[3] = new EmpleadoRegular(nombre, edad, salario, horas);
        } else if (tipo == 2) {
            misEmpleados[3] = new Gerente(nombre, edad, salario, horas);
        } else if (tipo == 3) {
            misEmpleados[3] = new Director(nombre, edad, salario, horas);
        } else
            System.out.println("Se eligio una opcion incorrecta");

    }
    private static void mostrarDatos() {
        // pasarle nombre y devolver salario
        for (Empleado persona : misEmpleados) {
            System.out.println("Nombre: " + persona.mostrarempleado() + " "+ persona.calcularSalario());
        }
    }
    private static void mostrarDatoEmpleado() {

        System.out.println("Ingrese el nombre del empleado que desea calcular el salario final");
        Scanner teclado1 = new Scanner(System.in);
        String nombre = teclado1.next();

        for (Empleado buscar: misEmpleados){
            if (buscar.mostrarNombre().equals(nombre)){
                System.out.println(buscar.mostrarempleado()+ " " +buscar.calcularSalario());
            };
        }

    }
}