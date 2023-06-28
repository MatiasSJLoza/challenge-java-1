public class Director extends Empleado{

    private int bonificacion;

    public Director(String nombre, int cantidadHorasTrabajadas, int salarioBase, int bonificacionDirector) {
    }

    public void calcularSalario (){
        this.salario = (cantidadHorasTrabajadas * salarioBase) + bonificacion;
    }
    
}
