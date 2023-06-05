public class Gerente extends Empleado {
    public Gerente(String nombre, int edad, int salarioBase, int horasTrabajo){
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.horasTrabajo = horasTrabajo;
    }

    public  String mostrarempleado() {
        String nombre  = ("Mi nombre es " + getNombre() + " tengo  " + getEdad() + " años. " +
                "Trabajo " + getHorasTrabajo() + " horas y tengo un sueldo base: " + getSalarioBase());        return nombre;
    }

    @Override
    public String calcularSalario(){
        int salario = 0;
        int bono = 2000;
        String mensaje;
        salario = (getSalarioBase() * getHorasTrabajo()) + bono;
        mensaje = ("Tengo un bono de: " + bono + ". Mi sueldo final es: " + salario);
        return mensaje;
    };
}
