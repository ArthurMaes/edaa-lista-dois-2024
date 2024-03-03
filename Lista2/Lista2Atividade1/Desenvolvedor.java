public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, int id, double salarioBase) {
        super(nome, id, salarioBase);
    }

    public double calcularSalario() {
        double bonus = 0.10 * getSalario();
        return getSalario() + bonus;
    }

    @Override
    public double calcularSalario(double salarioBase) {

        return 0;
    }
}