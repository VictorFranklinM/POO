package Questão1;

// A classe médico tem uma herança da classe pessoa.
public class Medico extends Pessoa{
	
	// A classe médico é composta pela classe Hospital, pois todo médico atende em um hospital.
	public Hospital hospital;
	
	// A classe médico pode ter métodos próprios que não são herdados pela classe pessoa, pois nem toda pessoa é um médico.
	public void cirurgia() {
		System.out.println(nome+" está fazendo uma cirurgia no: "+hospital.nome+".");
		
		// Mas também pode utilizar métodos herdados da classe pessoa, pois todo médico é uma pessoa.
		andar();
	}
	
	public static void main(String[] args) {
		Medico m1 = new Medico();
		Hospital h1 = new Hospital();
		m1.hospital = h1;
		m1.cirurgia();
		
		// Printa:
		// Claudio está fazendo uma cirurgia no: Hospital X.
		// Claudio está andando.
	}
}