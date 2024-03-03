public class Suporte extends Funcionario {
    public Suporte(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        double bonus = 0.05 * salarioBase;
        return salarioBase + bonus;
    }
}