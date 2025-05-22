import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {
	public static void main(String[] args)  throws ParseException{
		Empresa e1 = new Empresa();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Contrato contra1 = new Contrato();
		Fatura f1 = new Fatura();
		Consulta consul1 = new Consulta();
		
		e1.nome = "Empresa X";
		e1.endereço = "Rua Y";
		
		p1.nome = "Carlos";
		p1.sexo = "Masculino";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		p1.nascimento = sdf1.parse("06/06/1986 02:32");
		p1.endereço = "Rua Z";
		
		p2.nome = "Maria";
		p2.sexo = "Feminino";
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		p2.nascimento = sdf2.parse("15/07/2015 06:40");
		p2.endereço = "Rua Z";
		
		p3.nome = "Rodrigo";
		p3.sexo = "Masculino";
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		p3.nascimento = sdf3.parse("28/09/1978 18:20");
		p3.endereço = "Rua J";
		
		contra1.titular = p1;
		contra1.dependentes = p2;
		contra1.empresa = e1;
		contra1.fatura = f1;
		contra1.histórico = consul1;
		
		f1.tarifaTitular = 500;
		f1.tarifaDependentes = 300;
		f1.jurosDia = 0.02;
		f1.percentualMulta = 50.8;
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		f1.vencimento = sdf4.parse("01/04/2025 00:00");
		
		consul1.paciente = p2;
		consul1.profissional = p3;
		consul1.exames = "Exame de sangue";
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		consul1.data = sdf5.parse("20/03/2025 16:30");
		
		System.out.println(contra1.printContrato());
	}
}
