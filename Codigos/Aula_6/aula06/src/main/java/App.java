public class App {
    public static void main(String[] args) {
        // Aplicando o conveito de Encapsulamento
        Funcionario f1 = new Funcionario("Joao", "123456", "11/03/2001", 1000, 5);
        f1.mostraInfo();
        System.out.println();
        Funcionario f2 = new Funcionario("Maria", "98765", "01/01/2000",2000, 5);
        f2.mostraInfo();
        System.out.println();
        f1.mostraInfo();
        System.out.println();
        System.out.println(Funcionario.getNumFunc());
        System.out.println();

        // Métodos utilitários
        double potencia = Math.pow(2, 3);
        System.out.println(potencia);
    }
}
