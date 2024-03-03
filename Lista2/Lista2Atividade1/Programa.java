public class Programa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        funcionariosFicticios(empresa);
        double folhaSalarial = empresa.calcularFolhaSalarial();
        System.out.println("\nFolha Salarial Total: R$ " + folhaSalarial);
        System.out.println("\n=======================================================");
    }

    public static void funcionariosFicticios(Empresa empresa) {
        Funcionario desenvolvedor = new Desenvolvedor("Rafael", 651, 6.599);
        Funcionario gerente = new Gerente("Lara", 731, 9.729);
        Funcionario suporte = new Suporte("Natan", 182, 4.540);

        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(suporte);
        
        System.out.println("\n============== Cargos e seus respectivos salários ==============");
        System.out.println("\nDESENVOLVEDOR:" + desenvolvedor.getNome() + "\nSalário de Desenvolvedor: R$ " + desenvolvedor.getSalario());
        System.out.println("\n=======================================================");
        System.out.println("\nGERENTE: " + gerente.getNome() + "\nSalário de Gerente: R$ " + gerente.getSalario());
        System.out.println("\n=======================================================");
        System.out.println("\nFUNCIONARIO UM:  " + suporte.getNome() + "\nSalário do Suporte: R$ " + suporte.getSalario());
        System.out.println("\n=======================================================");
    }
}