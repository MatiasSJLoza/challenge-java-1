public abstract class Empleado {
    private String nombre;
    private double sueldoBase;
    private int horasTrabajadas;

    public Empleado(String nombre, double sueldoBase, int horasTrabajadas) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public abstract double calcularSueldoFinal();
}
