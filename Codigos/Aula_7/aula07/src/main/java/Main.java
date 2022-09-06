public class Main {
    public static void main(String[] args) {
        Arquiteto arquiteto = new Arquiteto("Joao", 21, 1000, "Design");
        Engenheiro engenheiro = new Engenheiro("Zé", 20, 1000, "Computação");
        Professor professor = new Professor("Maria", 25, 2000, "POO");
        Funcionario funcionario = new Funcionario("Genérico", 99, 9999);

        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = arquiteto;
        funcionarios[1] = engenheiro;
        funcionarios[2] = professor;

        /*
        Funcionario f = arquiteto;

        f.mostraInfo();     // Vai mostrar o comportamento específico do arquiteto
        f.trabalhar();      // Vai mostrar o comportamento específico do arquiteto
        f.salarioBonus();   // Vai mostrar o comportamento específico do arquiteto
        f.fazAlgo();        // NÂO VAI DAR
        */

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Arquiteto){ // A posição i do vetor está apontando para um objeto do tipo Arquiteto?
                    Arquiteto a = (Arquiteto) funcionarios[i];
                    a.mostraInfo();
                    a.trabalhar();
                    a.salarioBonus();
                    a.fazAlgo();
                    System.out.println();
                }
                else if(funcionarios[i] instanceof Engenheiro){ // A posição i do vetor está apontando para um objeto do tipo Engenheiro?
                    Engenheiro e = (Engenheiro)funcionarios[i];
                    e.mostraInfo();
                    e.trabalhar();
                    e.salarioBonus();
                    e.fazAlgo();
                    System.out.println();
                }
                else if(funcionarios[i] instanceof Professor){ // A posição i do vetor está apontando para um objeto do tipo Professor?
                    Professor p = (Professor) funcionarios[i];
                    p.mostraInfo();
                    p.trabalhar();
                    p.salarioBonus();
                    p.fazAlgo();
                    System.out.println();
                }
            }else{
                System.out.println("Posição nula!");
            }
        }

        // Testando a herança
        /*
        arquiteto.mostraInfo();
        engenheiro.mostraInfo();
        professor.mostraInfo();

        arquiteto.trabalhar();
        engenheiro.trabalhar();
        professor.trabalhar();

        arquiteto.salarioBonus();
        engenheiro.salarioBonus();
        professor.salarioBonus();

        funcionario.mostraInfo();
        funcionario.trabalhar();
        funcionario.salarioBonus();*/
    }
}
