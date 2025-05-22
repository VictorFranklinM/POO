
public class Paciente extends Pessoa{
	public String doença;
	public String medicação;
	
	public void dor() {
		System.out.println("O paciente "+nome+" está sentindo dor.");
	}
	
	public void alta() {
		System.out.println("O paciente "+nome+" recebeu alta.");
	}
	
	@Override
	public void imprimirValores() {
		super.imprimirValores();
		System.out.println("Doença: "+doença);
		System.out.println("Medicação: "+medicação);
	}
}
