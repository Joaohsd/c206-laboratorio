public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(double valor){
        System.out.println("Não foi possível realizar o saque com o valor de " + valor);
    }
}
