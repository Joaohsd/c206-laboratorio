public class Professor extends Funcionario implements Atividade, Pesquisa{
    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia: "+ this.materia);
        System.out.println();
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) professor(a) "+ this.nome + " está trabalhando.");
    }

    @Override
    public void salarioBonus() {
        System.out.println("Salario novo do professor: " + this.salario*1.50);
    }

    public void fazAlgo(){
        System.out.println("O(a) professor(a) "+ this.nome + " está fazendo algo.");
    }

    @Override
    public void corrigirAtividade() {
        System.out.println("O professor está corrigindo a atividade.");
    }

    @Override
    public void prepararAtividade() {
        System.out.println("O professor está preparando a atividade.");
    }

    @Override
    public void pesquisar(String projeto) {
        System.out.println("O professor está pesquisando sobre o projeto " + projeto);
    }
}
