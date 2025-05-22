package Parte1;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Carlos";
		p1.idade = 10;
		
		p2.nome = "Maria";
		p2.idade = 12;
		
		// Cada pessoa tem nome e idade diferente, mas moram na mesma cidade.
		System.out.println(p1.nome+" / "+p1.idade+" / "+p1.cidade);
		
		/* A variável cidade pode ser acessada tanto com p1.cidade (apesar de não ter sido declarada), quanto com Pessoa.cidade,
		 * mas com um aviso de que a variável deve ser acessada de forma estática quando chamada com p1.cidade. */
		System.out.println(p2.nome+" / "+p2.idade+" / "+Pessoa.cidade);
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		System.out.println("Conta 1 = "+c1.luz+" / "+c1.água);
		System.out.println("Conta 2 = "+c2.luz+" / "+c2.água);
		
		Conta.água *= 3;
		c1.luz *= 2;
		c2.luz /= 2;
		
		// Os valores da conta de luz mudaram individualmente e a conta de água mudou para os dois.
		System.out.println("Conta 1 = "+c1.luz+" / "+c1.água);
		System.out.println("Conta 2 = "+c2.luz+" / "+c2.água);
	}
}
