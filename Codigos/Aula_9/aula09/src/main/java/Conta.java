public class Conta implements Comparable<Conta>{
    String dono;
    double saldo;

    public Conta(String dono, double saldo){
        this.dono = dono;
        this.saldo = saldo;
    }
    // Ordenar pelo Saldo
/*
    @Override
    public int compareTo(Conta c) {
        return Double.compare(this.saldo, c.saldo);
    }
*/
    // Ordenar em ordem alfabética
    @Override
    public int compareTo(Conta c) {
        return this.dono.compareTo(c.dono);
    }
}
