public abstract class Empleado {
    protected String nombre;
    protected double sueldobase;
    protected double horastrabajadas;

    public abstract double calculosueldo();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldoBase() {
        return sueldobase;
    }
    public void setSueldoBase(double sueldobase) {
        this.sueldobase = sueldobase;
    }
    public double getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
}
