package com.meli.challengemc;

public class Empleado {

    //Atributos
    private String nombre;
    private double salario;
    private int horas_trabajadas;


    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    //Metodos
    public String getFormattedSalary() {
        return String.format("$%.2f", salario);
    }
    void Saludar(){
         System.out.println("Buenos dias!!!");
    }
    void calcularSalario(){
         System.out.println("Salario total: ");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", horas_trabajadas=" + horas_trabajadas +
                '}';
    }

}
