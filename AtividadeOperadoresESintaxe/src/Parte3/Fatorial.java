package Parte3;

public class Fatorial {
	public static void main(String[] args) {
		int n = 10;
		for(int count = 1; count<=n; count++) {
			int fat = count;
			
			for(int num = ((count-1)==0) ? 1 : count-1; num!=1; num--) {
				fat*=num;
			}
			System.out.println("Fatorial de "+count+": "+fat);
		}
	}
}
