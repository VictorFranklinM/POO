import java.text.ParseException;

public class TesteFuncionario {
	public static void main(String[] args) throws ParseException{
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		// Funcionario 1
		
		f1.setNome("Carlos");
		f1.setAdmissao("16/12/2030");
		f1.setSalario(1500);
		
		// Funcionario 2
		
		f2.setNome("Carla");
		f2.setAdmissao("12/05/2020");
		f2.setSalario(1250.25);
		
		// Funcionario 3
		
		f3.setNome("Claudio");
		f3.setAdmissao("03/03/2015");
		f3.setSalario(133.92);
		
		// Prints
		
		System.out.println("\n"+f1.getId());
		System.out.println(f1.getNome());
		System.out.println(f1.getAdmissao());
		System.out.println(f1.getSalario());
		
		System.out.println("\n"+f2.getId());
		System.out.println(f2.getNome());
		System.out.println(f2.getAdmissao());
		System.out.println(f2.getSalario());
		
		System.out.println("\n"+f3.getId());
		System.out.println(f3.getNome());
		System.out.println(f3.getAdmissao());
		System.out.println(f3.getSalario());
		
		f1.tirarFerias();
		f3.tirarFerias(7);
	}
}
