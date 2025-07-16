package view;

import controller.CtrlPessoa;
import model.Pessoa;

import java.util.Scanner;

public class CadPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        Pessoa pessoa = new Pessoa(nome);
        CtrlPessoa ctrl = new CtrlPessoa();

        try {
            ctrl.salvar(pessoa);
            System.out.println("Pessoa salva com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
