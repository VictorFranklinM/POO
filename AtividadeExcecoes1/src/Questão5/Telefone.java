package Questão5;

import javax.swing.JOptionPane;

public class Telefone {
	private int ddd;
	private long numero;
	
	public void setDDD() {
		String ddd = (JOptionPane.showInputDialog("Digite o ddd:"));
		if(!ddd.matches(".*\\d.*")) {
			ddd = "0";
		}
		this.ddd = Integer.parseInt(ddd);
	}
	
	public void setNum() {
		String num = (JOptionPane.showInputDialog("Digite o número:"));
		if(!num.matches(".*\\d.*")) {
			num = "0";
		}
		this.numero = Long.parseLong(num);
	}
	
	public int getDDD() {
		return ddd;
	}
	
	public long getNumero() {
		return numero;
	}
}
