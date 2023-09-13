package com.meli.challengemc;

public class Gerente extends Empleado {

    //Atrinutos
    private double bonificacion;

    //Getters
    public double getBonificacion() {
        return bonificacion;
    }

    //Setters
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    //Metodos

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacion=" + bonificacion +
                '}';
    }
}
