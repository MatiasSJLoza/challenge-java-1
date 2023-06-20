public class Director extends Empleado {
    private double bonificacion;

    public Director(String nombre, double salarioBase, int horasTrabajadas, double bonificacion,
                    String direccion, String telefono, boolean casado, int hijos) {
        super(nombre, salarioBase, horasTrabajadas, direccion, telefono, casado, hijos);
        this.bonificacion = bonificacion;
        // O parâmetro "bonificacion" é usado para inicializar o atributo "bonificacion" da classe Director.
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalarioFinal() {
        double salarioBase = getSalarioBase();
        int horasTrabajadas = getHorasTrabajadas();
        // Os atributos "salarioBase" e "horasTrabajadas" são obtidos através dos métodos getter herdados da classe Empleado.

        double salarioFinal = salarioBase * horasTrabajadas + bonificacion;
        // O cálculo do salário final inclui o salário base multiplicado pelas horas trabalhadas e a bonificação.

        return salarioFinal;
    }

    private int getHorasTrabajadas() {
        return 0;
    }

    private double getSalarioBase() {
        return 0;
    }
}
