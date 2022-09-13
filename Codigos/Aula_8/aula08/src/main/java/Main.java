public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos
        Arquiteto arquiteto = new Arquiteto("Joao", 21, 1000, "Design");
        Engenheiro engenheiro = new Engenheiro("Zé", 20, 1000, "Computação");
        Professor professor = new Professor("Maria", 25, 2000, "POO");
        //Funcionario funcionario = new Funcionario("Genérico", 99, 9999); // Não é mais possível ter instâncias de Funcionário

        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = arquiteto;
        funcionarios[1] = engenheiro;
        funcionarios[2] = professor;

        // Varrendo o vetor para verificar se os comportamentos estão corretos
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Arquiteto){ // Verifica se está apontando para um objeto do tipo Arquiteto
                    Arquiteto a = (Arquiteto) funcionarios[i];
                    a.mostraInfo();
                    a.salarioBonus();
                    a.trabalhar();
                    a.fazAlgo();
                    a.gerenciarProjeto();
                    a.finalizarProjeto();
                    System.out.println();
                }
                else if(funcionarios[i] instanceof Engenheiro){ // Verifica se está apontando para um objeto do tipo Engenheiro
                    Engenheiro e = (Engenheiro) funcionarios[i];
                    e.mostraInfo();
                    e.salarioBonus();
                    e.trabalhar();
                    e.fazAlgo();
                    e.gerenciarProjeto();
                    e.finalizarProjeto();
                    System.out.println();
                }
                else if(funcionarios[i] instanceof Professor){ // Verifica se está apontando para um objeto do tipo Professor
                    Professor p = (Professor) funcionarios[i];
                    p.mostraInfo();
                    p.salarioBonus();
                    p.trabalhar();
                    p.fazAlgo();
                    p.prepararAtividade();
                    p.corrigirAtividade();
                    p.pesquisar("Brasil 6G");
                }
            }
        }
    }
}
