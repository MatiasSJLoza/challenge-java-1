public class Director extends Empleado{

    private int bonificacion;

    public Director(String nombre, int cantidadHorasTrabajadas, int salarioBase) {
    }

    public void calcularSalario (){
        this.salario = (cantidadHorasTrabajadas * salarioBase) + bonificacion;
    }
    
}
