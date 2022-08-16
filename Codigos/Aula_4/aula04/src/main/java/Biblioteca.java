public class Biblioteca {
    String nome;
    Livro[] livros = new Livro[100];

    void adicionarLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null){
                livros[i] = livro;
                System.out.println("Livro adicionado!");
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome da Biblioteca: "+ this.nome);
        System.out.println();
        System.out.println("Informação dos livros: ");
        for (Livro livro: this.livros) {
            if(livro != null)
                livro.mostraInfo();
        }
    }

    boolean alugarLivro(String nomeLivro){
        for (Livro livro : this.livros) {
            if(livro != null){
                if(livro.nome.equals(nomeLivro)){
                    return true;
                }
            }
        }
        return false;
    }
}
