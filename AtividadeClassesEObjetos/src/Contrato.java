
public class Contrato {
	Empresa empresa;
	Pessoa titular;
	Pessoa dependentes;
	Consulta histórico;
	Fatura fatura;
	
	public String printContrato() {
		return "Empresa: "+empresa.nome+"\n"
				+"Titular: "+titular.nome+" "+titular.sexo+" "+titular.nascimento+"\n"
				+"Dependentes: "+dependentes.nome+" "+dependentes.sexo+" "+dependentes.nascimento+"\n"
				+"Histórico: "+histórico.paciente.nome+" "+histórico.exames+" "+histórico.data+"\n"
				+"Fatura: R$"+fatura.tarifaTitular+" + R$"+fatura.tarifaDependentes+"\n"
				+"Vencimento: "+fatura.vencimento;
	}
}
