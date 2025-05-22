public class TesteRelogio {
	public static void main(String[] args) {
		Relogio r1 = new Relogio();
		
		System.out.println("Relógio 1:");
		r1.inicializar(14);
		
		System.out.println("\nRelógio 2:");
		r1.inicializar(12,30);
		
		System.out.println("\nRelógio 2:");
		r1.inicializar(15,45,20);
	}
}
