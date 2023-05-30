public class Director extends Empleado {
    private String nombre;
    private int edad, salarioBase , horasTrabajo;

    public Director() {
    }

    public Director(String nombre, int edad, int salarioBase, int horasTrabajo){
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.horasTrabajo = horasTrabajo;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public  String mostrarempleado() {
        String nombre  = ("Mi nombre es " + getNombre() + " tengo " + getEdad() + " años. " +
                "Trabajo " + getHorasTrabajo() + " horas y tengo un sueldo base: " + getSalarioBase());
        return nombre;
    }

    public String calcularSalario(){
        int salario = 0;
        int bono = 5300;
        String mensaje;
        salario = (getSalarioBase() * getHorasTrabajo()) + bono;
        mensaje = ("Tengo un bono de: " + bono + ". Mi sueldo final es: " + salario);
        return mensaje;
    };

    @Override
    public String mostrarNombre() {
        String nomnbre1 = (getNombre());
        return nomnbre1;
    }
}
