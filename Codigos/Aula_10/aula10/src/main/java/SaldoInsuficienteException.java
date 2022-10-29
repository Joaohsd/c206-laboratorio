public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(double valor){
        super("Não foi possível realizar o saque com o valor de " + valor);
    }
}
