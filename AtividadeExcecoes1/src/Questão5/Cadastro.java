package Questão5;

import javax.swing.JOptionPane;

public class Cadastro {
	public static boolean isOK = false;
	
	public static void main(String[] args) {
		Telefone t1 = new Telefone();
		
		while(!isOK) {
			try {
				String nomeCompleto = JOptionPane.showInputDialog("Digite o nome completo:");
				if(nomeCompleto.isEmpty()) {
					throw new Exception("Nome inválido.");
				}
				
				t1.setDDD();
				if(Integer.toString(t1.getDDD()).length() != 2) {
					throw new Exception("O DDD deve possuir dois números inteiros.");
				}
				
				t1.setNum();
				if((Long.toString(t1.getNumero()).length() != 8) && (Long.toString(t1.getNumero()).length() != 9)) {
					throw new Exception("O número deve ter 8 ou 9 digitos inteiros.");
				}
				
				System.out.println("Cadastro realizado.");
				System.out.println("Nome: "+nomeCompleto);
				System.out.println("DDD: "+t1.getDDD());
				System.out.println("Telefone: "+t1.getNumero());
				isOK = true;
				
			} catch (Exception e) {
				System.out.println("Exceção: "+e.toString());
			}
		}
	}
}
