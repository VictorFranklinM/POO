import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	private static int funcionarioCount = 0;
	private int identificador = ++funcionarioCount;
	private String nome;
	private Date dataAdmissao;
	private double salario;
	
	// Não é necessário um setter, pois quando o objeto é criado, o identificador já é definido automaticamente.
	public int getId() {
		return this.identificador;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Date getAdmissao() {
		return this.dataAdmissao;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAdmissao(String admissao) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date atual = new Date();
		
		if(atual.before(sdf.parse(admissao))) {
			System.out.println("O funcionário "+this.identificador+" não pode ter sido contratado em uma data que ainda não ocorreu.");
		}
		else {
			this.dataAdmissao = sdf.parse(admissao);
		}
	}
	
	public void setSalario(double salario) {
		if(salario<1100) {
			System.out.println("O salário do funcionário "+this.identificador+" não pode ser inferior a RS 1.100,00.");
		}
		else {
			this.salario = salario;
		}
	}
	
	public void tirarFerias() {
		tirarFerias(30);
	}
	
	public void tirarFerias(int dias) {
		if(dias>=1) {
			System.out.println("O funcionário "+this.identificador+" irá tirar férias de "+dias+" dias.");
		}
		else {
			System.out.println("As férias mínimas são de 1 dia");
		}
	}
}
