public class EmpleadoRegular extends Empleado {
    public EmpleadoRegular(String nombre, double salarioBase, int horasTrabajadas, String direccion, String telefono,
                           boolean casado, int hijos) {
        super(nombre, salarioBase, horasTrabajadas, direccion, telefono, casado, hijos);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * getHorasTrabajadas();
    }
}
