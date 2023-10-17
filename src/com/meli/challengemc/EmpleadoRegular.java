package com.meli.challengemc;

public class EmpleadoRegular extends Empleado {

    public EmpleadoRegular(String nombre, double salario_base, int horas_trabajadas) {
        super(nombre, salario_base, horas_trabajadas);
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = getSalario() * getHoras_trabajadas();
        System.out.println("Salario total para el gerente: " + salarioTotal);
    }

    public void Saludar(){
        System.out.println("Buenos dias!!!");
    }


}
