
public class Medico extends Pessoa{
	public int crm;
	public int salario;
	public String especialização;
	public Hospital hospital;
	
	public void plantão() {
		System.out.println("O médico "+nome+" está de plantão no hospital: "+hospital.nome);
	}
	
	@Override
	public void imprimirValores() {
		super.imprimirValores();
		System.out.println("CRM: "+crm);
		System.out.println("Salário: "+salario);
		System.out.println("Especialização: "+especialização);
		System.out.println("Hospital: "+hospital.nome);
	}
}
