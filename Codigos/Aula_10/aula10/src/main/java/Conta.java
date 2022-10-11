public class Conta {
    double saldo;

    void sacarDeUmJeito(double valor){
        try{
            if(this.saldo < valor)
                throw new SaldoInsuficienteException(valor);
            else
                this.saldo -= valor;
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Continuou o sacarDeUmJeito");
    }

    void sacarDeOutroJeito(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor)
            throw new SaldoInsuficienteException(valor);
        else
            this.saldo -= valor;
        System.out.println("Continuou o sacarDeOutroJeito");
    }
}
