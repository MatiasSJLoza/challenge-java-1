public class Director extends Empleado {
    private double bonificacion;

    public Director(String nombre, double salarioBase, int horasTrabajadas, double bonificacion) {
        super(nombre, salarioBase, horasTrabajadas);
        this.bonificacion = bonificacion;
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
        double salarioFinal = salarioBase * horasTrabajadas + bonificacion;
        return salarioFinal;
    }
}
