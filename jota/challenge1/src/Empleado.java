public class Empleado {
    private String nombre;
    private int salarioBase;
    private int cantidadHorasTrabajadas;
    private int salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setSalarioBase( int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getSalarioBase() {
        return salarioBase;
    }
    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    //constructor without arguments
    public Empleado() {
    }
    //constructor with arguments
    public Empleado(String nombre, int cantidadHorasTrabajadas, int salarioBase) {
        this.nombre = nombre;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.salarioBase = salarioBase;
    }
}
