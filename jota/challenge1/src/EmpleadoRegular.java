class EmpleadoRegular extends Empleado{



    public EmpleadoRegular(String nombre, int cantidadHorasTrabajadas, int salarioBase) {
        this.nombre = nombre;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.salarioBase = salarioBase;
    }

    @Override
    //modificador de acceso public
    //tipo de dato de return void
    //nombre del metodo calcularSalario
    //() parameters --> tipo de dato nombre, tipo de dato nombre, tipo de dato nombre
    public void calcularSalario (){
        this.salario = cantidadHorasTrabajadas * salarioBase;
    }
}