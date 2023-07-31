public class Operario extends Empleado {
    public Operario(String nombre, double sueldoBase, int horasTrabajadas) {
        super(nombre, sueldoBase, horasTrabajadas);
    }

    @Override
    public double calcularSueldoFinal() {
        return getSueldoBase() * getHorasTrabajadas();
    }
}
