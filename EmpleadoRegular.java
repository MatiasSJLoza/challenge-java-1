public class EmpleadoRegular extends Empleado {
    public EmpleadoRegular(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase, horasTrabajadas);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * getHorasTrabajadas();
    }
}
