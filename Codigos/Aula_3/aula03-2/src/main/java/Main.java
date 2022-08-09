/*
    Composição: A existência do objeto depende da existência do outro objeto.
        Ex.: Para a existência (objeto) da Arma, precisa existir um objeto Nave. Quando instancia-se
        uma Nave, instancia-se, também, uma Arma (a instância é feita dentro do construtor da Nave.
    Agregação: A exstência do objeto NÃO depende da existência do outro objeto.
        Ex.: Para a existência (objeto) da Arma, NÃO precisa existir um objeto Nave. Nesse caso,
        adicionamos pelo construtor ou um método adicionarArma, passando a referência da Arma como
        parâmetro.
 */

public class Main {
    public static void main(String[] args) {
        Nave n1 = new Nave("Foguete", true, 1000, "Fogo", 1000);
        n1.mostraInfo();
    }
}
