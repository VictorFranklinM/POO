
public class Pessoa {
	public String nome;
	public String endereço;
	public int idade;
	public int cpf;
	public String sexo;
	
	public void andar() {
		System.out.println(nome+" está andando.");
	}
	
	public void imprimirValores() {
		System.out.println("Nome: "+nome);
		System.out.println("Endereço: "+endereço);
		System.out.println("Idade: "+idade);
		System.out.println("Cpf: "+cpf);
		System.out.println("Sexo: "+sexo);
	}
}
