
public class Teste {
	public static void main(String[] args) {
		Hospital h1 = new Hospital();
		Pessoa p2 = new Pessoa();
		Paciente p1 = new Paciente();
		Medico m1 = new Medico();
		
		h1.nome = "Hospital X";
		h1.endereço = "Rua tal número tal";
		h1.imprimirValores();
		System.out.println();
		
		p1.nome = "Inacio";
		p1.endereço = "Rua blau número tal";
		p1.idade = 54;
		p1.cpf = 235809528;
		p1.sexo = "Masculino";
		p1.doença = "Virose";
		p1.medicação = "Água com casca de pão";
		p1.dor();
		p1.andar();
		p1.alta();
		p1.imprimirValores();
		System.out.println();
		
		p2.nome = "Maria";
		p2.endereço = "Rua blau número tal";
		p2.idade = 12;
		p2.cpf = 454574528;
		p2.sexo = "Feminino";
		p2.andar();
		p2.imprimirValores();
		System.out.println();
		
		m1.nome = "Carlos";
		m1.endereço = "Rua tal número blau";
		m1.idade = 80;
		m1.cpf = 1256091254;
		m1.sexo = "Masculino";
		m1.crm = 2395;
		m1.salario = 20000;
		m1.hospital = h1;
		m1.especialização = "Neurocirurgião";
		m1.andar();
		m1.plantão();
		m1.imprimirValores();
	}
}
