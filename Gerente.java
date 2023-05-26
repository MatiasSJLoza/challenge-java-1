public class Gerente extends Empleado {
    private double bonificacion;

    public Gerente(String nombre, double salarioBase, int horasTrabajadas, double bonificacion, String direccion,
                   String telefono, boolean casado, int hijos) {
        super(nombre, salarioBase, horasTrabajadas, direccion, telefono, casado, hijos);
        this.bonificacion=bonificacion;
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
