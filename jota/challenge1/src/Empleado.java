public class Empleado {
    private String nombre;
    private int salario;
    private int cantidadHorasTrabajadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    //constructor without arguments
    public Empleado() {
    }
    //constructor with arguments
    public Empleado(String nombre, int cantidadHorasTrabajadas) {
        this.nombre = nombre;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }
}
