public class Funcionario {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private double salario;
    private int tempoServico;
    private int matricula;
    private static int numFunc;

    public Funcionario(String nome, String cpf, String dataNascimento, double salario, int tempoServico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.tempoServico = tempoServico;
        numFunc++;
        this.matricula = numFunc;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Matricula: " + this.matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(this.verificarAumento()){
            this.salario = salario;
        }
        else{
            System.out.println("Você não possui tempo o suficiente para receber um aumento!");
        }
    }


    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public static int getNumFunc() {
        return numFunc;
    }

    public static void setNumFunc(int numFunc) {
        Funcionario.numFunc = numFunc;
    }

    private boolean verificarAumento(){
        if(this.tempoServico >= 5){
            return true;
        }
        else{
            return false;
        }
    }


}
