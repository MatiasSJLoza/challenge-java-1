package com.meli.challengemc;

public class Gerente extends Empleado {

    //Atrinutos
    private double bonificacionGerente;

    //Constructor completo
    public Gerente(String nombre, double salario_base, int horas_trabajadas,double bonificacionGerente) {
        super(nombre,salario_base,horas_trabajadas);
        this.bonificacionGerente = bonificacionGerente;
    }

    //Constructor por defecto
    public Gerente() {
    }

    //Getters
    public double getbonificacionGerente() {
        return bonificacionGerente;
    }

    //Setters
    public void setbonificacionGerente(double bonificacionGerente) {
        this.bonificacionGerente = bonificacionGerente;
    }

    //Metodos

    @Override
    public String toString() {
        return super.toString() +
          " Es Gerente " +
                "bonificacionGerente=" + bonificacionGerente +
                '}';
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = getSalario() * getHoras_trabajadas() + getbonificacionGerente();
        System.out.println("Salario total para el Gerente: " + salarioTotal);
    }
}
