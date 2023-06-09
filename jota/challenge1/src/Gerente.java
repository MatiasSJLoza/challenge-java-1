public class Gerente extends Empleado {
    
    private int bonificacion;

    public void calcularSalario (){
        this.salario = (cantidadHorasTrabajadas * salarioBase) + bonificacion;
    }
}
