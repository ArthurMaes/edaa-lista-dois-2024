class Gerente extends Funcionario {
    public Gerente(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    public double calcularSalario(double salarioBase) {
        return salarioBase + (0.2 * salarioBase) + 1000;
    }
}