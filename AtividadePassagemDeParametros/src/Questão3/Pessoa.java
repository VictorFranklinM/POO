package Questão3;

public class Pessoa {
	public int numero;
	
	Pessoa(){
		this.numero = 1;
	}
	
	public void alterarNumero(int num) {
		this.numero = num;
	}
	
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		System.out.println(p1.numero);
		
		p1.alterarNumero(10);
		System.out.println(p1.numero);
		
		/* Como p1 é um objeto do tipo Pessoa, ao passar p1.numero como parâmetro, ele passa o valor do endereço da váriavel ao invés do
		 * seu valor. Por conta disso, apesar da linguagem só ter passagem por valores, é possível mudar o valor da variável de entrada
		 * na saída, pois o valor de endereço permanece o mesmo e o seu conteúdo muda.*/
	}
}
