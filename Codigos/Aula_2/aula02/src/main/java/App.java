import java.util.Scanner;

public class App {
    public static void main(String[] args) {
/*
        // Tipos primitivos
        int valor1 = 10;
        int valor2 = 3;
        float resultado = (float)valor1/valor2;
        boolean flag = true;
        double pi = 3.14159;
        float PI = 3.14159f;
        System.out.println(pi);
        System.out.println(PI);
        System.out.println(resultado);

        //String não é tipo primitivo e sim uma classe
        //Manipulando Strings
        String nome = "Inatel Tecnologias";
        String nomeCortado = nome.substring(0,5);
        String nomeMinusculo = nome.toLowerCase();
        System.out.println(nome);
        System.out.println(nomeCortado);
        System.out.println(nomeMinusculo);
        String nomeJunto = nome.concat(nomeCortado);
        System.out.println(nomeJunto);
        String nome2 = "Inatel Tecnologias";

        if(nome.equals(nome2)){
            System.out.println("São Iguais");
        }
        else{
            System.out.println("São Diferentes");
        }

        //Precisa fazer o casting
        double a = 10.5;
        int b = (int) a;
        System.out.println(b); // Vai mostrar apenas o 10
*//*
        // Entrada de dados
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o seu nome: ");
        String nome = input.nextLine();
        System.out.println("O seu nome é " + nome);
        System.out.println("Entre com a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Sua idade é: " + idade);
        System.out.println("Entre com a sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Sua altura é: " + altura);
        input.nextLine();
        System.out.println("Entre com o seu CPF: ");
        String cpf = input.nextLine();
        System.out.println("Seu cpf é: " + cpf);

        */
    /*
        // Curiosidade
        System.out.println("Sua idade é: " + 5 + 3);
        System.out.println("Sua idade é: " + (5 + 3));
*//*
        double n1 = 99.5;
        double n2 = 40;
        double media = (n1+n2)/2;
        int presenca = 20;
        //Criando uma constante
        final int MINIMA_PRESENCA = 15;

        if(media >= 60 && presenca >= MINIMA_PRESENCA){
            System.out.println("Aprovado");
        }
        else if(media >= 30 && media < 60 && presenca >= MINIMA_PRESENCA){
            System.out.println("NP3");
        }
        else{
            System.out.println("Reprovado");
        }

        // Usando o for
        int[] inteiros = {1,2,3,4,5};

        for (int valor : inteiros) {
            System.out.println("Valor para o For each: " + valor);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor para o For normal: " + inteiros[i]);
        }
        */

        //Switch
 /*     int estado =0;

        switch (estado){
            case 0:
                System.out.println("Desligado");
                break;
            case 1:
                System.out.println("Ligado");
                break;
            default:
                System.out.println("Stand by");
                break;
        }
*/
    }
}
