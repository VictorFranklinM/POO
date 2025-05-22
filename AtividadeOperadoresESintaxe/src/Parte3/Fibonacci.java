package Parte3;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o teto da série: "));
		int elementoZero = 0;
		int elementoUm = 1;

		System.out.println("Série de Fibonacci menor que "+n+": ");
		
		while (elementoZero < n) {
			System.out.print(elementoZero + " ");
			int aux = elementoZero + elementoUm;
			elementoZero = elementoUm;
			elementoUm = aux;
		}
	}
}
