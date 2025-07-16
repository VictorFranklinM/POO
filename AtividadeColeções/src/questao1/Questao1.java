package questao1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();
        String nome;

        System.out.println("Digite nomes (Digite \"fim\" para parar).");
        while(true) {
            nome = sc.nextLine();
            if(nome.equals("fim")) {
                break;
            }
            nomes.add(nome);
        }

        System.out.println("Digite nomes para consultar (Digite \"fim\" para parar).");
        while (true) {
            nome = sc.nextLine();
            if (nome.equals("fim")) {
                break;
            }
            if (nomes.contains(nome)) {
                System.out.println(nome + " localizado");
            } else {
                System.out.println(nome + " nao localizado");
            }
        }

        sc.close();
    }
}
