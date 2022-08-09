public class Funcionario {
    String nome;
    int idade;
    String cpf;
    double salario;

    public Funcionario() {
        System.out.println("Funcionário contratado com sucesso!");
    }

    public Funcionario(String nome, int idade, String cpf, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario);
    }

    void tirarFerias(){
        System.out.println("O(a) " + this.nome + " está tirando férias!");
    }

    double calcularSalarioAnual(){
        return this.salario*12;
    }

    double calcularSalarioAnual(boolean teste){
        if(teste)
            return this.salario*13;
        else return this.salario*12;
    }
}
