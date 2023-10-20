package com.meli.challengemc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
    private static ArrayList<EmpleadoRegular> listaEmp = new ArrayList<EmpleadoRegular>();
    private static ArrayList<Gerente> listaGer = new ArrayList<Gerente>();
    private static ArrayList<Director> listaDir = new ArrayList<Director>();
    //Modificar Arraylist por map

//    public static void altaUsuario(EmpleadoRegular emp){
//        listaEmpleado.add(emp);
//    }

    public static void altaUsuario(Empleado emp){
        listaEmpleado.add(emp);
    }
    public static void altaUsuarioGerente(Gerente ger){
        listaEmpleado.add(ger);
    }
    public static void altaUsuarioDirector(Director dir){
        listaEmpleado.add(dir);
    }

    public static void bajaUsuario(EmpleadoRegular emp){

    }
    public static void actualizarUsuario(EmpleadoRegular emp){

    }
    public static Empleado leerUsuario(Empleado emp){
        for (Empleado emp1:listaEmpleado) {

            //Test de polimorfismo
            //Asi se castea un objeto Empleado a EmpleadoRegular
            ((EmpleadoRegular)emp1).Saludar();

            //Asi se usa con instanceof, que significa instanceof? es un operador que devuelve true si el objeto es de la clase que se le pasa por parametro
            //sirve para manejar encapsulamiento porque si el objeto es de la clase que se le pasa por parametro, se puede acceder a sus metodos y atributos
            if(emp1 instanceof EmpleadoRegular empR){
                empR.calcularSalario();
                empR.Saludar();
            }
            if (emp1==emp){
                return emp1;
            }
            else{
                System.out.println("No se encontró el empleado");
            }
        }
        return emp;
    }

    public static void listarUsuario(){
        for (Empleado emp:listaEmpleado) {
            System.out.println("Empleado Regular: ");
            System.out.println(emp.getNombre());
        }
    }
    public static void listarGerente(){
        for (Gerente ger:listaGer) {
            System.out.println("Gerente : ");
            System.out.println(ger.getNombre());
        }
    }
    public static void listarDirector(){
        for (Director dir:listaDir) {
            System.out.println("Director : ");
            System.out.println(dir.getNombre());
        }
    }

    public static void listarTodos(){
        listarUsuario();
        //listarGerente();
        //listarDirector();
    }



    public static void calcularSalarioFinal(String nom){
        //me pasan un nombre por parametro
        //lo busco en la lista de empleados
        //lo busco en la lista de gerentes
        //lo busco en la lista de directores
        boolean encontrado = false;
        for (Director dir:listaDir) {
            if (dir.getNombre().contains(nom)) {
                encontrado = true;
                System.out.println("Este es el salario del Director :" + dir.getNombre());
                dir.calcularSalario();
                break;
            }
        }
        if(!encontrado){
            for (Gerente ger:listaGer){
                if (ger.getNombre().contains(nom)){
                    encontrado = true;
                    System.out.println("Este es el salario del Gerente :" + ger.getNombre());
                    ger.calcularSalario();
                    break;
                }
            }
        }
        if(!encontrado){
            for (Empleado emp:listaEmpleado){
                if (emp.getNombre().contains(nom)){
                    encontrado = true;
                    System.out.println("Este es el salario del Empleado :" + emp.getNombre());
                    emp.calcularSalario();
                    break;
                }
            }
        }

        if(!encontrado){
                    System.out.println("El usuario especificado no se encuentra!");
                }

    }

    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcionEmpleado;

        do {
            //System.out.println("**** MENU ****");
            System.out.println("\033[32m**** MENU ****\033[0m");
            System.out.println("1. Dar de alta un usuario");
            System.out.println("2. Dar de baja un usuario");
            System.out.println("3. Actualizar un usuario");
            System.out.println("4. Leer un usuario");
            System.out.println("5. Listar todos los usuarios del sistema");
            System.out.println("6. Calcular el salario final");
            System.out.println("7. Salir");
            System.out.println("\033[32m**** ---- ****\033[0m");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de empleado:");
                    System.out.println("1. Empleado Regular");
                    System.out.println("2. Gerente");
                    System.out.println("3. Director");
                    System.out.println("4. Volver al menu anterior");
                    System.out.print("Seleccione una opción: ");
                    opcionEmpleado = scanner.nextInt();

                    switch (opcionEmpleado) {
                        case 1:
                            // Alta empleado regular
                            System.out.println("Dar de alta un empleado regular");
                            //Solicitud de datos al usuario

                            //Nombre
                            String nomEmpleado = inputName("empleado");

                            //Sueldo Base
                            double sueldo_ingresado = inputValue("sueldo");

                            //Horas Trabajadas
                            int horas_ingresadas = inputHoras("horas");

                            EmpleadoRegular emp = new EmpleadoRegular (nomEmpleado, sueldo_ingresado,horas_ingresadas);
                            altaUsuario(emp);
                            System.out.println("Empleado agregado con exito! " );
                            listarUsuario();
                            break;
                        case 2:
                            // Alta empleado Gerente
                            System.out.println("Dar de alta un Gerente");
                            //Solicitud de datos al usuario
                            //Nombre
                            String nomGerente = inputName("gerente");

                            //Sueldo Base
                            double sueldo_ingresadoG = inputValue("sueldo");

                            //Horas Trabajadas
                            int horas_ingresadasG = inputHoras("horas");

                            //Bonificacion Gerente
                            double bonifiGerdouble = inputValue("bonificacion");

                            Gerente ger = new Gerente (nomGerente, sueldo_ingresadoG, horas_ingresadasG,bonifiGerdouble);
                            //altaUsuarioGerente(ger);
                            altaUsuario(ger);
                            System.out.println("Gerente agregado con exito! " );
                            //listarGerente();
                            listarUsuario();
                            break;
                        case 3:
                            // Alta empleado Director
                            System.out.println("Dar de alta un Director");
                            //Solicitud de datos al usuario
                            //Nombre
                            String nomDirector = inputName("director");

                            //Sueldo Base
                            double sueldo_ingresadoD = inputValue("sueldo");

                            //Horas Trabajadas
                            int horas_ingresadasD = inputHoras("horas");

                            //Bonificacion Director

                            double bonifiDirdouble = inputValue("bonificacion");

                            Director dir = new Director (nomDirector, sueldo_ingresadoD, horas_ingresadasD,bonifiDirdouble);
                            //altaUsuarioDirector(dir);
                            altaUsuario(dir);
                            System.out.println("Gerente agregado con exito! " );
                            //listarDirector();
                            listarUsuario();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                    }
                    break;
                case 2:
                    System.out.println("2. Dar de baja un usuario");
                    break;
                case 5:
                    System.out.println("5. Listar todos los usuarios del sistema");
                    listarTodos();
                    break;
                case 6:
                    System.out.println("6. Calcular el salario final");
                    //Nombre
                    Scanner miScanNombre = new Scanner(System.in);
                    System.out.println("Ingrese nombre del Empleado: ");
                    String nombre = miScanNombre.nextLine();
                    calcularSalarioFinal(nombre);
                    break;
                case 7:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        } while (opcion != 7);

        scanner.close();
    }


    //Encapsulamos metodos para reutilizar en los diferentes cases.
    private static String inputName(String employeeType){
        Scanner scName = new Scanner(System.in);
        System.out.println("Ingrese el nombre del " + employeeType + " : ");
        return scName.nextLine();
    }
    private static Double inputValue(String value){
        Scanner scValue = new Scanner(System.in);
        if (value.equalsIgnoreCase("sueldo") ){
            System.out.println("Ingrese el sueldo base: ");
            String sueldoEmpleado = scValue.nextLine();
            //System.out.println("Ingrese el sueldo " + value + " : ");
            return Double.parseDouble(sueldoEmpleado);
        }
        if (value.equalsIgnoreCase("bonificacion")){
            System.out.println("Ingrese la bonificacion: ");
            String bonifiGer = scValue.nextLine();
            return Double.parseDouble(bonifiGer);
        }
        return null;
    }

    private static int inputHoras(String canthoras){
        Scanner scHoras = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        String horasEmpleado = scHoras.nextLine();
        return Integer.parseInt(horasEmpleado);
    }
}
