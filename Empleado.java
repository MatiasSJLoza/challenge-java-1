public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;

    public Empleado(String nombre, double salario, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas=horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {;
        return salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioFinal() {
        return salarioBase * horasTrabajadas;
    }

    public void add(Empleado empleado) {
    }
}
