public abstract class Empleado {
    // Atributos
    private String nombre;
    double salarioBase;
    int horasTrabajadas;

    private String direccion;
    private String telefono;
    private boolean casado;
    private int hijos;

    // Construtor
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

    // Getters e Setters para os atributos

    // Método abstrato para calcular o salário final
    public abstract double calcularSalarioFinal();

    public String getNombre() {
        return null;
    }
}
