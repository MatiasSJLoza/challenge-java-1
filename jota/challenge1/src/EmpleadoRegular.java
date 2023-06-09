class EmpleadoRegular extends Empleado{


    // (?)se puede heredar el construstor de la clase padre
    public EmpleadoRegular(String nombre, int cantidadHorasTrabajadas, int salarioBase) {
        this.nombre = nombre;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario (){
        this.salario = cantidadHorasTrabajadas * salarioBase;
    }
}