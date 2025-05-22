package Parte3;

public class Tabela {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1; i<=n; i++) {
			for(int count = 1; count<=i; count++) {
				int j = i;
				j*=count;
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
