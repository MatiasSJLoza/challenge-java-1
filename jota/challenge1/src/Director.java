public class Director extends Empleado{

    private int bonificacionDirector;

    public Director(String nombre, int cantidadHorasTrabajadas, int salarioBase, int bonificacionDirector) {
        this.nombre = nombre;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.salarioBase = salarioBase;
        this.bonificacionDirector = bonificacionDirector;
    }

    @Override
    public void calcularSalario (){
        this.salario = (cantidadHorasTrabajadas * salarioBase) + bonificacionDirector;
    }
    
}
