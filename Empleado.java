public abstract class Empleado {
    protected String nombre;
    protected int edad, salarioBase , horasTrabajo;

    public abstract String  mostrarempleado();
    public abstract String calcularSalario();
// leer modificadores de acceso y encapsulamiento
// como se conformo una variable  (abstract y static)
// que es una clase


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String mostrarNombre()
    {
        return getNombre();
    };
}
