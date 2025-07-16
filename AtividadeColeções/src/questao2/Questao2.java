package questao2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> inteiros = new TreeMap<Integer, Integer>();
		String num;
		
		System.out.println("Digite números inteiros (Digite \"fim\" para parar).");
		while(true) {
			try {
				num = sc.nextLine();
				if(num.equals("fim")) break;
				else {
					inteiros.put(Integer.parseInt(num), Integer.parseInt(num));
				}
			} catch (Exception e) {
				System.out.println("O número deve ser um inteiro.");
			}
		}
		sc.close();
		System.out.println(inteiros.values());
	}
}
