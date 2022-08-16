import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        // Variável de Referência
        Livro l1;
        // Instancia de um objeto
        l1 = new Livro("Diário de um Banana", 100);

        Livro[] estante = new Livro[5];
        // Duas formas:
        estante[0] = l1;
        estante[1] = new Livro("Jogos Vorazes", 300);

        */
        Scanner input = new Scanner(System.in);
        Biblioteca b1 = new Biblioteca();
        b1.nome = "Biblioteca Municipal";

        // Flag que permite a execução em loop do menu
        boolean flag = true;

        while(flag){
            System.out.println("Bem-vindo ao menu de informações:");
            System.out.println("1 - Adicionar um livro.");
            System.out.println("2 - Mostrar as informações da Biblioteca e dos livros.");
            System.out.println("3 - Alugar o livro.");
            System.out.println("4 - Para sair do menu.");
            int op = input.nextInt();
            switch (op){
                case 1:
                    System.out.println("Entre com o nome do livro:");
                    // Para evitar erro do \n
                    input.nextLine();
                    String nomeLivro = input.nextLine();
                    System.out.println("Entre com a quantidade de páginas");
                    int qtdPaginas = input.nextInt();
                    Livro l = new Livro(nomeLivro, qtdPaginas);
                    b1.adicionarLivro(l);
                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    System.out.println("Entre com o nome do livro: ");
                    // Para evitar erro do \n
                    input.nextLine();
                    String nomeDoLivro = input.nextLine();
                    if(b1.alugarLivro(nomeDoLivro)){
                        System.out.println("O livro " + nomeDoLivro + " foi alugado com sucesso.");
                    }
                    else{
                        System.out.println("O livro não foi encontrado ou já foi alugado");
                    }
                    break;
                case 4:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }


    }
}
