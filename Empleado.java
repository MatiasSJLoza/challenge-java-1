public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;

    private String direccion;
    private String telefono;
    private boolean casado;
    private int hijos;

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, String direccion, String telefono,
                    boolean casado, int hijos) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.direccion = direccion;
        this.telefono = telefono;
        this.casado = casado;
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setSalario(double salario) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal () {
            return salarioBase * horasTrabajadas;
    }

}