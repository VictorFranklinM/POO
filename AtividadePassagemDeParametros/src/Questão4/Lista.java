package Questão4;

public class Lista {
	public void imprimirNumero(int...num) {
		for(int i : num) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		Lista l1 = new Lista();
		System.out.println("Primeira chamada:");
		l1.imprimirNumero();
		System.out.println("\nSegunda chamada:");
		l1.imprimirNumero(2,3);
		System.out.println("\nTerceira chamada:");
		l1.imprimirNumero(4,5,8,9);
		
		/* É possível criar uma lista variável de argumentos adicionando "..." depois do tipo da variável e antes do nome da mesma.
		 * É obrigatório que a lista seja o ultimo parâmetro definido na função. */
	}
}
