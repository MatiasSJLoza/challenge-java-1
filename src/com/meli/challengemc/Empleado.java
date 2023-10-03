package com.meli.challengemc;

public abstract class Empleado {

    //Atributos
    private String nombre;
    private double salario_base;
    private int horas_trabajadas;

    //Constructor completo
    public Empleado(String nombre, double salario_base, int horas_trabajadas) {
        this.nombre = nombre;
        this.salario_base = salario_base;
        this.horas_trabajadas = horas_trabajadas;
    }

    //Constructor por defecto
    public Empleado() {
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario_base;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario_base = salario;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    //Metodos
    public String getFormattedSalary() {
        return String.format("$%.2f", salario_base);
    }
    void Saludar(){
         System.out.println("Buenos dias!!!");
    }

//    void calcularSalario(){
//         double salarioTotal = salario_base * horas_trabajadas;
//         System.out.println("Salario total: " + salarioTotal );
//    }

   public abstract void calcularSalario();


    @Override
    public String toString() {
        return "Empleado" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario_base +
                ", horas_trabajadas=" + horas_trabajadas;

    }

}
