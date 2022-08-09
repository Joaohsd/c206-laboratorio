public class Main {
    public static void main(String[] args) {
        // Variável de referência
        Funcionario func1;
        Funcionario func2;

        // Instancia dos objetos
        func1 = new Funcionario();
        func2 = new Funcionario("Fulano", 20, "987654321", 500);

        // Setando atributos do funcionário
        func1.nome = "João";
        func1.idade = 21;
        func1.salario = 500;
        func1.cpf = "123456789";

        // Invocando/Executando comportamentos do funcionário
        func1.mostraInfo();
        func1.tirarFerias();
        System.out.println("O salario do " + func1.nome + " é:" + func1.calcularSalarioAnual());
        System.out.println("O salario do " + func1.nome + " é:" + func1.calcularSalarioAnual(true));
        func2.mostraInfo();
    }
}
