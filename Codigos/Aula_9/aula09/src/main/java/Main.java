import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Trabalhando com elementos heterogêneos
        /*ArrayList lista = new ArrayList(); // Lista heterogênea

        Conta c = new Conta("Maria", 1000.0);

        lista.add(10);
        lista.add("João");
        lista.add(150.0);
        lista.add(c);

        System.out.println(lista);

        lista.remove(c);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        */

        // Trabalhando com uma lista homogênea
        /*ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(5);
        inteiros.add(7);
        inteiros.add(31);

        System.out.println("Antes da ordenação:");
        System.out.println(inteiros);

        // Ordenando os elementos de uma lista que já implementa a interface comparable
        Collections.sort(inteiros);
        Collections.reverse(inteiros);

        System.out.println("Depois da ordenação:");
        System.out.println(inteiros);*/

        ArrayList<Conta> contas = new ArrayList<>();

        Conta c1 = new Conta("João", 150.0);
        Conta c2 = new Conta("Maria", 1500.0);
        Conta c3 = new Conta("José", 1000.0);
        Conta c4 = new Conta("Ana", 15.0);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);

        // Ordenação está sendo feita por nome do dono
        System.out.println("Antes da ordenação: ");

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome: " + contas.get(i).dono);
            System.out.println("Saldo: " + contas.get(i).saldo);
        }

        Collections.sort(contas);

        System.out.println("Depois da ordenação: ");

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome: " + contas.get(i).dono);
            System.out.println("Saldo: " + contas.get(i).saldo);
        }

        contas.forEach(c->{
            System.out.println(c.saldo);
        });

        ArrayList<Conta> contas2 = new ArrayList<>();
        contas2.add(c1);
        contas2.add(c2);

        System.out.println(contas);
        contas.removeAll(contas2);
        System.out.println(contas);

        System.out.println(contas.isEmpty());

        /*HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("João", 21);
        mapa.put("Maria", 20);
        mapa.put("Ana", 35);

        System.out.println(mapa);
        System.out.println(mapa.get("João"));
        System.out.println(mapa.size());
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());*/
/*
        HashSet<Integer> inteiros = new HashSet<>();

        inteiros.add(10);
        inteiros.add(10);
        inteiros.add(25);
        inteiros.add(30);

        System.out.println(inteiros);
        System.out.println(inteiros.isEmpty());*/
    }
}
