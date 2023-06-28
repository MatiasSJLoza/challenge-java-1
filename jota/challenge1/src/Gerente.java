public class Gerente extends Empleado {
    
    private int bonificacion;

    public Gerente(String nombre, int cantidadHorasTrabajadas, int salarioBase) {
    }

    public void calcularSalario (){
        this.salario = (cantidadHorasTrabajadas * salarioBase) + bonificacion;
    }
}
