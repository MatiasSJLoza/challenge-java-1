package com.meli.challengemc;

public class Director extends Empleado {
    //Atrinutos
    private double bonificacionDirector;

    //Constructor completo
    public Director(String nombre, double salario_base, int horas_trabajadas,double bonificacionDirector) {
        super(nombre,salario_base,horas_trabajadas);
        this.bonificacionDirector = bonificacionDirector;
    }

    //Getters
    public double getbonificacionDirector() {
        return bonificacionDirector;
    }

    //Setters
    public void setbonificacionDirector(double bonificacionDirector) {
        this.bonificacionDirector = bonificacionDirector;
    }

    //Metodos

    @Override
    public String toString() {
        return super.toString() +
                "Gerente{" +this.getNombre()+
                "bonificacionDirector=" + bonificacionDirector +
                '}';
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = getSalario() * getHoras_trabajadas() + getbonificacionDirector();
        System.out.println("Salario total para el Director: " + salarioTotal);
    }
}
