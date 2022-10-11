import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Conta contas[] = new Conta[3];
        contas[0] = new Conta();
        contas[0].saldo = 300;
        contas[1] = new Conta();
        contas[1].saldo = 700;

        try{
            for (int i = 0; i < contas.length; i++) {
                System.out.println("Saldo em conta: " + contas[i].saldo);
            }
        }catch(Exception e){
            System.out.println(e);
        }*/

        // Tratando duas exceções
        /*
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        try{
            num1 = input.nextInt();
            num2 = input.nextInt();
            resultado = num1/num2;
        }catch(ArithmeticException e){
            System.out.println("Divisão por zero.");
        }catch(InputMismatchException e){
            System.out.println("Entrou com o valor errado.");
        }finally {
            System.out.println("Executa de qualquer forma.");
        }

        System.out.println(resultado);*/

        // Tratando uma exceção própria
        Conta c = new Conta();
        c.saldo = 100;

        c.sacarDeUmJeito(300);

        try {
            c.sacarDeOutroJeito(300);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println(c.saldo);

        System.out.println("O programa continua normalmente");

    }
}
