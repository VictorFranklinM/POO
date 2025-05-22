package Questão2;

public class Cachorro extends Animal{
	
	// Esse método sobrescreve o método de mesmo nome da classe herdada, reimplementando-o com um código diferente, pois dessa vez, o
	// animal não é desconhecido.
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo.");
	}
	
	// Esse método tem um comportamento especificado para quando ele recebe o número de latidas como parâmetro.
	public void latir(int vezes) {
		System.out.println("O cachorro latiu "+vezes+" vezes.");
	}
	
	// Mas também tem uma sobrecarga (método de mesmo nome, mas com parâmetros diferentes) para quando nenhum parâmetro é passado.
	public void latir() {
		System.out.println("O cachorro latiu.");
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Cachorro c1 = new Cachorro();
		
		a1.emitirSom();
		c1.emitirSom();
		c1.latir();
		c1.latir(2);
		
		// Resumidamente, sobrescrita é reescrever um código já existente para se adequar a uma classe específica.
		// Enquanto sobrecarga é implementar o mesmo método mas para diferentes parâmetros.
	}
}
