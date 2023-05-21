public class Empleado {
    private String nombre;
    private double salario;
    private int horasTrabajadas;

    public Empleado(String nombre, double salario, int horasTrabajadas) {
        this.nombre=nombre;
        this.salario=salario;
        this.horasTrabajadas=horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String calcularSalarioFinal() {
        double String = 0;
        double salarioFinal =
        String; String resultado = "El salario final es: " + salarioFinal;
        return resultado;
    }
}
