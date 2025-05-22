package Questão1;

public class Pessoa {
	public String nome = "Claudio";
	
	public void andar() {
		System.out.println(this.nome+" está andando.");
		
		// cirurgia(); 
		
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		// The method cirurgia() is undefined for the type Pessoa
		
		// Não é possivel acessar o método, pois Pessoa não tem acesso à classe médico.
	}
}
