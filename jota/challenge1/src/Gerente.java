public class Gerente extends Empleado {
    
    private int bonificacionGerente;

    public Gerente(String nombre, int cantidadHorasTrabajadas, int salarioBase, int bonificacionGerente) {
        this.nombre = nombre;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.salarioBase = salarioBase;
        this.bonificacionGerente = bonificacionGerente;
    }

    @Override
    public void calcularSalario (){
        this.salario = (cantidadHorasTrabajadas * salarioBase) + bonificacionGerente;
    }

}
