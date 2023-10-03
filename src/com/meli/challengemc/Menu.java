package com.meli.challengemc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static ArrayList<EmpleadoRegular> listaEmp = new ArrayList<EmpleadoRegular>();
    private static ArrayList<Gerente> listaGer = new ArrayList<Gerente>();
    private static ArrayList<Director> listaDir = new ArrayList<Director>();
    //Modificar Arraylist por map

    public static void altaUsuario(EmpleadoRegular emp){
        listaEmp.add(emp);
    }
    public static void altaUsuarioGerente(Gerente ger){
        listaGer.add(ger);
    }
    public static void altaUsuarioDirector(Director dir){
        listaDir.add(dir);
    }

    public static void bajaUsuario(EmpleadoRegular emp){

    }

    public static void actualizarUsuario(EmpleadoRegular emp){

    }

    public static EmpleadoRegular leerUsuario(EmpleadoRegular emp){
        for (EmpleadoRegular emp1:listaEmp) {
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
        for (EmpleadoRegular emp:listaEmp) {
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
        listarGerente();
        listarDirector();
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
            for (EmpleadoRegular emp:listaEmp){
                if (emp.getNombre().contains(nom)){
                    encontrado = true;
                    System.out.println("Este es el salario del Empleado :" + emp.getNombre());
                    emp.calcularSalario();
                    break;
                }
            }
        }
//        if(encontrado){
//            System.out.println("Se encontro!");
//        }
//        else{
//            System.out.println("No se encontro!");
//        }
    }





    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcionEmpleado;

        do {
            System.out.println("**** MENU ****");
            System.out.println("1. Dar de alta un usuario");
            System.out.println("2. Dar de baja un usuario");
            System.out.println("3. Actualizar un usuario");
            System.out.println("4. Leer un usuario");
            System.out.println("5. Listar todos los usuarios del sistema");
            System.out.println("6. Calcular el salario final");
            System.out.println("7. Salir");
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
                            Scanner miScanNombre = new Scanner(System.in);
                            System.out.println("Ingrese nombre del empleado: ");
                            String nomEmpleado = miScanNombre.nextLine();
                            //Sueldo Base
                            Scanner miScanSueldo = new Scanner(System.in);
                            System.out.println("Ingrese el sueldo base: ");
                            String sueldoEmpleado = miScanSueldo.nextLine();
                            double sueldo_ingresado = Double.parseDouble(sueldoEmpleado);
                            //Horas Trabajadas
                            Scanner miScanHoras = new Scanner(System.in);
                            System.out.println("Ingrese la cantidad de horas trabajadas: ");
                            String horasEmpleado = miScanHoras.nextLine();
                            int horas_ingresadas = Integer.parseInt(horasEmpleado);
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
                            Scanner miScanNombreG = new Scanner(System.in);
                            System.out.println("Ingrese nombre del Gerente: ");
                            String nomGerente = miScanNombreG.nextLine();
                            //Sueldo Base
                            Scanner miScanSueldoG = new Scanner(System.in);
                            System.out.println("Ingrese el sueldo base: ");
                            String sueldoGerente = miScanSueldoG.nextLine();
                            double sueldoGerentedouble = Double.parseDouble(sueldoGerente);
                            double sueldo_ingresadoG = Double.parseDouble(sueldoGerente);
                            //Horas Trabajadas
                            Scanner miScanHorasG = new Scanner(System.in);
                            System.out.println("Ingrese la cantidad de horas trabajadas: ");
                            String horasGerente = miScanHorasG.nextLine();
                            int horas_ingresadasG = Integer.parseInt(horasGerente);
                            //Bonificacion Gerente
                            Scanner scanBonifG = new Scanner(System.in);
                            System.out.println("Ingrese la bonificacion: ");
                            String bonifiGer = scanBonifG.nextLine();
                            double bonifiGerdouble = Double.parseDouble(bonifiGer);
                            //int horas_ingresadasG = Integer.parseInt(bonifiGer);
                            Gerente ger = new Gerente (nomGerente, sueldoGerentedouble, horas_ingresadasG,bonifiGerdouble);
                            System.out.println("test ! agregado con exito! " );
                            altaUsuarioGerente(ger);
                            System.out.println("Gerente agregado con exito! " );
                            listarGerente();
                            break;
                        case 3:
                            // Alta empleado Director
                            System.out.println("Dar de alta un Director");
                            //Solicitud de datos al usuario
                            //Nombre
                            Scanner miScanNombreD = new Scanner(System.in);
                            System.out.println("Ingrese nombre del Director: ");
                            String nomDirector = miScanNombreD.nextLine();
                            //Sueldo Base
                            Scanner miScanSueldoD = new Scanner(System.in);
                            System.out.println("Ingrese el sueldo base: ");
                            String sueldoDirector = miScanSueldoD.nextLine();
                            double sueldoDirectordouble = Double.parseDouble(sueldoDirector);
                            double sueldo_ingresadoD = Double.parseDouble(sueldoDirector);
                            //Horas Trabajadas
                            Scanner miScanHorasD = new Scanner(System.in);
                            System.out.println("Ingrese la cantidad de horas trabajadas: ");
                            String horasDirector = miScanHorasD.nextLine();
                            int horas_ingresadasD = Integer.parseInt(horasDirector);
                            //Bonificacion Director
                            Scanner scanBonifD = new Scanner(System.in);
                            System.out.println("Ingrese la bonificacion: ");
                            String bonifiDir = scanBonifD.nextLine();
                            double bonifiDirdouble = Double.parseDouble(bonifiDir);
                            //int horas_ingresadasD = Integer.parseInt(bonifiGer);
                            Director dir = new Director (nomDirector, sueldoDirectordouble, horas_ingresadasD,bonifiDirdouble);
                            System.out.println("test ! agregado con exito! " );
                            altaUsuarioDirector(dir);
                            System.out.println("Gerente agregado con exito! " );
                            listarDirector();
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
}
