public class Nave {
    String nome;
    boolean velocidadeDaLuz;
    int velocidade;
    Arma arma;

    public Nave(String nome, boolean velocidadeDaLuz, int velocidade, String tipoArma, int poderArma) {
        this.nome = nome;
        this.velocidadeDaLuz = velocidadeDaLuz;
        this.velocidade = velocidade;

        //Composição: A existência da arma (intância do objeto arma) depende diretamente da instância da nave
        this.arma = new Arma(tipoArma,poderArma);
        System.out.println("Nave criada");
    }

    void adicionaArma(Arma arma){
        this.arma = arma;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Velocidade da Luz? " + ((this.velocidadeDaLuz)?"Sim":"Não"));
        System.out.println("Tipo da arma: " + this.arma.tipo);
        System.out.println("Poder da arma: " + this.arma.poder);
    }
}
