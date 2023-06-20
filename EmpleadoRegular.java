public class EmpleadoRegular extends Empleado {
    public EmpleadoRegular(String nombre, double salarioBase, int horasTrabajadas, String direccion, String telefono,
                           boolean casado, int hijos) {
        super(nombre, salarioBase, horasTrabajadas, direccion, telefono, casado, hijos);
        // A palavra-chave "super" é usada para chamar o construtor da classe pai (Empleado).
        // Ela é usada aqui para inicializar os atributos herdados da classe pai.
        //double é un tipo de dado numero em ponto flutuante que representa numeros decimais.
        //int é un tipo de dado numero inteiro.
        //String é un tipo de dado que representa unha cadea de caracteres.
        //boolean é un tipo de dado que representa un valor lóxico (verdadeiro ou falso).

    }

    // Implementação do método abstrato calcularSalarioFinal()
    @Override
    public double calcularSalarioFinal() {
        // O tipo de retorno do método é "double" porque o cálculo do salário final resulta em um valor decimal.
        // Ele é declarado como "double" para permitir maior precisão nos cálculos.
        return getSalarioBase() * getHorasTrabajadas();
        // Neste caso, o salário final é calculado multiplicando o salário base pelas horas trabalhadas.
    }

    private double getHorasTrabajadas() {
        return 0;
    }

    private double getSalarioBase() {
    }
}
