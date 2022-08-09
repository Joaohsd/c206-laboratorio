public class Arma {
    String tipo;
    int poder;

    public Arma(){
        System.out.println("Arma criada!");
    }

    public Arma(String tipo, int poder) {
        System.out.println("Arma criada!");
        this.tipo = tipo;
        this.poder = poder;
    }
}
