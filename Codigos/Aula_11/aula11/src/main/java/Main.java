import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Arquivo arquivo = new Arquivo("Funcionarios.txt");
        ArrayList<Funcionario> funcionarios = arquivo.ler();
        for (Funcionario f: funcionarios) {
            System.out.println("Nome do funcionario: " + f.nome);
            System.out.println("Idade do funcionario: " + f.idade);
            System.out.println("CPF do funcionario: " + f.cpf);
        }*/

        Arquivo arquivo = new Arquivo("Funcionarios2.txt");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int op = 0;

        while(flag){
            System.out.println("1 - Cadastro de um funcionário;");
            System.out.println("2 - Mostrar as informações de todos os funcionários cadastrados;");
            System.out.println("3 - Sair do menu;");
            try{
                op = input.nextInt();
                input.nextLine();
            }catch(Exception e){
                System.out.println(e);
                op = 0;
                input.nextLine();
            }
            switch (op){
                case 1:
                    try{
                        Funcionario f = new Funcionario();
                        System.out.println("Nome: ");
                        f.nome = input.nextLine();
                        System.out.println("Idade: ");
                        f.idade = input.nextInt();
                        System.out.println("CPF: ");
                        input.nextLine();
                        f.cpf = input.nextLine();
                        arquivo.escrever(f);
                    }catch(Exception e){
                        System.out.println(e);
                        input.nextLine();
                    }
                    break;
                case 2:
                    ArrayList<Funcionario> funcionarios = arquivo.ler();
                    for (Funcionario func: funcionarios) {
                        System.out.println("Nome do funcionario: " + func.nome);
                        System.out.println("Idade do funcionario: " + func.idade);
                        System.out.println("CPF do funcionario: " + func.cpf);
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }

    }
}
