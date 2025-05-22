package Parte3;

public class TernarioWhile {
	public static void main(String[] args) {
		int x = 80;
		int y;
		do {
			y = ((x%2)==0) ? x/2 : 3*x + 1;
			System.out.println("Y = "+y);
			x = y;
		}
		while(y!=1);
	}
}
